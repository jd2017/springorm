package cn.jd.spring.jdbc.test;

import java.sql.SQLException;

import javax.sql.DataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.jd.spring.jdbc.template.PersonDao;
import cn.jd.spring.jdbc.template.PersonDao2;
import cn.jd.spring.jdbc.template.PersonDao3;
import cn.jd.spring.jdbc.template.PersonDao4;


public class DataSourcesTest {
	@Test
	public void test(){
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		DataSource ds =(DataSource)context.getBean("dataSource");
		System.out.println(ds);
	}
	@Test
	public void personDao() throws SQLException{
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		PersonDao ps =(PersonDao)context.getBean("personDao");
		ps.add();
	}
	@Test
	public void personDao2() throws SQLException{
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		PersonDao2 ps =(PersonDao2)context.getBean("personDao2");
		ps.add();
	}
	@Test
	public void personDao2_1() throws SQLException{
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		PersonDao2 ps =(PersonDao2)context.getBean("personDao2_1");
		ps.add();
	}
	@Test
	public void personDao2_query() throws SQLException{
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		PersonDao2 ps =(PersonDao2)context.getBean("personDao2_1");
		System.out.println(ps.query().size());
	}
	@Test
	public void personDao3() throws SQLException{
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		PersonDao3 ps =(PersonDao3)context.getBean("personDao3");
		ps.add();
	}
	@Test
	public void personDao4() throws SQLException{
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		PersonDao4 ps =(PersonDao4)context.getBean("personDao4");
		ps.add();
	}
}
