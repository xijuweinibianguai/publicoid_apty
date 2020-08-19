package cn.itheima.dao.impl;

import org.hibernate.Query;
import org.hibernate.Session;

import cn.itheima.dao.UploadDao;
import cn.itheima.domain.NodeInfo;
import cn.itheima.utils.HibernateUtils;

public class UploadDaoImpl implements UploadDao {

	@Override
	public void save(NodeInfo f) {
		//1 获得session
				Session session = HibernateUtils.getCurrentSession();
				//2 执行保存
				session.save(f);
		
	}

	@Override
	public void update(int  userid, String nodeoid) {
		//1 获得session
				String s =Integer.toString(userid);
				Session session = HibernateUtils.getCurrentSession();		
				//使用HQL语句更新
				//query.setString(num,String)中num从0开始，sql语句中第一个问号开始;
				String hql="update NodeInfo m set m.usr_id=? where m.node_oid=?";
				//String hql="update NodeInfo nodeinfo set nodeinfo.usr_id=:usr_id where nodeinfo.node_oid=:node_oid";
				 //, manuinfo.manuf_addrs=:manuf_addrs , manuinfo.manuf_serverip=:manuf_serverip , manuinfo.manuf_linkman=:manuf_linkman , manuinfo.manuf_tel=:manuf_tel , manuinfo.manuf_email=:manuf_email 
				Query query  = session.createQuery(hql);
				query.setString(1,nodeoid);
				query.setString(0,s);
				query.executeUpdate();
		
	}


	

}
