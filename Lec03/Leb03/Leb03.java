package Lec03.Leb03;
import java.sql.*;

public class Leb03 {
        private static Connection con;
        
    
        public static void main(String[] args) {
            // TODO Auto-generated method stub
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                String dbURL = "jdbc:mysql://localhost/javawebLabssec1?characterEncoding=utf-8";
                con = DriverManager.getConnection(dbURL, "root", "");
                
                PreparedStatement pStatement = con.prepareStatement("SELECT * FROM teachers WHERE gender = ?"); 
                pStatement.setString(1, "m");
                ResultSet resultSet = pStatement.executeQuery();
                
                while (resultSet.next()) {  
                    String gender;
                    String tname = resultSet.getString("tname");
                    if(resultSet.getString("gender").equals("m")) {
                        gender = "ชาย";
                    }else {
                        gender = "หญิง";
                    }
                    System.out.println("ชื่อ : " + tname + " เพศ : " + gender);
                }
        
            con.close();
    
        } catch (ClassNotFoundException e) {
            System.err.println("Error loading driver: " + e);
        } catch (SQLException e) {
            System.err.println("Error database connection: " + e);
        }
        }

}
