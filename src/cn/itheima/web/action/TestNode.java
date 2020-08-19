package cn.itheima.web.action;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.struts2.ServletActionContext;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import cn.itheima.domain.Manufinfo;
import cn.itheima.domain.NodeInfo;
import cn.itheima.domain.Usrinfo;
import cn.itheima.service.NodeInfoService;
import cn.itheima.service.impl.NodeInfoServiceImpl;
import cn.itheima.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class TestNode extends ActionSupport implements ModelDriven<NodeInfo>{
	private NodeInfoService ns = new NodeInfoServiceImpl();
	private NodeInfo nodeinfo = new NodeInfo();
	private Manufinfo manufinfo = new Manufinfo();
	private Usrinfo usrinfo = new Usrinfo();
	/*获取传感节点信息*/
	public String execute() throws Exception {
	String node_oid = ServletActionContext.getRequest().getParameter("node_oid");//将前端输入的node_oid获取到后台
	
	
	List<Manufinfo> list1 = new ArrayList<Manufinfo>();
	List<Usrinfo> list2 = new ArrayList<Usrinfo>();
	
	try{
		
		Session session = HibernateUtils.getCurrentSession();
		//2.打开事务
		Transaction tx = session.beginTransaction();
		//3.调用dao层方法
		////list1.add(session.get(NodeInfo.class, node_oid));//get方法产生查询语句		
		/*String hql="from NodeInfo nodeinfo LEFT JOIN nodeinfo.manufinfo where nodeinfo.node_oid='"+node_oid+"'";//左链接，根据node_oid来查询NodeInfo(manuf_id为外键)，进而级联查询Manufinfo
		List<Object> list=session.createQuery(hql).list();
		System.out.print("第一张表查询成功");*/
		String hql="from NodeInfo nodeinfo LEFT JOIN nodeinfo.manufinfo LEFT JOIN nodeinfo.usrinfo where nodeinfo.node_oid='"+node_oid+"'";//左链接，根据node_oid级联查询Manufinfo与Usrinfo两个表的信息
		List<Object[]> list=session.createQuery(hql).list();//执行HQL语句
		Object[] object = list.get(0);//object有三个对象nodeinfo，manufinfo，usrinfo
		manufinfo = (Manufinfo) object[1];
		usrinfo = (Usrinfo)object[2];
		//将查询获得的manufinfo与nodeinfo放入list集合，从而显示到界面
		list1.add(manufinfo);
		list2.add(usrinfo);
		ActionContext.getContext().put("list1", list1);//放到jsp页面<s>标签的list1显示
		ActionContext.getContext().put("list2", list2);
		
		//4.关闭事务
				tx.commit();
	}catch(Exception e){
		e.printStackTrace();	
		
	}
	
	//获取NodeInfo中对应的Manufinfo信息		
			return "ok";
	}
	@Override
	public NodeInfo getModel() {
		// TODO Auto-generated method stub
		return nodeinfo;
	}

}
