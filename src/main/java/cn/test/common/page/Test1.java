package cn.test.common.page;

import java.util.ArrayList;
public class Test1 {
	public Pagination selectBrandPages(Integer pageNo,Integer pageSize) {
		//null 或者小于1  设置为1
		Pagination.cpn(pageNo);
		//每页显示3条
		pageSize=3;
		Integer count = 8;
		Pagination pagination = new Pagination(pageNo,pageSize,count);
		//设置结果集
		pagination.setList(new ArrayList());
		return pagination;
	}
}
