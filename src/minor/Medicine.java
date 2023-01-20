/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minor;

import ConnectionDB.ConnectionProvider;
import java.sql.*;
import javax.swing.JOptionPane;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;




public class Medicine extends javax.swing.JFrame {

    //private Object medicine;
    
       
//    private Connection connection;

    /**
     * Creates new form Medicine
     */
    public Medicine() {
        initComponents();
        //SelectMed();
    }
  //ResultSet rs =;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        MedId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        MedName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        MedPrice = new javax.swing.JTextField();
        MedQty = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        AddBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        UpdateBtn = new javax.swing.JButton();
        CompCh = new javax.swing.JComboBox<>();
        MFGDate = new javax.swing.JTextField();
        EXPDate1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        medTable = new javax.swing.JTable();
        DeleteBtn1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("MANAGE MEDICINE");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 13, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 84, -1, -1));

        MedId.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        MedId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MedIdActionPerformed(evt);
            }
        });
        getContentPane().add(MedId, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 81, 143, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("MEDNAME");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 148, -1, -1));

        MedName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(MedName, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 145, 143, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("PRICE");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        MedPrice.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        MedPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MedPriceActionPerformed(evt);
            }
        });
        getContentPane().add(MedPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 206, 143, -1));

        MedQty.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(MedQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 143, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("QUANTITY");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("MFGDATE");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(448, 84, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("EXPDATE");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(449, 148, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("COMPANY");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(449, 212, -1, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 51, 51));
        jButton1.setText("X");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(708, 0, -1, -1));

        AddBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        AddBtn.setText("ADD");
        AddBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddBtnMouseClicked(evt);
            }
        });
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });
        getContentPane().add(AddBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 135, 35));

        clearBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        clearBtn.setText("CLEAR");
        clearBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clearBtnMouseEntered(evt);
            }
        });
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });
        getContentPane().add(clearBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 340, 135, 35));

        UpdateBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        UpdateBtn.setText("UPDATE");
        UpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBtnActionPerformed(evt);
            }
        });
        getContentPane().add(UpdateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, 135, 35));

        CompCh.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CompCh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT COMPANY", "SUN PHARM", "CIPLA", "LUPIN", "AUROBINDO", "ZYDUS ", "DIVI'S LAB", "ABBOTT", "GSK PLC", "PFIZER", "BIOCON" }));
        getContentPane().add(CompCh, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 210, -1, 40));

        MFGDate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(MFGDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 90, 140, -1));

        EXPDate1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(EXPDate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 150, 140, -1));

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

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 750, 150));

        DeleteBtn1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        DeleteBtn1.setText("DELETE");
        DeleteBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteBtn1MouseClicked(evt);
            }
        });
        DeleteBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtn1ActionPerformed(evt);
            }
        });
        getContentPane().add(DeleteBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 340, 135, 35));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minor/top-view-pills-with-container-copy-space   7  5.jpg"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 550));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MedPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MedPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MedPriceActionPerformed

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_AddBtnActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        // TODO add your handling code here:
      
        MedId.setText("");
        MedName.setText("");
        MedPrice.setText("");
        MedQty.setText("");
        MFGDate.setText("");
        EXPDate1.setText("");
       
        
    }//GEN-LAST:event_clearBtnActionPerformed

    private void UpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtnActionPerformed
        // TODO add your handling code here:
//        if(MedId.getText().isEmpty()||MedName.getText().isEmpty()||MedPrice.getText().isEmpty()||MedQty.getText().isEmpty())
//        {
//            
//        }
//        else{
//                try{
//                 Class.forName("com.mysql.cj.jdbc.Driver");
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharma","root","452010");
//            
//          
//            
//                }catch(Exception e)
//                {
//                    JOptionPane.showMessageDialog(this, "Medicine is Updated Successfully");
//                }
//            
//        }
        
        
        
      // SelectMed();
      
 //===============================================================================================================================
 
        try {
            String value1 = MedId.getText();
            String value2 = MedName.getText();
            String value3 = MedPrice.getText();
            String value4 = MedQty.getText();
            String value5 = MFGDate.getText();
            String value6 = EXPDate1.getText();
            String value7 = (String)CompCh.getSelectedItem();
            
            
            String sql = "update medicine set MedId='"+value1+"',MedName='"+value2+"',MedPrice='"+value3+"',MedQty='"+value4+"',FabDate='"+value5+"',ExpDate='"+value6+"',CompCh='"+value7+"' where MedId='"+value1+"' ";
            
             Connection con = ConnectionProvider.getCon();
            PreparedStatement ps = con.prepareStatement(sql);
            System.out.println(con);
            ps.execute();
            JOptionPane.showMessageDialog(this, "Medicine Updated Successfully");
            
        } catch (Exception e) {
                JOptionPane.showMessageDialog(this,e);
        }
      
      
      
      
    }//GEN-LAST:event_UpdateBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    
    @SuppressWarnings("empty-statement")
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
        
        
        
        
        
        //===========================================================================================================
      /*  String showTable = "SELECT * FROM medicine";
        
        try{
             Connection con = ConnectionProvider.getCon();
            
            PreparedStatement pts = con.prepareStatement(showTable);
            ResultSet rs;
            rs = pts.executeQuery();
           // ResultSetMetaData rsmd = pts.getMetaData();
            //int n=7;
            DefaultTableModel model = (DefaultTableModel)medTable.getModel();
            model.setRowCount(0);
           
          while(rs.next())
          {
              Vector coloumData = new Vector();
              
              for(i=1;i<=q;i++)
              {
                  coloumData.add(rs.getString("MedId"));
                  coloumData.add(rs.getString("MedName"));
                  coloumData.add(rs.getString("MedPrice"));
                  coloumData.add(rs.getString("MedQty"));
                  coloumData.add(rs.getString("FabDate"));
                  coloumData.add(rs.getString("ExpDate"));
                  coloumData.add(rs.getString("CompCh"));
              }
              RecordTable.addRaw("coloumData");
              
              
              
          }
          
            
        }catch(Exception e)
        {
            //JOptionPane.showMessageDialog(null, "Error1 : "+e);
            e.printStackTrace();
        }
        
        */
        
        
        
        
        //=========================================================================================================
   /*     try{
               
                Connection con = ConnectionProvider.getCon();
                Statement st = con.createStatement();
               ResultSet rs =  st.executeUpdate("Select * from medicine");
                
                DefaultTableModel model = (DefaultTableModel)medTable.getModel();
                model.setRowCount(0);
                
                while(rs.next())
                {
                    Vector coloumData = new Vector();
                    
                    for(int i=1;i<=7;i++)
                    {
                  coloumData.add(rs.getString("MedId"));
                  coloumData.add(rs.getString("MedName"));
                  coloumData.add(rs.getString("MedPrice"));
                  coloumData.add(rs.getString("MedQty"));
                  coloumData.add(rs.getString("FabDate"));
                  coloumData.add(rs.getString("ExpDate"));
                  coloumData.add(rs.getString("CompCh"));                        
                    }
                    
                }
                
        
        }catch(java.sql.SQLException ex)
        {
             ex.printStackTrace();
        }
        
        */
   // }
    
    
    
    
    private void AddBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBtnMouseClicked
        // TODO add your handling code here:
        
        String MId = MedId.getText();
        String MName = MedName.getText();
        String MPrice = MedPrice.getText();
        String MQty = MedQty.getText();
        String fdate = MFGDate.getText();
        String edate = MFGDate.getText();
        String choose = (String)CompCh.getSelectedItem();
        
        try{
            
            Connection con = ConnectionProvider.getCon();
            PreparedStatement ps = con.prepareStatement("insert into medicine values(?,?,?,?,?,?,?)");
            ps.setString(1, MId);
            ps.setString(2, MName);
            ps.setString(3, MPrice);
            ps.setString(4, MQty);
            ps.setString(5, fdate);
            ps.setString(6,edate );
            ps.setString(7, choose);
            ps.executeUpdate();
            
           JOptionPane.showMessageDialog(null, "Medicine Added Successefully");
           //SelectMed();
           //ps.close();
            
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        

        
            
       
    }//GEN-LAST:event_AddBtnMouseClicked

    private void MedIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MedIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MedIdActionPerformed

    private void clearBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearBtnMouseClicked
        // TODO add your handling code here:
//        if(MedId.getText().isEmpty())
//        {
//            JOptionPane.showMessageDialog(null, "Enter the Medicine to be DELETED");
//        }
//        else
//        {
//            
//            try {
//                Class.forName("com.mysql.cj.jdbc.Driver");
//            } catch (ClassNotFoundException ex) {
//                Logger.getLogger(Medicine.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharma","root","452010")) {
//                Statement st = con.createStatement();
//                String id = MedId.getText();
//                String qr = "Delete from medicine where MedId="+id;
//                Statement add = con.createStatement();
//                add.executeQuery(qr);
//                SelectMed();
//                JOptionPane.showMessageDialog(null, "Medicine DELETED Successfully");
//            } catch (java.sql.SQLException e) {
//                e.printStackTrace();
//            }
//        }
        
//=========================================================================================================


    /*        try {
                Class.forName("com.mysql.cj.jdbc.Driver");
             Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharma","root","452010");
             
             String sql = "Delete from medicine where MedId='?'";
             PreparedStatement ps = con.prepareStatement(sql);
             ps.setInt(1, Integer.parseInt(MedId.getText()));
             JOptionPane.showMessageDialog(null, "Medicine Deleted Successfully");
             con.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        */
    
    //=============================================================================================================
    
//        int a = JOptionPane.showConfirmDialog(null, "DO you want to Delete ?","Delete",JOptionPane.YES_NO_OPTION);
//      //  System.out.println(a);
//        if(a==0)
//        {
//            int row = medTable.getSelectedRow();
//            String cell = medTable.getModel().getValueAt(row, 0).toString();
//            String sql = "Delete from medicine where MedId ="+cell;
//            try {
//             Class.forName("com.mysql.cj.jdbc.Driver");
//             Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharma","root","452010");
//             
//             
//             PreparedStatement ps = con.prepareStatement(sql);
//             ps.execute();
//            // ps.setInt(1, Integer.parseInt(MedId.getText()));
//             JOptionPane.showMessageDialog(null, "Medicine Deleted Successfully");
//             SelectMed();
//             con.close();
//                
//            } catch (Exception e) {
//            }
//        }

        
    }//GEN-LAST:event_clearBtnMouseClicked

    private void medTableMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_medTableMouseEntered
        // TODO add your handling code here:
        SelectMed();
    }//GEN-LAST:event_medTableMouseEntered

    private void DeleteBtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBtn1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteBtn1MouseClicked

    private void DeleteBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtn1ActionPerformed
        // TODO add your handling code here:
        String sql = "Delete from medicine where MedId =?";
        
        try {
             Connection con = ConnectionProvider.getCon();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, MedId.getText());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Medicine Deleted Successfully");
            
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null,e);
        }
        
    }//GEN-LAST:event_DeleteBtn1ActionPerformed

    private void clearBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearBtnMouseEntered
        // TODO add your handling code here:
        int i =medTable.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel)medTable.getModel();        //dummy remove data from jtabl
        model.removeRow(i);


    }//GEN-LAST:event_clearBtnMouseEntered

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
            java.util.logging.Logger.getLogger(Medicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Medicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Medicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Medicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Medicine().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JComboBox<String> CompCh;
    private javax.swing.JButton DeleteBtn1;
    private javax.swing.JTextField EXPDate1;
    private javax.swing.JTextField MFGDate;
    private javax.swing.JTextField MedId;
    private javax.swing.JTextField MedName;
    private javax.swing.JTextField MedPrice;
    private javax.swing.JTextField MedQty;
    private javax.swing.JButton UpdateBtn;
    private javax.swing.JButton clearBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable medTable;
    // End of variables declaration//GEN-END:variables

    private String toString(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
