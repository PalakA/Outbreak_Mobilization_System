/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.PatientRole;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.DiagnosticCenterEnterprise;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organizations.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.PatientRegistrationRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
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
 * 04/21/2021            @author palak       Added PatientSampleJPanel
 */

public class PatientSampleJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PatientSampleJPanel
     */
    
    private JPanel userProcessContainer;
    private EcoSystem ecosystem;
    Enterprise enterprise;
    Organization organization;
    
    public PatientSampleJPanel(JPanel userProcessContainer, EcoSystem ecosystem, Enterprise enterprise, Organization organization) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.enterprise = enterprise;
        this.organization = organization;
        populateEnterpriseTable();
        populatePatientStatusTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
        private void populateEnterpriseTable() {
        DefaultTableModel enterpriseModel = (DefaultTableModel) tblDiagnosticCenter.getModel();
        enterpriseModel.setRowCount(0);
        for (Network network : ecosystem.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                if(enterprise instanceof DiagnosticCenterEnterprise){
                    for (UserAccount userAccount : enterprise.getUserAccountDirectory().getUserAccountList()) {
                    
                    if(userAccount.getWorkQueue().getWorkRequestList().isEmpty())
                    {
                        Object[] row = new Object[3];
                        row[0] = enterprise.getName();
                        row[1] = userAccount.getEmployee();
                        row[2] = network.getName();
                        enterpriseModel.addRow(row);
                    }
                }
                }
            }
        }
    }
        
    private void populatePatientStatusTable(){
        DefaultTableModel model = (DefaultTableModel) tblPopulatePatientStatus.getModel();
        model.setRowCount(0);
        
        for (WorkRequest workRequest : enterprise.getWorkQueue().getWorkRequestList()) {

            if (workRequest instanceof PatientRegistrationRequest) {
                Object[] row = new Object[model.getColumnCount()];
                row[0] = ((PatientRegistrationRequest) workRequest);
                row[1] = ((PatientRegistrationRequest) workRequest).getDiagnostician();
                row[2] = ((PatientRegistrationRequest) workRequest).getStatus();
                row[3] = ((PatientRegistrationRequest) workRequest).getMessage();
                model.addRow(row);
            }
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDiagnosticCenter = new javax.swing.JTable();
        btnSubmit = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPopulatePatientStatus = new javax.swing.JTable();

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTitle.setText("Select Diagnostic Center to give Samples");

        tblDiagnosticCenter.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Diagnostic Center", "Diagnostician", "State"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblDiagnosticCenter);

        btnSubmit.setText("Submit Samples");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        tblPopulatePatientStatus.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Assigned Diagnostician", "Status", "Message"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblPopulatePatientStatus);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(btnBack)
                        .addGap(80, 80, 80)
                        .addComponent(lblTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(273, 273, 273)
                        .addComponent(btnSubmit)))
                .addContainerGap(254, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTitle)
                    .addComponent(btnBack))
                .addGap(55, 55, 55)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSubmit)
                .addContainerGap(112, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblPopulatePatientStatus.getSelectedRow();
        int selectedDiagnosticRow = tblDiagnosticCenter.getSelectedRow(); 
        
        PatientRegistrationRequest patientRegistrationRequest = (PatientRegistrationRequest) tblPopulatePatientStatus.getValueAt(selectedRow, 0);

        Employee employee = (Employee)tblDiagnosticCenter.getValueAt(selectedDiagnosticRow, 1);
        
        if (selectedRow >= 0 && selectedDiagnosticRow >=0)
        {
            if(patientRegistrationRequest.getDiagnostician()==null){
                String msg = JOptionPane.showInputDialog("Additional Information");
            
                patientRegistrationRequest.setDiagnostician(employee);
                patientRegistrationRequest.setStatus("Submitted Samples for Testing");
                patientRegistrationRequest.setMessage(msg);

                for(Organization o : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    for (UserAccount u : o.getUserAccountDirectory().getUserAccountList()) {
                        if (u.getEmployee().getId() == (employee.getId())) {
                            u.getWorkQueue().getWorkRequestList().add(patientRegistrationRequest);
                        }
                    }
                }

                JOptionPane.showMessageDialog(null, "Samples Submitted Successfully");
                populateEnterpriseTable();
                populatePatientStatusTable();
            }
            else{
                 JOptionPane.showMessageDialog(null,"Samples already submitted to the Diagnostic Center", "Warning", JOptionPane.WARNING_MESSAGE);
                 return;
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Please select a Diadnostic Center & Samples to Submit!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblDiagnosticCenter;
    private javax.swing.JTable tblPopulatePatientStatus;
    // End of variables declaration//GEN-END:variables
}
