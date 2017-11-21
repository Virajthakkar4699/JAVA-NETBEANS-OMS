/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mahadevfoam_dealers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Student
 */
public class Vendor_details extends javax.swing.JFrame {
    private String dealer_group;

    /**
     * Creates new form Vendor_details
     */
    public Vendor_details() {
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

        jLabel10 = new javax.swing.JLabel();
        jfirmname1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jtingst1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jid1 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jcontactnumber1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jtincst1 = new javax.swing.JTextField();
        jcontactperson1 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jtfadd = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vendor Details");
        setPreferredSize(new java.awt.Dimension(920, 410));
        getContentPane().setLayout(null);

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Contact Person Name:-");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(10, 85, 112, 22);
        getContentPane().add(jfirmname1);
        jfirmname1.setBounds(140, 57, 280, 20);

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Firm Name:-");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(10, 55, 112, 24);

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("TIN CST:-");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(10, 275, 90, 14);
        getContentPane().add(jtingst1);
        jtingst1.setBounds(140, 303, 280, 20);

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Address:-");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(10, 158, 112, 23);
        getContentPane().add(jid1);
        jid1.setBounds(140, 27, 280, 20);

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Contact Number:-");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(10, 118, 112, 22);
        getContentPane().add(jcontactnumber1);
        jcontactnumber1.setBounds(140, 119, 280, 20);

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("TIN GST:-");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(10, 306, 100, 14);
        getContentPane().add(jtincst1);
        jtincst1.setBounds(140, 272, 280, 20);
        getContentPane().add(jcontactperson1);
        jcontactperson1.setBounds(140, 86, 280, 20);

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Vendor  ID:-");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(10, 25, 112, 24);
        getContentPane().add(jtfadd);
        jtfadd.setBounds(140, 159, 280, 95);

        jPanel1.setBackground(new java.awt.Color(36, 47, 65));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jButton1.setBackground(new java.awt.Color(97, 212, 195));
        jButton1.setText("View");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(97, 212, 195));
        jButton7.setText("Back");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(97, 212, 195));
        jButton8.setText("Dealer update");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(97, 212, 195));
        jButton2.setText("Add Dealer");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Firm Name", "Contact person", "Number"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton4.setBackground(new java.awt.Color(97, 212, 195));
        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jButton2)
                .addGap(5, 5, 5)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(jButton7)
                        .addComponent(jButton8)
                        .addComponent(jButton2)
                        .addComponent(jButton4)))
                .addGap(29, 29, 29))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 920, 390);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            Class.forName("java.sql.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mahadev_foam","root","admin");
            Statement stmt = conn.createStatement();
            
            int id=Integer.parseInt(jid1.getText());
            String firm_name=jfirmname1.getText();
            String contact_person=jcontactperson1.getText();
            String contact_number=jcontactnumber1.getText();
            String address=jtfadd.getText();
            String tin_cst=jtincst1.getText();
            String tin_gst=jtingst1.getText();

            String sql = "insert into vendor_details values('"+id+"','"+firm_name+"','"+contact_person+"','"+contact_number+"','"+address+"','"+tin_cst+"','"+tin_gst+"');";
            stmt.executeUpdate(sql);

            JOptionPane.showMessageDialog(this,"vendor added Sucessfully...");
            jid1.setText(null);
            jfirmname1.setText(null);
            jcontactnumber1.setText(null);
            jcontactperson1.setText(null);
            jtfadd.setText(null);
            jtincst1.setText(null);
            jtingst1.setText(null);

        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        new Dealer_Portal().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        try {
            Class.forName("java.sql.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mahadev_foam","root","admin");
            Statement stmt = conn.createStatement();
            String id=jid1.getText();
            String firm_name=jfirmname1.getText();
            String contact_person=jcontactperson1.getText();
            String contact_number=jcontactnumber1.getText();
            String address=jtfadd.getText();
            String tin_cst=jtincst1.getText();
            String tin_gst=jtingst1.getText();

            String sql = "update vendor_details set firm_name='"+firm_name+"',contact_person_name='"+contact_person+"',vendor_contact_number='"+contact_number+"',vendor_address='"+address+"',vendor_tincst='"+tin_cst+"',vendor_tingst='"+tin_gst+"' where vendor_id='"+id+"';";
            stmt.executeUpdate(sql);

            JOptionPane.showMessageDialog(this,"vendors details updated  Sucessfully...");
            
            

        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try
        {
            Class.forName("java.sql.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mahadev_foam","root","admin");
            Statement stmt = conn.createStatement();
            String id=jid1.getText();

            String sqldelete = "delete from vendor_details where vendor_id='"+id+"';";
            stmt.executeUpdate(sqldelete);

            JOptionPane.showMessageDialog(this, "vendor deleted..!");
            jid1.setText(null);
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         try{
                    DefaultTableModel model=(DefaultTableModel)jTable1.getModel();

                    Class.forName("java.sql.Driver");
                    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mahadev_foam","root","admin");
                    Statement stmt=conn.createStatement();

                     String sql="select vendor_id,firm_name,contact_person_name,vendor_contact_number from vendor_details;";

                     ResultSet rs=stmt.executeQuery(sql);

                int rows=model.getRowCount();
                if(rows>0)
                    {
                        for (int i=0;i<rows;i++)
                        {
                            model.removeRow(0);
                        }
                    }
                    while(rs.next())
                    {
                        model.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)});
                    }

                }    
                catch(Exception e)
                {
                        JOptionPane.showMessageDialog(this, e.getMessage()); 
                }

                    
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Vendor_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vendor_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vendor_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vendor_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vendor_details().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jcontactnumber1;
    private javax.swing.JTextField jcontactperson1;
    private javax.swing.JTextField jfirmname1;
    private javax.swing.JTextField jid1;
    private javax.swing.JTextField jtfadd;
    private javax.swing.JTextField jtincst1;
    private javax.swing.JTextField jtingst1;
    // End of variables declaration//GEN-END:variables
}
