package cn.itheima.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import com.sun.org.apache.xpath.internal.operations.Bool;

import cn.itheima.domain.Manufinfo;

public interface ManufinfoDao {
	//保存厂商
	void save(Manufinfo c);
	//查询所有厂商
	List<Manufinfo> getAll();
	//查找指定的厂商名字
	Boolean getByName(String manuf_name);
	//根据条件查询所有厂商
	List<Manufinfo> getAll(DetachedCriteria dc);
    //根据id删除
	void delete(Long manuf_id);
	List<Manufinfo> getId();

	Manufinfo getManufinfo(Long manuf_id);
	void update(String manuf_id, String name, String addrs, String serverip, String linkman, String tel, String email);




	


}
