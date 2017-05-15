package movietest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class deletemovie
{
	public static void delete(String movieName) throws ClassNotFoundException, SQLException
	{
		           
        Connection con= conncetiondb.connect();
        String sql = "delete from movies where  movie_name = ?";
         PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, movieName);
         int rows = pst.executeUpdate();
        System.out.println("No of rows deleted:" + rows);
    }
}
