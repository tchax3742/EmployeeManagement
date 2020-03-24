/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student_management;

/**
 *
 * @author Dell
 */
public class EditEmployee extends javax.swing.JFrame {

    /**
     * Creates new form EditEmployee
     */
    public EditEmployee() {
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

        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jbtnSaveEditEmployee = new javax.swing.JButton();
        jtxtEmployeeName = new javax.swing.JTextField();
        jtxtEmployeeSurname = new javax.swing.JTextField();
        jComboChooseEmployee = new javax.swing.JComboBox<>();
        jtxtStuffNumber = new javax.swing.JTextField();
        jComboJobTitle = new javax.swing.JComboBox<>();
        jbtnDeleteEditEmployee = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Choose Employee");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Employee Name");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Employee Surname");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Job Title");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Staff Number");

        jbtnSaveEditEmployee.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtnSaveEditEmployee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student_management/save.png"))); // NOI18N
        jbtnSaveEditEmployee.setText("Save");
        jbtnSaveEditEmployee.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jbtnSaveEditEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSaveEditEmployeeActionPerformed(evt);
            }
        });

        jtxtEmployeeName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtxtEmployeeName.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtxtEmployeeName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtEmployeeNameActionPerformed(evt);
            }
        });

        jtxtEmployeeSurname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtxtEmployeeSurname.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtxtEmployeeSurname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtEmployeeSurnameActionPerformed(evt);
            }
        });

        jComboChooseEmployee.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboChooseEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboChooseEmployeeActionPerformed(evt);
            }
        });

        jtxtStuffNumber.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtxtStuffNumber.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtxtStuffNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtStuffNumberActionPerformed(evt);
            }
        });

        jComboJobTitle.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jbtnDeleteEditEmployee.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtnDeleteEditEmployee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student_management/exit.png"))); // NOI18N
        jbtnDeleteEditEmployee.setText("Delete");
        jbtnDeleteEditEmployee.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Edit An Employee By Filling In The Following Details");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(106, 106, 106)
                                .addComponent(jtxtStuffNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(76, 76, 76)
                                .addComponent(jComboChooseEmployee, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(88, 88, 88)
                                .addComponent(jtxtEmployeeName, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(141, 141, 141)
                                .addComponent(jComboJobTitle, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(66, 66, 66)
                                .addComponent(jtxtEmployeeSurname, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(239, 239, 239)
                        .addComponent(jbtnSaveEditEmployee)
                        .addGap(31, 31, 31)
                        .addComponent(jbtnDeleteEditEmployee)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(134, 134, 134))
            .addGroup(layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboChooseEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtxtEmployeeName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtxtEmployeeSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboJobTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtxtStuffNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnSaveEditEmployee)
                    .addComponent(jbtnDeleteEditEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(94, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtEmployeeNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtEmployeeNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtEmployeeNameActionPerformed

    private void jtxtEmployeeSurnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtEmployeeSurnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtEmployeeSurnameActionPerformed

    private void jtxtStuffNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtStuffNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtStuffNumberActionPerformed

    private void jbtnSaveEditEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSaveEditEmployeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnSaveEditEmployeeActionPerformed

    private void jComboChooseEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboChooseEmployeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboChooseEmployeeActionPerformed

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
            java.util.logging.Logger.getLogger(EditEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboChooseEmployee;
    private javax.swing.JComboBox<String> jComboJobTitle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton jbtnDeleteEditEmployee;
    private javax.swing.JButton jbtnSaveEditEmployee;
    private javax.swing.JTextField jtxtEmployeeName;
    private javax.swing.JTextField jtxtEmployeeSurname;
    private javax.swing.JTextField jtxtStuffNumber;
    // End of variables declaration//GEN-END:variables
}
