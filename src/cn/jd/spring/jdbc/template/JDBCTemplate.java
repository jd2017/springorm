package cn.jd.spring.jdbc.template;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

public class JDBCTemplate {
	private DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	public JDBCTemplate(){}
	public JDBCTemplate(DataSource ds){
		this.dataSource = ds;
	}
	public void insert(String sql) throws SQLException{
		Connection connection = this.dataSource.getConnection();
		Statement statement = connection.createStatement();
		statement.execute(sql);
	}
	
	
}
