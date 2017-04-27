import java.sql.*;
public class SQLDriver {


	public static Connection getConnection() throws Exception{
		try{
			String driver = "com.mysql.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/medagent";
			String username = "root";
			String password = "databasepass";
			Class.forName(driver);
			
			Connection conn = DriverManager.getConnection(url, username, password);
			System.out.println("Connected");
			
			return conn;
		}catch(Exception e){e.printStackTrace();}
		
		return null;
	}
}