/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.PatientRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.WorkQueue.PatientRegistrationRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 * @author ajayp
 * @author nakul
 * @author palak
 * 
 * Revision History:
 * 
 * Date(MM/DD/YYYY)      Author              Comment
 * 04/21/2021            @author palak       Added DoctorPrescriptionJPanel
 */

public class DoctorPrescriptionJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DoctorPrescriptionJPanel
     */
    
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    Enterprise enterprise;
    
    public DoctorPrescriptionJPanel(JPanel userProcessContainer, EcoSystem ecosystem, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.enterprise = enterprise;
        populateDoctorPrescriptionTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    private void populateDoctorPrescriptionTable() {
        DefaultTableModel prescriptionModel = (DefaultTableModel) tblPrescription.getModel();
        prescriptionModel.setRowCount(0);
        for (WorkRequest wr : enterprise.getWorkQueue().getWorkRequestList()) {
            if (wr instanceof PatientRegistrationRequest) {
                Object[] row = new Object[prescriptionModel.getColumnCount()];
                row[0] = ((PatientRegistrationRequest) wr);
                row[1] = ((PatientRegistrationRequest) wr).getDoctor();
                row[2] = ((PatientRegistrationRequest) wr).getCareTaker();
                row[3] = ((PatientRegistrationRequest) wr).getPrescription();
                row[4] = ((PatientRegistrationRequest) wr).getStatus();
                row[5] = ((PatientRegistrationRequest) wr).getMessage();
                prescriptionModel.addRow(row);
            }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPrescription = new javax.swing.JTable();
        btnRequestCaretaker = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnBack.setText("Back");
        btnBack.setOpaque(false);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 110, 40));

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        lblTitle.setText("View Doctor Prescription");
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, 610, -1));

        tblPrescription.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tblPrescription.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Prescription ID", "Doctor Name", "Care Taker", "Precription given", "Status", "Message"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPrescription.setRowHeight(50);
        tblPrescription.setRowMargin(0);
        jScrollPane1.setViewportView(tblPrescription);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 290, 1200, 240));

        btnRequestCaretaker.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnRequestCaretaker.setText("Request Care Taker to deliver medicines");
        btnRequestCaretaker.setOpaque(false);
        btnRequestCaretaker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestCaretakerActionPerformed(evt);
            }
        });
        add(btnRequestCaretaker, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 610, -1, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/diagnew.jpg"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1440, 1080));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnRequestCaretakerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestCaretakerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRequestCaretakerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRequestCaretaker;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblPrescription;
    // End of variables declaration//GEN-END:variables
}
