package library_management.returning;

import java.sql.*;
import java.io.*;

import library_management.connection.connection;

public class returning extends connection {
    public void returnbook() {
        String query = "update book set book_avaialble= (book_avaialble+1) where book_id=?";
        try {
            Connection connection = connect();
            PreparedStatement ptm = connection.prepareStatement(query);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("enter the book id :"); 
            String book_id = br.readLine();
            ptm.setString(1, book_id);
            ptm.executeUpdate();

            System.out.println("Book Returned Successfully\n Have a Great Day Ahead!");
            connection.close();
            ptm.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
