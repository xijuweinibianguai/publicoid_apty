package cn.itheima.service;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import cn.itheima.domain.Manufinfo;
import cn.itheima.domain.Usrinfo;

public interface UsrinfoService {
	//保存联系人
	void save(Usrinfo lm);
	//获得所有客户
	List<Usrinfo> getAll();
	//根据条件查询所有客户
	List<Usrinfo> getAll(DetachedCriteria dc);
	//根据id删除信息
	void delete(Long usr_id);
	//根据id编辑信息
	void edit(Usrinfo usrinfo);
	List<Usrinfo> getById();
	Usrinfo getUsrinfo(Long usr_id);
	void update(String usr_id, String name, String addrs, String serverip, String linkman, String tel, String email);
}
