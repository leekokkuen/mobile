package kok.lee.test;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.apache.log4j.Logger;
import kok.lee.model.Person;
import kok.lee.service.PersonServiceI;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml", "classpath:spring-mybatis.xml" })
public class TestMybatis {

	private static final Logger logger = Logger.getLogger(TestMybatis.class);

	private PersonServiceI upersonService;

	public PersonServiceI getPersonService() {
		return upersonService;
	}

	@Autowired
	public void setPersonService(PersonServiceI upersonService) {
		this.upersonService = upersonService;
	}

	@Test
	public void test1() {
		Person u = new Person("1","liuhui");
		upersonService.insert(u);
	}

}
