
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class breturn extends javax.swing.JFrame {
     Connection con;
     PreparedStatement pst;
     ResultSet rs;
    /**
     * Creates new form breturn
     */
    public breturn() {
         super("login");
         initComponents();
         con=sqlconn.connect();
    }
       /*public void Delete() {
        String sql="delete from issue where user_number=?";
        try{
            pst=con.prepareStatement(sql);
            pst.setString(1,txt_unum.getText());
            pst.execute();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }*/
       public void returnUpdate(){
           String sql="Insert into breturn values(?,?,?,?,?)";
           try{
               pst=con.prepareStatement(sql);
               pst.setString(1,txt_unum.getText());
               pst.setString(2,txt_issueid.getText());
               String valuesOfCheckBox="";
                if(cb_1.isSelected()){
                    pst.setString(3,txt_bnum1.getText());
                     valuesOfCheckBox+=txt_bnum1.getText()+"";
                }
                 if(cb_2.isSelected()){
                     pst.setString(3,txt_bnum2.getText());
                     valuesOfCheckBox+=txt_bnum2.getText()+"";
                }
                  if(cb_3.isSelected()){
                     pst.setString(3,txt_bnum3.getText());
                     valuesOfCheckBox+=txt_bnum3.getText()+"";
                }
                   if(cb_4.isSelected()){
                     pst.setString(3,txt_bnum4.getText());
                     valuesOfCheckBox+=txt_bnum4.getText()+"";
                }
                    if(cb_5.isSelected()){
                     pst.setString(3,txt_bnum5.getText());
                     valuesOfCheckBox+=txt_bnum5.getText()+"";
                }
                
               pst.setString(4,txt_idate.getText());
               pst.setString(5,txt_rdate.getText());
               pst.execute();
               JOptionPane.showMessageDialog(null,"Book Returned");
             
           }catch(HeadlessException | SQLException e){
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

        jPanel1 = new javax.swing.JPanel();
        btn_clear = new javax.swing.JButton();
        btn_return = new javax.swing.JButton();
        txt_unum = new javax.swing.JTextField();
        lbl_unum = new javax.swing.JLabel();
        btn_search = new javax.swing.JButton();
        lbl_issueid = new javax.swing.JLabel();
        txt_issueid = new javax.swing.JTextField();
        lbl_bnum1 = new javax.swing.JLabel();
        txt_bnum1 = new javax.swing.JTextField();
        lbl_bnum2 = new javax.swing.JLabel();
        txt_bnum2 = new javax.swing.JTextField();
        lbl_bnum3 = new javax.swing.JLabel();
        txt_bnum3 = new javax.swing.JTextField();
        lbl_bnum4 = new javax.swing.JLabel();
        txt_bnum4 = new javax.swing.JTextField();
        lbl_bnum5 = new javax.swing.JLabel();
        txt_bnum5 = new javax.swing.JTextField();
        lbl_idate = new javax.swing.JLabel();
        txt_idate = new javax.swing.JTextField();
        lbl_rdate = new javax.swing.JLabel();
        txt_rdate = new javax.swing.JTextField();
        cb_1 = new javax.swing.JCheckBox();
        cb_2 = new javax.swing.JCheckBox();
        cb_3 = new javax.swing.JCheckBox();
        cb_4 = new javax.swing.JCheckBox();
        cb_5 = new javax.swing.JCheckBox();
        btn_back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 0), 2), "Return Books", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(153, 255, 0)))); // NOI18N

        btn_clear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_clear.setText("CLEAR");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });

        btn_return.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_return.setText("RETURN");
        btn_return.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_returnActionPerformed(evt);
            }
        });

        txt_unum.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_unum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_unumActionPerformed(evt);
            }
        });

        lbl_unum.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_unum.setText("User Number");

        btn_search.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_search.setText("Search");
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });

        lbl_issueid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_issueid.setText("Issue ID");

        lbl_bnum1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_bnum1.setText("First Book Number");

        txt_bnum1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lbl_bnum2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_bnum2.setText("Second Book Number");

        txt_bnum2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_bnum2ActionPerformed(evt);
            }
        });

        lbl_bnum3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_bnum3.setText("Thired Book Number");

        txt_bnum3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lbl_bnum4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_bnum4.setText("Fourth Book Number");

        txt_bnum4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lbl_bnum5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_bnum5.setText("Fifth Book Number");

        txt_bnum5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lbl_idate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_idate.setText("Issued Date");

        txt_idate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lbl_rdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_rdate.setText("Return Date");

        txt_rdate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btn_back.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_back.setText("Back To Home");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbl_issueid)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_bnum3)
                                    .addComponent(lbl_bnum4)
                                    .addComponent(lbl_bnum5)
                                    .addComponent(lbl_rdate))
                                .addGap(45, 45, 45)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_bnum3)
                                    .addComponent(txt_bnum4)
                                    .addComponent(txt_bnum5)
                                    .addComponent(txt_idate)
                                    .addComponent(txt_rdate)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_bnum2)
                                    .addComponent(lbl_bnum1))
                                .addGap(40, 40, 40)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_bnum1)
                                    .addComponent(txt_bnum2)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbl_unum)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(72, 72, 72)
                                        .addComponent(txt_issueid))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_unum)
                                        .addGap(85, 85, 85))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btn_search)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cb_1)
                                .addComponent(cb_2, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(cb_3)
                            .addComponent(cb_4)
                            .addComponent(cb_5)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_return)
                            .addComponent(lbl_idate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(74, 74, 74)
                        .addComponent(btn_clear)
                        .addGap(49, 49, 49)
                        .addComponent(btn_back)
                        .addContainerGap(49, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_unum, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_unum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(btn_search)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_issueid)
                    .addComponent(txt_issueid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_bnum1)
                    .addComponent(txt_bnum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_1))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb_2)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_bnum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_bnum2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_bnum3)
                    .addComponent(txt_bnum3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_bnum4)
                    .addComponent(txt_bnum4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_bnum5)
                    .addComponent(txt_bnum5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_idate)
                    .addComponent(txt_idate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_rdate)
                    .addComponent(txt_rdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_return)
                    .addComponent(btn_clear)
                    .addComponent(btn_back))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
        // TODO add your handling code here:
        String sql="select * from issue where user_number=?";
        try{
            pst=con.prepareStatement(sql);
            pst.setString(1,txt_unum.getText());
            rs=pst.executeQuery();
            if(rs.next()){
               String add1=rs.getString("issue_id");
                txt_issueid.setText(add1);
                 String add2=rs.getString("book_number1");
                txt_bnum1.setText(add2);
                 String add3=rs.getString("book_number2");
                txt_bnum2.setText(add3);
                 String add4=rs.getString("book_number3");
                txt_bnum3.setText(add4);
                 String add5=rs.getString("book_number4");
                txt_bnum4.setText(add5);
                 String add6=rs.getString("book_number5");
                txt_bnum5.setText(add5);
                 String add7=rs.getString("i_date");
                txt_idate.setText(add7);
                 String add8=rs.getString("r_date");
                txt_rdate.setText(add8);
                
                rs.close();
                pst.close();
                
            }
            else{
                JOptionPane.showMessageDialog(null,"User can't found");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_btn_searchActionPerformed

    private void txt_bnum2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_bnum2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_bnum2ActionPerformed

    private void txt_unumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_unumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_unumActionPerformed

    private void btn_returnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_returnActionPerformed
        // TODO add your handling code here:
        //Delete();
        returnUpdate();
        
    }//GEN-LAST:event_btn_returnActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        HomePage ob=new HomePage();
        ob.setVisible(true);
    }//GEN-LAST:event_btn_backActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        // TODO add your handling code here:
        
        txt_unum.setText("");
        txt_issueid.setText("");
        txt_bnum1.setText("");
        txt_bnum2.setText("");
        txt_bnum3.setText("");
        txt_bnum4.setText("");
        txt_bnum5.setText("");
        txt_idate.setText("");
        txt_rdate.setText("");
        
     
    }//GEN-LAST:event_btn_clearActionPerformed

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
            java.util.logging.Logger.getLogger(breturn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(breturn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(breturn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(breturn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new breturn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_return;
    private javax.swing.JButton btn_search;
    private javax.swing.JCheckBox cb_1;
    private javax.swing.JCheckBox cb_2;
    private javax.swing.JCheckBox cb_3;
    private javax.swing.JCheckBox cb_4;
    private javax.swing.JCheckBox cb_5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_bnum1;
    private javax.swing.JLabel lbl_bnum2;
    private javax.swing.JLabel lbl_bnum3;
    private javax.swing.JLabel lbl_bnum4;
    private javax.swing.JLabel lbl_bnum5;
    private javax.swing.JLabel lbl_idate;
    private javax.swing.JLabel lbl_issueid;
    private javax.swing.JLabel lbl_rdate;
    private javax.swing.JLabel lbl_unum;
    private javax.swing.JTextField txt_bnum1;
    private javax.swing.JTextField txt_bnum2;
    private javax.swing.JTextField txt_bnum3;
    private javax.swing.JTextField txt_bnum4;
    private javax.swing.JTextField txt_bnum5;
    private javax.swing.JTextField txt_idate;
    private javax.swing.JTextField txt_issueid;
    private javax.swing.JTextField txt_rdate;
    private javax.swing.JTextField txt_unum;
    // End of variables declaration//GEN-END:variables
}