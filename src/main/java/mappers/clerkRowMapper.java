package mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import entity.Clerk;

@Component
public class clerkRowMapper implements RowMapper<Clerk>{

	@Override
	public Clerk mapRow(ResultSet rs, int arg1) throws SQLException {
		return new Clerk(rs.getString("ssn"), rs.getString("name"), rs.getDate("startDate"), 
				//rs.getDate("terminantionDate"), 
				rs.getInt("active") ==1 ?true:false);
	}

}
