package cn.test.common.page2;

import java.util.ArrayList;
import java.util.List;

import cn.test.common.utils.CommonUtils;


public class PageTest {
	public PageBean<Classes> findByPage(int page) {
		PageBean<Classes> pageBean = new PageBean<Classes>();
		// 设置当前页数:
		pageBean.setPage(page);
		// 设置每页显示记录数:
		int size = CommonUtils.PAGESIZE;
		pageBean.setPageSize(size);
		// 设置总记录数:
		int totalCount = 20;
		pageBean.setTotalCount(totalCount);
		// 设置总页数:
		double tc = totalCount;
		Double num = Math.ceil(tc/size);
		pageBean.setTotalPage(num.intValue());
		// 设置每页显示数据集合:
		int begin = (page - 1)*size;
		List<Classes> list = new ArrayList<Classes>();
		pageBean.setList(list);
		return pageBean;
	}
}
