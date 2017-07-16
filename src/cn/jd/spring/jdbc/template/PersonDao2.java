package cn.jd.spring.jdbc.template;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class PersonDao2 extends JdbcDaoSupport {
	public void add() throws SQLException{
		this.getJdbcTemplate().execute("insert into person(name) values('张三')");
	}
	public List<Person> query(){
		return this.getJdbcTemplate().query("select * from person", new RowMapper() {
			@Override
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				Person p = new Person();
				p.setpId(rs.getLong("id"));
				p.setName(rs.getString("name"));
				return p;
			}
		});
	}
}
