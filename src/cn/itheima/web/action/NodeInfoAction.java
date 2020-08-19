package cn.itheima.web.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.struts2.ServletActionContext;
import org.omg.PortableInterceptor.SUCCESSFUL;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import cn.itheima.dao.ManufinfoDao;
import cn.itheima.dao.impl.ManufinfoDaoImpl;
import cn.itheima.domain.Manufinfo;
import cn.itheima.domain.NodeInfo;
import cn.itheima.domain.Usrinfo;
import cn.itheima.getservers.GetServers;
import cn.itheima.service.NodeInfoService;
import cn.itheima.service.impl.NodeInfoServiceImpl;
import cn.itheima.utils.HibernateUtils;

    public class NodeInfoAction extends ActionSupport implements ModelDriven<NodeInfo> {

		private NodeInfoService ns = new NodeInfoServiceImpl();
		private NodeInfo nodeinfo = new NodeInfo();	
		private Manufinfo manufinfo = new Manufinfo();
		private Usrinfo usrinfo = new Usrinfo();
	
	HttpServletRequest request = ServletActionContext.getRequest(); 
	HttpServletResponse response = ServletActionContext.getResponse(); 
	//生产厂商对生产的传感节点OID注册，即出厂备案。(添加数据)
	public String add() throws Exception {	
		String oid = request.getParameter("node_oid");
		//if(oid.length()!=32||!oid.startsWith("2.16.156.101818.")){	
			if(!oid.startsWith("2.16.156.101818.")){
			ActionContext.getContext().put("message","您输入的oid格式有误，请重新输入");
			return "nosave";
		}
		else{
		//1.调用Service
		ns.save(nodeinfo);
		//2 重定向到列表action方法
		return "save";}		
	}		
	//使用厂商对传感节点OID注册，即使用备案(更新数据)
	public String update() throws Exception {	
		//取出jsp页面表单数据		
		String usr = request.getParameter("usr_id");
		String oid = request.getParameter("node_oid");
		//1.调用Service
		ns.updateByoid(usr, oid);
		//2 重定向到列表action方法
		return "update";
	}	
	//根据oid查找节点生产厂商与应用商的信息   以及url地址
	public String getbyoid() throws Exception {
		/*1.获取manuf与usr厂商信息*/
		String node_oid = ServletActionContext.getRequest().getParameter("node_oid");
		
		List<Manufinfo> list1 = new ArrayList<Manufinfo>();
		List<Usrinfo> list2 = new ArrayList<Usrinfo>();			
			
		List<Object[]> list=ns.getManufusr(node_oid);
		Object[] object = list.get(0);//object有三个对象nodeinfo，manufinfo，usrinfo
		manufinfo = (Manufinfo) object[1];
		usrinfo = (Usrinfo)object[2];
		//将查询获得的manufinfo与usrinfo放入list集合，从而显示到界面
		list1.add(manufinfo);
		list2.add(usrinfo);
		ActionContext.getContext().put("list1", list1);//放到jsp页面<s>标签的list1显示
		ActionContext.getContext().put("list2", list2);								
	
		
///////////给a标签传值，动态生成url
			/*2.获取两种厂商管理服务器的url*/
			String acommand = GetServers.toFqdn(node_oid);//处理node_oid，将node_oid（传感节点OID）转成传感节点厂商FQDN
			acommand = "dig " + acommand + " -t naptr";//获取
			String apturl = GetServers.GetApturl(acommand)+"?oid="+node_oid;
			System.out.println("apturl为"+apturl);
			//1.获取感知信息管理服务器的url
//			String scommand = GetServers.toFqdn(node_oid);//处理node_oid，将node_oid（传感节点OID）转成传感节点厂商FQDN
//			scommand = "dig " + scommand + " -t naptr";//获取
			String senurl = GetServers.GetSenurl(acommand)+"?oid="+node_oid;		
			System.out.println("senurl为"+senurl);
			//将url传到页面中
			HttpServletRequest request = ServletActionContext.getRequest(); 
			 HttpSession session=request.getSession();
//			String senurl="http://[2111::2]:8080/oid_senc/?oid="+node_oid;
//			String apturl="http://[2111::2]:8080/oid_apty?oid="+node_oid;
		    session.setAttribute("senurl",senurl);
		    session.setAttribute("apturl",apturl);
		    System.out.println("感知"+senurl);
			return "getnodeif";						
		}					
	@Override
	public NodeInfo getModel() {
		// TODO Auto-generated method stub 
		return nodeinfo;
	}

}