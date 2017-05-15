package movietest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class updatemovie
{
	public static void update(String movieName,int movieId) throws ClassNotFoundException, SQLException
	   {
	 	        
	        Connection con= conncetiondb.connect();    
	        String sql = "update movies set movie_name = ? where movie_id = ? ";
	        PreparedStatement pst = con.prepareStatement(sql);
	        pst.setString(1, movieName);
	        pst.setInt(2, movieId);
	        int rows = pst.executeUpdate();
	        System.out.println("No of rows updated:" + rows);
	    }

}
