/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.LogisticsWorkArea;

/**
 *
 * @author ajayp
 */
public class ManageMedicalDevicesJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageMedicalDevicesJPanel
     */
    public ManageMedicalDevicesJPanel() {
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

        btnDeliver = new javax.swing.JButton();
        btnProcess = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMedicalDevices = new javax.swing.JTable();
        lblDeliverMedicalDevices = new javax.swing.JLabel();

        btnDeliver.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnDeliver.setText("Deliver");

        btnProcess.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnProcess.setText("Process");

        tblMedicalDevices.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Hospital Name", "Quantity", "Status", "Message"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblMedicalDevices);

        lblDeliverMedicalDevices.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDeliverMedicalDevices.setText("Manage Medical Devices");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(lblDeliverMedicalDevices))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnProcess)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDeliver))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(173, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(lblDeliverMedicalDevices)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProcess)
                    .addComponent(btnDeliver))
                .addContainerGap(246, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeliver;
    private javax.swing.JButton btnProcess;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDeliverMedicalDevices;
    private javax.swing.JTable tblMedicalDevices;
    // End of variables declaration//GEN-END:variables
}
