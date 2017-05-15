package movietest;
import java.sql.SQLException;

import java.util.ArrayList;

public class testlistmovie
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException	
	{
	ArrayList<movie> list=listmovie.findAllMovies();
	for(movie m :list)
	{
		System.out.println(m.movieid +" -" + m.moviename);
	}
	}
}
