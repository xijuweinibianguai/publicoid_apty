package cn.itheima.dao;

import java.util.List;

import org.hibernate.Query;

import cn.itheima.domain.NodeInfo;

public interface NodeInfoDao {
	
	void save(NodeInfo n);

	List<NodeInfo> getAll();
	
	NodeInfo getByoid(String node_oid);
	
	//由特定的node_oid更新字段（where node_oid = ?）
	void updateByoid(String usr , String oid);

	NodeInfo getByOid(String node_oid);
	
	List<Object[]> getManufusr(String node_oid);
	
}
