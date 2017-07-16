package cn.jd.spring.jdbc.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.jd.spring.jdbc.transaction.PersonServive;

public class PersonTransationTest {
	@Test
	public void  personTx(){
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		PersonServive ps =(PersonServive)context.getBean("personService");
		ps.savePerson();
	}
}
