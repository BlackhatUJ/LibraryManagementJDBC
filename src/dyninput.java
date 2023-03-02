import java.sql.*;
import java.io.*;
public class dyninput {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url= "jdbc:mysql://localhost:3306/ujjwaldb";
            String username= "root";
            String password= "666ujg666*";
            Connection con= DriverManager.getConnection(url, username, password);
            String query= "insert into student(roll_no, student_name, marks, age) values (?,?,?,?)";
            PreparedStatement ptm= con.prepareStatement(query);
            BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
            System.out.println("enter the roll number :");
            String roll_no= br.readLine();
            System.out.println("enter the name of the student :");
            String name= br.readLine();
            System.out.println("enter the marks obtained by student :");
            String marks= br.readLine();
            System.out.println("enter the age of the student :");
            String age= br.readLine();

            ptm.setString(1, roll_no);
            ptm.setString(2, name);
            ptm.setString(3, marks);
            ptm.setString(4, age);

            ptm.executeUpdate();

            System.out.println("insertion successful");
            ptm.close();
            con.close();



         
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
}
