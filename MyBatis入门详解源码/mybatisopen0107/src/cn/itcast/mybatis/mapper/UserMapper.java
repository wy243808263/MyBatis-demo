package cn.itcast.mybatis.mapper;

import java.util.List;

import cn.itcast.mybatis.po.User;

/**
 * 
 * <p>Title: UserDao</p>
 * <p>Description: userDao接口</p>
 * <p>Company: www.itcast.com</p> 
 * @author	苗润土
 * @date	2014年11月25日下午9:26:39
 * @version 1.0
 */
public interface UserMapper {
	
	//根据用户名称 查询用户信息
	public User  findUserByUsername(String username) throws Exception;
	
	//查询用户列表
	public List<User> findUserList(User user)throws Exception;
	
	//查询用户列表总数
	public int findUserCount(User user)throws Exception;
	
	

}
