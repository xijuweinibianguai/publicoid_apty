package cn.itheima.domain;

import java.util.ArrayList;
import java.util.List;

public class PageBean<T> {
	
	
	//当前页
	   private int currentPage; 
	 //当前页显示的条数
	   private int currentCount;  
	 //总页数
	   private int totalPage; 
	 //总条数
	   private int totalCount;
     // 每页显示的数据
       private List<T> nodewayList = new ArrayList<T>();
       
       
       
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getCurrentCount() {
		return currentCount;
	}
	public void setCurrentCount(int currentCount) {
		this.currentCount = currentCount;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	public List<T> getNodewayList() {
		return nodewayList;
	}
	public void setNodewayList(List<T> nodewayList) {
		this.nodewayList = nodewayList;
	}
	
     
   
   
   
   
   
   
   
}
