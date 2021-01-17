package javariance.bookshop;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Tharindu
 */
public class NewBook extends javax.swing.JFrame {
    
    /*public static Connection getDBConnection() throws Exception{
      
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/bookshop","root","");
        return conn;
    }*/

    /**
     * Creates new form NewBook
     */
    public NewBook() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldISBN = new javax.swing.JTextField();
        jTextFieldB_Title = new javax.swing.JTextField();
        jTextFieldA_Search = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTextFieldPrice = new javax.swing.JTextField();
        jTextFieldCategory = new javax.swing.JTextField();
        jButtonAdd = new javax.swing.JButton();
        jButtonClear = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        AuthorSearchTable = new javax.swing.JTable();
        jTextFieldAuthorID = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add New Book");

        jLabel2.setText("ISBN Number");

        jLabel3.setText("Book Title");

        jLabel4.setText("Auther ID");

        jLabel5.setText("Price");

        jLabel6.setText("Category");

        jTextFieldISBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldISBNActionPerformed(evt);
            }
        });

        jTextFieldA_Search.setBackground(new java.awt.Color(231, 243, 248));
        jTextFieldA_Search.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jTextFieldA_Search.setForeground(new java.awt.Color(102, 102, 102));
        jTextFieldA_Search.setText("Search Author");
        jTextFieldA_Search.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextFieldA_Search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldA_SearchMouseClicked(evt);
            }
        });
        jTextFieldA_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldA_SearchActionPerformed(evt);
            }
        });
        jTextFieldA_Search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldA_SearchKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldA_SearchKeyReleased(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setText("Add New Author");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButtonAdd.setText("ADD");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        jButtonClear.setText("CLEAR");
        jButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearActionPerformed(evt);
            }
        });

        AuthorSearchTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Author_ID", "Author_Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        AuthorSearchTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AuthorSearchTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(AuthorSearchTable);
        if (AuthorSearchTable.getColumnModel().getColumnCount() > 0) {
            AuthorSearchTable.getColumnModel().getColumn(0).setMaxWidth(100);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(53, 53, 53))
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jTextFieldAuthorID)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1))
                            .addComponent(jTextFieldISBN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldB_Title, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(62, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jButtonClear)
                .addGap(115, 115, 115))
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldA_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(62, 62, 62))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldB_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldAuthorID)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldA_Search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(jButtonClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        // TODO add your handling code here:
         int dialogButton = JOptionPane.YES_NO_OPTION;
         int dialogResult = JOptionPane.showConfirmDialog (null, "Would You Like to Save this details?","Warning",dialogButton);
         if(dialogResult == JOptionPane.YES_OPTION){
        
            try{
                DBConnection c = new DBConnection(); 
                c.getDBConnection();
                Statement stmt=c.getDBConnection().createStatement();
                String sql="insert into book (ISBN, Book_Name, Author_ID, No_of_Books_Remaining, Price, Category) values ('"+jTextFieldISBN.getText()+"','"+jTextFieldB_Title.getText()+"','"+jTextFieldAuthorID.getText()+"','0','"+jTextFieldPrice.getText()+"','"+jTextFieldCategory.getText()+"')";
                stmt.executeUpdate(sql);
                c.getDBConnection().close();
                
                jTextFieldISBN.setText("");
                jTextFieldB_Title.setText("");
                jTextFieldAuthorID.setText("");
                jTextFieldA_Search.setText("Search Author");
                jTextFieldPrice.setText("");
                jTextFieldCategory.setText("");
                AuthorSearchTable.setVisible(false);
                
        
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Something goes wrong!!! Please try again");
                System.out.println("Error in connecting to database: "+e);
            }
        }  
         
         
        
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jTextFieldISBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldISBNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldISBNActionPerformed

    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearActionPerformed
        // TODO add your handling code here:
        jTextFieldISBN.setText("");
        jTextFieldB_Title.setText("");
        jTextFieldAuthorID.setText("");
        jTextFieldA_Search.setText("Search Author");
        jTextFieldPrice.setText("");
        jTextFieldCategory.setText("");
        AuthorSearchTable.setVisible(false);
        
        
    }//GEN-LAST:event_jButtonClearActionPerformed

    
    
     private void Authortable(){
        try{
            DBConnection c = new DBConnection(); 
            c.getDBConnection();
            Statement stmt=c.getDBConnection().createStatement();
            String sql= "select Author_ID, Author_Name from author order by Author_Name;";
            stmt=c.getDBConnection().prepareStatement(sql,ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet rs=stmt.executeQuery(sql);
            DefaultTableModel tblModel=(DefaultTableModel)AuthorSearchTable.getModel();
            tblModel.getDataVector().removeAllElements();
            revalidate();
            if(!rs.next()){
                String TbData[]={"empty","empty"};       
                tblModel.addRow(TbData);
                c.getDBConnection().close();
            }
        
            else{
                rs.beforeFirst();
                while(rs.next()){
                    String Author_ID =rs.getString("Author_ID");
                    String Author_Name=rs.getString("Author_Name");

                    String TbData[]={Author_ID,Author_Name};    
                    tblModel.addRow(TbData);
                } 
                c.getDBConnection().close();
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
    
    
    
    
    private void AuthorSearchTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AuthorSearchTableMouseClicked
        // TODO add your handling code here:
        JTable source = (JTable)evt.getSource();
            int row = source.rowAtPoint( evt.getPoint() );
            int column = 0;
            String AuthorID=source.getModel().getValueAt(row, column)+"";
          
            try{
                DBConnection c = new DBConnection(); 
                c.getDBConnection();
                Statement stmt=c.getDBConnection().createStatement();
                String sql= "select Author_ID, Author_Name from author where Author_ID="+Integer.valueOf(AuthorID)+";";
                ResultSet rs=stmt.executeQuery(sql);
        
                while(rs.next()){
                    
                    String Author_ID=rs.getString(String.valueOf("Author_ID"));
                    String Author_Name=rs.getString("Author_Name");
                    jTextFieldAuthorID.setText(Author_ID); 
                    jTextFieldA_Search.setText(Author_Name);
                } 
                c.getDBConnection().close();
                
            }catch(Exception e){
                System.out.println(e);
        }
    }//GEN-LAST:event_AuthorSearchTableMouseClicked

    private void jTextFieldA_SearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldA_SearchMouseClicked
        // TODO add your handling code here:
        jTextFieldA_Search.setText("");
        Authortable();
        AuthorSearchTable.setVisible(true);
    }//GEN-LAST:event_jTextFieldA_SearchMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        NewAuthor newAuthor=new  NewAuthor();
        newAuthor.setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextFieldA_SearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldA_SearchKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextFieldA_SearchKeyPressed

    private void jTextFieldA_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldA_SearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldA_SearchActionPerformed

    private void jTextFieldA_SearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldA_SearchKeyReleased
        // TODO add your handling code here:
        AuthorSearchTable.setVisible(true);
        
        
         try{
            DBConnection c = new DBConnection(); 
            c.getDBConnection();
            Statement stmt=c.getDBConnection().createStatement();
            String s=jTextFieldA_Search.getText();
            String sql= "select Author_ID, Author_Name from author where Author_Name LIKE '%"+s+"%';";     
            stmt=c.getDBConnection().prepareStatement(sql,ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet rs=stmt.executeQuery(sql);
            DefaultTableModel tblModel=(DefaultTableModel)AuthorSearchTable.getModel();
            tblModel.getDataVector().removeAllElements();
            revalidate();
           
            if(!rs.next()){
                String TbData[]={"empty","empty"};       
                tblModel.addRow(TbData);
                c.getDBConnection().close();
            }
            else{
            rs.beforeFirst();
                while(rs.next()){               
                    
                    String AuthorID=String.valueOf(rs.getInt("Author_ID"));
                    String AuthorName=rs.getString("Author_Name");
          
                    String TbData[]={AuthorID, AuthorName};       
                    tblModel.addRow(TbData);
                } 
                c.getDBConnection().close();;
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_jTextFieldA_SearchKeyReleased

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
            java.util.logging.Logger.getLogger(NewBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable AuthorSearchTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonClear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextFieldA_Search;
    private javax.swing.JTextField jTextFieldAuthorID;
    private javax.swing.JTextField jTextFieldB_Title;
    private javax.swing.JTextField jTextFieldCategory;
    private javax.swing.JTextField jTextFieldISBN;
    private javax.swing.JTextField jTextFieldPrice;
    // End of variables declaration//GEN-END:variables
}
