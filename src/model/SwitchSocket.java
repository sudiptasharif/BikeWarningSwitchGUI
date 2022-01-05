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
public class SwitchSocket {

    public static final int APP_LISTENING = 1;
    public static final int INVALID_WARNING_CODE = -1;

    private final String CONNECTION_SUCCESS = "Android app connection SUCCESSFUL.\n";
    private final String CONNECTION_FAILURE = "Android app connection FAILED.\n\nMake sure:\n(i) Network is setup.\n(ii) Android app is running.\n(iii) In app press button: START LISTENING.\n\n" + SUtils.CONTACT_SOFTWARE_ENGINEER;
    private final String UNKNOWN_HOST_EXCEPTION = "Unknown host (port): %s\nException msg: %s\n\nMake sure:\n(i) Network is setup.\n\n" + SUtils.CONTACT_SOFTWARE_ENGINEER;
    private final String IO_EXCEPTION = "I/O connection exception to: %s\nException msg: %s\n\nMake sure:\n(i) Network is setup.\n\n" + SUtils.CONTACT_SOFTWARE_ENGINEER;
    private final String INVALID_WARNING = "Warning FAILED.\nInvalid warning code: %s";
    private final String WARNING_EXCEPTION = "Warning FAILED.\nException message: %s\n\nMake sure:\n(i) Android Device is connected to computer.\n(ii) Network is setup.\n\n" + SUtils.CONTACT_SOFTWARE_ENGINEER;
    private final String SOCKET_CLOSE_SUCCESS = "Socket close SUCCESSFUL.";
    private final String SOCKET_CLOSE_FAIL = "Socket close FAILED.\nException message: %s\n\nd" + SUtils.CONTACT_SOFTWARE_ENGINEER;

    private static SwitchSocket uniqueSwitchSocket;
    private Socket socket;
    private PrintWriter out;
    private BufferedReader in;
    private final String hostName;
    private final int portNumber;
    private volatile boolean connectedToApp;

    private SwitchSocket(String hostName, int portNumber) {
        this.hostName = hostName;
        this.portNumber = portNumber;
        connectedToApp = false;
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

    public boolean isAndroidAppListening(String state) {
        return state != null && state.equalsIgnoreCase(Integer.toString(APP_LISTENING));
    }

    public Message connectToAndroidApp() {
        Message returnMsg;
        boolean appListening;
        try {
            socket = new Socket(hostName, portNumber);
            out = new PrintWriter(socket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            appListening = isAndroidAppListening(in.readLine());
            if (appListening) {
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

    public Message sendWarningSignal(int warningCodeToSend) {
        Message warningResponse;
        try {
            out.println(warningCodeToSend);
            String t3 = in.readLine();
            if (t3 != null && !t3.equals(Integer.toString(INVALID_WARNING_CODE))) {
                warningResponse = new Message(true, SUtils.formatDate(Long.parseLong(t3), SUtils.DATE_FORMAT_HH_MM_SS_MSSS), JOptionPane.INFORMATION_MESSAGE);
            } else {
                warningResponse = new Message(false, String.format(INVALID_WARNING, warningCodeToSend), JOptionPane.ERROR_MESSAGE);
            }
        } catch (IOException e) {
            warningResponse = new Message(false, String.format(WARNING_EXCEPTION, e.getMessage()), JOptionPane.ERROR_MESSAGE);
        }
        return warningResponse;
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
}
