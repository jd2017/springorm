package cn.jd.spring.jdbc.transaction;

public class PersonServiceImpl implements PersonServive {
	private PersonDao personDao;
	public void setPersonDao(PersonDao personDao) {
		this.personDao = personDao;
	}
	@Override
	public void savePerson() {
		this.personDao.savePerson();
		int i =1/0;
		this.personDao.savePerson();
	}

}
