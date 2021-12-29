/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import javax.swing.JTable;
import model.Experiment;
import model.ExperimentTableModel;
import model.Warning;
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
        selectedWarningCode = SUtils.DEFAULT_WARNING_CODE;
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
    
    public void processWarningRequest(){
        Warning warning;
        if(SUtils.isWarningNone(selectedWarningCode)) {
            warning = new Warning(selectedWarningCode, SUtils.DEFAULT_MILLISECOND);
        } else {
            warning = new Warning(selectedWarningCode, System.currentTimeMillis());
            // TODO: send warning signal and get t3
        }
        modelExperiment.addWarning(warning);
        updateTableData();
    }
    
    private void updateTableData() {
        int totalRecords = modelExperiment.getWarningListCount();
        ExperimentTableModel tableModel = new ExperimentTableModel(totalRecords);
        Warning warning;
        for(int i = 0; i < totalRecords; i++) {
            warning = modelExperiment.getWarning(i);
            tableModel.setRowData(i, warning);
        }
        viewDataTable.setModel(tableModel);
    }
    
}
