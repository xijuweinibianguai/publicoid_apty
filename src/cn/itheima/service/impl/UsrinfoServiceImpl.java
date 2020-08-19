package cn.itheima.service.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.DetachedCriteria;


import cn.itheima.dao.UsrinfoDao;
import cn.itheima.dao.impl.UsrinfoDaoImpl;
import cn.itheima.domain.Manufinfo;
import cn.itheima.domain.Usrinfo;
import cn.itheima.service.UsrinfoService;
import cn.itheima.utils.HibernateUtils;

public class UsrinfoServiceImpl implements UsrinfoService {
	private UsrinfoDao usrinfoDao = new UsrinfoDaoImpl();
	public void save(Usrinfo lm) {
		Session session =  HibernateUtils.getCurrentSession();
		//打开事务
		Transaction tx = session.beginTransaction();
		//调用Dao保存厂商
		try {
			//insert添加记录
			usrinfoDao.save(lm);
			//关闭事务
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		}
		
	}
		

	public List<Usrinfo> getAll() {
		Session session =  HibernateUtils.getCurrentSession();
		//打开事务
		Transaction tx = session.beginTransaction();		
		List<Usrinfo> list = usrinfoDao.getAll();				
		//关闭事务
		tx.commit();
		return list;
	}

	public List<Usrinfo> getAll(DetachedCriteria dc) {
		Session session =  HibernateUtils.getCurrentSession();
		//打开事务
		Transaction tx = session.beginTransaction();
		
		List<Usrinfo> list = usrinfoDao.getAll(dc);
		
		
		//关闭事务
				tx.commit();
		return list;
	}

	@Override
	public void delete(Long usr_id) {
		// TODO Auto-generated method stub
	
		 Session session=HibernateUtils.getCurrentSession();  
	        Transaction tx=null;  
	        try{  
	            tx=session.beginTransaction();  
	            usrinfoDao.delete(usr_id);  
	        } catch (Exception e) {  
	            tx.rollback();  
	            throw new RuntimeException(e);  
	            } finally{  
	            	tx.commit();   
	            }  
    } 
	

	@Override
	public void edit(Usrinfo usrinfo) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public List<Usrinfo> getById() {
		Session session =  HibernateUtils.getCurrentSession();
		//打开事务
		Transaction tx = session.beginTransaction();		
		List<Usrinfo> list2 = usrinfoDao.getIdd();				
		//关闭事务
		tx.commit();
		return list2;
	}


	@Override
	public Usrinfo getUsrinfo(Long usr_id) {
		Session session =  HibernateUtils.getCurrentSession();
		//打开事务
		Transaction tx = session.beginTransaction();		
		Usrinfo c = usrinfoDao.getUsrinfo(usr_id);		
		//关闭事务
			tx.commit();
			return c;
	}
	


	@Override
	public void update(String usr_id, String name, String addrs, String serverip, String linkman, String tel,
			String email) {
		Session session =  HibernateUtils.getCurrentSession();
		//打开事务
		Transaction tx = session.beginTransaction();		
		usrinfoDao.update(usr_id,name,addrs,serverip,linkman,tel,email);		
		//关闭事务
			tx.commit();
		
	}
}
