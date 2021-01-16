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
   
}
