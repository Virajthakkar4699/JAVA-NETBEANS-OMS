/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mahadevfoam_dealers;

import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.*;


/**
 *
 * @author SAGAR
 */
public class login_page1 extends javax.swing.JFrame {

    /**
     * Creates new form login_page1
     */
    public login_page1() {
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
        jPanel2 = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        jTfuserid = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        jpassfromuser = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jTfnewuserpass = new javax.swing.JPasswordField();
        jTfnewuserid = new javax.swing.JTextField();
        jTfadminid = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jadminpass = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Signup = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(36, 47, 65));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(97, 212, 195));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 270, 10));

        jLabel14.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("USERNAME");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jTfuserid.setBackground(new java.awt.Color(97, 212, 195));
        jTfuserid.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTfuserid.setForeground(new java.awt.Color(255, 255, 255));
        jTfuserid.setText("Enter your username");
        jTfuserid.setBorder(null);
        jTfuserid.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        jTfuserid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTfuseridMouseClicked(evt);
            }
        });
        jPanel2.add(jTfuserid, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jSeparator7.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 270, -1));

        jLabel15.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("PASSWORD");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jpassfromuser.setBackground(new java.awt.Color(97, 212, 195));
        jpassfromuser.setForeground(new java.awt.Color(255, 255, 255));
        jpassfromuser.setText("jPasswordField1");
        jpassfromuser.setBorder(null);
        jpassfromuser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jpassfromuserFocusGained(evt);
            }
        });
        jPanel2.add(jpassfromuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 270, 30));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("LOGIN");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, -1, -1));

        jButton1.setBackground(new java.awt.Color(36, 47, 65));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mahadevfoam_dealers/images/Dark BG.JPG"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 120, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 350, 290));

        jPanel5.setBackground(new java.awt.Color(36, 47, 65));
        jPanel5.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("USERNAME");
        jPanel5.add(jLabel4);
        jLabel4.setBounds(75, 29, 71, 19);

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("PASSWORD");
        jPanel5.add(jLabel5);
        jLabel5.setBounds(75, 111, 75, 19);

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.add(jSeparator4);
        jSeparator4.setBounds(75, 90, 270, 10);

        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.add(jSeparator5);
        jSeparator5.setBounds(75, 177, 270, 2);

        jTfnewuserpass.setBackground(new java.awt.Color(36, 47, 65));
        jTfnewuserpass.setForeground(new java.awt.Color(255, 255, 255));
        jTfnewuserpass.setText("jPasswordField1");
        jTfnewuserpass.setBorder(null);
        jTfnewuserpass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTfnewuserpassFocusGained(evt);
            }
        });
        jTfnewuserpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTfnewuserpassActionPerformed(evt);
            }
        });
        jPanel5.add(jTfnewuserpass);
        jTfnewuserpass.setBounds(75, 136, 270, 30);

        jTfnewuserid.setBackground(new java.awt.Color(36, 47, 65));
        jTfnewuserid.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTfnewuserid.setForeground(new java.awt.Color(255, 255, 255));
        jTfnewuserid.setText("Enter your username");
        jTfnewuserid.setBorder(null);
        jTfnewuserid.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        jTfnewuserid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTfnewuseridMouseClicked(evt);
            }
        });
        jPanel5.add(jTfnewuserid);
        jTfnewuserid.setBounds(75, 54, 270, 30);

        jTfadminid.setBackground(new java.awt.Color(36, 47, 65));
        jTfadminid.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTfadminid.setForeground(new java.awt.Color(255, 255, 255));
        jTfadminid.setText("Enter administrator ID");
        jTfadminid.setBorder(null);
        jTfadminid.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        jTfadminid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTfadminidFocusGained(evt);
            }
        });
        jTfadminid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTfadminidActionPerformed(evt);
            }
        });
        jPanel5.add(jTfadminid);
        jTfadminid.setBounds(75, 222, 270, 30);

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("ADMINISTRATOR ID");
        jPanel5.add(jLabel11);
        jLabel11.setBounds(75, 192, 126, 19);

        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.add(jSeparator6);
        jSeparator6.setBounds(75, 344, 270, 10);

        jSeparator8.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.add(jSeparator8);
        jSeparator8.setBounds(75, 263, 270, 2);

        jadminpass.setBackground(new java.awt.Color(36, 47, 65));
        jadminpass.setForeground(new java.awt.Color(255, 255, 255));
        jadminpass.setText("jPasswordField1");
        jadminpass.setBorder(null);
        jadminpass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jadminpassFocusGained(evt);
            }
        });
        jPanel5.add(jadminpass);
        jadminpass.setBounds(75, 308, 270, 30);

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("ADMINISTRATOR PASSWORD");
        jPanel5.add(jLabel6);
        jLabel6.setBounds(75, 283, 187, 19);

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel7.setText("Sign up");
        jPanel5.add(jLabel7);
        jLabel7.setBounds(170, 380, 60, 19);

        Signup.setBackground(new java.awt.Color(36, 47, 65));
        Signup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mahadevfoam_dealers/images/Cyan BG.JPG"))); // NOI18N
        Signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignupActionPerformed(evt);
            }
        });
        jPanel5.add(Signup);
        Signup.setBounds(135, 372, 123, 39);

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText(" Sign Up");
        jPanel5.add(jLabel3);
        jLabel3.setBounds(190, 0, 69, 23);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel5.add(jSeparator1);
        jSeparator1.setBounds(20, -20, 10, 440);

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, 420, 550));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("MAHADEV FOAM AND FURNISHING");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 410, 50));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("BUSINESS MANAGEMENT SYSTEM");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, -1, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 842, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTfadminidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTfadminidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTfadminidActionPerformed

    private void jTfnewuseridMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTfnewuseridMouseClicked
        // TODO add your handling code here:
        jTfnewuserid.setText("");
    }//GEN-LAST:event_jTfnewuseridMouseClicked

    private void jTfadminidFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTfadminidFocusGained
        // TODO add your handling code here:
         jTfadminid.setText("");
    }//GEN-LAST:event_jTfadminidFocusGained
    
    private void jTfnewuserpassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTfnewuserpassFocusGained
        // TODO add your handling code here:
        jTfnewuserpass.setText("");
    }//GEN-LAST:event_jTfnewuserpassFocusGained

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel2MouseClicked

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        // TODO add your handling code here:   
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jadminpassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jadminpassFocusGained
        jadminpass.setText(null);
    }//GEN-LAST:event_jadminpassFocusGained

    private void jTfuseridMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTfuseridMouseClicked
        jTfuserid.setText(null);
    }//GEN-LAST:event_jTfuseridMouseClicked

    private void jpassfromuserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jpassfromuserFocusGained
        jpassfromuser.setText(null);
    }//GEN-LAST:event_jpassfromuserFocusGained

    private void jTfnewuserpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTfnewuserpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTfnewuserpassActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try
       { 
         Class.forName("java.sql.Driver");
         Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mahadev_foam","root","admin");
         Statement stmt = conn.createStatement();
         String useridfromuser = jTfuserid.getText();
         String passwordfromuser =jpassfromuser.getText();
         String sql = "SELECT * FROM login where userid='"+useridfromuser+"';";
         ResultSet rs = stmt.executeQuery(sql);
         
                 
         //String password=rs.getString("password");
         if(rs.next()) 
         {         
            String password=rs.getString("password");  // password from database
            if(password.equals(passwordfromuser))
            {
              new mahadev_menu_page().setVisible(true);
              dispose();
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Check username or password..!");
            }
         }
         
       }
       catch(Exception e)
       {
           JOptionPane.showMessageDialog(this, e.getMessage());
       }  
    }//GEN-LAST:event_jButton1ActionPerformed

    private void SignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignupActionPerformed
        try
       { 
         Class.forName("java.sql.Driver");
         Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mahadev_foam","root","admin");
         Statement stmt = conn.createStatement();
         String newuser = jTfnewuserid.getText();
         String newpassword =jTfnewuserpass.getText();
         String adminid = jTfadminid.getText();
         String adminpass = jadminpass.getText();
         String sql = "SELECT * FROM login where userid='"+adminid+"';";
         ResultSet rs = stmt.executeQuery(sql);
         
         //String password=rs.getString("password");
         if(rs.next()) 
         {         
            String password=rs.getString("password");
            if(password.equals(adminpass))
            {
                String sqlinsert = "INSERT INTO LOGIN VALUES('"+newuser+"','"+newpassword+"');";
                                  //insert into login values('newuser','newpassword');
                stmt.executeUpdate(sqlinsert);
                JOptionPane.showMessageDialog(this, "New User Created..!");
                jTfadminid.setText(null);
                jTfnewuserid.setText(null);
                jTfnewuserpass.setText(null);
                jadminpass.setText(null);
                new mahadev_menu_page().setVisible(true);
                dispose();
                
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Check admin userid or pass..!");
            }
         }
         
       }
       catch(HeadlessException e)
       {
           JOptionPane.showMessageDialog(this, e.getMessage());
       } catch (ClassNotFoundException e) {
           JOptionPane.showMessageDialog(this, e.getMessage());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_SignupActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new login_page1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Signup;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTextField jTfadminid;
    private javax.swing.JTextField jTfnewuserid;
    private javax.swing.JPasswordField jTfnewuserpass;
    private javax.swing.JTextField jTfuserid;
    private javax.swing.JPasswordField jadminpass;
    private javax.swing.JPasswordField jpassfromuser;
    // End of variables declaration//GEN-END:variables
}
