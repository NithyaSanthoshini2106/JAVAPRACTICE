import java.sql.*;

public class DBConnect {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb", "root", "password"
            );

            System.out.println("Connected!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
