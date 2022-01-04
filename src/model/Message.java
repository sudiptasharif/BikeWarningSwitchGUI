/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author sudiptasharif
 */
public class Message {
    private String msg;
    private int msgType;
    
    public Message(String msg, int msgType) {
        this.msg = msg;
        this.msgType = msgType;
    }
    
    public String getMessage() {
        return msg;
    }
    
    public int getMessageType() {
        return msgType;
    }
}
