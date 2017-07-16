package cn.jd.spring.jdbc.template;
import java.sql.SQLException;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class PersonDao4 extends JdbcTemplate{
	public PersonDao4(){}
	public PersonDao4(DataSource dataSource){
		super(dataSource);
	}
	public void add() throws SQLException{
		this.execute("insert into person(name) values('张三')");
	}
}
