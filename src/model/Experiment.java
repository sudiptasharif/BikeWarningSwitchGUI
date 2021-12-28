/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author sudiptasharif
 */
public class Experiment {
    private Calendar startDateTime;
    private Calendar stopDateTime;
    private int participantID;
    private String participantName;
    private ArrayList<Warning> warningList;
    
    public Experiment() {
        startDateTime = Calendar.getInstance();
        warningList = new ArrayList<>();
    }
    
    public Experiment(int participantID, String participantName){
        this.participantID = participantID;
        this.participantName = participantName;
        startDateTime = Calendar.getInstance();
        warningList = new ArrayList<>();      
    }
    
    public void addWarning(Warning warning) {
        warningList.add(warning);
    }
    
    public void stopExperiment() {
        stopDateTime = Calendar.getInstance();
        // TODO: need to dump to text file
    }
    
    public void setParticipantID(int id) {
        participantID = id;
    }
    
    public void setParticipantName(String name) {
        participantName = name;
    }
}
