/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class Selling extends javax.swing.JFrame {

    /**
     * Creates new form Selling
     */
    public Selling() {
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

        jScrollPane2 = new javax.swing.JScrollPane();
        medTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Addbtn = new javax.swing.JButton();
        Addbtn2 = new javax.swing.JButton();
        Clearbtn3 = new javax.swing.JButton();
        Deletebtn4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        medTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "MEDNAME", "PRICE", "QUANTITY", "MFGDATE", "EXPDATE", "COMPANY"
            }
        ));
        medTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                medTableMouseEntered(evt);
            }
        });
        jScrollPane2.setViewportView(medTable);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("BILLING");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("ID");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("QTY");

        Addbtn.setBackground(new java.awt.Color(153, 153, 153));
        Addbtn.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        Addbtn.setText("SHOW DATA");
        Addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddbtnActionPerformed(evt);
            }
        });

        Addbtn2.setBackground(new java.awt.Color(153, 153, 153));
        Addbtn2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        Addbtn2.setText("ADD");
        Addbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Addbtn2ActionPerformed(evt);
            }
        });

        Clearbtn3.setBackground(new java.awt.Color(153, 153, 153));
        Clearbtn3.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        Clearbtn3.setText("CLEAR");
        Clearbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Clearbtn3ActionPerformed(evt);
            }
        });

        Deletebtn4.setBackground(new java.awt.Color(153, 153, 153));
        Deletebtn4.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        Deletebtn4.setText("DELETE");
        Deletebtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Deletebtn4ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("  X");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("BILL");

        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("MEDNAEM");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setBackground(new java.awt.Color(102, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton1.setText("PRINT BILL");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 255));
        jLabel8.setText("Seller");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Addbtn)
                        .addGap(29, 29, 29)
                        .addComponent(Addbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Deletebtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(161, 161, 161)
                        .addComponent(Clearbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(88, 88, 88)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(598, 598, 598)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(197, 197, 197)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                                .addComponent(jButton1)))))
                .addGap(85, 85, 85))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addComponent(jLabel7)
                    .addContainerGap(1024, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(96, 96, 96)
                    .addComponent(jLabel8)
                    .addContainerGap(1008, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Deletebtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Clearbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Addbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Addbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 155, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(150, 150, 150))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(194, 194, 194)
                    .addComponent(jLabel7)
                    .addContainerGap(503, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(64, 64, 64)
                    .addComponent(jLabel8)
                    .addContainerGap(633, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void SelectMed()
    {
        
        try {
            // TODO add your handling code here:
            Class.forName("com.mysql.cj.jdbc.Driver");
            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharma","root","452010")) {
                Statement st = con.createStatement();
                
                String qr ="select * from medicine";
                java.sql.ResultSet rs=st.executeQuery(qr);
                ResultSetMetaData rsmd = rs.getMetaData();
                DefaultTableModel model =  (DefaultTableModel) medTable.getModel();
                int cols =rsmd.getColumnCount();
                model.setRowCount(0);            
                String mid,mn,mp,mq,md,ed,co;
                while(rs.next())
                {
                    mid=rs.getString(1);
                    mn=rs.getString(2);
                    mp=rs.getString(3);
                    mq=rs.getString(4);
                    md=rs.getString(5);
                    ed=rs.getString(6);
                    co=rs.getString(7);
                    
                    String[]row={mid,mn,mp,mq,md,ed,co};
                    model.addRow(row);
                }
                
                st.close();
            }
                
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Medicine.class.getName()).log(Level.SEVERE, null, ex);
        } catch (java.sql.SQLException ex) {
            Logger.getLogger(Medicine.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    private void medTableMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_medTableMouseEntered
        // TODO add your handling code here:

    }//GEN-LAST:event_medTableMouseEntered

    private void AddbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddbtnActionPerformed
        // TODO add your handling code here:
        SelectMed();
    }//GEN-LAST:event_AddbtnActionPerformed

    private void Addbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Addbtn2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Addbtn2ActionPerformed

    private void Clearbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Clearbtn3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Clearbtn3ActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void Deletebtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Deletebtn4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Deletebtn4ActionPerformed

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
            java.util.logging.Logger.getLogger(Selling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Selling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Selling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Selling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Selling().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Addbtn;
    private javax.swing.JButton Addbtn2;
    private javax.swing.JButton Clearbtn3;
    private javax.swing.JButton Deletebtn4;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTable medTable;
    // End of variables declaration//GEN-END:variables
}
