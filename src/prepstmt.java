import java.sql.*;

public class prepstmt {
   public static void main(String[] args) {
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/ujjwaldb";
        String username= "root";
        String password= "666ujg666*";
         
        Connection con= DriverManager.getConnection(url, username, password);
        String query= "insert into student (roll_no, student_name, marks, age) values (?,?,?,?)";
        PreparedStatement pstmt= con.prepareStatement(query);
        pstmt.setString(1, "589");
        pstmt.setString(2, "sachin");
        pstmt.setInt(3, 86);
        pstmt.setInt(4,45);
        pstmt.executeUpdate();
        System.out.println("insertion succesfull");
        pstmt.close();
        con.close();
    } catch (Exception e) {
        System.out.println(e);
    }
    
   }
  

    
}
