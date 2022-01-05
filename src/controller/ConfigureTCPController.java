/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Message;
import model.TCP;

/**
 *
 * @author sudiptasharif
 */
public class ConfigureTCPController {

    private static ConfigureTCPController uniqueTCPController;
    private TCP tcp;

    private ConfigureTCPController() {
        tcp = new TCP();
    }

    public static ConfigureTCPController getInstance() {
        if (uniqueTCPController == null) {
            uniqueTCPController = new ConfigureTCPController();
        }
        return uniqueTCPController;
    }

    public Message setupTCP() {
        return tcp.configureTCP();
    }
}
