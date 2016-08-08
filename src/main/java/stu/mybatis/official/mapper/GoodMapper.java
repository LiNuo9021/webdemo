package stu.mybatis.official.mapper;

import java.util.List;

import stu.mybatis.official.base.Good;

public interface GoodMapper {
	Good selectOneGood(int id);
	
	List<Good> selectGoods();
	
	void updateGood(Good good);
	
	void deleteGood(int id);
}
