package movietest;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;



public class listmovie
{
	public static ArrayList<movie> findAllMovies() throws ClassNotFoundException, SQLException 
    {
    ArrayList<movie> movienam=new ArrayList<movie>();   
	Connection con=conncetiondb.connect();      		 
        String sql = "select movie_id,movie_name,release_date from movies";
        PreparedStatement pst = con.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
        while (rs.next())
        {
            int movieId = rs.getInt("movie_id");
            String movieName = rs.getString("movie_name");
            Date dt=rs.getDate("release_date");
            movie  m=new movie();
            m.movieid=movieId;
            m.moviename=movieName;
            m.releasedat=dt.toLocalDate();
            movienam.add(m);
            System.out.println("MovieId=" + movieId + "MovieName=" + movieName + "releasedate" + dt);
        }
            rs.close();
            pst.close();
            con.close();
            return movienam;
       }
    
}
