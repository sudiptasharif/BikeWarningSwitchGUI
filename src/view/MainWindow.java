/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.MainWindowController;
import java.awt.Cursor;
import java.awt.event.MouseEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import model.Experiment;
import model.ExperimentTableModel;
import switchutility.SUtils;

/**
 *
 * @author sudiptasharif
 */
public class MainWindow extends javax.swing.JFrame {

    private MainWindowController mainWindowController;
    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        initComponents();
        setComboBoxWarningItems();
        setEmptyExperimentTableModel();
    }

    private void showTableDataPopUpMenu(MouseEvent e) {
        jPopupMenuTableData.show(e.getComponent(), e.getX(), e.getY());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenuTableData = new javax.swing.JPopupMenu();
        jMenuItemDelete = new javax.swing.JMenuItem();
        jPanelDataTable = new javax.swing.JPanel();
        jScrollPaneDataTable = new javax.swing.JScrollPane();
        jTableData = new javax.swing.JTable();
        jPanelSwitch = new javax.swing.JPanel();
        jLabelWarning = new javax.swing.JLabel();
        jComboBoxWarning = new javax.swing.JComboBox<>();
        jButtonSwitch = new javax.swing.JButton();
        jPanelParticipant = new javax.swing.JPanel();
        jLabelParticipantID = new javax.swing.JLabel();
        jTextFieldParticipantID = new javax.swing.JTextField();
        jLabelParticipantName = new javax.swing.JLabel();
        jTextFieldParticipantName = new javax.swing.JTextField();
        jMenuBarSwitch = new javax.swing.JMenuBar();
        jMenuExperiment = new javax.swing.JMenu();
        jMenuItemStartExp = new javax.swing.JMenuItem();
        jMenuItemStopExp = new javax.swing.JMenuItem();
        jMenuNetwork = new javax.swing.JMenu();
        jMenuItemConfigTCP = new javax.swing.JMenuItem();

        jMenuItemDelete.setText("Delete");
        jMenuItemDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemDeleteActionPerformed(evt);
            }
        });
        jPopupMenuTableData.add(jMenuItemDelete);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bike Warning Switch");
        setName("jFrameMainWindow"); // NOI18N
        setPreferredSize(new java.awt.Dimension(740, 530));
        setResizable(false);
        setSize(new java.awt.Dimension(740, 530));

        jPanelDataTable.setBorder(javax.swing.BorderFactory.createTitledBorder("Data"));
        jPanelDataTable.setPreferredSize(new java.awt.Dimension(485, 300));

        jScrollPaneDataTable.setPreferredSize(new java.awt.Dimension(480, 290));

        jTableData.setEnabled(false);
        jTableData.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTableData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableDataMouseClicked(evt);
            }
        });
        jScrollPaneDataTable.setViewportView(jTableData);

        javax.swing.GroupLayout jPanelDataTableLayout = new javax.swing.GroupLayout(jPanelDataTable);
        jPanelDataTable.setLayout(jPanelDataTableLayout);
        jPanelDataTableLayout.setHorizontalGroup(
            jPanelDataTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneDataTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelDataTableLayout.setVerticalGroup(
            jPanelDataTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneDataTable, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
        );

        jPanelSwitch.setBorder(javax.swing.BorderFactory.createTitledBorder("Switch"));

        jLabelWarning.setText("Choose Warning ");

        jComboBoxWarning.setEnabled(false);
        jComboBoxWarning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxWarningActionPerformed(evt);
            }
        });

        jButtonSwitch.setText("Warn");
        jButtonSwitch.setEnabled(false);
        jButtonSwitch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonSwitchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonSwitchMouseExited(evt);
            }
        });
        jButtonSwitch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSwitchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelSwitchLayout = new javax.swing.GroupLayout(jPanelSwitch);
        jPanelSwitch.setLayout(jPanelSwitchLayout);
        jPanelSwitchLayout.setHorizontalGroup(
            jPanelSwitchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSwitchLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSwitchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxWarning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelSwitchLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabelWarning)))
                .addGap(18, 18, 18)
                .addComponent(jButtonSwitch, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelSwitchLayout.setVerticalGroup(
            jPanelSwitchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSwitchLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelWarning)
                .addGap(18, 18, 18)
                .addComponent(jComboBoxWarning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jButtonSwitch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanelParticipant.setBorder(javax.swing.BorderFactory.createTitledBorder("Participant"));

        jLabelParticipantID.setText("ID:");

        jTextFieldParticipantID.setColumns(5);
        jTextFieldParticipantID.setEnabled(false);
        jTextFieldParticipantID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldParticipantIDFocusLost(evt);
            }
        });

        jLabelParticipantName.setText("Name:");

        jTextFieldParticipantName.setColumns(20);
        jTextFieldParticipantName.setEnabled(false);
        jTextFieldParticipantName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldParticipantNameFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanelParticipantLayout = new javax.swing.GroupLayout(jPanelParticipant);
        jPanelParticipant.setLayout(jPanelParticipantLayout);
        jPanelParticipantLayout.setHorizontalGroup(
            jPanelParticipantLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelParticipantLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelParticipantLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelParticipantName, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelParticipantID, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(4, 4, 4)
                .addGroup(jPanelParticipantLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldParticipantName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldParticipantID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelParticipantLayout.setVerticalGroup(
            jPanelParticipantLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelParticipantLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelParticipantLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelParticipantID)
                    .addComponent(jTextFieldParticipantID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelParticipantLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelParticipantName)
                    .addComponent(jTextFieldParticipantName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenuExperiment.setMnemonic('V');
        jMenuExperiment.setText("Experiment");

        jMenuItemStartExp.setText("Start");
        jMenuItemStartExp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemStartExpActionPerformed(evt);
            }
        });
        jMenuExperiment.add(jMenuItemStartExp);

        jMenuItemStopExp.setText("Stop");
        jMenuItemStopExp.setEnabled(false);
        jMenuItemStopExp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemStopExpActionPerformed(evt);
            }
        });
        jMenuExperiment.add(jMenuItemStopExp);

        jMenuBarSwitch.add(jMenuExperiment);

        jMenuNetwork.setText("Network");

        jMenuItemConfigTCP.setText("Configure TCP");
        jMenuNetwork.add(jMenuItemConfigTCP);

        jMenuBarSwitch.add(jMenuNetwork);

        setJMenuBar(jMenuBarSwitch);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelParticipant, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelSwitch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanelDataTable, javax.swing.GroupLayout.DEFAULT_SIZE, 726, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelDataTable, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelParticipant, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelSwitch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemStartExpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemStartExpActionPerformed
        jMenuItemStartExp.setEnabled(false);
        jMenuItemStopExp.setEnabled(true);
        getParticipantInfo();
        setEnabledGUIComponents(true);
        mainWindowController = new MainWindowController(new Experiment(Integer.parseInt(jTextFieldParticipantID.getText()), jTextFieldParticipantName.getText()), jTableData);
    }//GEN-LAST:event_jMenuItemStartExpActionPerformed

    private void jMenuItemStopExpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemStopExpActionPerformed
        jMenuItemStartExp.setEnabled(true);
        jMenuItemStopExp.setEnabled(false);
        setEnabledGUIComponents(false);
        resetGUIComponents();
    }//GEN-LAST:event_jMenuItemStopExpActionPerformed

    private void jButtonSwitchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSwitchMouseEntered
        jButtonSwitch.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jButtonSwitchMouseEntered

    private void jButtonSwitchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSwitchMouseExited
        jButtonSwitch.setCursor(new Cursor(Cursor.DEFAULT_CURSOR) {
        });
    }//GEN-LAST:event_jButtonSwitchMouseExited

    private void jTableDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableDataMouseClicked
        if (!jTableData.getSelectionModel().isSelectionEmpty() && evt.getButton() == MouseEvent.BUTTON3) {
            showTableDataPopUpMenu(evt);
        }
    }//GEN-LAST:event_jTableDataMouseClicked

    private void jMenuItemDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemDeleteActionPerformed
        //((DefaultTableModel) jTableData.getModel()).removeRow(jTableData.getSelectedRow());
    }//GEN-LAST:event_jMenuItemDeleteActionPerformed

    private void jTextFieldParticipantIDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldParticipantIDFocusLost
        String participantID = jTextFieldParticipantID.getText();
        participantID = participantID.trim();
        if (!SUtils.isValidParticipantID(participantID)) {
            participantID = (participantID == null) || (participantID.isBlank()) ? SUtils.INVALID_STRING_BLANK : participantID;
            JOptionPane.showMessageDialog(this, SUtils.INVALID_PARTICIPANT_ID + ": " + participantID + "\n" + SUtils.PARTICIPANT_ID_PROMPT_WITH_HINT, "Error", JOptionPane.ERROR_MESSAGE);
            jTextFieldParticipantID.requestFocusInWindow();
        }
        mainWindowController.updateParticipantID(Integer.parseInt(participantID));
    }//GEN-LAST:event_jTextFieldParticipantIDFocusLost

    private void jTextFieldParticipantNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldParticipantNameFocusLost
        String participantName = jTextFieldParticipantName.getText();
        participantName = participantName.trim();
        if (!SUtils.isValidParticipantName(participantName)) {
            participantName = (participantName == null) || (participantName.isBlank()) ? SUtils.INVALID_STRING_BLANK : participantName;
            JOptionPane.showMessageDialog(this, SUtils.INVALID_PARTICIPANT_NAME + ": " + participantName + "\n" + SUtils.PARTICIPANT_NAME_PROMPT_WITH_HINT, "Error", JOptionPane.ERROR_MESSAGE);
            jTextFieldParticipantName.requestFocusInWindow();
        }   
        mainWindowController.updateParticipantName(participantName);
    }//GEN-LAST:event_jTextFieldParticipantNameFocusLost

    private void jComboBoxWarningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxWarningActionPerformed
        JComboBox cb = (JComboBox)evt.getSource();
        int warningIndex = cb.getSelectedIndex();
        updateEnableButtonSwitch(warningIndex+1);
        mainWindowController.updateSelectedWarningCode(warningIndex+1);
    }//GEN-LAST:event_jComboBoxWarningActionPerformed

    private void jButtonSwitchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSwitchActionPerformed
        mainWindowController.processWarningRequest();
    }//GEN-LAST:event_jButtonSwitchActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSwitch;
    private javax.swing.JComboBox<String> jComboBoxWarning;
    private javax.swing.JLabel jLabelParticipantID;
    private javax.swing.JLabel jLabelParticipantName;
    private javax.swing.JLabel jLabelWarning;
    private javax.swing.JMenuBar jMenuBarSwitch;
    private javax.swing.JMenu jMenuExperiment;
    private javax.swing.JMenuItem jMenuItemConfigTCP;
    private javax.swing.JMenuItem jMenuItemDelete;
    private javax.swing.JMenuItem jMenuItemStartExp;
    private javax.swing.JMenuItem jMenuItemStopExp;
    private javax.swing.JMenu jMenuNetwork;
    private javax.swing.JPanel jPanelDataTable;
    private javax.swing.JPanel jPanelParticipant;
    private javax.swing.JPanel jPanelSwitch;
    private javax.swing.JPopupMenu jPopupMenuTableData;
    private javax.swing.JScrollPane jScrollPaneDataTable;
    private javax.swing.JTable jTableData;
    private javax.swing.JTextField jTextFieldParticipantID;
    private javax.swing.JTextField jTextFieldParticipantName;
    // End of variables declaration//GEN-END:variables

    private void setEnabledGUIComponents(boolean enable) {
        jTableData.setEnabled(enable);
        jComboBoxWarning.setEnabled(enable);
        jButtonSwitch.setEnabled(enable);
        jTextFieldParticipantID.setEnabled(enable);
        jTextFieldParticipantName.setEnabled(enable);
    }

    private void resetGUIComponents() {
        setEmptyExperimentTableModel();
        jComboBoxWarning.setSelectedIndex(0);
        jTextFieldParticipantID.setText("");
        jTextFieldParticipantName.setText("");
    }

    private void getParticipantInfo() {
        String participantID = JOptionPane.showInputDialog(SUtils.PARTICIPANT_ID_PROMPT);
        participantID = participantID.trim();
        while (!SUtils.isValidParticipantID(participantID)) {
            participantID = (participantID == null) || (participantID.isBlank()) ? SUtils.INVALID_STRING_BLANK : participantID;
            participantID = JOptionPane.showInputDialog(SUtils.INVALID_PARTICIPANT_ID + ": " + participantID + "\n" + SUtils.PARTICIPANT_ID_PROMPT_WITH_HINT);
        }

        String participantName = JOptionPane.showInputDialog(SUtils.PARTICIPANT_NAME_PROMPT);
        participantName = participantName.trim();
        while (!SUtils.isValidParticipantName(participantName)) {
            participantName = (participantName == null) || (participantName.isBlank()) ? SUtils.INVALID_STRING_BLANK : participantName;
            participantName = JOptionPane.showInputDialog(SUtils.INVALID_PARTICIPANT_NAME + ": " + participantName + "\n" + SUtils.PARTICIPANT_NAME_PROMPT_WITH_HINT);
        }
        jTextFieldParticipantID.setText(participantID);
        jTextFieldParticipantName.setText(participantName);
    }
    
    private void setComboBoxWarningItems() {
        String[] items = new String[SUtils.WARNINGS.length];
        for(int i = 0; i < items.length; i++) {
             items[i] = "(" + (i+1) + ") " + SUtils.WARNINGS[i];
        }
        jComboBoxWarning.setModel(new DefaultComboBoxModel(items));
    }
    
    private void updateEnableButtonSwitch(int warningCode) {
        if(SUtils.isWarningNone(warningCode)) {
            jButtonSwitch.setEnabled(false);
        } else {
            jButtonSwitch.setEnabled(true); 
        }
    }
    
    private void setEmptyExperimentTableModel() {
        ExperimentTableModel tableModel = new ExperimentTableModel(0);
        jTableData.setModel(tableModel);
    }
}