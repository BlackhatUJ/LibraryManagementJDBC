import java.util.*;
import java.sql.*;
import java.io.*;
class demo
{
    
    //public   con;
  static  void conmethod() 
    {
        try
         {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/ujjwaldb";
            String username = "root";
            String pass = "666ujg666*";
            
            Connection con = DriverManager.getConnection(url, username, pass);
        } catch (Exception e) 
        {
            System.out.println(e);
        }
    }
}

public class multiplequery  extends demo{

    public static void main(String[] args) {
conmethod();
String query= "select * from student";
//Statement st= con.createStatement();

}
}

