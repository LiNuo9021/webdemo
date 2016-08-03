package stu.mybatis.official.base;

public interface GoodMapper {
	Good selectGood(int id);
	
	void updateGoodName(int id);
}
