package movietest;

import java.sql.SQLException;

public class testdeletemovie 
{

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		String movieName = "new";
		deletemovie.delete(movieName);
	}

}
