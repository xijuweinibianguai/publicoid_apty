package cn.itheima.service;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import cn.itheima.domain.Manufinfo;

public interface ManufinfoService {
	//保存厂商信息
	void save(Manufinfo c);
	//获得所有厂商信息
	List<Manufinfo> getAll();
	//根据条件查询所有厂商信息
	List<Manufinfo> getAll(DetachedCriteria dc);
	//根据name查询指定厂商信息
	Boolean getByName(String manuf_name);
	//根据id删除信息
	void delete(Long manuf_id);
	//根据id编辑信息

	
	
	List<Manufinfo> getById();
	Manufinfo getManufinfo(Long manuf_id);
	void update(String manuf_id, String name, String addrs, String serverip, String linkman, String tel, String email);

	
	


}
