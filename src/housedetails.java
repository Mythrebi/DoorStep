import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.*;
import net.proteanit.sql.DbUtils;

public class housedetails extends javax.swing.JFrame {

      public housedetails() {   
    
          print p=new print();
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        JLabel l=new JLabel("");
        //ImageIcon i=new ImageIcon("");
        //l.setIcon(i);
        l.setBounds(0, 0,1500, 800);
        l.setOpaque(true);
      ImageIcon i=new ImageIcon("C:\\Users\\prabhu.S\\Pictures\\lake.jpg");
      Dimension s=Toolkit.getDefaultToolkit().getScreenSize();
      l.setBounds(0,0,s.width,s.height);
        l.setIcon(i);
                
        l.setOpaque(true);
       
        this.add(l);
      }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jRadioButton11 = new javax.swing.JRadioButton();
        jRadioButton12 = new javax.swing.JRadioButton();
        jRadioButton13 = new javax.swing.JRadioButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("F1"); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("LOCATION");

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("DONE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jRadioButton1.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jRadioButton1.setText("RSPURAM");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jRadioButton2.setText("PEELAMEDU");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jRadioButton3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jRadioButton3.setText(" GANDHIPURAM");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        jRadioButton4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jRadioButton4.setText("SITRA");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(51, 102, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "LOCATION_ID", "LOCATION", "BHK", "BATHROOMS", "COST", "ADDRESS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("BHK");

        jRadioButton5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jRadioButton5.setText("2 BHK");
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });

        jRadioButton6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jRadioButton6.setText("3 BHK");
        jRadioButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton6ActionPerformed(evt);
            }
        });

        jRadioButton7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jRadioButton7.setText("1BHK");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ENTER LOCATION ID OF THE DESIRED HOUSE=");

        jTextField1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setText("OK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("COST");

        jRadioButton8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jRadioButton8.setText("<5000");

        jRadioButton9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jRadioButton9.setText("<15000");
        jRadioButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton9ActionPerformed(evt);
            }
        });

        jRadioButton10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jRadioButton10.setText("<25000");

        jRadioButton11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jRadioButton11.setText("<35000");

        jRadioButton12.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jRadioButton12.setText("<45000");

        jRadioButton13.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jRadioButton13.setText("<55000");

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton3.setText("BUY");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(155, 155, 155)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton3)
                                    .addComponent(jRadioButton1)
                                    .addComponent(jRadioButton4)
                                    .addComponent(jRadioButton2)
                                    .addComponent(jRadioButton7)
                                    .addComponent(jRadioButton5)
                                    .addComponent(jRadioButton6)
                                    .addComponent(jRadioButton8)
                                    .addComponent(jRadioButton9)
                                    .addComponent(jRadioButton10)
                                    .addComponent(jRadioButton11)
                                    .addComponent(jRadioButton12)
                                    .addComponent(jRadioButton13)
                                    .addComponent(jButton1)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel5))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 890, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(175, 175, 175))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jRadioButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton6)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel5)
                        .addGap(8, 8, 8)
                        .addComponent(jRadioButton8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(23, 23, 23)
                .addComponent(jButton3)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
               
        
       try{
   Class.forName("com.mysql.jdbc.Driver");
   Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/house","root","");
      //jLabel2.setVisible(true);
   if(jRadioButton1.isSelected())
   {
           //Statement stmt=conn.createStatement();
          
           String sql="SELECT LOCATION_ID,LOCATION ,BHK,BATHROOMS,PRICE,ADDRESS FROM details "+" WHERE LOCATION='R.S.PURAM'";
           PreparedStatement pst = conn.prepareStatement(sql);
           ResultSet rs =pst.executeQuery();
           jTable1.setModel(DbUtils.resultSetToTableModel(rs));
           
   }
         
    
  
   
     else if(jRadioButton2.isSelected())
       {
               String sql="SELECT LOCATION_ID,LOCATION,BHK,BATHROOMS,PRICE,ADDRESS FROM details "+" WHERE LOCATION='PEELAMEDU'";
           PreparedStatement pst = conn.prepareStatement(sql);
           ResultSet rs =pst.executeQuery();
           jTable1.setModel(DbUtils.resultSetToTableModel(rs));
      
       }
     else  if(jRadioButton3.isSelected())
       {
              String sql="SELECT LOCATION_ID,LOCATION,BHK,BATHROOMS,PRICE,ADDRESS FROM details "+" WHERE LOCATION='GANDHIPURAM'";
           PreparedStatement pst = conn.prepareStatement(sql);
           ResultSet rs =pst.executeQuery();
           jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        
       }
     else if(jRadioButton4.isSelected())
       {
                String sql="SELECT LOCATION_ID,LOCATION,BHK,BATHROOMS,PRICE,ADDRESS FROM details "+" WHERE LOCATION='SITRA'";
           PreparedStatement pst = conn.prepareStatement(sql);
           ResultSet rs =pst.executeQuery();
           jTable1.setModel(DbUtils.resultSetToTableModel(rs));
     
   }
      else if(jRadioButton5.isSelected())
       {
                String sql="SELECT LOCATION_ID,LOCATION,BHK,BATHROOMS,PRICE,ADDRESS FROM details "+" WHERE BHK=2";
           PreparedStatement pst = conn.prepareStatement(sql);
           ResultSet rs =pst.executeQuery();
           jTable1.setModel(DbUtils.resultSetToTableModel(rs));
       }
       else if(jRadioButton6.isSelected())
       {
                String sql="SELECT LOCATION_ID,LOCATION,BHK,BATHROOMS,PRICE,ADDRESS FROM details "+" WHERE BHK=3";
           PreparedStatement pst = conn.prepareStatement(sql);
           ResultSet rs =pst.executeQuery();
           jTable1.setModel(DbUtils.resultSetToTableModel(rs));
       }
      else if(jRadioButton7.isSelected())
       {
                String sql="SELECT LOCATION_ID,LOCATION,BHK,BATHROOMS,PRICE,ADDRESS FROM details "+" WHERE BHK=1";
           PreparedStatement pst = conn.prepareStatement(sql);
           ResultSet rs =pst.executeQuery();
           jTable1.setModel(DbUtils.resultSetToTableModel(rs));
       }
   else if(jRadioButton8.isSelected())
       {
                String sql="SELECT LOCATION_ID,LOCATION,BHK,BATHROOMS,PRICE,ADDRESS FROM details "+" WHERE PRICE < 5000";
           PreparedStatement pst = conn.prepareStatement(sql);
           ResultSet rs =pst.executeQuery();
           jTable1.setModel(DbUtils.resultSetToTableModel(rs));
       }
       else if(jRadioButton9.isSelected())
       {
                String sql="SELECT LOCATION_ID,LOCATION,BHK,BATHROOMS,PRICE,ADDRESS FROM details "+" WHERE PRICE < 15000";
           PreparedStatement pst = conn.prepareStatement(sql);
           ResultSet rs =pst.executeQuery();
           jTable1.setModel(DbUtils.resultSetToTableModel(rs));
       }
      else if(jRadioButton10.isSelected())
       {
                String sql="SELECT LOCATION_ID,LOCATION,BHK,BATHROOMS,PRICE,ADDRESS FROM details "+" WHERE PRICE < 25000";
           PreparedStatement pst = conn.prepareStatement(sql);
           ResultSet rs =pst.executeQuery();
           jTable1.setModel(DbUtils.resultSetToTableModel(rs));
       }
      else if(jRadioButton11.isSelected())
       {
                String sql="SELECT LOCATION_ID,LOCATION,BHK,BATHROOMS,PRICE,ADDRESS FROM details "+" WHERE PRICE < 35000";
           PreparedStatement pst = conn.prepareStatement(sql);
           ResultSet rs =pst.executeQuery();
           jTable1.setModel(DbUtils.resultSetToTableModel(rs));
       }
      else if(jRadioButton12.isSelected())
       {
                String sql="SELECT LOCATION_ID,LOCATION,BHK,BATHROOMS,PRICE,ADDRESS FROM details "+" WHERE PRICE < 45000";
           PreparedStatement pst = conn.prepareStatement(sql);
           ResultSet rs =pst.executeQuery();
           jTable1.setModel(DbUtils.resultSetToTableModel(rs));
       }
      else if(jRadioButton13.isSelected())
       {
                String sql="SELECT LOCATION_ID,LOCATION,BHK,BATHROOMS,PRICE,ADDRESS FROM details "+" WHERE PRICE < 55000";
           PreparedStatement pst = conn.prepareStatement(sql);
           ResultSet rs =pst.executeQuery();
           jTable1.setModel(DbUtils.resultSetToTableModel(rs));
       }



    }   // dispose();     
        // TODO add your handling code here:
            catch(ClassNotFoundException | SQLException e)
        {
            e.printStackTrace();
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    private void jRadioButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try{
             Class.forName("com.mysql.jdbc.Driver");
             Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/house","root","");
             Statement st=conn.createStatement();
             
             ResultSet rs =st.executeQuery("select * from details where LOCATION_ID='"+jTextField1.getText()+"'");
    if(rs.next())
    {
        byte[] img=rs.getBytes("IMAGE");
        ImageIcon image=new ImageIcon(img);
        Image im=image.getImage();
        Image myimg=im.getScaledInstance(jLabel3.getWidth(),jLabel3.getHeight(),Image.SCALE_SMOOTH);
   ImageIcon newimage=new ImageIcon(myimg);
   jLabel3.setIcon(newimage);
    }
        }
            catch(ClassNotFoundException | SQLException e)
        {
            e.printStackTrace();
        }

        
                
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        try{
     Class.forName("com.mysql.jdbc.Driver");
   Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/house","root","");
      Statement st=conn.createStatement();
             
             int rs =st.executeUpdate("UPDATE `details` SET `STATUS`=1 WHERE LOCATION_ID='"+jTextField1.getText()+"'");
          
    }//GEN-LAST:event_jButton3ActionPerformed

        catch(ClassNotFoundException | SQLException e)
        {
            e.printStackTrace();
        }
        print p=new print();
        p.setVisible(true);
        this.dispose();
    
    }

    private void jRadioButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton9ActionPerformed
     
    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(housedetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(housedetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(housedetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(housedetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

           java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new housedetails().setVisible(true);
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton12;
    private javax.swing.JRadioButton jRadioButton13;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
