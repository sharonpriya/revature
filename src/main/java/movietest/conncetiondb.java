package movietest;
/**
 * 
 */
/**
 * @author Prashanth
 *
 */


import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.DataSource;
 import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;
public class conncetiondb
{
	
	 public static JdbcTemplate getJdbcTemplate() {
	        JdbcTemplate jdbcTemplate = new JdbcTemplate();
	        jdbcTemplate.setDataSource(getDataSource());
	        return jdbcTemplate;
	    }
	 
	    public static DataSource getDataSource() {
	        BasicDataSource ds = new BasicDataSource();
	        ds.setDriverClassName("com.mysql.jdbc.Driver");
	        ds.setUrl("jdbc:mysql://localhost:3306/sharon");
	        ds.setUsername("root");
	        ds.setPassword("enter");
	        return ds;
	    }
	 public static Connection connect() throws ClassNotFoundException, SQLException 
	{
		 DataSource dataSource = getDataSource();
	        Connection con = dataSource.getConnection();
	        	return (con);
	}

}