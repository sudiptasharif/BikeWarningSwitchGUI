/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.Calendar;
import switchutility.SUtils;

/**
 *
 * @author sudiptasharif
 */
public class Experiment {

    private Calendar startDateTime;
    private Calendar stopDateTime;
    private Participant participant;
    private ArrayList<Warning> warningList;

    public Experiment() {
        startDateTime = Calendar.getInstance();
        warningList = new ArrayList<>();
    }

    public Experiment(int participantID, String participantName) {
        participant = new Participant(participantID, participantName);
        startDateTime = Calendar.getInstance();
        warningList = new ArrayList<>();
    }

    public void addWarning(Warning warning) {
        warningList.add(warning);
    }

    public void stopExperiment() {
        stopDateTime = Calendar.getInstance();
    }

    public void updateParticipantID(int newID) {
        participant.setId(newID);
    }

    public void updateParticipantName(String newName) {
        participant.setName(newName);
    }

    public int getWarningListCount() {
        return warningList.size();
    }

    public Warning getWarning(int index) {
        return warningList.get(index);
    }

    public void removeWarning(int index) {
        warningList.remove(index);
    }

    public String getExperimentName() {
        String experimentName = "";
        String participantID = participant.getId() + "";
        String participantName = participant.getName().replaceAll(" ", "_");
        String startExpTimeStr = SUtils.formatDate(startDateTime, SUtils.DATE_FORMAT_YYYY_MM_DD);
        experimentName = participantID + "_" + participantName.toLowerCase() + "_" + startExpTimeStr;
        return experimentName;
    }
    
    public void emptyWarningList() {
        warningList = new ArrayList<>();
    }
}
