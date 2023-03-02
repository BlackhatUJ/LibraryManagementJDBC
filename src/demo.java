import java.sql.*;
import java.io.*;

public class demo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url= "jdbc:mysql://localhost:3306/ujjwaldb";
            String username= "root";
            String password= "666ujg666*";
            Connection con= DriverManager.getConnection(url, username, password);
        
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
   
}
