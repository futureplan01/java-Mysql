import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class pract {
	public static void main (String [] args){
		String url = "jdbc:mysql://localhost:3306/370";
		String user = "newuser";
		String password = "password";

		// Load the Connector/J driver

		// Establish connection to MySQL
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			Connection conn = (Connection) DriverManager.getConnection(url, user, password);
			
			System.out.println("DataBase Connected");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
