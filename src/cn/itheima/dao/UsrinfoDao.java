package cn.itheima.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import cn.itheima.domain.Usrinfo;

public interface UsrinfoDao {
	//保存节点信息
	void save(Usrinfo ni);
	//查询所有节点
	List<Usrinfo> getAll();
	//根据条件查询所有节点
	List<Usrinfo> getAll(DetachedCriteria dc);
	//根据id删除
	void delete(Long usr_id);
	List<Usrinfo> getIdd();
	void update(String usr_id, String name, String addrs, String serverip, String linkman, String tel, String email);
	Usrinfo getUsrinfo(Long usr_id);
}
