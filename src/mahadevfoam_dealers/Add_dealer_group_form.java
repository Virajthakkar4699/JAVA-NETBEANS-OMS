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
public class Add_dealer_group_form extends javax.swing.JFrame {

    /**
     * Creates new form Add_dealer_group_form
     */
    public Add_dealer_group_form() {
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
        jTfid = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jTfaddealer = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jdealergrptable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        viewall = new javax.swing.JButton();
        searchbutton = new javax.swing.JButton();
        back = new javax.swing.JButton();
        addgroup = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();

        jLabel3.setText("Id  No:-");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add Dealer group");
        setBackground(new java.awt.Color(36, 47, 65));
        setPreferredSize(new java.awt.Dimension(610, 345));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(36, 47, 65));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jTfaddealer, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 156, 133, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Enter Dealer Group :-");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 152, 156, 24));

        jdealergrptable.setBackground(new java.awt.Color(97, 212, 195));
        jdealergrptable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Group Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jdealergrptable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(346, 132, 220, 158));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Dealer Group Update");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 72, -1, 41));

        viewall.setBackground(new java.awt.Color(97, 212, 195));
        viewall.setText("View All");
        viewall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewallActionPerformed(evt);
            }
        });
        jPanel1.add(viewall, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 254, 154, 36));

        searchbutton.setBackground(new java.awt.Color(97, 212, 195));
        searchbutton.setText("Search");
        searchbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(searchbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 254, 105, 36));

        back.setBackground(new java.awt.Color(97, 212, 195));
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 202, 105, 34));

        addgroup.setBackground(new java.awt.Color(97, 212, 195));
        addgroup.setText("Add Dealer Group");
        addgroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addgroupActionPerformed(evt);
            }
        });
        jPanel1.add(addgroup, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 202, 154, 34));

        jSeparator7.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 119, 270, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("MAHADEV FOAM AND FURNISHING");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 11, 410, 50));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 610, 330);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        new Dealer_Portal().setVisible(true);
        dispose();
    }//GEN-LAST:event_backActionPerformed

    private void addgroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addgroupActionPerformed
        try
       { 
         Class.forName("java.sql.Driver");
         Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mahadev_foam","root","admin");
         Statement stmt = conn.createStatement();
            String dealer_group=jTfaddealer.getText().trim();
            String sql = "insert into dealer_group values('"+dealer_group+"');";
                       //"insert into dealer_group values('region');"

		stmt.executeUpdate(sql);         
                jTfaddealer.setText(null);
                JOptionPane.showMessageDialog(this,"Region added Sucessfully...");
}
        catch(Exception e)
       {
           JOptionPane.showMessageDialog(this, e.getMessage());
       }
    }//GEN-LAST:event_addgroupActionPerformed

    private void viewallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewallActionPerformed
        try{
            DefaultTableModel model=(DefaultTableModel)jdealergrptable.getModel();

            Class.forName("java.sql.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mahadev_foam","root","admin");
            Statement stmt=conn.createStatement();

            String sql="select * from dealer_group;";

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
                model.addRow(new Object[]{rs.getString(1)});
            }

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, "Database Connection Error.....!");
        }
    }//GEN-LAST:event_viewallActionPerformed

    private void searchbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbuttonActionPerformed
        try {
            DefaultTableModel model=(DefaultTableModel)jdealergrptable.getModel();
            Class.forName("java.sql.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mahadev_foam","root","admin");
            Statement stmt = conn.createStatement();
            String region = (jTfaddealer.getText());
            String sql = "SELECT * FROM dealer_group where delergroup like '%"+region+"%';";
                        //select * from region_list where region like '%r%';
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
                    model.addRow(new Object[]{rs.getString(1)});
                }

            }
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_searchbuttonActionPerformed

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
            java.util.logging.Logger.getLogger(Add_dealer_group_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_dealer_group_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_dealer_group_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_dealer_group_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_dealer_group_form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addgroup;
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTextField jTfaddealer;
    private javax.swing.JTextField jTfid;
    private javax.swing.JTable jdealergrptable;
    private javax.swing.JButton searchbutton;
    private javax.swing.JButton viewall;
    // End of variables declaration//GEN-END:variables
}
