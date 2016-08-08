package stu.mybatis.official.mapper;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import stu.mybatis.official.base.Good;

public class DDLSample {
	public static void main(String[] args) throws IOException {
		InputStream in = Resources.getResourceAsStream("stu/mybatis/official/mapper/mybatis-config.xml");
		
		SqlSessionFactory factory 
			= new SqlSessionFactoryBuilder().build(in);
		
		SqlSession session = factory.openSession();
		
		GoodMapper mapper = session.getMapper(GoodMapper.class);
		
		
//		Good good = new Good();
//		good.setId(5);
//		good.setName("batis");
//		mapper.updateGood(good);
		
//		mapper.deleteGood(5);
		try {
			session.delete("stu.mybatis.official.mapper.GoodMapper.deleteGood",5);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			session.close();
			
		}
		
		
	}
}
