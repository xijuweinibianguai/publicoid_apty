package cn.itheima.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;

import cn.itheima.dao.NodeInfoDao;
import cn.itheima.domain.Manufinfo;
import cn.itheima.domain.NodeInfo;
import cn.itheima.utils.HibernateUtils;

public class NodeInfoDaoImpl implements NodeInfoDao{

	@Override
	public void save(NodeInfo n) {		
		//1 获得session
		Session session = HibernateUtils.getCurrentSession();
		//3 执行保存
		session.save(n);
	}
	@Override
	public List<NodeInfo> getAll() {
		//1 获得session
		Session session = HibernateUtils.getCurrentSession();
		//2 创建Criteria对象
		Criteria c = session.createCriteria(NodeInfo.class);
		return c.list();
	}

	@Override
	public NodeInfo getByoid(String node_oid) {
		//1 获得session
		Session session = HibernateUtils.getCurrentSession();
		return session.get(NodeInfo.class, node_oid);//get方法产生查询语句
	}
	@Override
	//根据OID更新应用厂商
	public void updateByoid(String usr , String oid) {
		//1 获得session
		Session session = HibernateUtils.getCurrentSession();		
		//使用HQL语句更新
		String hql="update NodeInfo nodeinfo set nodeinfo.usr_id=:usr_id where nodeinfo.node_oid=:node_oid";
		Query query  = session.createQuery(hql); 
		query.setString("usr_id",usr);
		query.setString("node_oid",oid);
		query.executeUpdate();  
	}

	@Override
	public NodeInfo getByOid(String node_oid) {
		//1 获得session
		Session session = HibernateUtils.getCurrentSession();
		return session.get(NodeInfo.class, node_oid);//get方法产生查询语句
	}
	@Override
	public List<Object[]> getManufusr(String node_oid) {
		//1 获得session
		Session session = HibernateUtils.getCurrentSession();		
		//使用HQL语句级联查询
		String hql="from NodeInfo nodeinfo LEFT JOIN nodeinfo.manufinfo LEFT JOIN nodeinfo.usrinfo where nodeinfo.node_oid='"+node_oid+"'";
		//左链接，根据node_oid级联查询Manufinfo与Usrinfo两个表的信息
		List<Object[]> list=session.createQuery(hql).list();//执行HQL语句
		return list;
	}

}
