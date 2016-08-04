package configuration;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import dao.ClerkDAO;

@Configuration
@ComponentScan(basePackages={"SpringTraining.entity","SpringTraining.mappers","SpringTraining.dao"})
@PropertySource("classpath:connection.properties")
public class ConfigureClass {
	
	@Autowired
	public Environment env;
	@Bean
	public JdbcTemplate getJdbcTemplate(){
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		jdbcTemplate.afterPropertiesSet();
		return jdbcTemplate;
		//return new JdbcTemplate(getDataSource());
	}
	
	@Bean
	public DataSource getDataSource(){
		DriverManagerDataSource ds = new DriverManagerDataSource();// = new DriverManagerDataSource(env.getProperty("url"), env.getProperty("username"), env.getProperty("password"));
		ds.setDriverClassName(env.getProperty("driverclass"));
		ds.setUrl(env.getProperty("url"));
		ds.setUsername(env.getProperty("username"));
		ds.setPassword(env.getProperty("password"));
		//DriverManagerDataSource ds1 = new DriverMana
		return ds;
	}
	
	@Bean
	public ClerkDAO getClerkDAO(){
		return new ClerkDAO();
	}
		
}
