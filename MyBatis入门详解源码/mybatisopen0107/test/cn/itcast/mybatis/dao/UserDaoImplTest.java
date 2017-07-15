package cn.itcast.mybatis.dao;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.itcast.mybatis.po.User;

public class UserDaoImplTest {
	
	//spring容器
	private ApplicationContext applicationContext;

	@Before
	public void setUp() throws Exception {
		//构造spring容器
		applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
	}

	@Test
	public void testFindUserByUsername() throws Exception {
		//从spring容器中得到userDao的bean对象
		
		UserDao userDao = (UserDao) applicationContext.getBean("userDao");
		
		//调用 userDao的方法
		User user = userDao.findUserByUsername("张三");
		
		System.out.println(user);
		
	}

}
