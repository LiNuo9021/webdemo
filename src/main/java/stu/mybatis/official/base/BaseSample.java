package stu.mybatis.official.base;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Timestamp;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class BaseSample {
	public static void main(String[] args) throws IOException {
		
		System.out.println(System.currentTimeMillis());
		
		Timestamp ts = new Timestamp(System.currentTimeMillis());
		System.out.println(ts);
		System.out.println(ts.getTime());
		
//		InputStream in = Resources.getResourceAsStream("stu/mybatis/official/base/mybatis-config.xml");
//		
//		SqlSessionFactory factory 
//			= new SqlSessionFactoryBuilder().build(in);
//		
//		SqlSession session = factory.openSession();
//
//		try {
//			//方法一
//			Good good = (Good) session.selectOne("stu.mybatis.official.base.GoodMapper.selectGood", 1);
//			System.out.println(good);
//			
//			//方法二
//			GoodMapper goodMapper = session.getMapper(GoodMapper.class);
//			Good good2 = goodMapper.selectGood(1);
//			System.out.println(good2);
//		} 
//		finally {
//			session.close();
//		}
	}
}
