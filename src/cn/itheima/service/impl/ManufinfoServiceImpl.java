package cn.itheima.service.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.DetachedCriteria;

import com.opensymphony.xwork2.ModelDriven;

import cn.itheima.dao.ManufinfoDao;
import cn.itheima.dao.impl.ManufinfoDaoImpl;
import cn.itheima.domain.Manufinfo;
import cn.itheima.domain.NodeInfo;
import cn.itheima.domain.User;
import cn.itheima.service.ManufinfoService;
import cn.itheima.utils.HibernateUtils;


public class ManufinfoServiceImpl implements ManufinfoService {

	private ManufinfoDao manufinfoDao = new ManufinfoDaoImpl();

	public void save(Manufinfo c) {
		Session session =  HibernateUtils.getCurrentSession();
		//打开事务
		Transaction tx = session.beginTransaction();
		//调用Dao保存厂商
		try {
			//insert添加记录
			manufinfoDao.save(c);
			//关闭事务
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		}
		
	}

	public List<Manufinfo> getAll() {
			Session session =  HibernateUtils.getCurrentSession();
			//打开事务
			Transaction tx = session.beginTransaction();		
			List<Manufinfo> list = manufinfoDao.getAll();		
			//关闭事务
			tx.commit();
			return list;
	}

	public List<Manufinfo> getAll(DetachedCriteria dc) {
			Session session =  HibernateUtils.getCurrentSession();
			//打开事务
			Transaction tx = session.beginTransaction();
			
			List<Manufinfo> list = manufinfoDao.getAll(dc);
			//关闭事务
			tx.commit();
			return list;
		
	}


	//删除
	public void delete(Long manuf_id){  
	        Session session=HibernateUtils.getCurrentSession();  
	        Transaction tx=null;  
	        try{  
	            tx=session.beginTransaction();  
	            manufinfoDao.delete(manuf_id);  
	        } catch (Exception e) {  
	            tx.rollback();  
	            throw new RuntimeException(e);  
	            } finally{  
	            	tx.commit();   
	            }  
	    } 



	@Override
	//g根据name查找
	public Boolean getByName(String manuf_name) {
		return false;
	}

	@Override
	public List<Manufinfo> getById() {
		Session session =  HibernateUtils.getCurrentSession();
		//打开事务
		Transaction tx = session.beginTransaction();		
		List<Manufinfo> list1 = manufinfoDao.getId();		
		//关闭事务
			tx.commit();
			return list1;
}

	@Override
	public Manufinfo getManufinfo(Long manuf_id) {
		Session session =  HibernateUtils.getCurrentSession();
		//打开事务
		Transaction tx = session.beginTransaction();		
		Manufinfo c = manufinfoDao.getManufinfo(manuf_id);		
		//关闭事务
			tx.commit();
			return c;
	}

	@Override
	public void update(String manuf_id, String name, String addrs, String serverip, String linkman, String tel,
			String email) {
		Session session =  HibernateUtils.getCurrentSession();
		//打开事务
		Transaction tx = session.beginTransaction();		
		 manufinfoDao.update(manuf_id,name,addrs,serverip,linkman,tel,email);		
		//关闭事务
			tx.commit();
		
	}

	





	

	
}
