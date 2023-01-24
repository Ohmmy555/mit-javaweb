package Lec03.Ass03;
import java.sql.*;

public class Ass03 {
        private static Connection con;
        public static void main(String[] args) {
            // TODO Auto-generated method stub
            try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String dbURL = "jdbc:mysql://localhost/blueshop?characterEncoding=utf-8";
            con = DriverManager.getConnection(dbURL, "root", "");
            PreparedStatement pStatement = con.prepareStatement("SELECT * FROM member"); 
            // pStatement.setInt(1, 3);
            // pStatement.setString(2, "g%");
            ResultSet resultSet = pStatement.executeQuery();
            while (resultSet.next()) {
            String username = resultSet.getString("username");
            String name = resultSet.getString("name");
            String address = resultSet.getString("address");
            String mobile = resultSet.getString("mobile");
            String email = resultSet.getString("email");
            System.out.println(username + " , " + name + " , " + address + " , " + mobile+ " , "+email);
            }
            con.close();
            } catch (ClassNotFoundException e) {
            System.err.println("Error loading driver: " + e);
            } catch (SQLException e) {
            System.err.println("Error database connection: " + e);
            }
    }
}
