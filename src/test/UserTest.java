package test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.pojo.User;
import cn.service.UserService;

public class UserTest {
	@Test
	public void userTest(){
		ApplicationContext con = new ClassPathXmlApplicationContext("spring-hibernate.xml");
		UserService userService = (UserService) con.getBean("userService");
		for (User user : userService.find()) {
			System.out.println(user.getName());
		}
	}
}
