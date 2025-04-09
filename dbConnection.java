package jdbcDemo;
import java.sql.*;
public class dbConnection {

	public static void main(String[] args) {
        String driver = "com.mysql.cj.jdbc.Driver";  // Corrected driver name
        String url = "jdbc:mysql://localhost:3306/school"; // Corrected URL
        String username = "root";
        String password = "Maha@123";

        try{ 
            Class.forName(driver);
            Connection con = DriverManager.getConnection(url,username,password);
            Statement  stmt = con.createStatement();
            //stmt.executeUpdate("INSERT INTO student VALUES (1, 'maha')");
            //stmt.executeUpdate("INSERT INTO student VALUES (4, 'sai')");
            ResultSet res = stmt.executeQuery("select * from student");
            while(res.next()) {
            System.out.println(res.getInt("id") + " 		" + res.getString("name"));
            
            }
            
            
            con.close();
           }
        catch(Exception e){
           System.out.println(e);
         }
    }
}










