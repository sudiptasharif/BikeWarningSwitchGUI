/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

/**
 *
 * @author sudiptasharif
 */
public class SwitchSocket {

    public static final int SERVER_ON = 1;
    private static SwitchSocket uniqueSwitchSocket;
    private Socket socket;
    private PrintWriter out;
    private BufferedReader in;
    private String hostName;
    private int portNumber;

    private SwitchSocket(String hostName, int portNumber) {
        this.hostName = hostName;
        this.portNumber = portNumber;
    }

    public static SwitchSocket getInstance(String hostName, int portNumber) {
        if (uniqueSwitchSocket == null) {
            uniqueSwitchSocket = new SwitchSocket(hostName, portNumber);
        }
        return uniqueSwitchSocket;
    }

    public boolean checkServerOnState(String state) {
        return state != null && state.equalsIgnoreCase(Integer.toString(SERVER_ON));
    }
}
