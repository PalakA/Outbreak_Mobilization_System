/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.SystemAdminWorkArea;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Network.Network;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import static java.time.Clock.system;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author nakul
 */
public class SystemAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminWorkAreaJPanel
     */
    
    JPanel userProcessContainer;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    EcoSystem ecosystem;
    Network network;
    Timer timer;
    
    public SystemAdminWorkAreaJPanel(JPanel userProcessContainer,EcoSystem ecosystem, Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.network = network;
       
        
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
    
    public void CurrentDate()
    {
        Calendar cal = new GregorianCalendar();
        int month = cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        date_txt.setText(year+"/"+(month+1)+"/"+day);
        
        int second = cal.get(Calendar.SECOND);
        int minute = cal.get(Calendar.MINUTE);
        int hour = cal.get(Calendar.HOUR);
        time_txt.setText(hour+":"+minute+":"+second);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnManageNetwork = new javax.swing.JButton();
        btnManageEnterprises = new javax.swing.JButton();
        lblANewEnterprise = new javax.swing.JLabel();
        date_txt = new javax.swing.JLabel();
        time_txt = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnManageNetwork.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnManageNetwork.setText("Manage Network");
        btnManageNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageNetworkActionPerformed(evt);
            }
        });
        add(btnManageNetwork, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 400, 400, 50));

        btnManageEnterprises.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnManageEnterprises.setText("Manage Enterprises");
        btnManageEnterprises.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageEnterprisesActionPerformed(evt);
            }
        });
        add(btnManageEnterprises, new org.netbeans.lib.awtextra.AbsoluteConstraints(477, 520, 400, 50));

        lblANewEnterprise.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        lblANewEnterprise.setText("Welcome System Admin");
        add(lblANewEnterprise, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, -1, -1));

        date_txt.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        add(date_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 30, 184, 28));

        time_txt.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        add(time_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 30, 206, 28));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/manageenterprise.jpg"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, -4, 1920, 1090));
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageNetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageNetworkActionPerformed
        ManageNetworkJPanel manageNetworkJPanel = new ManageNetworkJPanel(userProcessContainer, ecosystem);
        userProcessContainer.add("ManageNetwork", manageNetworkJPanel);
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageNetworkActionPerformed

    private void btnManageEnterprisesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageEnterprisesActionPerformed
        // TODO add your handling code here:
        ManageEnterprisesJPanel manageEnterprisesJPanel = new ManageEnterprisesJPanel(userProcessContainer, ecosystem, network);
        userProcessContainer.add("ManageEnterprises", manageEnterprisesJPanel);
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageEnterprisesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageEnterprises;
    private javax.swing.JButton btnManageNetwork;
    private javax.swing.JLabel date_txt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblANewEnterprise;
    private javax.swing.JLabel time_txt;
    // End of variables declaration//GEN-END:variables
}
