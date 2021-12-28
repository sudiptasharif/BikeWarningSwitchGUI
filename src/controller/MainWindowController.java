/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import javax.swing.JTable;
import model.Experiment;

/**
 *
 * @author sudiptasharif
 */
public class MainWindowController {
    private JTable viewDataTable;
    private Experiment modelExperiment;
    
    public MainWindowController(int participantID, String participantName, JTable dataTable){
        modelExperiment = new Experiment(participantID, participantName);
        viewDataTable = dataTable;
    }
    
    public MainWindowController(Experiment experiment, JTable dataTable) {
        modelExperiment = experiment;
        viewDataTable = dataTable;
    }
}
