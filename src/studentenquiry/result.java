
//package studentenquiry;
import java.sql.*;
import java.io.*;

public class result {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/studentenq";
            String username = "root";
            String password = "666ujg666*";

            Connection con = DriverManager.getConnection(url, username, password);
            String query1 = "insert into details (roll_no, sname, age, marks) values(?,?,?,?)";

            String query2 = "update details set sname=?,age=?,marks=? where roll_no=?";
            PreparedStatement ptm = con.prepareStatement(query1);
            PreparedStatement ptm2 = con.prepareStatement(query2);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("enter the rno.");
            int rno = Integer.parseInt(br.readLine());

            System.out.println("enter the name :");
            String name = br.readLine();

            System.out.println("enter the age :");
            int age = Integer.parseInt(br.readLine());

            System.out.println("enter the marks :");
            float marks = Float.parseFloat(br.readLine());
            // public void insert()
            // {
            // String query1 = "insert into details (roll_no, sname, age, marks) values(?,?,?,?)";
            // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            // PreparedStatement ptm = con.prepareStatement(query1);
            
            // System.out.println("enter the rno.");
            // int rno = Integer.parseInt(br.readLine());

            // System.out.println("enter the name :");
            // String name = br.readLine();

            // System.out.println("enter the age :");
            // int age = Integer.parseInt(br.readLine());

            // System.out.println("enter the marks :");
            // float marks = Float.parseFloat(br.readLine());

            //     ptm.setInt(1, rno);
            //     ptm.setString(2, name);
            //     ptm.setInt(3, age);
            //     ptm.setFloat(4, marks);
            //     System.out.println("inserted");
            //     ptm.executeLargeUpdate();
            //     ptm.close();
            // }

            ptm.setInt(1, rno);
            ptm.setString(2, name);
            ptm.setInt(3, age);
            ptm.setFloat(4, marks);
            System.out.println("inserted");
            ptm.executeLargeUpdate();
            ptm.close();

            ptm2.setString(1, name);
            ptm2.setInt(2, age);
            ptm2.setFloat(3, marks);
            ptm2.setInt(4, rno);
            System.out.println("updated");
            ptm2.executeLargeUpdate();
            ptm2.close();
            con.close();
            // public   void update()
            // {
            // String query2 = "update details set sname=?,age=?,marks=? where roll_no=?";

            //     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            // PreparedStatement ptm2 = con.prepareStatement(query2);


            // System.out.println("enter the rno.");
            // int rno = Integer.parseInt(br.readLine());

            // System.out.println("enter the name :");
            // String name = br.readLine();

            // System.out.println("enter the age :");
            // int age = Integer.parseInt(br.readLine());

            // System.out.println("enter the marks :");
            // float marks = Float.parseFloat(br.readLine());
            // ptm2.setString(1, name);
            // ptm2.setInt(2, age);
            // ptm2.setFloat(3, marks);
            // ptm2.setInt(4, rno);
            // System.out.println("updated");
            // ptm2.executeLargeUpdate();
            // ptm2.close();

            // }

        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
