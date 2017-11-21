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
public class Task_panel extends javax.swing.JFrame {

    /**
     * Creates new form Task_panel
     */
    public Task_panel() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jtftaskid = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jrbcustomer = new javax.swing.JRadioButton();
        jrboffice = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Task Panel");
        setPreferredSize(new java.awt.Dimension(710, 460));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(36, 47, 65));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jTable1.setBackground(new java.awt.Color(97, 212, 195));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Task ID", "Invoice ID", "Customer ID", "Name", "Phone", "Task"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(220, 140, 460, 250);

        jButton2.setBackground(new java.awt.Color(97, 212, 195));
        jButton2.setText("Set as done");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(20, 370, 110, 23);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Enter Task_ID");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 330, 80, 20);
        jPanel1.add(jtftaskid);
        jtftaskid.setBounds(130, 330, 60, 20);

        jButton1.setBackground(new java.awt.Color(97, 212, 195));
        jButton1.setText("Show Tasks");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(40, 240, 130, 23);

        jrbcustomer.setBackground(new java.awt.Color(97, 212, 195));
        buttonGroup1.add(jrbcustomer);
        jrbcustomer.setForeground(new java.awt.Color(255, 255, 255));
        jrbcustomer.setText("Customer Task");
        jPanel1.add(jrbcustomer);
        jrbcustomer.setBounds(40, 190, 130, 20);

        jrboffice.setBackground(new java.awt.Color(97, 212, 195));
        buttonGroup1.add(jrboffice);
        jrboffice.setForeground(new java.awt.Color(255, 255, 255));
        jrboffice.setText("Office Task");
        jrboffice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbofficeActionPerformed(evt);
            }
        });
        jPanel1.add(jrboffice);
        jrboffice.setBounds(40, 170, 130, 20);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Task Panel");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(280, 70, 73, 25);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Manage all your pending tasks from here");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 110, 320, 30);

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("MAHADEV FOAM AND FURNISHING");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(150, 10, 410, 50);

        jSeparator8.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator8);
        jSeparator8.setBounds(10, 100, 680, 2);

        jSeparator9.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator9);
        jSeparator9.setBounds(20, 290, 170, 2);

        jButton3.setBackground(new java.awt.Color(97, 212, 195));
        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(150, 370, 55, 23);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 700, 460);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try 
        {
            Class.forName("java.sql.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mahadev_foam","root","admin");
            Statement stmt = conn.createStatement();  
              
            if(jrboffice.isSelected())
            {
             String pnd_task="select * from tasks where status='N' and cus_id=0";
             ResultSet rs=stmt.executeQuery(pnd_task);
             DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
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
                        model.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)});
                    }

            }
            if(jrbcustomer.isSelected())
            {
             String pnd_task="select * from tasks where status='N'and name!='mahadev foam';";
             ResultSet rs=stmt.executeQuery(pnd_task);
             DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
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
                        model.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)});
                    }
            }
        } 
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try
        {
           Class.forName("java.sql.Driver");
           Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mahadev_foam","root","admin");
           Statement stmt = conn.createStatement(); 
           
           String id=jtftaskid.getText();
           String taskdone="update tasks set status='Y' where status='N' and taskid='"+id+"';";
           stmt.executeUpdate(taskdone);
           JOptionPane.showMessageDialog(this, "Hurray You Just completed Your task keep it up..!");
           jtftaskid.setText(null);
           
           
           if(jrboffice.isSelected())
            {
             String pnd_task="select * from tasks where status='N' and cus_id=0";
             ResultSet rs=stmt.executeQuery(pnd_task);
             DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
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
                        model.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)});
                    }

            }
            if(jrbcustomer.isSelected())
            {
             String pnd_task="select * from tasks where status='N';";
             ResultSet rs=stmt.executeQuery(pnd_task);
             DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
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
                        model.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)});
                    }
        }
        }
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jrbofficeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbofficeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbofficeActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new mahadev_menu_page().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Task_panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Task_panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Task_panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Task_panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Task_panel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton jrbcustomer;
    private javax.swing.JRadioButton jrboffice;
    private javax.swing.JTextField jtftaskid;
    // End of variables declaration//GEN-END:variables
}
