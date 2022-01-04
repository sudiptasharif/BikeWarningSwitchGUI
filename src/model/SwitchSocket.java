/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import javax.swing.JOptionPane;
import switchutility.SUtils;

/**
 *
 * @author sudiptasharif
 */
public class SwitchSocket implements Runnable {

    public static final int WARNING_IDLE = 0;
    public static final int WARNING_START = 1;
    public static final int WARNING_STOP = 2;
    public static final int APP_LISTENING = 1;
    public static final int INVALID_WARNING_CODE = -1;

    private final String CONNECTION_SUCCESS = "Android app connection SUCCESSFUL.\n";
    private final String CONNECTION_FAILURE = "Android app connection FAILED.\n\nIn app press button: START LISTENING";
    private final String UNKNOWN_HOST_EXCEPTION = "Unknown host (port): %s\nException msg: %s";
    private final String IO_EXCEPTION = "I/O connection exception to: %s\nException msg: %s";
    private final String INVALID_WARNING = "Warning FAILED.\nInvalid warning code: %s";
    private final String WARNING_EXCEPTION = "Warning FAILED.\nException message: %s";
    private final String SOCKET_CLOSE_SUCCESS = "Socket close SUCCESSFUL.";
    private final String SOCKET_CLOSE_FAIL = "Socket close FAILED.\nException message: %s";

    private static SwitchSocket uniqueSwitchSocket;
    private Socket socket;
    private PrintWriter out;
    private BufferedReader in;
    private final String hostName;
    private final int portNumber;
    private boolean connectedToApp;
    private int warningCodeToSend;
    private volatile int warningState;
    private volatile Message warningResponseMsg;

    private SwitchSocket(String hostName, int portNumber) {
        this.hostName = hostName;
        this.portNumber = portNumber;
        connectedToApp = false;
        warningState = WARNING_IDLE;
        warningResponseMsg = null;
    }

    public static SwitchSocket getInstance(String hostName, int portNumber) {
        if (uniqueSwitchSocket == null) {
            uniqueSwitchSocket = new SwitchSocket(hostName, portNumber);
        }
        return uniqueSwitchSocket;
    }

    public boolean isConnectedToAndroidApp() {
        return connectedToApp;
    }

    public void setWarningToSend(int warningCode) {
        warningCodeToSend = warningCode;
    }

    public int getWarningState() {
        return warningState;
    }

    public Message getWarningResponse() {
        return warningResponseMsg;
    }

    public boolean checkServerOnState(String state) {
        return state != null && state.equalsIgnoreCase(Integer.toString(APP_LISTENING));
    }

    public Message connectToAndroidApp() {
        Message returnMsg;
        boolean serverOn;
        try {
            socket = new Socket(hostName, portNumber);
            out = new PrintWriter(socket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            serverOn = checkServerOnState(in.readLine());
            if (serverOn) {
                returnMsg = new Message(true, CONNECTION_SUCCESS, JOptionPane.INFORMATION_MESSAGE);
                connectedToApp = true;
            } else {
                returnMsg = new Message(false, CONNECTION_FAILURE, JOptionPane.ERROR_MESSAGE);
                connectedToApp = false;
            }
        } catch (UnknownHostException e) {
            returnMsg = new Message(false, String.format(UNKNOWN_HOST_EXCEPTION, hostName + " (" + portNumber + ")", e.getMessage()), JOptionPane.ERROR_MESSAGE);
            connectedToApp = false;
        } catch (IOException e) {
            returnMsg = new Message(false, String.format(IO_EXCEPTION, hostName + " (" + portNumber + ")", e.getMessage()), JOptionPane.ERROR_MESSAGE);
            connectedToApp = false;
        }
        return returnMsg;
    }

    public void sendWarningSignal() {
        warningState = WARNING_START;
        try {
            out.println(warningCodeToSend);
            String t3 = in.readLine();
            if (t3 != null && !t3.equals(Integer.toString(INVALID_WARNING_CODE))) {
                warningResponseMsg = new Message(true, SUtils.formatDate(Long.parseLong(t3), SUtils.DATE_FORMAT_HH_MM_SS_MSSS), JOptionPane.INFORMATION_MESSAGE);
            } else {
                warningResponseMsg = new Message(false, String.format(INVALID_WARNING, warningCodeToSend), JOptionPane.ERROR_MESSAGE);
            }
        } catch (IOException e) {
            warningResponseMsg = new Message(false, String.format(WARNING_EXCEPTION, e.getMessage()), JOptionPane.ERROR_MESSAGE);
        }
        warningState = WARNING_STOP;
    }

    public Message closeSocket() {
        Message returnMsg;
        try {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
            if (socket != null) {
                socket.close();
            }
            returnMsg = new Message(true, SOCKET_CLOSE_SUCCESS, JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            returnMsg = new Message(false, String.format(SOCKET_CLOSE_FAIL, e.getMessage()), JOptionPane.ERROR_MESSAGE);
        }
        return returnMsg;
    }

    @Override
    public void run() {
        sendWarningSignal();
    }
}
