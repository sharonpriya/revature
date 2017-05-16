package movietest;
import java.sql.SQLException;
public class testdao 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		String movnam = "daomovie";
		dao.insert(movnam);
		String movnam1="newmovie";
		dao.delete(movnam1);
	}
}
