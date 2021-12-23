/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import javax.swing.JOptionPane;

/**
 *
 * @author sudiptasharif
 */
public class MainWindow extends javax.swing.JFrame {

    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelDataTable = new javax.swing.JPanel();
        jScrollPaneDataTable = new javax.swing.JScrollPane();
        jTableData = new javax.swing.JTable();
        jPanelSwitch = new javax.swing.JPanel();
        jLabelScenario = new javax.swing.JLabel();
        jLabelWarning = new javax.swing.JLabel();
        jSpinnerScenario = new javax.swing.JSpinner();
        jComboBoxWarning = new javax.swing.JComboBox<>();
        jButtonSwitch = new javax.swing.JButton();
        jMenuBarSwitch = new javax.swing.JMenuBar();
        jMenuExperiment = new javax.swing.JMenu();
        jMenuItemStartExp = new javax.swing.JMenuItem();
        jMenuItemStopExp = new javax.swing.JMenuItem();
        jMenuNetwork = new javax.swing.JMenu();
        jMenuItemConfigTCP = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bike Warning Switch");
        setSize(new java.awt.Dimension(300, 300));

        jPanelDataTable.setBorder(javax.swing.BorderFactory.createTitledBorder("Data"));
        jPanelDataTable.setPreferredSize(new java.awt.Dimension(485, 300));

        jScrollPaneDataTable.setPreferredSize(new java.awt.Dimension(480, 290));

        jTableData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Experiment", "Scenario", "Warning", "T2", "T3"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableData.setEnabled(false);
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

        jLabelScenario.setText("Scenario");

        jLabelWarning.setText("Choose Warning ");

        jSpinnerScenario.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        jSpinnerScenario.setEnabled(false);

        jComboBoxWarning.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "(1) Stop + Tone", "(2) Stop + Voice ", "(3) Yeild + Tone ", "(4) Yeild + Voice" }));
        jComboBoxWarning.setEnabled(false);

        jButtonSwitch.setText("Warn");
        jButtonSwitch.setEnabled(false);

        javax.swing.GroupLayout jPanelSwitchLayout = new javax.swing.GroupLayout(jPanelSwitch);
        jPanelSwitch.setLayout(jPanelSwitchLayout);
        jPanelSwitchLayout.setHorizontalGroup(
            jPanelSwitchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSwitchLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSwitchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jSpinnerScenario, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelScenario))
                .addGap(145, 145, 145)
                .addGroup(jPanelSwitchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabelWarning)
                    .addComponent(jComboBoxWarning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(jButtonSwitch, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelSwitchLayout.setVerticalGroup(
            jPanelSwitchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSwitchLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSwitchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelWarning, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelScenario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelSwitchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSpinnerScenario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxWarning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
            .addComponent(jButtonSwitch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                    .addComponent(jPanelSwitch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelDataTable, javax.swing.GroupLayout.DEFAULT_SIZE, 668, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelDataTable, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelSwitch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemStartExpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemStartExpActionPerformed
        jMenuItemStartExp.setEnabled(false);
        jMenuItemStopExp.setEnabled(true);
        setEnabledGUIComponents(true);
    }//GEN-LAST:event_jMenuItemStartExpActionPerformed

    private void jMenuItemStopExpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemStopExpActionPerformed
        jMenuItemStartExp.setEnabled(true);
        jMenuItemStopExp.setEnabled(false);
        setEnabledGUIComponents(false);
        //TODO: Need to dump data to a text file
    }//GEN-LAST:event_jMenuItemStopExpActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSwitch;
    private javax.swing.JComboBox<String> jComboBoxWarning;
    private javax.swing.JLabel jLabelScenario;
    private javax.swing.JLabel jLabelWarning;
    private javax.swing.JMenuBar jMenuBarSwitch;
    private javax.swing.JMenu jMenuExperiment;
    private javax.swing.JMenuItem jMenuItemConfigTCP;
    private javax.swing.JMenuItem jMenuItemStartExp;
    private javax.swing.JMenuItem jMenuItemStopExp;
    private javax.swing.JMenu jMenuNetwork;
    private javax.swing.JPanel jPanelDataTable;
    private javax.swing.JPanel jPanelSwitch;
    private javax.swing.JScrollPane jScrollPaneDataTable;
    private javax.swing.JSpinner jSpinnerScenario;
    private javax.swing.JTable jTableData;
    // End of variables declaration//GEN-END:variables

    private void setEnabledGUIComponents(boolean enable) {
        jTableData.setEnabled(enable);
        jSpinnerScenario.setEnabled(enable);
        jComboBoxWarning.setEnabled(enable);
        jButtonSwitch.setEnabled(enable);
    }
}
