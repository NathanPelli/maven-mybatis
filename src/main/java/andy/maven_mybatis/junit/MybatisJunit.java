package andy.maven_mybatis.junit;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import andy.maven_mybatis.dao.UserDao;
import andy.maven_mybatis.domain.User;

public class MybatisJunit {
	private static SqlSessionFactory sqlSessionFactory;
	private static SqlSession sqlSession;
	private static UserDao userDao;
	@Before
	public void init(){
		try {
			Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
			sqlSession = sqlSessionFactory.openSession();
			userDao = sqlSession.getMapper(UserDao.class);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@Test
	public void session_select_test(){//直接通过SqlSession实例来执行已经映射的sql语句
		User user = userDao.selectUserById(2);
		String str = user.toString();
		System.out.println(str);
	}
	@After
	public void end(){
		
	}
}
