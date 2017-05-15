package movietest;

import java.sql.SQLException;

public class testupdatemovie 
{
		public static void main(String[] args) throws ClassNotFoundException, SQLException
		{
			String movieName = "newupdate";
	        int movieId = 1;
			updatemovie.update(movieName, movieId);
		}	}
