package cn.jd.spring.jdbc.template;

import java.sql.SQLException;

public class PersonDao extends JDBCTemplate {
	public void add() throws SQLException{
		this.insert("insert into person(name) values('张三')");
	}
}
