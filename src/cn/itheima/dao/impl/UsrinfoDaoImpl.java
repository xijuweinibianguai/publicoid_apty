package cn.itheima.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;

import cn.itheima.dao.UsrinfoDao;
import cn.itheima.domain.Manufinfo;
import cn.itheima.domain.Usrinfo;
import cn.itheima.utils.HibernateUtils;

public class UsrinfoDaoImpl implements UsrinfoDao {

	public void save(Usrinfo lm) {
		//1 获得session
		Session session = HibernateUtils.getCurrentSession();
		session.save(lm);
	}
	public List<Usrinfo> getAll() {
		//1 获得session
				Session session = HibernateUtils.getCurrentSession();
		//2 创建Criteria对象
				Criteria c = session.createCriteria(Usrinfo.class);
		return c.list();
	}

	public List<Usrinfo> getAll(DetachedCriteria dc) {
		//1 获得session
				Session session = HibernateUtils.getCurrentSession();
		//2 将离线对象关联到session
				Criteria c = dc.getExecutableCriteria(session);
		//3 执行查询并返回
		return c.list();
	}
	@Override
	public void delete(Long usr_id) {
		// TODO Auto-generated method stub
		Session session=HibernateUtils.getCurrentSession();  
        session.delete(session.get(Usrinfo.class, usr_id));  
	}
	@Override
	public List<Usrinfo> getIdd() {
		//1.获得Session
				Session session = HibernateUtils.getCurrentSession();
				//2.书写HQL 倒叙排列
				// sql:SELECT * FROM oid_manufinfo ORDER BY manuf_id DESC LIMIT 1;
				String hql = "FROM Usrinfo ORDER BY usr_id DESC";
				//取最大id的那个
				Query query = session.createQuery(hql).setMaxResults(1);
				 List<Usrinfo> list2 = query.list();
				 //测试下
			        for (Usrinfo t : list2) {
			            System.out.println(t);
			        }
				return list2;
			}
	@Override
	public void update(String usr_id, String name, String addrs, String serverip, String linkman, String tel,
			String email) {
		//1 获得session
		Session session = HibernateUtils.getCurrentSession();		
		//使用HQL语句更新
		//query.setString(num,String)中num从0开始，sql语句中第一个问号开始;
		String hql="update Usrinfo m set m.usr_name=?,m.usr_addrs=?,m.usr_serverip=?,m.usr_linkman=?,m.usr_tel=?,m.usr_email=? where m.usr_id=?";
		//String hql="update NodeInfo nodeinfo set nodeinfo.usr_id=:usr_id where nodeinfo.node_oid=:node_oid";
		 //, manuinfo.manuf_addrs=:manuf_addrs , manuinfo.manuf_serverip=:manuf_serverip , manuinfo.manuf_linkman=:manuf_linkman , manuinfo.manuf_tel=:manuf_tel , manuinfo.manuf_email=:manuf_email 
		Query query  = session.createQuery(hql);
		query.setString(6,usr_id);
		query.setString(0,name);
		query.setString(1,addrs);
		query.setString(2,serverip);
		query.setString(3,linkman);
		query.setString(4,tel);
		query.setString(5,email);
		query.executeUpdate();
	}
	@Override
	public Usrinfo getUsrinfo(Long usr_id) {
		Session session=HibernateUtils.getCurrentSession();  
		Usrinfo c =session.get(Usrinfo.class, usr_id);  
		  
		return c;
	}
}
