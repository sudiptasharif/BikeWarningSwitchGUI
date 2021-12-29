/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.swing.table.AbstractTableModel;

/**
 *
 * @author sudiptasharif
 */
public class ExperimentTableModel extends AbstractTableModel{
    private final String[] columnNames = {"Sequence #", "Warning", "T2", "T3"};
    private Object[][] data;

    public ExperimentTableModel(int totalRecords) {
        data = new Object[totalRecords][columnNames.length];
    }
    
    @Override
    public int getRowCount() {
        return data.length;
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int row, int col) {
        return data[row][col];
    }
    
    @Override
    public Class getColumnClass(int c) {
        return getValueAt(0, c).getClass();
    }
    
    @Override
    public void setValueAt(Object value, int row, int col) {
        data[row][col] = value;
        fireTableCellUpdated(row, col);
    } 
    
    @Override
    public String getColumnName(int col) {
        return columnNames[col];
    }
    
    public void setRowData(int row, Warning warning) {
        //Sequence #
        setValueAt(row+1, row, 0);
        //Warning
        setValueAt(warning.geWarningStrForTable(), row, 1);
        //T2
        setValueAt(warning.getStrT2(), row, 2);
        //T3
        setValueAt(warning.getStrT3(), row, 3);
    }
}
