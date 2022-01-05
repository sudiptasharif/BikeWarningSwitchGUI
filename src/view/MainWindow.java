/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.ConfigureTCPController;
import controller.MainWindowController;
import java.awt.Cursor;
import java.awt.event.MouseEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import model.Experiment;
import model.ExperimentTableModel;
import model.Message;
import model.Participant;
import model.SwitchSocket;
import model.TCP;
import model.Warning;
import switchutility.SUtils;

/**
 *
 * @author sudiptasharif
 */
public class MainWindow extends javax.swing.JFrame {

    private ConfigureTCPController tcpController;
    private MainWindowController mainWindowController;

    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        initComponents();
        setComboBoxWarningItems();
        setEmptyExperimentTableModel();
        setAppIcon();
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
        jMenuItemResetTable = new javax.swing.JMenuItem();
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
        setTitle("Warning Application for Bicyclist ");
        setName("jFrameMainWindow"); // NOI18N
        setPreferredSize(new java.awt.Dimension(740, 540));
        setResizable(false);
        setSize(new java.awt.Dimension(740, 540));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

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
            .addComponent(jScrollPaneDataTable, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
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

        jMenuItemResetTable.setText("Reset Table");
        jMenuItemResetTable.setEnabled(false);
        jMenuItemResetTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemResetTableActionPerformed(evt);
            }
        });
        jMenuExperiment.add(jMenuItemResetTable);

        jMenuBarSwitch.add(jMenuExperiment);

        jMenuNetwork.setText("Network");

        jMenuItemConfigTCP.setText("Setup TCP (Android)");
        jMenuItemConfigTCP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemConfigTCPActionPerformed(evt);
            }
        });
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
                    .addComponent(jPanelDataTable, javax.swing.GroupLayout.DEFAULT_SIZE, 716, Short.MAX_VALUE))
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

        getAccessibleContext().setAccessibleName("Research Warning Switch Application For Bicyclist  ");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemStartExpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemStartExpActionPerformed
        SwitchSocket switchSocket = SwitchSocket.getInstance(TCP.HOSTNAME, Integer.parseInt(TCP.PORT_FORWARD_FROM));
        if (!switchSocket.isConnectedToAndroidApp()) {
            Message returnMsg = switchSocket.connectToAndroidApp();
            if (returnMsg.isMessageSuccess()) {
                startExperiment(switchSocket);
            } else {
                JOptionPane.showMessageDialog(this, returnMsg.getMessage(), "Connection Error", returnMsg.getMessageType());
            }
        } else {
            startExperiment(switchSocket);
        }
    }//GEN-LAST:event_jMenuItemStartExpActionPerformed

    private void jMenuItemStopExpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemStopExpActionPerformed
        stopAndSaveExperiment();
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
        int rowIndex = jTableData.getSelectedRow();
        mainWindowController.deleteRow(rowIndex);
    }//GEN-LAST:event_jMenuItemDeleteActionPerformed

    private void jTextFieldParticipantIDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldParticipantIDFocusLost
        String participantID = jTextFieldParticipantID.getText();
        participantID = participantID.trim();
        if (!Participant.isValidParticipantID(participantID)) {
            participantID = (participantID == null) || (participantID.isBlank()) ? SUtils.INVALID_STRING_BLANK : participantID;
            JOptionPane.showMessageDialog(this, SUtils.INVALID_PARTICIPANT_ID + ": " + participantID + "\n" + SUtils.PARTICIPANT_ID_PROMPT_WITH_HINT, "Error", JOptionPane.ERROR_MESSAGE);
            jTextFieldParticipantID.requestFocusInWindow();
        } else {
            jTextFieldParticipantID.setText(participantID);
            mainWindowController.updateParticipantID(Integer.parseInt(participantID));
        }
    }//GEN-LAST:event_jTextFieldParticipantIDFocusLost

    private void jTextFieldParticipantNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldParticipantNameFocusLost
        String participantName = jTextFieldParticipantName.getText();
        participantName = participantName.trim();
        participantName = participantName.replaceAll(SUtils.REGEX_EXTRA_WHITE_SPACE, " ");
        if (!Participant.isValidParticipantName(participantName)) {
            participantName = (participantName == null) || (participantName.isBlank()) ? SUtils.INVALID_STRING_BLANK : participantName;
            JOptionPane.showMessageDialog(this, SUtils.INVALID_PARTICIPANT_NAME + ": " + participantName + "\n" + SUtils.PARTICIPANT_NAME_PROMPT_WITH_HINT, "Error", JOptionPane.ERROR_MESSAGE);
            jTextFieldParticipantName.requestFocusInWindow();
        } else {
            jTextFieldParticipantName.setText(participantName);
            mainWindowController.updateParticipantName(participantName);
        }
    }//GEN-LAST:event_jTextFieldParticipantNameFocusLost

    private void jComboBoxWarningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxWarningActionPerformed
        JComboBox cb = (JComboBox) evt.getSource();
        int warningIndex = cb.getSelectedIndex();
        updateEnableButtonSwitch(warningIndex + 1);
        mainWindowController.updateSelectedWarningCode(warningIndex + 1);
    }//GEN-LAST:event_jComboBoxWarningActionPerformed

    private void jButtonSwitchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSwitchActionPerformed
        jButtonSwitch.setCursor(new Cursor(Cursor.WAIT_CURSOR));
        Message returnMsg = mainWindowController.processAlertWarningRequests();
        jButtonSwitch.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        if (!returnMsg.isMessageSuccess()) {
            JOptionPane.showMessageDialog(this, returnMsg.getMessage(), "Error", returnMsg.getMessageType());
        }
    }//GEN-LAST:event_jButtonSwitchActionPerformed

    private void jMenuItemConfigTCPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemConfigTCPActionPerformed
        tcpController = ConfigureTCPController.getInstance();
        Message returnMsg = tcpController.setupTCP();
        JOptionPane.showMessageDialog(this, returnMsg.getMessage(), "Network", returnMsg.getMessageType());
    }//GEN-LAST:event_jMenuItemConfigTCPActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        stopAndSaveExperiment();
        if (mainWindowController != null) {
            mainWindowController.closeSocketConnection();
        }
    }//GEN-LAST:event_formWindowClosing

    private void jMenuItemResetTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemResetTableActionPerformed
        jMenuItemResetTable.setEnabled(false);
        jMenuItemStartExp.setEnabled(true);
        mainWindowController.emptyDataTable();
        resetGUIComponents();
    }//GEN-LAST:event_jMenuItemResetTableActionPerformed

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
    private javax.swing.JMenuItem jMenuItemResetTable;
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
        jComboBoxWarning.setSelectedIndex(0);
        jTextFieldParticipantID.setText("");
        jTextFieldParticipantName.setText("");
    }

    private void getParticipantInfo() {
        String participantID = JOptionPane.showInputDialog(SUtils.PARTICIPANT_ID_PROMPT);
        participantID = participantID.trim();
        while (!Participant.isValidParticipantID(participantID)) {
            participantID = (participantID == null) || (participantID.isBlank()) ? SUtils.INVALID_STRING_BLANK : participantID;
            participantID = JOptionPane.showInputDialog(SUtils.INVALID_PARTICIPANT_ID + ": " + participantID + "\n" + SUtils.PARTICIPANT_ID_PROMPT_WITH_HINT);
        }

        String participantName = JOptionPane.showInputDialog(SUtils.PARTICIPANT_NAME_PROMPT).trim().replaceAll(SUtils.REGEX_EXTRA_WHITE_SPACE, " ");
        while (!Participant.isValidParticipantName(participantName)) {
            participantName = (participantName == null) || (participantName.isBlank()) ? SUtils.INVALID_STRING_BLANK : participantName;
            participantName = JOptionPane.showInputDialog(SUtils.INVALID_PARTICIPANT_NAME + ": " + participantName + "\n" + SUtils.PARTICIPANT_NAME_PROMPT_WITH_HINT);
        }
        jTextFieldParticipantID.setText(participantID);
        jTextFieldParticipantName.setText(participantName);
    }

    private void setComboBoxWarningItems() {
        String[] items = Warning.getAllWarnings();
        for (int i = 0; i < items.length; i++) {
            items[i] = "(" + (i + 1) + ") " + items[i];
        }
        jComboBoxWarning.setModel(new DefaultComboBoxModel(items));
    }

    private void updateEnableButtonSwitch(int warningCode) {
        if (Warning.isWarningNone(warningCode)) {
            jButtonSwitch.setEnabled(false);
        } else {
            jButtonSwitch.setEnabled(true);
        }
    }

    private void setEmptyExperimentTableModel() {
        ExperimentTableModel tableModel = new ExperimentTableModel(0);
        jTableData.setModel(tableModel);
    }

    private void showTableDataPopUpMenu(MouseEvent e) {
        jPopupMenuTableData.show(e.getComponent(), e.getX(), e.getY());
    }

    private void setAppIcon() {
        if (SUtils.isOSWindows()) {
            this.setIconImage(new ImageIcon(SUtils.APP_ICON_PATH).getImage());
            // ImageIcon not supported in Mac OS           
        }
    }

    private void startExperiment(SwitchSocket switchSocket) {
        jMenuItemStartExp.setEnabled(false);
        jMenuItemStopExp.setEnabled(true);
        getParticipantInfo();
        setEnabledGUIComponents(true);
        mainWindowController = new MainWindowController(switchSocket, new Experiment(Integer.parseInt(jTextFieldParticipantID.getText()), jTextFieldParticipantName.getText()), jTableData);
    }

    private void stopAndSaveExperiment() {
        if (mainWindowController != null && !mainWindowController.isTableEmpty()) {
            int result = JOptionPane.showConfirmDialog(this, "Do you want to save experiment?", this.getTitle(), JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (result == JOptionPane.YES_OPTION) {
                mainWindowController.stopExperiment();
                Message msg = mainWindowController.saveExperiment();
                if (msg.isMessageSuccess()) {
                    JOptionPane.showMessageDialog(this, msg.getMessage(), "Experiment", msg.getMessageType());
                    mainWindowController.emptyDataTable();
                    jMenuItemStartExp.setEnabled(true);
                    jMenuItemStopExp.setEnabled(false);
                    resetGUIComponents();
                    setEnabledGUIComponents(false);
                } else {
                    JOptionPane.showMessageDialog(this, msg.getMessage(), "Experiment", msg.getMessageType());
                    jMenuItemResetTable.setEnabled(true);
                    jMenuItemStopExp.setEnabled(false);
                    setEnabledGUIComponents(false);
                    jTableData.setEnabled(true);
                    jComboBoxWarning.setSelectedIndex(0);
                }
            } else {
                mainWindowController.stopExperiment();
                mainWindowController.emptyDataTable();
                jMenuItemStartExp.setEnabled(true);
                jMenuItemStopExp.setEnabled(false);
                resetGUIComponents();
                setEnabledGUIComponents(false);
            }
        }
    }
}
