import java.sql.*;
import java.io.*;

public class updatedata {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/ujjwaldb";
            String username = "root";
            String password = "666ujg666*";

            Connection con = DriverManager.getConnection(url, username, password);

            String query = "update student set student_name=?,marks=?,age=? where roll_no=?";

            PreparedStatement ptm = con.prepareStatement(query);

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("enter the name of the student ");
            String name = br.readLine();

            System.out.println("enter the marks of the student :");
            String marks = br.readLine();

            System.out.println("enter the age of the student :");
            String age = br.readLine();

            System.out.println("enter the roll number of the student :");
            int roll = Integer.parseInt(br.readLine());

            ptm.setString(1, name);
            ptm.setString(2, marks);

            ptm.setString(3, age);
            ptm.setInt(4, roll);

            System.out.println("insertion done ...");
            
            ptm.executeUpdate();
            ptm.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}