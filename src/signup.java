/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hrithik
 */
import java.sql.*;
import javax.swing.JOptionPane;

public class signup extends javax.swing.JFrame {

    /**
     * Creates new form signup
     */
    public signup() {
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

        jPanel1 = new javax.swing.JPanel();
        jTextField3 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        jLabel8.setVisible(false);
        jLabel7 = new javax.swing.JLabel();
        jLabel7.setVisible(false);
        jLabel6 = new javax.swing.JLabel();
        jLabel6.setVisible(false);
        jLabel5 = new javax.swing.JLabel();
        jLabel5.setVisible(false);
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField3.setText("     User Name");
        jTextField3.setToolTipText("");
        jTextField3.setBorder(null);
        jTextField3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField3MouseClicked(evt);
            }
        });
        jPanel1.add(jTextField3);
        jTextField3.setBounds(250, 250, 360, 40);

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField1.setText("    Email ID");
        jTextField1.setBorder(null);
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(250, 350, 360, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Password");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(270, 460, 120, 22);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Confirm Password");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(270, 570, 160, 22);

        jPasswordField2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPasswordField2.setBorder(null);
        jPasswordField2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPasswordField2MouseClicked(evt);
            }
        });
        jPanel1.add(jPasswordField2);
        jPasswordField2.setBounds(250, 560, 310, 40);

        jPasswordField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPasswordField1.setBorder(null);
        jPasswordField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPasswordField1MouseClicked(evt);
            }
        });
        jPanel1.add(jPasswordField1);
        jPasswordField1.setBounds(250, 450, 310, 40);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(123, 42, 255));
        jLabel8.setText("!");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(640, 550, 41, 40);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(123, 42, 255));
        jLabel7.setText("!");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(640, 450, 41, 40);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(123, 42, 255));
        jLabel6.setText("!");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(640, 250, 41, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(123, 42, 255));
        jLabel5.setText("!");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(640, 350, 41, 40);

        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2);
        jLabel2.setBounds(560, 660, 250, 50);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sign_up.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1360, 840);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 855, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
        // TODO add your handling code here:
        jTextField1.setText("");
    }//GEN-LAST:event_jTextField1MouseClicked

    private void jTextField3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField3MouseClicked
        // TODO add your handling code here:
        jTextField3.setText("");
    }//GEN-LAST:event_jTextField3MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        jLabel7.setVisible(false);
        jLabel6.setVisible(false);
        jLabel5.setVisible(false);
        jLabel8.setVisible(false);
        
        int flag=1;
        String username = jTextField3.getText();
        String email = jTextField1.getText();
        String pass = jPasswordField1.getText();
        String cpass = jPasswordField2.getText();

        if(!Msignup.validate_username(username)) {
            jLabel6.setVisible(true);
            flag =0;
        }
        if(!Msignup.validate_email(email)) {
            jLabel5.setVisible(true);
            flag =0;
        }
        if(!Msignup.validate_password(pass)) {
            jLabel7.setVisible(true);
            flag =0;
        }
        if(!Msignup.confirm_password(pass,cpass)) {
            jLabel8.setVisible(true);
            flag =0;
        }
        if(!Msignup.email_is_exists(email)) {
            JOptionPane.showMessageDialog(this, "Email Id already used");
            jLabel5.setVisible(true);
            flag =0;
        }
        
        if(flag==1)
        {
            new SIGNUP_2().setVisible(true);
            SIGNUP_2.jLabel4.setVisible(false);
            SIGNUP_2.jLabel5.setVisible(false);
            SIGNUP_2.jLabel3.setVisible(false);
            SIGNUP_2.jLabel3.setText(username);
            SIGNUP_2.jLabel4.setText(email);
            SIGNUP_2.jLabel5.setText(pass);
            this.setVisible(false);
           
        }
        
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jPasswordField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordField1MouseClicked
        // TODO add your handling code here:
        jLabel3.setVisible(false);
    }//GEN-LAST:event_jPasswordField1MouseClicked

    private void jPasswordField2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordField2MouseClicked
        // TODO add your handling code here:
        jLabel4.setVisible(false);
    }//GEN-LAST:event_jPasswordField2MouseClicked

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
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
