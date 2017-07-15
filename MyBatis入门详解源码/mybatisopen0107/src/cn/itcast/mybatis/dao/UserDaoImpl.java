package cn.itcast.mybatis.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import cn.itcast.mybatis.po.User;

public class UserDaoImpl extends SqlSessionDaoSupport  implements UserDao {

	//由于继承SqlSessionDaoSupport通过spring容器注入会话工厂（SqlSessionFactory）
	

	@Override
	public User findUserByUsername(String username) throws Exception {
		// 从会话工厂中得到会话
		SqlSession sqlSession = this.getSqlSession();

		// 通过sqlSession操作数据库
		// 第一个参数：user.xml定义的statement的id
		// 第二个参数：输入参数
		User user = sqlSession.selectOne("test.findUserByUsername", "张三");

		//System.out.println(user);

		// 如果和spring整合后由spring容器自动关闭sqlSession,不用人为关闭sqlSession
		//sqlSession.close();

		return user;
	}

}
