package dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import entity.Clerk;
import mappers.clerkRowMapper;

@Repository
@Component
public class ClerkDAO {

	@Autowired
	public JdbcTemplate jdbcTemplate;


	public Clerk getClerk(String ssn) {
		String sql = "select * from clerk where ssn =?";
		return jdbcTemplate.queryForObject(sql, new Object[] { ssn }, new clerkRowMapper());
	}
}
