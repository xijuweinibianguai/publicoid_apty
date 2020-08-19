package cn.itheima.service.impl;

import org.hibernate.Session;
import org.hibernate.Transaction;

import cn.itheima.dao.UploadDao;
import cn.itheima.dao.impl.UploadDaoImpl;
import cn.itheima.domain.NodeInfo;
import cn.itheima.service.UploadService;
import cn.itheima.utils.HibernateUtils;

public class UploadServiceImpl implements UploadService {
	private UploadDao uploadDao = new  UploadDaoImpl();
	@Override
	public void save(NodeInfo f) {
		Session session =  HibernateUtils.getCurrentSession();
		//打开事务
		Transaction tx = session.beginTransaction();
		//调用Dao保存厂商
		try {
			//insert添加记录
			uploadDao.save(f);
			//关闭事务
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		}
		
	}
	@Override
	public void update(int  userid, String nodeoid) {
		Session session =  HibernateUtils.getCurrentSession();
		//打开事务
		Transaction tx = session.beginTransaction();
		//调用Dao保存厂商
		try {
			//insert添加记录
			uploadDao.update(userid,nodeoid);
			//关闭事务
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		}
		
	}
}


