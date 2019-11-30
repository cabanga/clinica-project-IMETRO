/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;
import java.sql.*;

/**
 *
 * @author joao.c
 */
public class DBConnection {
    public static void main(String[] agrs){
        DBConnection conn = new DBConnection();
        System.out.println(conn.getConnection());
    }
    
    
    public Connection getConnection() {
        Connection my_conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            my_conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/clinica_desktop", "root", "");
        } catch (Exception e) {
            System.out.println(e);
        }
        return my_conn;
    }
}
