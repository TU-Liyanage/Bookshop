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
public class AddNewOrder extends transactions {
    
    public AddNewOrder(){
        super.setOrderDate();
        setOrderID();
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
            //System.out.println(IDNum);
            super.setOrderID("ODR"+IDNum);
        } catch (Exception ex) {
            Logger.getLogger(AddNewOrder.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public void makeOrder(){
        try{
        String sql,SQL;
        sql= "Insert into place_order (Order_ID,Customer_ID,Delivery_Status,Total_Price,Order_Date) values('"+super.getOrderID()+"','"+super.getCustomerNIC()+"','incomplete','"+super.getTotalPrice()+"','"+super.getOrderDate()+"');";
        //System.out.println(OrderID+","+CustomerNIC+"','incomplete','"+TotalPrice+"','"+orderdate);
        DBConnection con=new DBConnection();
        Connection connection=con.getDBConnection();
        Statement statement;
        statement=connection.createStatement();
        statement.execute(sql);
        for(int i=0;i<super.getBooks().size();i++){
        //System.out.println(OrderID+"','"+Books.elementAt(i).getISBN()+"','"+Books.elementAt(i).getQuantity());    
        SQL="Insert into order_books (Order_ID,ISBN,Quantity) values ('"+super.getOrderID()+"','"+super.getBooks().elementAt(i).getISBN()+"','"+super.getBooks().elementAt(i).getQuantity()+"');";
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