/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.PatientRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organizations.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 * @author ajayp
 * @author nakul
 * @author palak
 * 
 * Revision History:
 * 
 * Date(MM/DD/YYYY)      Author              Comment
 * 04/13/2021            @author nakul       Added PatientWorkArea JPanel
 * 04/14/2021            @author palak       Added UserAccount, network
 */

public class PatientWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PatientWorkAreaJPanel
     */
    
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    UserAccount user;
    Network network;
    Timer timer;
    Enterprise enterprise;
    Organization organization;
    
    public PatientWorkAreaJPanel(JPanel userProcessContainer,UserAccount user, Network network, EcoSystem ecosystem, Enterprise enterprise, Organization organization) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.user = user;
        this.network = network;
        this.ecosystem=ecosystem;
        this.enterprise = enterprise;
        this.organization = organization;
        
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

        lblANewEnterprise = new javax.swing.JLabel();
        date_txt = new javax.swing.JLabel();
        time_txt = new javax.swing.JLabel();
        btnSampleTesting = new javax.swing.JButton();
        btnDrPrescription = new javax.swing.JButton();

        lblANewEnterprise.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblANewEnterprise.setText("Welcome Patient");

        date_txt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        time_txt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        btnSampleTesting.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnSampleTesting.setText("Give Samples for Testing");
        btnSampleTesting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSampleTestingActionPerformed(evt);
            }
        });

        btnDrPrescription.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnDrPrescription.setText("View Doctor Prescriptions");
        btnDrPrescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDrPrescriptionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblANewEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(date_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(time_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnSampleTesting, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDrPrescription, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblANewEnterprise)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(date_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(time_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42)
                .addComponent(btnSampleTesting, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnDrPrescription, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(310, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSampleTestingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSampleTestingActionPerformed
        // TODO add your handling code here:
        PatientSampleJPanel patientSampleJPanel = new PatientSampleJPanel(userProcessContainer, ecosystem, enterprise, organization);
        userProcessContainer.add("PatientSampleJPanel", patientSampleJPanel);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnSampleTestingActionPerformed

    private void btnDrPrescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDrPrescriptionActionPerformed
        // TODO add your handling code here:
        DoctorPrescriptionJPanel doctorPrescriptionJPanel = new DoctorPrescriptionJPanel(userProcessContainer, ecosystem);
        userProcessContainer.add("DoctorPrescriptionJPanel", doctorPrescriptionJPanel);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnDrPrescriptionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDrPrescription;
    private javax.swing.JButton btnSampleTesting;
    private javax.swing.JLabel date_txt;
    private javax.swing.JLabel lblANewEnterprise;
    private javax.swing.JLabel time_txt;
    // End of variables declaration//GEN-END:variables
}
