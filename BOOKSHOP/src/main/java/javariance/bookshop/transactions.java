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
/**
 *
 * @author Tharindu
 */
public class transactions {
    private String CustomerNIC;
    private String OrderID;
    private Date orderdate;
    private Date BillDate;
    private int BillNO;
    private int TotalPrice=0;
    private Vector<book> Books=new Vector<>();
    
    public String getCustomerNIC(){
        return this.CustomerNIC;
    }
    public String getOrderID(){
        return this.OrderID;
    }
    public Date getOrderDate(){
        return this.orderdate;
    }
    public int getTotalPrice(){
        return TotalPrice;
    }
    public Vector<book> getBooks(){
        return this.Books;
    }
    public int getBillNo(){
        return this.BillNO;
    }
    public Date getBillDate(){
        return this.BillDate;
    }
    public void setBillNo(int num){
            this.BillNO=num;
    }
    public void setBillDate(){
        long millis=System.currentTimeMillis();  
        Date dte=new Date(millis);  
        //System.out.println(date);  
        this.BillDate=dte;
    }
    
    public void setCustomerNIC(String NIC){
        this.CustomerNIC=NIC;
        //System.out.println(CustomerNIC);
    }
    public void setOrderID(String IDNum){
            this.OrderID=IDNum;
    }
    public void setOrderDate(){
        long millis=System.currentTimeMillis();  
        Date dte=new Date(millis);  
        //System.out.println(date);  
        this.orderdate=dte;
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
   /* public void pushData(){
        try{
        String sql,SQL;
        sql= "Insert into place_order (Order_ID,Customer_ID,Delivery_Status,Total_Price,Order_Date) values('"+OrderID+"','"+CustomerNIC+"','incomplete','"+TotalPrice+"','"+orderdate+"');";
        //System.out.println(OrderID+","+CustomerNIC+"','incomplete','"+TotalPrice+"','"+orderdate);
        DBConnection con=new DBConnection();
        Connection connection=con.getDBConnection();
        Statement statement;
        statement=connection.createStatement();
        statement.execute(sql);
        for(int i=0;i<Books.size();i++){
        //System.out.println(OrderID+"','"+Books.elementAt(i).getISBN()+"','"+Books.elementAt(i).getQuantity());    
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
}*/
}
