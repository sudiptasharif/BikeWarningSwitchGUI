/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.Cursor;
import javax.swing.JTable;
import model.Experiment;
import switchutility.SUtils;

/**
 *
 * @author sudiptasharif
 */
public class MainWindowController {
    private JTable viewDataTable;
    private Experiment modelExperiment;
    private int selectedWarningCode;
    
    public MainWindowController(Experiment experiment, JTable dataTable) {
        modelExperiment = experiment;
        viewDataTable = dataTable;
        selectedWarningCode = SUtils.INVALID_WARNING_CODE;
    }
    
    public void updateParticipantID(int newID) {
        modelExperiment.updateParticipantID(newID);
    }
    
    public void updateParticipantName(String newName) {
        modelExperiment.updateParticipantName(newName);
    }  
    
    public void updateSelectedWarningCode(int code) {
        selectedWarningCode = code;
    }
    
}
