package movietest;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;


public class searchmovie {
	public static movie searchname(String movnam) throws ClassNotFoundException, SQLException {
		movie m = null;
		Connection con = conncetiondb.connect();
		String sql = "select movie_id,movie_name,release_date from movies where movie_name= ?";
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setString(1, movnam);
		ResultSet rs = pst.executeQuery();
		if (rs.next()) {
			int movieId = rs.getInt("movie_id");
			String movieName = rs.getString("movie_name");
			Date dt = rs.getDate("release_date");
			m = new movie();
			m.movieid = movieId;
			m.moviename = movieName;
			m.releasedat = dt.toLocalDate();
			System.out.println("MovieId=" + movieId + "MovieName=" + movieName + "releasedate" + dt);
		}
		rs.close();
		pst.close();
		con.close();
		return m;
	}

	public static movie searchlang(String movielang) throws ClassNotFoundException, SQLException {
		movie m = null;
		Connection con = conncetiondb.connect();
		String sql = "select movie_id,movie_name,release_date from movies where language= ?";
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setString(1, movielang);
		ResultSet rs = pst.executeQuery();
		if (rs.next()) {
			int movieId = rs.getInt("movie_id");
			String movieName = rs.getString("movie_name");
			Date dt = rs.getDate("release_date");
			m = new movie();
			m.movieid = movieId;
			m.moviename = movieName;
			m.releasedat = dt.toLocalDate();
			System.out.println("MovieId=" + movieId + "MovieName=" + movieName + "releasedate" + dt);
		}
		rs.close();
		pst.close();
		con.close();
		return m;
	}

	public static movie searchdate(LocalDate rdate) throws ClassNotFoundException, SQLException {
		movie m = null;
		Connection con = conncetiondb.connect();
		String sql = "SELECT * FROM movies WHERE DATE(release_date)= ?";
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setObject(1, rdate);
		ResultSet rs = pst.executeQuery();
		if (rs.next()) {
			int movieId = rs.getInt("movie_id");
			String movieName = rs.getString("movie_name");
			Date dt = rs.getDate("release_date");
			m = new movie();
			m.movieid = movieId;
			m.moviename = movieName;
			m.releasedat = dt.toLocalDate();
			System.out.println("MovieId=" + movieId + "MovieName=" + movieName + "releasedate" + dt);
		}
		rs.close();
		pst.close();
		con.close();
		return m;
	}
}
