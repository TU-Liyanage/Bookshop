/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javariance.bookshop;
import java.sql.*;
/**
 *
 * @author Tharindu
 */
public class DBConnection {
    private Connection connection;
    private Statement statement;
    private ResultSet resultSet;
    
    public DBConnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookshop","root","");
            statement=connection.createStatement();
        }
        catch(Exception e){
            System.out.println("Error in connecting to database: "+e);
        }
    }
    /*public void getData(int type){
        try{
        String sql= "select id,model,m_date,price from items where type="+type+";";
        resultSet =statement.executeQuery(sql);
        System.out.println("Records:");
        //if(resultSet.first()){
         //   resultSet.previous();
            while(resultSet.next()){
                int ID=resultSet.getInt("id");
                String Model=resultSet.getString("model");
                String Date=resultSet.getString("m_date");
                int Price=resultSet.getInt("price");
                System.out.println("ID:"+ID+"\tModel:"+Model+"\tM_Date:"+Date+"\tPrice:"+Price);
            }   
        //}
        //else{
          //  System.out.println("0 Records");
        //}        
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

  /*  public void editData(int ID,Items item){
        try{
            String modl=item.getModel();
            String date=item.getManDate();
            int pric=item.getPrice();
        String sql= "UPDATE items SET model='"+modl+"',m_date='"+date+"',price="+pric+" WHERE id="+ID+";";
        statement.executeUpdate(sql);
        System.out.println("sucess:");
        }
        catch(Exception e){
            System.out.println("Update Failed:"+e);
     
        }
    }
     public void deleteData(int ID){
        try{
            
        String sql= "DELETE FROM items WHERE id="+ID+";";
        statement.executeUpdate(sql);
        System.out.println("Deleted");
        }
        catch(Exception e){
            System.out.println("Delete Failed:"+e);
     
        }
    }
   
    public void insertData(Items item){
        try{
            int typ=item.getType();
            String modl=item.getModel();
            String date=item.getManDate();
            int pric=item.getPrice();
            String query ="INSERT INTO items (type, model, m_date, price) VALUES (" +typ+ ",'" +modl+ "','" +date+ "'," +pric+ ");";
            statement.execute(query);
            System.out.println("inserted");
        }
        catch(Exception e){
            System.out.println("Error in running query"+e);
        }
    }*/
}
