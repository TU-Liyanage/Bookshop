/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javariance.bookshop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author Shehani
 */
public class EditCustomer extends javax.swing.JFrame {

    /**
     * Creates new form EditCustomer
     */
    public EditCustomer() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_NIC = new javax.swing.JTextField();
        btn_OK = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_Cname = new javax.swing.JTextField();
        txt_Caddress = new javax.swing.JTextField();
        txt_Ccontact = new javax.swing.JTextField();
        btn_save = new javax.swing.JButton();
        btn_save1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(204, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Edit Customer ");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 422, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Customer NIC ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 55, 102, 26));
        getContentPane().add(txt_NIC, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 56, 215, 26));

        btn_OK.setBackground(new java.awt.Color(204, 255, 204));
        btn_OK.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_OK.setText("OK");
        btn_OK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_OKActionPerformed(evt);
            }
        });
        getContentPane().add(btn_OK, new org.netbeans.lib.awtextra.AbsoluteConstraints(363, 55, -1, 27));

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Customer Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 12))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel4.setText("Contact : ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 118, 68, 26));

        jLabel5.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel5.setText("Name : ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 28, 68, 26));

        jLabel6.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel6.setText("Address : ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 73, 68, 26));
        jPanel1.add(txt_Cname, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 29, 284, 26));
        jPanel1.add(txt_Caddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 74, 284, 26));
        jPanel1.add(txt_Ccontact, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 119, 284, 26));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 400, 160));

        btn_save.setText("Save");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });
        getContentPane().add(btn_save, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 283, 83, -1));

        btn_save1.setText("Cancel");
        btn_save1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_save1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_save1, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 283, 83, -1));

        jLabel3.setBackground(new java.awt.Color(0, 102, 102));
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 420, 280));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_OKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_OKActionPerformed
        String customerNIC = txt_NIC.getText();

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/bookshop","root", "");
            //change connection
            Statement statement=con.createStatement();
            String query1 = "SELECT * FROM customer where Customer_NIC = '"+customerNIC+"';";

            ResultSet rs =statement.executeQuery(query1);

            if(rs.next()){
                txt_Cname.setText(rs.getString("Customer_Name"));
                txt_Caddress.setText(rs.getString("Customer_Address"));
                txt_Ccontact.setText(rs.getString("Customer_Contact_Number"));

            }
            else{
                JOptionPane.showMessageDialog(null, "Customer NIC is not available");
                this.setVisible(false);

            }
            con.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_btn_OKActionPerformed

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        String customerNIC = txt_NIC.getText();
        String customerName = txt_Cname.getText();
        String customerAddress = txt_Caddress.getText();
        String customerContact = txt_Ccontact.getText();

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/bookshop","root", "");
            //change connection
            Statement statement=con.createStatement();
            String query1 = "update customer set Customer_Name = '"+customerName+"', Customer_Address = '"+ customerAddress+
            "', Customer_Contact_Number = '"+customerContact+"' where Customer_NIC ='"+customerNIC+"' ;";
            statement.executeUpdate(query1);

            this.setVisible(false);
            JOptionPane.showMessageDialog(null, "record updated");

            con.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btn_saveActionPerformed

    private void btn_save1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_save1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btn_save1ActionPerformed

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
            java.util.logging.Logger.getLogger(EditCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditCustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_OK;
    private javax.swing.JButton btn_save;
    private javax.swing.JButton btn_save1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_Caddress;
    private javax.swing.JTextField txt_Ccontact;
    private javax.swing.JTextField txt_Cname;
    private javax.swing.JTextField txt_NIC;
    // End of variables declaration//GEN-END:variables
}
