package stu.mybatis.official.base;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class BaseSample {
	public static void main(String[] args) throws IOException {
		InputStream in = Resources.getResourceAsStream("stu/mybatis/official/base/mybatis-config.xml");
		
		SqlSessionFactory factory 
			= new SqlSessionFactoryBuilder().build(in);
		
		SqlSession session = factory.openSession();

		Good good = (Good)session.selectOne("stu.mybatis.official.base.GoodMapper.selectGood", 1);
		
		System.out.println(good);
	}
}
