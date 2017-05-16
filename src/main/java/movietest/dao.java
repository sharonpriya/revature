package movietest;

import org.springframework.jdbc.core.JdbcTemplate;

public class dao {

	public static void insert(String movnam) {
		JdbcTemplate jdbcTemplate = conncetiondb.getJdbcTemplate();
		String sql = "insert into movies ( movie_name) values ( ?)";
		int rows = jdbcTemplate.update(sql, movnam);
		System.out.println("no.of rows inserted" + rows + "Movie inserted is :" + movnam);
	}

	public static void delete(String movnam1) {
		JdbcTemplate jdbcTemplate = conncetiondb.getJdbcTemplate();
		String sql = "delete from movies where  movie_name = ?";
		int rows = jdbcTemplate.update(sql, movnam1);
		System.out.println("moviedeleted is -" + movnam1 + "Rows deleted" + rows);
	}
}
