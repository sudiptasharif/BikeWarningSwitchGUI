/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import javax.swing.JTable;
import model.Experiment;
import model.ExperimentTableModel;
import model.Warning;
import switchutility.SUtils;
import com.opencsv.CSVWriter;
import java.util.List;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import model.Message;
import model.SwitchSocket;

/**
 *
 * @author sudiptasharif
 */
public class MainWindowController {

    private JTable viewDataTable;
    private Experiment modelExperiment;
    private int selectedWarningCode;
    private SwitchSocket switchSocket;

    public MainWindowController(SwitchSocket switchSocket, Experiment experiment, JTable dataTable) {
        this.switchSocket = switchSocket;
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
        if (Warning.isWarningNone(selectedWarningCode)) {
            Warning warning = new Warning(selectedWarningCode, SUtils.DEFAULT_T);
            modelExperiment.addWarning(warning);
            updateTableData();
        }
    }

    public void processAlertWarningRequests() {
        Warning warning = new Warning(selectedWarningCode, SUtils.formatDate(System.currentTimeMillis(), SUtils.DATE_FORMAT_HH_MM_SS_MSSS));
        // TODO: send warning signal and get t3
        modelExperiment.addWarning(warning);
        updateTableData();
    }

    private void updateTableData() {
        int totalRecords = modelExperiment.getWarningListCount();
        ExperimentTableModel tableModel = new ExperimentTableModel(totalRecords);
        Warning warning;
        for (int i = 0; i < totalRecords; i++) {
            warning = modelExperiment.getWarning(i);
            tableModel.setRowData(i, warning);
        }
        viewDataTable.setModel(tableModel);
    }

    public void deleteRow(int rowIndex) {
        modelExperiment.removeWarning(rowIndex);
        updateTableData();
    }

    public void stopExperiment() {
        modelExperiment.stopExperiment();
    }

    public Message saveExperiment() {
        Message msg;
        String csvFileName = modelExperiment.getExperimentName() + ".csv";
        List<String[]> dataList = convertExperimentDataToArrayList();
        try (CSVWriter writer = new CSVWriter(new FileWriter(SUtils.CSV_ROOT_FOLDER + csvFileName))) {
            writer.writeAll(dataList);
            msg = new Message("Successfully saved experiment.\nSaved file name: " + csvFileName , JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e){
            msg = new Message("Failed to save experiment.\nError: " + e.getMessage(), JOptionPane.ERROR_MESSAGE);
        }
        return msg;
    }

    private List<String[]> convertExperimentDataToArrayList() {
        String[] tableHeaders = ExperimentTableModel.getAllTableDataHeaders();
        String[] columnValues;
        String t;
        int rowCount = modelExperiment.getWarningListCount();
        List<String[]> dataList = new ArrayList<>();
        dataList.add(tableHeaders);
        Warning warning;
        for (int row = 0; row < rowCount; row++) {
            warning = modelExperiment.getWarning(row);
            columnValues = new String[tableHeaders.length];
            //Sequence #
            columnValues[0] = (row + 1) + "";
            
            //Warning
            columnValues[1] = warning.geWarningStrForTable();
            
            //T2
            t = warning.getT2();
            if(!t.equals("--")) {
                t = "'" + t;
            }
            columnValues[2] = t;
            
            //T3
            t = warning.getT3();
            if(!t.equals("--")) {
                t = "'" + t;
            }           
            columnValues[3] = t;
            
            dataList.add(columnValues);
        }
        return dataList;
    }
}
