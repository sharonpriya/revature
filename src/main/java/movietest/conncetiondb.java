package movietest;
/**
 * 
 */
/**
 * @author Prashanth
 *
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conncetiondb
{
	public static Connection connect() throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/sharon";
		String username = "root";
		String password = "enter";
		Connection con = DriverManager.getConnection(url, username, password);
		return(con);
	}

}