package stu.mybatis.official.plugin;

import java.io.IOException;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import stu.mybatis.official.base.Good;

public class PluginSample {

	public static void main(String[] args) throws IOException {
		SqlSessionFactory factory 
			= new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("stu/mybatis/official/base/mybatis-config.xml"));
	
		SqlSession session = factory.openSession();
	
		Good good = new Good();
		good.setId(6);
		good.setName("mybatis");
		int row = session.update("stu.mybatis.official.base.GoodMapper.updateName", good);
		
		System.out.println(row);
		
//		GoodMapper mapper = session.getMapper(GoodMapper.class);
		
	}
	
	
	
	
}
