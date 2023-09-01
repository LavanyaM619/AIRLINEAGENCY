/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageAirliners;

import Business.Airliner;
import Business.AirlinerDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author medas
 */
public class ManageAirlinersJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageAirlinersJPanel
     */
    private JPanel cardSequenceJPanel;
    private AirlinerDirectory airlinerDir;
    public ManageAirlinersJPanel(JPanel cardSequenceJPanel, AirlinerDirectory airlinerDir) {
        initComponents();
        this.airlinerDir = airlinerDir;
        this.cardSequenceJPanel = cardSequenceJPanel;
        populateTable();
    }
    
    public void populateTable(){
        DefaultTableModel dtm = (DefaultTableModel)airlinerTable.getModel();
        dtm.setRowCount(0);
        
        for(Airliner a : airlinerDir.getAirlinerDir()){
            Object[] row = new Object[dtm.getColumnCount()];
            row[0]= a;
            row[1]= a.getAirlineCode();
            row[2]= a.getCountriesOperated();
            row[3] = a.getOriginCountry();
            row[4] = a.getNumOfFlights();
            dtm.addRow(row);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        airlinerTable = new javax.swing.JTable();
        viewAirlinerBtn = new javax.swing.JButton();
        createAirlinerBtn = new javax.swing.JButton();
        deleteAirlinerBtn = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 51));
        jLabel1.setText("Manage AirLiners");

        airlinerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Name", "AirlineCode", "Countries Operated", "Origin Country", "Fleet"
            }
        ));
        jScrollPane1.setViewportView(airlinerTable);

        viewAirlinerBtn.setBackground(new java.awt.Color(0, 153, 0));
        viewAirlinerBtn.setForeground(new java.awt.Color(255, 255, 255));
        viewAirlinerBtn.setText("View Airliner");
        viewAirlinerBtn.setPreferredSize(new java.awt.Dimension(135, 40));
        viewAirlinerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAirlinerBtnActionPerformed(evt);
            }
        });

        createAirlinerBtn.setBackground(new java.awt.Color(0, 204, 204));
        createAirlinerBtn.setForeground(new java.awt.Color(255, 255, 255));
        createAirlinerBtn.setText("Create Airliner");
        createAirlinerBtn.setPreferredSize(new java.awt.Dimension(135, 40));
        createAirlinerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createAirlinerBtnActionPerformed(evt);
            }
        });

        deleteAirlinerBtn.setBackground(new java.awt.Color(255, 0, 51));
        deleteAirlinerBtn.setForeground(new java.awt.Color(255, 255, 255));
        deleteAirlinerBtn.setText("Delete Airliner");
        deleteAirlinerBtn.setPreferredSize(new java.awt.Dimension(135, 40));
        deleteAirlinerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteAirlinerBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(268, 268, 268)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(createAirlinerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(113, 113, 113)
                                .addComponent(viewAirlinerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(deleteAirlinerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(170, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewAirlinerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(createAirlinerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteAirlinerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(274, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void createAirlinerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createAirlinerBtnActionPerformed
        // TODO add your handling code here:
        CreateNewAirlinerJPanel panel = new CreateNewAirlinerJPanel(cardSequenceJPanel, airlinerDir);
        cardSequenceJPanel.add("CreateNewAirlinerJPanel",panel);
        CardLayout layout = (CardLayout) cardSequenceJPanel.getLayout();
        layout.next(cardSequenceJPanel);
    }//GEN-LAST:event_createAirlinerBtnActionPerformed

    private void viewAirlinerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAirlinerBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = airlinerTable.getSelectedRow();
        if(selectedRow > -1){
            Airliner airliner = airlinerDir.getAirlinerDir().get(selectedRow);
            ViewAirlinerJPanel panel = new ViewAirlinerJPanel(cardSequenceJPanel, airliner);
            cardSequenceJPanel.add("ViewAirlinerJPanel",panel);
            CardLayout layout = (CardLayout) cardSequenceJPanel.getLayout();
            layout.next(cardSequenceJPanel);
        }
        else{
            JOptionPane.showMessageDialog(null, "Please select a row above");
            return;
        }
    }//GEN-LAST:event_viewAirlinerBtnActionPerformed

    private void deleteAirlinerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteAirlinerBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = airlinerTable.getSelectedRow();
        if(selectedRow>=0){
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete??","Warning",selectionButton);
            if(selectionResult == JOptionPane.YES_OPTION){
                Airliner airliner = (Airliner)airlinerTable.getValueAt(selectedRow, 0);
                airlinerDir.removeAirliner(airliner);
                populateTable();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }
    }//GEN-LAST:event_deleteAirlinerBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable airlinerTable;
    private javax.swing.JButton createAirlinerBtn;
    private javax.swing.JButton deleteAirlinerBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton viewAirlinerBtn;
    // End of variables declaration//GEN-END:variables
}