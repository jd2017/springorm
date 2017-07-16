package cn.jd.spring.jdbc.transaction;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class PersonImpl extends JdbcDaoSupport implements PersonDao {

	@Override
	public void savePerson() {
		this.getJdbcTemplate().execute("insert into Person(name) values('bb')");
	}

}
