/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mahadevfoam_dealers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mahadav
 */
public class customer_management extends javax.swing.JFrame {

    /**
     * Creates new form customer_management
     */
    public customer_management() {
        initComponents();
         try {
        Class.forName("java.sql.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mahadev_foam","root","admin");
        Statement stmt = conn.createStatement();
        String combo_group = "Select DISTINCT region from region_list;";
        ResultSet rs = stmt.executeQuery(combo_group);
 
       while(rs.next())
        {
        jcomboregion.addItem(rs.getString(1));
        }
        
            } 
        catch (Exception e)
            {
            JOptionPane.showMessageDialog(this, e.getMessage());
            }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jrbtable = new javax.swing.JRadioButton();
        jrbfield = new javax.swing.JRadioButton();
        jrbsearch = new javax.swing.JRadioButton();
        jrbregionwise = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jcustable = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtfcusaddress = new javax.swing.JTextArea();
        jtfcusphone = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtfcusname = new javax.swing.JTextField();
        jtfid = new javax.swing.JTextField();
        jcomboregion = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Customer Management");
        setMinimumSize(new java.awt.Dimension(910, 490));
        setPreferredSize(new java.awt.Dimension(925, 500));
        getContentPane().setLayout(null);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Region");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 242, 100, 20);

        jPanel1.setBackground(new java.awt.Color(36, 47, 65));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jButton2.setBackground(new java.awt.Color(97, 212, 195));
        jButton2.setText("Add Customer");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(10, 290, 130, 23);

        jButton3.setBackground(new java.awt.Color(97, 212, 195));
        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(150, 290, 80, 23);

        jButton4.setBackground(new java.awt.Color(97, 212, 195));
        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(240, 290, 70, 23);

        buttonGroup1.add(jrbtable);
        jrbtable.setForeground(new java.awt.Color(255, 255, 255));
        jrbtable.setText("View in Table");
        jPanel1.add(jrbtable);
        jrbtable.setBounds(50, 340, 120, 23);

        buttonGroup1.add(jrbfield);
        jrbfield.setForeground(new java.awt.Color(255, 255, 255));
        jrbfield.setText("View in Fields");
        jPanel1.add(jrbfield);
        jrbfield.setBounds(50, 370, 120, 23);

        buttonGroup1.add(jrbsearch);
        jrbsearch.setForeground(new java.awt.Color(255, 255, 255));
        jrbsearch.setText("Search");
        jPanel1.add(jrbsearch);
        jrbsearch.setBounds(50, 400, 120, 23);

        buttonGroup1.add(jrbregionwise);
        jrbregionwise.setForeground(new java.awt.Color(255, 255, 255));
        jrbregionwise.setText("View Region Wise");
        jPanel1.add(jrbregionwise);
        jrbregionwise.setBounds(50, 430, 170, 23);

        jButton1.setBackground(new java.awt.Color(97, 212, 195));
        jButton1.setText("View");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(200, 380, 80, 23);

        jcustable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Number", "Address", "Region"
            }
        ));
        jcustable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jcustable);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(520, 20, 366, 402);

        jButton6.setBackground(new java.awt.Color(97, 212, 195));
        jButton6.setText("Go to Billings");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(400, 290, 110, 23);

        jButton5.setBackground(new java.awt.Color(97, 212, 195));
        jButton5.setText("Back");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(320, 290, 70, 23);

        jtfcusaddress.setColumns(20);
        jtfcusaddress.setRows(5);
        jScrollPane2.setViewportView(jtfcusaddress);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(130, 136, 364, 90);
        jPanel1.add(jtfcusphone);
        jtfcusphone.setBounds(130, 100, 364, 30);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name:-");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 60, 240, 30);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Contact Number:-");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 100, 150, 30);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Address:-");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 140, 190, 30);
        jPanel1.add(jtfcusname);
        jtfcusname.setBounds(130, 60, 364, 30);
        jPanel1.add(jtfid);
        jtfid.setBounds(130, 20, 50, 30);

        jcomboregion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcomboregionActionPerformed(evt);
            }
        });
        jPanel1.add(jcomboregion);
        jcomboregion.setBounds(130, 240, 110, 30);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Customer ID:-");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 20, 120, 24);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 910, 460);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcomboregionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcomboregionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcomboregionActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
try {
            Class.forName("java.sql.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mahadev_foam","root","admin");
            Statement stmt = conn.createStatement();
            String id=jtfid.getText();
            String name=jtfcusname.getText();
            String phone=jtfcusphone.getText();
            String address=jtfcusaddress.getText();
            String region=jcomboregion.getSelectedItem().toString();
            
            String sql = "update customer_details set cus_name='"+name+"',cus_phone='"+phone+"',cus_address='"+address+"',cus_region='"+region+"'where cus_id='"+id+"';";
            stmt.executeUpdate(sql);
            
            
            JOptionPane.showMessageDialog(this,"customer details updated  Sucessfully...");
            
            DefaultTableModel model=(DefaultTableModel)jcustable.getModel();

                     String sqlview="select * from customer_details;";

                     ResultSet rs=stmt.executeQuery(sqlview);

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
                        model.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)});
                    }
            
            } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(this, e.getMessage());  
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
 try
        {
            Class.forName("java.sql.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mahadev_foam","root","admin");
            Statement stmt = conn.createStatement();
            String id=jtfid.getText();
            
            String sqldelete = "delete from customer_details where cus_id='"+id+"';";
            stmt.executeUpdate(sqldelete);
            
            JOptionPane.showMessageDialog(this, "customer detail deleted..!");
            jtfid.setText(null);
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
new mahadev_menu_page().setVisible(true);
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(jrbtable.isSelected())
        {
            try{
                    DefaultTableModel model=(DefaultTableModel)jcustable.getModel();

                    Class.forName("java.sql.Driver");
                    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mahadev_foam","root","admin");
                    Statement stmt=conn.createStatement();

                     String sql="select * from customer_details;";

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
                        model.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)});
                    }

                }    
                catch(Exception e)
                {
                        JOptionPane.showMessageDialog(this, "Database Connection Error.....!"); 
                }

                    }
        if (jrbfield.isSelected())
        {
                     try {
                    Class.forName("java.sql.Driver");
                    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mahadev_foam","root","admin");
                    Statement stmt=conn.createStatement();
                    int id=Integer.parseInt(jtfid.getText());
                    String sql="select * from customer_details WHERE cus_id='"+id+"';";
                    ResultSet rs1=stmt.executeQuery(sql);

                     if(rs1.next())
                     {
                     jtfid.setText(rs1.getString("CUS_ID"));
                     jtfcusname.setText(rs1.getString("CUS_NAME"));
                     jtfcusphone.setText(rs1.getString("CUS_PHONE"));
                     jtfcusaddress.setText(rs1.getString("CUS_ADDRESS"));
                     jcomboregion.setSelectedItem(rs1.getString("CUS_REGION"));
                     }
                        }
                        catch (Exception e)
                        {
                            JOptionPane.showMessageDialog(this, e.getMessage());
                        }
                    }
        if (jrbsearch.isSelected())
        {
            try {
                        DefaultTableModel model=(DefaultTableModel)jcustable.getModel();
                        Class.forName("java.sql.Driver");
                        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mahadev_foam","root","admin");
                        Statement stmt = conn.createStatement();
                        String name = (jtfcusname.getText());
                        String sql = "SELECT * FROM customer_details where cus_name like '%"+name+"%';";

                        ResultSet rs = stmt.executeQuery(sql);

                        int rows=model.getRowCount();
                    if(rows>=0)
                    {
                        for (int i=0;i<rows;i++)
                        {
                            model.removeRow(0);
                        }

                            while(rs.next())
                            {
                                model.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)});
                            }

                    }
          }
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }       
        }
        if (jrbregionwise.isSelected())
        {
            
                        try 
                        {
                        DefaultTableModel model=(DefaultTableModel)jcustable.getModel();
                        Class.forName("java.sql.Driver");
                        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mahadev_foam","root","admin");
                        Statement stmt = conn.createStatement();
                        String region = jcomboregion.getSelectedItem().toString();
                        String sql = "SELECT * FROM customer_details where cus_region='"+region+"';"; 

                        ResultSet rs = stmt.executeQuery(sql);

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
                                model.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)});
                            }

                        }                      
                        catch (Exception e)
                        {
                            JOptionPane.showMessageDialog(this, e.getMessage());
                        }
           }
               
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try 
        {
            Class.forName("java.sql.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mahadev_foam","root","admin");
            Statement stmt = conn.createStatement();
            int id=Integer.parseInt(jtfid.getText());
            int id2=id+1;
            String name=jtfcusname.getText();
            String phone=jtfcusphone.getText();
            String address=jtfcusaddress.getText();
            String region=jcomboregion.getSelectedItem().toString();
            
            String sqlinsert = "insert into customer_details values('"+id+"','"+name+"','"+phone+"','"+address+"','"+region+"');";
            stmt.executeUpdate(sqlinsert);
            
            jtfcusaddress.setText(null);
            jtfcusname.setText(null);
            jtfcusphone.setText(null);
            jtfcusname.setText(null);
            jtfid.setText(""+id2);
            JOptionPane.showMessageDialog(this, "Customer added succesfully");
        }
        catch (Exception e)
        {
            
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
new bills().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(customer_management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(customer_management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(customer_management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(customer_management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new customer_management().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox jcomboregion;
    private javax.swing.JTable jcustable;
    private javax.swing.JRadioButton jrbfield;
    private javax.swing.JRadioButton jrbregionwise;
    private javax.swing.JRadioButton jrbsearch;
    private javax.swing.JRadioButton jrbtable;
    private javax.swing.JTextArea jtfcusaddress;
    private javax.swing.JTextField jtfcusname;
    private javax.swing.JTextField jtfcusphone;
    private javax.swing.JTextField jtfid;
    // End of variables declaration//GEN-END:variables
}
