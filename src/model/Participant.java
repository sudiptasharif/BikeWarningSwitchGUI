/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import switchutility.SUtils;

/**
 *
 * @author sudiptasharif
 */
public class Participant {
    private int id;
    private String name;

    public Participant(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public static boolean isValidParticipantID(String participantID) {
        return !((participantID == null) || (participantID.isBlank()) || (!SUtils.isInteger(participantID.trim())));
    }

    public static boolean isValidParticipantName(String participantName) {
        return !((participantName == null) || (participantName.isBlank()) || (!SUtils.isValidName(participantName.trim())));
    }    
}
