package movietest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class addmovie
{
	public static void insert(String movnam) throws ClassNotFoundException, SQLException
    {
    	Connection con= conncetiondb.connect();    	      		        		 
        String sql = "insert into movies ( movie_name) values ( '" + movnam + "')";
        PreparedStatement pst = con.prepareStatement(sql);
        int rows = pst.executeUpdate();
        System.out.println("No of rows inserted:" + rows);
    }

	}
