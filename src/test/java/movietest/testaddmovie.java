package movietest;

import java.sql.SQLException;

public class testaddmovie {

	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		
		String movnam = "newmovie";
		addmovie.insert(movnam);
	}

}
 