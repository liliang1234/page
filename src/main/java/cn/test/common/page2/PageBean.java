package cn.test.common.page2;

import java.util.List;

/**
 * 分页数据的封装的Bean.
 * 
 */
public class PageBean<T> {
	private int page; 		// 当前页数:
	private int pageSize;	// 每页显示记录数.
	private int totalCount;	// 总记录数:
	private int totalPage;	// 总页数:
	private List<T> list;	// 每页显示数据的集合:
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public List<T> getList() {
		return list;
	}
	public void setList(List<T> list) {
		this.list = list;
	}
	
}
