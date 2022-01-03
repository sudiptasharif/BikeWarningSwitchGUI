/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import switchutility.SUtils;

/**
 *
 * @author sudiptasharif
 */
public class TCP {

    public static final String PORT_FORWARD_FROM = "5000";
    public static final String PORT_FORWARD_TO = "6000";

    private final String COMMAND_MAC_OS = "%s";
    private final String COMMAND_WINDOWS_OS = "cmd.exe /c %s";
    private final String ADB_COMMAND_LIST_DEVICES = "adb devices";
    private final String ADB_COMMAND_FORWARD_TCP_FORMAT_STR = "adb -d forward tcp:%s tcp:%s";
    private final String ADB_PATH_MAC_FORMAT_STR = "/Users/%s/Library/Android/sdk/platform-tools/";
    private final String NETWORK_ACTIVE_MSG = "Network is setup.\nNo action needed.\nReady to start experiment.";
    private final String NETWORK_SETUP_SUCCESS_MSG = "Network setup successful.\nReady to start experiment.";
    private final String NETWORK_SETUP_FAIL_MSG = "Network setup failed.\nTry to configure network manually in terminal.\n\nUse following command:\nadb -d forward tcp:5000 tcp:6000\n\nMake sure: \n(i) Port Number 5000 is available.\n";
    private final String OS_ERROR_MSG = "Network setup failed.\nOperating System (OS) not supported.\nConfigure TCP manually for this OS.\nHowever, app might not work as expected.";
    private final String ERROR = "error";
    private final String EMULATOR = "emulator";
    private final String DEVICE = "device";
    private final String NO_ANDROID_DEVICE_ATTACHED_ERROR_MSG = "No android device detected. Make sure: \n\n(i) Phone is connected to computer.\n(ii) USB debugging is enabled.\n\nThen try again.";

    private boolean tcpConfigured;

    public TCP() {
        tcpConfigured = false;
    }

    public String configureTCP() {
        String result;
        if (tcpConfigured) {
            result = NETWORK_ACTIVE_MSG;
        } else if (SUtils.isOSWindows()) {
            result = configureTCPWindows();
        } else if (SUtils.isOSMac()) {
            result = configureTCPMacOS();
        } else {
            result = OS_ERROR_MSG;
        }
        return result;
    }

    public String configureTCPWindows() {
        String result = "TODO";
        return result;
    }

    public String configureTCPMacOS() {
        String result;
        String userName = SUtils.getSystemUserName();
        if (!userName.isBlank()) {
            result = scanForAttachedDevices(true, userName);
            if (!result.equalsIgnoreCase(ERROR)) {
                if (scannForAndroidDevice(result) == 1) {
                    result = forwardPort(true, userName);
                    if (result.startsWith(PORT_FORWARD_FROM)) {
                        result = NETWORK_SETUP_SUCCESS_MSG;
                        tcpConfigured = true;
                    } else if (result.isBlank()) {
                        result = NETWORK_ACTIVE_MSG;
                        tcpConfigured = true;
                    } else {
                        result = NETWORK_SETUP_FAIL_MSG;
                    }
                } else {
                    result = NO_ANDROID_DEVICE_ATTACHED_ERROR_MSG;
                }
            } else {
                result = NETWORK_SETUP_FAIL_MSG;
            }
        } else {
            result = NETWORK_SETUP_FAIL_MSG;
        }
        return result;
    }

    private String forwardPort(boolean isMacOS, String userName) {
        String command;
        String args;
        if (isMacOS) {
            command = COMMAND_MAC_OS;
            args = String.format(ADB_PATH_MAC_FORMAT_STR, userName) + String.format(ADB_COMMAND_FORWARD_TCP_FORMAT_STR, PORT_FORWARD_FROM, PORT_FORWARD_TO);
        } else {
            command = COMMAND_WINDOWS_OS;
            args = String.format(ADB_COMMAND_FORWARD_TCP_FORMAT_STR, PORT_FORWARD_FROM, PORT_FORWARD_TO);
        }
        return runTerminalCommand(command, args);
    }

    private String scanForAttachedDevices(boolean isMacOS, String userName) {
        String command;
        String args;
        if (isMacOS) {
            command = COMMAND_MAC_OS;
            args = String.format(ADB_PATH_MAC_FORMAT_STR, userName) + ADB_COMMAND_LIST_DEVICES;
        } else {
            command = COMMAND_WINDOWS_OS;
            args = ADB_COMMAND_LIST_DEVICES;
        }
        return runTerminalCommand(command, args);
    }

    private int scannForAndroidDevice(String input) {
        String[] lines = input.toLowerCase().split(System.lineSeparator());
        int emulatorDeviceCount = 0;
        int androidDeviceCount = 0;
        int ignore = 0;
        for (String line : lines) {
            if (line.startsWith(EMULATOR) && line.endsWith(DEVICE)) {
                emulatorDeviceCount++;
            } else if (line.endsWith(DEVICE)) {
                androidDeviceCount++;
            } else {
                ignore++;
            }
        }
        return androidDeviceCount;
    }

    private String runTerminalCommand(String command, String args) {
        String output = "";
        try {
            Process process = Runtime.getRuntime().exec(String.format(command, args));
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                output += line.replaceAll(SUtils.REGEX_EXTRA_WHITE_SPACE, " ").trim() + System.lineSeparator();
            }
            int exitCode = process.waitFor();
            if (!(exitCode == 0)) {
                output = ERROR;
            }
        } catch (IOException | InterruptedException e) {
            output = ERROR;
        }
        output = output.trim() + System.lineSeparator();
        return output;
    }
}
