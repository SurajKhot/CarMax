/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carmax;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Suraj
 */
public class buycars2 extends javax.swing.JFrame {
PreparedStatement pst=null;
Connection con=null;
String sql=null;
ResultSet rs=null;
    /**
     * Creates new form buycars2
     */
    public buycars2() {
        initComponents();
        xuv();
        xuvp();
        lambo();
        lambop();
        
    }

    
    private void xuv(){
        try{
         sql="select CAR_MODEL,COMPANY,PRICE from CAR_INFO where serial_no=80000";
         pst=con.prepareStatement(sql);
         rs=pst.executeQuery();
         xuv.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch (SQLException e) {
             JOptionPane.showMessageDialog(null,e);
        } 
    }

private void xuvp(){
        try{
         sql="select CAR_MODEL,COMPANY,PRICE from CAR_PERFORMANCE where serial_no=80000";
         pst=con.prepareStatement(sql);
         rs=pst.executeQuery();
         xuvp.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch (SQLException e) {
             JOptionPane.showMessageDialog(null,e);
        } 
    }

private void lambo(){
        try{
         sql="select CAR_MODEL,COMPANY,PRICE from CAR_INFO where serial_no=70000";
         pst=con.prepareStatement(sql);
         rs=pst.executeQuery();
         lambo.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch (SQLException e) {
             JOptionPane.showMessageDialog(null,e);
        } 
    }

private void lambop(){
        try{
         sql="select CAR_MODEL,COMPANY,PRICE from CAR_PERFORMANCE where serial_no=70000";
         pst=con.prepareStatement(sql);
         rs=pst.executeQuery();
         lambop.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch (SQLException e) {
             JOptionPane.showMessageDialog(null,e);
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

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        xuv = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        xuvp = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        lambo = new javax.swing.JTable();
        jScrollPane8 = new javax.swing.JScrollPane();
        lambop = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carmax/carmax_wide_logo.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(0, 0, 504, 129);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carmax/mahindra-xuv500-moondust-silver.jpg"))); // NOI18N
        getContentPane().add(jButton2);
        jButton2.setBounds(0, 196, 361, 203);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carmax/rsz_carspct20lamborghinipct20orangepct20carspct202560x1440pct20wallpaper_wwwwall321com_2.jpg"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(10, 448, 361, 257);

        jLabel1.setText("Car Information");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(380, 210, 76, 14);

        jLabel2.setText("Car Information");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(380, 480, 76, 14);

        jLabel3.setText("Car Performance");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(381, 592, 81, 14);

        jLabel4.setText("Car Performance");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(381, 311, 81, 14);

        xuv.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(xuv);

        getContentPane().add(jScrollPane5);
        jScrollPane5.setBounds(381, 243, 452, 57);

        xuvp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane6.setViewportView(xuvp);

        getContentPane().add(jScrollPane6);
        jScrollPane6.setBounds(380, 340, 452, 60);

        lambo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane7.setViewportView(lambo);

        getContentPane().add(jScrollPane7);
        jScrollPane7.setBounds(380, 510, 452, 60);

        lambop.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane8.setViewportView(lambop);

        getContentPane().add(jScrollPane8);
        jScrollPane8.setBounds(380, 620, 452, 60);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(buycars2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(buycars2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(buycars2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(buycars2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new buycars2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTable lambo;
    private javax.swing.JTable lambop;
    private javax.swing.JTable xuv;
    private javax.swing.JTable xuvp;
    // End of variables declaration//GEN-END:variables
}
