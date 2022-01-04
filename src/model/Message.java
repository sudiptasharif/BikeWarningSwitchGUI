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

    private final int DEFAULT_TYPE = -1;
    private final boolean DEFAULT_SUCCESS = false;
    private String msg;
    private int msgType;
    private boolean msgSuccess;

    public Message(boolean msgSuccess, String msg, int msgType) {
        this.msg = msg;
        this.msgType = msgType;
        this.msgSuccess = msgSuccess;
    }

    public Message(boolean msgSuccess, String msg) {
        this.msg = msg;
        this.msgType = DEFAULT_TYPE;
        this.msgSuccess = msgSuccess;
    }

    public Message(String msg, int msgType) {
        this.msg = msg;
        this.msgType = msgType;
        this.msgSuccess = DEFAULT_SUCCESS;
    }

    public String getMessage() {
        return msg;
    }

    public int getMessageType() {
        return msgType;
    }

    public boolean isMessageSuccess() {
        return msgSuccess;
    }
    
    public void setMessageType(int msgType) {
        this.msgType = msgType;
    }
    
    public void setMessageSuccess(boolean msgSuccess) {
        this.msgSuccess = msgSuccess;
    }
}
