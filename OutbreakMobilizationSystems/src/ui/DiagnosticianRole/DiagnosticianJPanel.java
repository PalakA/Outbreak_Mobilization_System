/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.DiagnosticianRole;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Network.Network;
import Business.Organizations.Organization;
import Business.Organizations.OrganizationDirectory;
import Business.Roles.LabAssistantRole;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.PatientRegistrationRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

/**
 * @author ajayp
 * @author nakul
 * @author palak
 *
 * Revision History:
 *
 * Date(MM/DD/YYYY) Author Comment 04/13/2021 @author nakul Added
 * DiagnosticCenter JPanel 04/14/2021 @author palak Added UserAccount, network
 */
public class DiagnosticianJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DiagnosticianJPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    Network network;
    Enterprise enterprise;
    private OrganizationDirectory directory;
    Timer timer;

    public DiagnosticianJPanel(JPanel userProcessContainer, EcoSystem ecosystem, Network network, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.network = network;
        this.enterprise = enterprise;
        populateSamplesTable();
        populateLabAssistantCombo();
        
        ActionListener actionListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
                //Time in 12Hrs Format
                Date date1 = new Date();
                DateFormat timeFormat1 = new SimpleDateFormat("hh:mm:ss");
                String time1 = timeFormat1.format(date1);
                time_txt.setText(time1);
                
                //Todays Date
                Date date2 = new Date();
                DateFormat timeFormat2 = new SimpleDateFormat("MM/dd/yyyy");
                String time2 = timeFormat2.format(date2);
                date_txt.setText(time2);
            }
        };
        timer = new Timer(1000, actionListener);
        timer.setInitialDelay(0);
        timer.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblManageAssistant = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSamples = new javax.swing.JTable();
        lblAssignLabAssistant = new javax.swing.JLabel();
        comboLabAssistant = new javax.swing.JComboBox();
        btnSubmit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        date_txt = new javax.swing.JLabel();
        time_txt = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblManageAssistant.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        lblManageAssistant.setText("Manage Lab Assistants");
        add(lblManageAssistant, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, 560, -1));

        tblSamples.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tblSamples.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Patient Name", "Symptoms", "Assigned Lab Assistant", "Created Date", "Status", "Message"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSamples.setRowHeight(50);
        tblSamples.setRowMargin(0);
        jScrollPane1.setViewportView(tblSamples);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 1300, 172));

        lblAssignLabAssistant.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblAssignLabAssistant.setText("Assign Lab Assistant :");
        add(lblAssignLabAssistant, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 590, -1, -1));

        comboLabAssistant.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        comboLabAssistant.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboLabAssistant.setOpaque(false);
        add(comboLabAssistant, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 590, 390, -1));

        btnSubmit.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnSubmit.setText("Assign");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 710, 160, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/diagnew.jpg"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1440, 1080));

        date_txt.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        add(date_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 30, 180, 28));

        time_txt.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        add(time_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1256, 30, 160, 28));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblSamples.getSelectedRow();
        boolean isResolved = true;
        UserAccount empUserAccount = null;
        PatientRegistrationRequest patientRegistrationRequest = (PatientRegistrationRequest) tblSamples.getValueAt(selectedRow, 0);
        Employee labAssistant = (Employee) comboLabAssistant.getSelectedItem();
        if (selectedRow >= 0) {
            for (Network network : ecosystem.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
            for (Organization o : enterprise.getOrganizationDirectory().getOrganizationList()) {
                for (UserAccount u : o.getUserAccountDirectory().getUserAccountList()) {
                    if (u.getEmployee().getId() == (labAssistant.getId())) {
                        empUserAccount = u;
                        break;
                    }
                }
            }
            }
            }
            for (WorkRequest wr : empUserAccount.getWorkQueue().getWorkRequestList()) {
                if (wr instanceof PatientRegistrationRequest) {
                    if (!((PatientRegistrationRequest) wr).getStatus().equals("Resolved")) {
                        isResolved = false;
                        break;
                    }
                }
            }
            if (isResolved) {
                String msg = JOptionPane.showInputDialog("Additional Information");
                patientRegistrationRequest.setLabAssistant(labAssistant);
                patientRegistrationRequest.setStatus("Assigned Lab Assistant");
                patientRegistrationRequest.setMessage(msg);
                for (Organization o : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    for (UserAccount u : o.getUserAccountDirectory().getUserAccountList()) {
                        if (u.getEmployee().getId() == (labAssistant.getId())) {
                            u.getWorkQueue().getWorkRequestList().add(patientRegistrationRequest);
                        }
                    }
                }
                JOptionPane.showMessageDialog(null, "Lab Assistant is assigned successfully");
                populateSamplesTable();
            } else {
                JOptionPane.showMessageDialog(null, "This lab assistant is already processing tests in Lab. Please select a different Lab Assistant.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a Diadnostic Center to give your samples!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void populateSamplesTable() {
        DefaultTableModel samplesModel = (DefaultTableModel) tblSamples.getModel();
        samplesModel.setRowCount(0);
        for (Network network : ecosystem.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                if (enterprise instanceof HospitalEnterprise) {
                    for (WorkRequest wr : enterprise.getWorkQueue().getWorkRequestList()) {
                        if (wr instanceof PatientRegistrationRequest) {
                            Object[] row = new Object[samplesModel.getColumnCount()];
                            row[0] = ((PatientRegistrationRequest) wr);
                            row[1] = ((PatientRegistrationRequest) wr).getPatientName();
                            row[2] = ((PatientRegistrationRequest) wr).getSymptom1();
                            row[3] = ((PatientRegistrationRequest) wr).getLabAssistant();
                            row[4] = ((PatientRegistrationRequest) wr).getRequestDate();
                            row[5] = ((PatientRegistrationRequest) wr).getStatus();
                            row[6] = ((PatientRegistrationRequest) wr).getMessage();
                            samplesModel.addRow(row);
                        }
                    }
                }
            }
        }
    }

    private void populateLabAssistantCombo() {
        comboLabAssistant.removeAllItems();
        for (Network network : ecosystem.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (Organization o : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    for (UserAccount u : o.getUserAccountDirectory().getUserAccountList()) {
                        System.out.println(o.getUserAccountDirectory().getUserAccountList());
                        if (u.getRole() instanceof LabAssistantRole) {
                            comboLabAssistant.addItem(u.getEmployee());
                        }
                    }
                }
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox comboLabAssistant;
    private javax.swing.JLabel date_txt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAssignLabAssistant;
    private javax.swing.JLabel lblManageAssistant;
    private javax.swing.JTable tblSamples;
    private javax.swing.JLabel time_txt;
    // End of variables declaration//GEN-END:variables
}
