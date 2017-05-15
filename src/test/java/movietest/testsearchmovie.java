package movietest;
import java.sql.SQLException;
import java.time.LocalDate;
public class testsearchmovie
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		{
			System.out.println("Search by nmovie name");
			String movnam = "bahubali";
			searchmovie.searchname(movnam);
			
			
			System.out.println("Search by language");
			String movielang="Tamizh";
			searchmovie.searchlang(movielang);
		
			System.out.println("Search by date");
			String inputdate="2017-05-12";
			LocalDate rdate=LocalDate.parse(inputdate);
			searchmovie.searchdate(rdate);
		}
			
	}

}
