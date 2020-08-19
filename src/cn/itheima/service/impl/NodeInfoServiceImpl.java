package cn.itheima.service.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.DetachedCriteria;
import cn.itheima.dao.NodeInfoDao;
import cn.itheima.dao.impl.NodeInfoDaoImpl;
import cn.itheima.domain.NodeInfo;
import cn.itheima.service.NodeInfoService;
import cn.itheima.utils.HibernateUtils;

public class NodeInfoServiceImpl implements NodeInfoService{
	private NodeInfoDao nodeinfoDao = new NodeInfoDaoImpl();
	@Override
	public void save(NodeInfo n) {
		// TODO Auto-generated method stub
		Session session =  HibernateUtils.getCurrentSession();
		//打开事务
		Transaction tx = session.beginTransaction();
		//调用Dao保存厂商
		try {
			nodeinfoDao.save(n);
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		}
		//关闭事务
		tx.commit();
	}
	@Override
	public List<NodeInfo> getAll(DetachedCriteria dc) {
		Session session =  HibernateUtils.getCurrentSession();
		//打开事务
		Transaction tx = session.beginTransaction();		
		List<NodeInfo> list = nodeinfoDao.getAll();		
		//关闭事务
		tx.commit();
		return list;
	}
	@Override
	//通过node_oid更新
	public void updateByoid(String usr, String oid) {
		//1 获得session
		Session session = HibernateUtils.getCurrentSession();
		//2.打开事务
		Transaction tx = session.beginTransaction();
		//3.调用dao层更新
		try{			
			nodeinfoDao.updateByoid(usr, oid);
		}catch(Exception e){
			e.printStackTrace();
			tx.rollback();
			//session.close();
		}
		//关闭事务
		tx.commit();
	}
	@Override
	//通过NodeInfo的node_oid查找
	public NodeInfo getByOid(String node_oid) {
		//1.获得session
		Session session = HibernateUtils.getCurrentSession();
		//2.打开事务
		Transaction tx = session.beginTransaction();
		//3.调用dao层方法
		NodeInfo ni = nodeinfoDao.getByOid(node_oid);
		//4.关闭事务
		tx.commit();
		return ni;
	}
	//通过NodeInfo的node_oid级联查找Manufinfo和UsrInfo
	@Override
	public List<Object[]> getManufusr(String node_oid) {
		//1 获得session
		Session session = HibernateUtils.getCurrentSession();
		//2.打开事务
		Transaction tx = session.beginTransaction();
		//3.调用dao层更新							
		List<Object[]> list=nodeinfoDao.getManufusr(node_oid);							
		//关闭事务
		tx.commit();
		return list;
	}
}
