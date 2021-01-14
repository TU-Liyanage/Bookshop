/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javariance.bookshop;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author chamcbs <your.name at your.org>
 */
public class DBConnection {
    
    public Connection getDBConnection() throws Exception{
        final String DBURL="jdbc:mysql://localhost:3306/bookshop";
        final String USERNAME="root";
        final String PASSWORD="";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn=DriverManager.getConnection(DBURL,USERNAME,PASSWORD);
        return conn;
    }
    
}
