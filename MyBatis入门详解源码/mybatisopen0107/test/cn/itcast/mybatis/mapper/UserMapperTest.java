package cn.itcast.mybatis.mapper;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.itcast.mybatis.po.User;

public class UserMapperTest {
	// spring容器
	private ApplicationContext applicationContext;

	@Before
	public void setUp() throws Exception {
		// 构造spring容器
		applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
	}

	@Test
	public void testFindUserByUsername() throws Exception {
		//从spring容器中获取mapper的动态代理对象userMapper
		UserMapper userMapper = (UserMapper) applicationContext.getBean("userMapper");
		//调用userMapper方法
		User user = userMapper.findUserByUsername("张三");
		
		System.out.println(user);
		
	}
	
	@Test
	public void testFindUserList() throws Exception {
		//从spring容器中获取mapper的动态代理对象userMapper
		UserMapper userMapper = (UserMapper) applicationContext.getBean("userMapper");
		//查询条件
		User user  = new User();
		user.setUsername("张三");
		user.setSex("1");
		//调用userMapper方法
		List<User> list = userMapper.findUserList(user);
		
		System.out.println(list.size());
		
		int count = userMapper.findUserCount(user);
		System.out.println(count);
		
	}

}
