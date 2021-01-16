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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tharindu
 */
public class OrderBill extends transactions {
    
    public OrderBill(String orderID){
        super.setBillDate();
        setBillNo();
        super.setOrderID(orderID);
        setBooks(orderID);
        
    }
    public void setBooks(String ID){
        try {
            DBConnection con=new DBConnection();
            Connection connection=con.getDBConnection();
            Statement statement;
            ResultSet resultSet;
            statement=connection.createStatement();
            String sql= "select A.ISBN,A.Quantity,B.Price from order_books A, book B where Order_ID='"+ID+"' and A.ISBN=B.ISBN;";
            resultSet =statement.executeQuery(sql);
            
            while(resultSet.next()){
                String ISBN =resultSet.getString("A.ISBN");
                int price=resultSet.getInt("B.Price");
                int Quantity=resultSet.getInt("A.Quantity");
                super.addBooks(ISBN, price, Quantity);
            }
        } catch (Exception ex) {
            Logger.getLogger(OrderBill.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void makeBill(){
        try{
        String sql,SQL,Sql,SQl;
        sql= "Insert into handle_purchases (Bill_No,Emp_ID,Total_Price,Date_of_Purchase) values('"+super.getBillNo()+"','"+user.userID+"','"+super.getTotalPrice()+"','"+super.getBillDate()+"');";
        //System.out.println(OrderID+","+CustomerNIC+"','incomplete','"+TotalPrice+"','"+orderdate);
        DBConnection con=new DBConnection();
        Connection connection=con.getDBConnection();
        Statement statement;
        statement=connection.createStatement();
        statement.execute(sql);
        for(int i=0;i<super.getBooks().size();i++){
        //System.out.println(OrderID+"','"+Books.elementAt(i).getISBN()+"','"+Books.elementAt(i).getQuantity());    
        SQL="Insert into bill_books (Bill_No,ISBN,Quantity) values ("+super.getBillNo()+",'"+super.getBooks().elementAt(i).getISBN()+"',"+super.getBooks().elementAt(i).getQuantity()+");";
        Statement stmt=connection.createStatement();
        stmt.execute(SQL);
        SQl="Update book SET No_of_Books_Remaining=No_of_Books_Remaining - "+super.getBooks().elementAt(i).getQuantity()+" WHERE ISBN="+super.getBooks().elementAt(i).getISBN()+" ;";
        Statement st=connection.createStatement();
        st.execute(SQl);
        }
        Sql="Update place_order SET Delivery_Status='Complete', Bill_NO="+super.getBillNo()+" , Date_of_Completion='"+super.getBillDate()+"' WHERE Order_ID='"+super.getOrderID()+"' ;";
        Statement stm=connection.createStatement();
        stm.execute(Sql);
        Sql="Update order_books SET Status='Complete' WHERE Order_ID='"+super.getOrderID()+"';";
        Statement stmt=connection.createStatement();
        stm.execute(Sql);
        }
        catch (SQLException ex) {
            Logger.getLogger(AddNewOrder.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (Exception ex) {
            Logger.getLogger(AddNewOrder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void setBillNo(){
        try {
            DBConnection conn=new DBConnection();
            Connection con=conn.getDBConnection();
            String Sql="SELECT Bill_No FROM `handle_purchases` ORDER BY `handle_purchases`.`Bill_No`  DESC";
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(Sql);
            rs.next();
            int billno=rs.getInt("Bill_No")+1;
            //System.out.println(IDNum);
            super.setBillNo(billno);
        } catch (Exception ex) {
            Logger.getLogger(AddNewOrder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void print(){
        System.out.println(super.getBillNo()+","+super.getBillDate()+","+super.getTotalPrice());
        for(int i=0;i<super.getBooks().size();i++){
            System.out.println(super.getBooks().elementAt(i).getISBN()+","+super.getBooks().elementAt(i).getQuantity());
        }
    }
}
