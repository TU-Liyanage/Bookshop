/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javariance.bookshop;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Tharindu
 */
public class AddNewOrder {
    private String CustomerNIC;
    private String OrderID;
    private Date date;
    private int TotalPrice=0;
    private Vector<book> Books=new Vector<>();
    
    public AddNewOrder(){
        setDate();
        setOrderID();
    }
    public String getCustomerNIC(){
        return this.CustomerNIC;
    }
    public String getOrderID(){
        return this.OrderID;
    }
    public Date getDate(){
        return this.date;
    }
    public int getTotalPrice(){
        return TotalPrice;
    }
    public Vector<book> getBooks(){
        return this.Books;
    }
    
    public void setCustomerNIC(String NIC){
        this.CustomerNIC=NIC;
        System.out.println(CustomerNIC);
    }
    public void setOrderID(){
        
        try {
            DBConnection conn=new DBConnection();
            Connection con=conn.getDBConnection();
            String Sql="SELECT Order_ID FROM `place_order` ORDER BY `place_order`.`Order_ID`  DESC";
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(Sql);
            rs.next();
            String oldID=rs.getString("Order_ID");
            int IDNum=Integer.parseInt(oldID.substring(3))+1;
            System.out.println(IDNum);
            this.OrderID="ODR"+IDNum;
        } catch (Exception ex) {
            Logger.getLogger(AddNewOrder.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public void setDate(){
        long millis=System.currentTimeMillis();  
        java.sql.Date dte=new java.sql.Date(millis);  
        //System.out.println(date);  
        this.date=dte;
    }
    public void addBooks(String ISBN,int price,int quantity){
        this.TotalPrice+=(price*quantity);
        book b=new book(ISBN,quantity);
        this.Books.add(b);
    }
    public void removeBooks(int row,int price){
        this.TotalPrice-=(price);
        this.Books.remove(row);
    }
    public void pushData(){
        try{
        String sql,SQL;
        sql= "Insert into place_order (Order_ID,Customer_ID,Delivery_Status,Total_Price,Order_Date) values('"+OrderID+"','"+CustomerNIC+"','incomplete','"+TotalPrice+"','"+date+"');";
        System.out.println(OrderID+","+CustomerNIC+"','incomplete','"+TotalPrice+"','"+date);
        DBConnection con=new DBConnection();
        Connection connection=con.getDBConnection();
        Statement statement;
        statement=connection.createStatement();
        statement.execute(sql);
        for(int i=0;i<Books.size();i++){
        System.out.println(OrderID+"','"+Books.elementAt(i).getISBN()+"','"+Books.elementAt(i).getQuantity());    
        SQL="Insert into order_books (Order_ID,ISBN,Quantity) values ('"+OrderID+"','"+Books.elementAt(i).getISBN()+"','"+Books.elementAt(i).getQuantity()+"');";
        Statement stmt=connection.createStatement();
        stmt.execute(SQL);
        }
        
        }
        catch (SQLException ex) {
            Logger.getLogger(AddNewOrder.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (Exception ex) {
            Logger.getLogger(AddNewOrder.class.getName()).log(Level.SEVERE, null, ex);
        }
}
}
class book{
    String book;
    int Quantiy;
    public book(String ISBN,int quan){
        book=ISBN;
        Quantiy=quan;
    }
    public String getISBN(){
        return this.book;
    }
    public int getQuantity(){
        return this.Quantiy;
    }
}