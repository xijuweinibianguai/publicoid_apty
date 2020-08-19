package cn.itheima.service;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import cn.itheima.domain.Manufinfo;
import cn.itheima.domain.NodeInfo;

public interface NodeInfoService {
	//存数据
	void save(NodeInfo n);
	//查数据
	List<NodeInfo> getAll(DetachedCriteria dc);	
	//根据node_oid更新数据
	void updateByoid(String usr, String oid);
	//根据node_oid查找
	NodeInfo getByOid(String node_oid);
	//通过NodeInfo的node_oid查找
	List<Object[]> getManufusr(String node_oid);
	
}
