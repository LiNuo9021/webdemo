package stu.mybatis.official.mapper;

import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import stu.mybatis.official.base.Good;

public class SelectSample {
	public static void main(String[] args) throws IOException {
		InputStream in = Resources.getResourceAsStream("stu/mybatis/official/mapper/mybatis-config.xml");
		
		SqlSessionFactory factory 
			= new SqlSessionFactoryBuilder().build(in);
		
		SqlSession session = factory.openSession();
		
		GoodMapper mapper = session.getMapper(GoodMapper.class);
		
		//一个参数
		Good good = mapper.selectOneGood(3);
		System.out.println(good);
		
		System.out.println("====================");
		
		//返回list
		List<Good> list = mapper.selectGoods();
		Iterator<Good> ite = list.iterator();
		while(ite.hasNext()){
			System.out.println(ite.next());
		}

		System.out.println("====================");
		
		
		
	}
}
