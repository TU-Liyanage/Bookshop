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
public class Bill{
    private static Vector<book> Books=new Vector<>();
    private static int TotalPrice;
    private int billno;
    public void addBooks(String ISBN,int price,int quantity){
        TotalPrice+=(price*quantity);
        book b=new book(ISBN,quantity);
        this.Books.add(b);
    }
    public Vector<book> getBooks(){
        return Books;
    }
    public void removeBooks(int row,int price){
        this.TotalPrice-=(price);
        this.Books.remove(row);
    }
    public void setTotalPrice(int n){
        TotalPrice=n;
    }
    public int getTotalPrice(){
        return TotalPrice;
    }
    public Date getDate(){
        long millis=System.currentTimeMillis();  
        Date dte=new Date(millis);  
        return dte;
    }
    public void setBillNo(){
        try {
            DBConnection conn=new DBConnection();
            Connection con=conn.getDBConnection();
            String Sql="SELECT Bill_No FROM `handle_purchases` ORDER BY `handle_purchases`.`Bill_No`  DESC";
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(Sql);
            rs.next();
            billno=rs.getInt("Bill_No")+1;
        } catch (Exception ex) {
            Logger.getLogger(Bill.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public int getBillNo(){
        
        try {
           
          return billno;
        } catch (Exception ex) {
            Logger.getLogger(AddNewOrder.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    public void makeBill(){
    try{
        setBillNo();
        String sql,SQL,Sql;
        sql= "Insert into handle_purchases (Bill_No,Emp_ID,Total_Price,Date_of_Purchase) values("+getBillNo()+",'"+user.userID+"','"+getTotalPrice()+"','"+getDate()+"');";
        //System.out.println(OrderID+","+CustomerNIC+"','incomplete','"+TotalPrice+"','"+orderdate);
        DBConnection con=new DBConnection();
        Connection connection=con.getDBConnection();
        Statement statement;
        statement=connection.createStatement();
        statement.execute(sql);
        for(int i=0;i<Books.size();i++){
        //System.out.println(OrderID+"','"+Books.elementAt(i).getISBN()+"','"+Books.elementAt(i).getQuantity());    
        SQL="Insert into bill_books (Bill_No,ISBN,Quantity) values ('"+getBillNo()+"','"+Books.elementAt(i).getISBN()+"','"+Books.elementAt(i).getQuantity()+"');";
        Statement stmt=connection.createStatement();
        stmt.execute(SQL);
        Sql="Update book SET No_of_Books_Remaining=No_of_Books_Remaining - "+Books.elementAt(i).getQuantity()+" WHERE ISBN="+Books.elementAt(i).getISBN()+" ;";
        Statement st=connection.createStatement();
        st.execute(Sql);
        }
        TotalPrice=0;
        Books.removeAllElements();
        }
        catch (SQLException ex) {
            Logger.getLogger(AddNewOrder.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (Exception ex) {
            Logger.getLogger(AddNewOrder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
