import java.sql.*;
public class App {
    public static void main(String[] args) throws Exception {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost/ujjwaldb","root","666ujg666*");
             Statement st= con.createStatement();
             ResultSet rs= st.executeQuery("select * from student;");
            //rs.next();
            /*   System.out.println(rs.getInt(1)+ " "+rs.getString(2)+" "+ rs.getString(3)+" "+rs.getString(4));
             rs.next();
             System.out.println(rs.getInt(1)+ " "+rs.getString(2)+" "+ rs.getString(3)+" "+rs.getString(4));*/

            while(rs.next())
            {
                System.out.println(rs.getInt(1)+ " "+rs.getString(2)+" "+ rs.getString(3)+" "+rs.getString(4));
            } 

            // inserting the data in databases
            /*int count= st.executeUpdate("insert into student values (900,'ashish',40,65)");
            System.out.println(count+ "rows affected");*/


             st.close();
             con.close();
             }
             catch(Exception e)
             {
                 System.out.println(e);
             }
    }
}
