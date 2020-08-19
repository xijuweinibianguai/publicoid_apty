package cn.itheima.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

import cn.itheima.dao.ManufinfoDao;
import cn.itheima.domain.Manufinfo;
import cn.itheima.domain.User;
import cn.itheima.utils.HibernateUtils;

public class ManufinfoDaoImpl implements ManufinfoDao {

	public void save(Manufinfo m) {
		//1 获得session
		Session session = HibernateUtils.getCurrentSession();
		//2 执行保存
		session.save(m);
	}

	public List<Manufinfo> getAll() {
		//1 获得session
				Session session = HibernateUtils.getCurrentSession();
		//2 创建Criteria对象
				Criteria c = session.createCriteria(Manufinfo.class);
		return c.list();
	}

	public List<Manufinfo> getAll(DetachedCriteria dc) {
		//1 获得session
				Session session = HibernateUtils.getCurrentSession();
		//2 将离线对象关联到session
				Criteria c = dc.getExecutableCriteria(session);
		//3 执行查询并返回
		return c.list();
	}
	//删除
	public void delete(Long manuf_id){  
		
        Session session=HibernateUtils.getCurrentSession();  
        session.delete(session.get(Manufinfo.class, manuf_id));  
    }

	@Override
	public Boolean getByName(String manuf_name) {
		//1.获得Session
		Session session = HibernateUtils.getCurrentSession();
		//2.书写HQL
		String hql = "select count(*) from Manufinfo mf where mf.manuf_name = ?";
		//3.创建查询对象
		Query query = session.createQuery(hql);
		//4.设置参数
		query.setParameter(0, manuf_name);
		Long l = (Long)query.uniqueResult();
		return l>0?true:false;
	}
//获取生产厂商版本号
	@Override
	public List<Manufinfo> getId() {
		//1.获得Session
		Session session = HibernateUtils.getCurrentSession();
		//2.书写HQL 倒叙排列
		// sql:SELECT * FROM oid_manufinfo ORDER BY manuf_id DESC LIMIT 1;
		String hql = "FROM Manufinfo ORDER BY manuf_id DESC";
		//取最大id的那个
		Query query = session.createQuery(hql).setMaxResults(1);
		 List<Manufinfo> list1 = query.list();
		 //测试下
	        for (Manufinfo t : list1) {
	            System.out.println(t);
	        }
		return list1;
	}



	@Override
	public Manufinfo getManufinfo(Long manuf_id) {
		  Session session=HibernateUtils.getCurrentSession();  
		  Manufinfo c =session.get(Manufinfo.class, manuf_id);  
		  
		return c;
	}

	@Override
	public void update(String manuf_id, String name, String addrs, String serverip, String linkman, String tel,String email) {
		//1 获得session
				Session session = HibernateUtils.getCurrentSession();		
				//使用HQL语句更新
				//query.setString(num,String)中num从0开始，sql语句中第一个问号开始;
				String hql="update Manufinfo m set m.manuf_name=?,m.manuf_addrs=?,m.manuf_serverip=?,m.manuf_linkman=?,m.manuf_tel=?,m.manuf_email=? where m.manuf_id=?";
				//String hql="update NodeInfo nodeinfo set nodeinfo.usr_id=:usr_id where nodeinfo.node_oid=:node_oid";
				 //, manuinfo.manuf_addrs=:manuf_addrs , manuinfo.manuf_serverip=:manuf_serverip , manuinfo.manuf_linkman=:manuf_linkman , manuinfo.manuf_tel=:manuf_tel , manuinfo.manuf_email=:manuf_email 
				Query query  = session.createQuery(hql);
				query.setString(6,manuf_id);
				query.setString(0,name);
				query.setString(1,addrs);
				query.setString(2,serverip);
				query.setString(3,linkman);
				query.setString(4,tel);
				query.setString(5,email);
				query.executeUpdate();
	}


	






	
}
