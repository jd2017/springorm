package cn.jd.spring.jdbc.template;

import java.sql.SQLException;

import org.springframework.jdbc.core.JdbcTemplate;

public class PersonDao3{
	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public void add() throws SQLException{
		this.jdbcTemplate.execute("insert into person(name) values('张三')");
	}
}
