
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
public class issue extends javax.swing.JFrame {
     Connection con;
     PreparedStatement pst;
     ResultSet rs;
    /**
     * Creates new form issue
     */
    public issue() {
        super("issue");
        initComponents();
        con=sqlconn.connect();
    
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
        lbl_unum = new javax.swing.JLabel();
        btn_clear = new javax.swing.JButton();
        btn_back = new javax.swing.JButton();
        lbl_idate = new javax.swing.JLabel();
        btn_add = new javax.swing.JButton();
        lbl_return = new javax.swing.JLabel();
        txt_unum = new javax.swing.JTextField();
        lbl_bnum1 = new javax.swing.JLabel();
        txt_bnum1 = new javax.swing.JTextField();
        txt_idate = new javax.swing.JTextField();
        txt_rdate = new javax.swing.JTextField();
        lbl_bnum2 = new javax.swing.JLabel();
        txt_bnum2 = new javax.swing.JTextField();
        lbl_bnum3 = new javax.swing.JLabel();
        txt_bnum3 = new javax.swing.JTextField();
        lbl_bnum4 = new javax.swing.JLabel();
        txt_bnum4 = new javax.swing.JTextField();
        lbl_num5 = new javax.swing.JLabel();
        txt_bnum5 = new javax.swing.JTextField();
        btn_search = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 0)), "Issue Book", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 18), new java.awt.Color(102, 204, 0))); // NOI18N

        lbl_unum.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_unum.setText("User Number");

        btn_clear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_clear.setText("CLEAR");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });

        btn_back.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_back.setText("Back To Home");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });

        lbl_idate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_idate.setText("Date Of Issue");

        btn_add.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_add.setText("ISSUE");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        lbl_return.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_return.setText("Return Of Date");

        txt_unum.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_unum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_unumActionPerformed(evt);
            }
        });

        lbl_bnum1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_bnum1.setText(" First Book Number");

        txt_idate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        txt_rdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_rdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_rdateActionPerformed(evt);
            }
        });

        lbl_bnum2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_bnum2.setText("Second Book Number");

        txt_bnum2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lbl_bnum3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_bnum3.setText("Third Book Number");

        txt_bnum3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lbl_bnum4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_bnum4.setText("Fourth Book Number");

        txt_bnum4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_bnum4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_bnum4ActionPerformed(evt);
            }
        });

        lbl_num5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_num5.setText("Fifth Book Number");

        txt_bnum5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btn_search.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_search.setText("Search");
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_add)
                        .addGap(61, 61, 61)
                        .addComponent(btn_clear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_back)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lbl_num5)
                        .addGap(393, 393, 393))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_bnum1)
                            .addComponent(lbl_idate))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_bnum2)
                            .addComponent(lbl_bnum3)
                            .addComponent(lbl_bnum4)
                            .addComponent(lbl_return))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_unum)
                        .addGap(86, 86, 86)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_unum, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_bnum1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_bnum2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_bnum3, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_bnum4, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_bnum5, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_idate, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_rdate, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_search)
                        .addGap(58, 58, 58))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_unum)
                    .addComponent(txt_unum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_search))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_bnum1)
                    .addComponent(txt_bnum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_bnum2)
                    .addComponent(txt_bnum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_bnum3)
                    .addComponent(txt_bnum3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_bnum4)
                    .addComponent(txt_bnum4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_num5)
                    .addComponent(txt_bnum5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_idate)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txt_idate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_return)
                    .addComponent(txt_rdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_add)
                    .addComponent(btn_clear)
                    .addComponent(btn_back))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        // TODO add your handling code here:
       setVisible(false);
        HomePage ob=new HomePage();
        ob.setVisible(true);
    }//GEN-LAST:event_btn_backActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        // TODO add your handling code here:
        String sql="insert into issue values(?,?,?,?,?,?,?,?)";
        try{
            pst=con.prepareStatement(sql);
           
            pst.setString(1,txt_unum.getText());
            pst.setString(2,txt_bnum1.getText());
            pst.setString(3,txt_bnum2.getText());
            pst.setString(4,txt_bnum3.getText());
            pst.setString(5,txt_bnum4.getText());
            pst.setString(6,txt_bnum5.getText());
            pst.setString(7,txt_idate.getText());
            pst.setString(8,txt_rdate.getText());
            pst.execute();
            JOptionPane.showMessageDialog(null," Book Issued.");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
            
        
        
    }//GEN-LAST:event_btn_addActionPerformed

    private void txt_rdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_rdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_rdateActionPerformed

    private void txt_unumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_unumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_unumActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        // TODO add your handling code here:
        
        txt_unum.setText("");
        txt_bnum1.setText("");
        txt_bnum2.setText("");
        txt_bnum3.setText("");
        txt_bnum4.setText("");
        txt_bnum5.setText("");
        txt_idate.setText("");
        txt_rdate.setText("");
    }//GEN-LAST:event_btn_clearActionPerformed

    private void txt_bnum4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_bnum4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_bnum4ActionPerformed

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
        // TODO add your handling code here:
                String sql="select * from issue where user_number=? ";
        try{
            pst=con.prepareStatement(sql);
            pst.setString(1,txt_unum.getText());
            rs=pst.executeQuery();
            if(rs.next()){
               String add1=rs.getString("book_number1");
                txt_bnum1.setText(add1);
                 String add2=rs.getString("book_number2");
                txt_bnum2.setText(add2);
                 String add3=rs.getString("book_number3");
                txt_bnum3.setText(add3);
                 String add4=rs.getString("book_number4");
                txt_bnum4.setText(add4);
                 String add5=rs.getString("book_number5");
                txt_bnum5.setText(add5);
                rs.close();
                pst.close();
                
            }
            else{
                JOptionPane.showMessageDialog(null,"User hasn't borrowed any book");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        
    }//GEN-LAST:event_btn_searchActionPerformed

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
            java.util.logging.Logger.getLogger(issue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(issue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(issue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(issue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new issue().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_search;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_bnum1;
    private javax.swing.JLabel lbl_bnum2;
    private javax.swing.JLabel lbl_bnum3;
    private javax.swing.JLabel lbl_bnum4;
    private javax.swing.JLabel lbl_idate;
    private javax.swing.JLabel lbl_num5;
    private javax.swing.JLabel lbl_return;
    private javax.swing.JLabel lbl_unum;
    private javax.swing.JTextField txt_bnum1;
    private javax.swing.JTextField txt_bnum2;
    private javax.swing.JTextField txt_bnum3;
    private javax.swing.JTextField txt_bnum4;
    private javax.swing.JTextField txt_bnum5;
    private javax.swing.JTextField txt_idate;
    private javax.swing.JTextField txt_rdate;
    private javax.swing.JTextField txt_unum;
    // End of variables declaration//GEN-END:variables
}
