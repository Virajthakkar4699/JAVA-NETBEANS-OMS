/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mahadevfoam_dealers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.sql.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Student
 */
public class cash_mgmt extends javax.swing.JFrame {

    /**
     * Creates new form cash_mgmt
     */
    public cash_mgmt() {
        initComponents();
        jLabel4.setVisible(false);
        jLabel6.setVisible(false);
        jLabel3.setVisible(false);
        jLabel5.setVisible(false);
        jid.setVisible(false);
        jamount.setVisible(false);
        jrefer.setVisible(false);
        jSpinner1.setVisible(false);
        jButton1.setVisible(false);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        Debit = new javax.swing.JRadioButton();
        credt = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton3 = new javax.swing.JButton();
        jid = new javax.swing.JTextField();
        jamount = new javax.swing.JTextField();
        jrefer = new javax.swing.JTextField();
        jSpinner1 = new javax.swing.JSpinner();
        jSpinner4 = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Manage your Cash");
        setPreferredSize(new java.awt.Dimension(700, 465));
        getContentPane().setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Amount", "Account of", "Date"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 95, 311, 140);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Amount", "Account of", "Date"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(10, 278, 311, 140);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Credit");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(132, 65, 43, 19);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Debit");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(129, 253, 43, 19);

        jPanel1.setBackground(new java.awt.Color(36, 47, 65));
        jPanel1.setLayout(null);

        jButton2.setBackground(new java.awt.Color(97, 212, 195));
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(500, 310, 130, 23);

        jButton1.setBackground(new java.awt.Color(97, 212, 195));
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(500, 270, 130, 23);

        buttonGroup1.add(Debit);
        Debit.setForeground(new java.awt.Color(255, 255, 255));
        Debit.setText("Debit");
        Debit.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                DebitStateChanged(evt);
            }
        });
        Debit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DebitActionPerformed(evt);
            }
        });
        jPanel1.add(Debit);
        Debit.setBounds(480, 40, 70, 23);

        buttonGroup1.add(credt);
        credt.setForeground(new java.awt.Color(255, 255, 255));
        credt.setText("Credit");
        credt.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                credtStateChanged(evt);
            }
        });
        credt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                credtActionPerformed(evt);
            }
        });
        jPanel1.add(credt);
        credt.setBounds(380, 40, 80, 23);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ID:-");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(380, 100, 112, 30);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Amount");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(380, 140, 140, 30);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Account of:-");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(380, 180, 140, 30);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Date:-");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(380, 230, 112, 22);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(340, 10, 2, 407);

        jButton3.setBackground(new java.awt.Color(97, 212, 195));
        jButton3.setText("View Record Date wise");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(150, 23, 180, 30);
        jPanel1.add(jid);
        jid.setBounds(500, 100, 111, 30);
        jPanel1.add(jamount);
        jamount.setBounds(500, 140, 111, 30);
        jPanel1.add(jrefer);
        jrefer.setBounds(500, 180, 111, 30);

        jSpinner1.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1513428373473L), new java.util.Date(1513428373473L), new java.util.Date(1513428373473L), java.util.Calendar.MONTH));
        jSpinner1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSpinner1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner1StateChanged(evt);
            }
        });
        jPanel1.add(jSpinner1);
        jSpinner1.setBounds(500, 230, 130, 31);

        jSpinner4.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1513426523230L), null, null, java.util.Calendar.MONTH));
        jSpinner4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSpinner4.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner4StateChanged(evt);
            }
        });
        jPanel1.add(jSpinner4);
        jSpinner4.setBounds(10, 20, 130, 31);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 700, 430);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jSpinner1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner1StateChanged
        //Spinner
        //Model property

        //jLabel1.setText(new SimpleDateFormat("yyyy-MM-dd").format(jSpinner1.getValue()));
//        String date=(new SimpleDateFormat("yyyy-MM-dd").format(jSpinner1.getValue()));
        // jcusname.setText(date); the value is stored in variable can be directly into database.
    }//GEN-LAST:event_jSpinner1StateChanged

    private void credtStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_credtStateChanged

    }//GEN-LAST:event_credtStateChanged

    private void DebitStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_DebitStateChanged

    }//GEN-LAST:event_DebitStateChanged

    private void credtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_credtActionPerformed
         jLabel4.setVisible(true);
        jLabel6.setVisible(true);
        jLabel3.setVisible(true);
        jLabel5.setVisible(true);
        jid.setVisible(true);
        jamount.setVisible(true);
        jrefer.setVisible(true);
        jSpinner1.setVisible(true);
        jButton1.setVisible(true);
    }//GEN-LAST:event_credtActionPerformed

    private void DebitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DebitActionPerformed
          jLabel4.setVisible(true);
        jLabel6.setVisible(true);
        jLabel3.setVisible(true);
        jLabel5.setVisible(true);
        jid.setVisible(true);
        jamount.setVisible(true);
        jrefer.setVisible(true);
        jSpinner1.setVisible(true);
        jButton1.setVisible(true);
    }//GEN-LAST:event_DebitActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        DefaultTableModel model1=(DefaultTableModel)jTable1.getModel();
        DefaultTableModel model2=(DefaultTableModel)jTable2.getModel();
        
        String id=jid.getText();
        String amount=jamount.getText();
        String reference=jrefer.getText();
        String date=(new SimpleDateFormat("yyyy-MM-dd").format(jSpinner1.getValue()));
        try
        {
            Class.forName("java.sql.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mahadev_foam","root","admin");
            Statement stmt = conn.createStatement();
            if(credt.isSelected())
            {
                String sqlinsert="insert into cash_cr values('"+id+"','"+amount+"','"+reference+"','"+date+"');";
                stmt.executeUpdate(sqlinsert);
                JOptionPane.showMessageDialog(this, "Record saved..!");
                
                String sqlretail="select * from cash_cr where date='"+date+"';";
    ResultSet rs=stmt.executeQuery(sqlretail);
    int rows=model1.getRowCount();
    if(rows>0)
    {
        for(int i=0;i<rows;i++)
        {
            model1.removeRow(0);
        }          
    }
    while(rs.next())
    {
        model1.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)});   
    }
                
            }
            if(Debit.isSelected())
            {
                String sqlinsert="insert into cash_de values('"+id+"','"+amount+"','"+reference+"','"+date+"');";
                stmt.executeUpdate(sqlinsert);
                JOptionPane.showMessageDialog(this, "Record saved..!");
            }    
            
            String sqlretail="select * from cash_de where date='"+date+"';";
    ResultSet rs=stmt.executeQuery(sqlretail);
    int rows=model2.getRowCount();
    if(rows>0)
    {
        for(int i=0;i<rows;i++)
        {
            model2.removeRow(0);
        }          
    }
    while(rs.next())
    {
        model2.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)});   
    }
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        
        
        
        
        jid.setText(null);
        jamount.setText(null);
        jrefer.setText(null);
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new mahadev_menu_page().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        DefaultTableModel model1=(DefaultTableModel)jTable1.getModel();
        DefaultTableModel model2=(DefaultTableModel)jTable2.getModel();
        String date=(new SimpleDateFormat("yyyy-MM-dd").format(jSpinner4.getValue()));
        
try{
    
    Class.forName("java.sql.Driver");
    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mahadev_foam","root","admin");
    Statement stmt=conn.createStatement();
                
    String sqlcredit="select * from cash_cr where date='"+date+"';";
    ResultSet rs=stmt.executeQuery(sqlcredit);
    int rows=model1.getRowCount();
    if(rows>0)
    {
        for(int i=0;i<rows;i++)
        {
            model1.removeRow(0);
        }          
    }
    while(rs.next())
    {
        model1.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)});   
    }
    
    String sqldebit="select * from cash_de where date='"+date+"';";
    ResultSet rs1=stmt.executeQuery(sqldebit);
    int rows1=model2.getRowCount();
    if(rows1>0)
    {
        for(int i=0;i<rows1;i++)
        {
            model2.removeRow(0);
        }          
    }
    while(rs1.next())
    {
        model2.addRow(new Object[]{rs1.getString(1),rs1.getString(2),rs1.getString(3),rs1.getString(4)});  
    }
    }

  catch(Exception e)
 {
        JOptionPane.showMessageDialog(this, e.getMessage()); 
 }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jSpinner4StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner4StateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jSpinner4StateChanged

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
            java.util.logging.Logger.getLogger(cash_mgmt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cash_mgmt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cash_mgmt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cash_mgmt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cash_mgmt().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Debit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton credt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jamount;
    private javax.swing.JTextField jid;
    private javax.swing.JTextField jrefer;
    // End of variables declaration//GEN-END:variables
}
