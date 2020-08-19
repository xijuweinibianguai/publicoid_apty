package cn.itheima.web.action;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.apache.struts2.ServletActionContext;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import cn.itheima.domain.Manufinfo;
import cn.itheima.domain.Usrinfo;
import cn.itheima.service.UsrinfoService;
import cn.itheima.service.impl.UsrinfoServiceImpl;

	public class UsrinfoAction extends ActionSupport implements ModelDriven<Usrinfo>{
		private UsrinfoService ni = new UsrinfoServiceImpl();
		private Usrinfo usrinfo = new Usrinfo();
		HttpServletRequest request = ServletActionContext.getRequest(); 
		HttpServletResponse response = ServletActionContext.getResponse(); 
	public String list() throws Exception {
		//1 接受参数
		String usr_name = ServletActionContext.getRequest().getParameter("usr_name");
		//2 创建离线查询对象
		DetachedCriteria dc =DetachedCriteria.forClass(Usrinfo.class);
		//3 判断参数拼装条件
		if(StringUtils.isNotBlank(usr_name)){
			dc.add(Restrictions.like("usr_name", "%"+usr_name+"%"));
		}
		//4 调用Service将离线对象传递
		List<Usrinfo> list = ni.getAll(dc);
		//5 将返回的list放入request域.转发到list.jsp显示		
		//ServletActionContext.getRequest().setAttribute("list", list);		
		// 放到ActionContext
			ActionContext.getContext().put("list", list);
			return "list";
		}
		//添加节点
		public String add() throws Exception {
			//1 调用Service
			ni.save(usrinfo);//报错：此方法有问题！！！！记录
			//2 重定向到列表action方法
			List<Usrinfo>list2 =ni.getById();
			ActionContext.getContext().put("list2", list2);
			return "save";
		}

		//修改厂商信息
		public String toEdit() throws Exception {
			//1调用Service根据id获得客户对象
			Usrinfo c = ni.getUsrinfo(usrinfo.getUsr_id());
			//2 将客户对象放置到request域,并转发到编辑页面
//			List<Manufinfo>list3 = new ArrayList<Manufinfo>();
//			list3.add(c);
//			ActionContext.getContext().put("list3", list3);
			ActionContext.getContext().put("list4", c);
			return "edit";
		}
		
		public String update() throws Exception {
			//修改页面执行保存操作将修改的信息更新到数据库中
			String usr_id = request.getParameter("usr_id");
					System.out.println(usr_id);
					String name = request.getParameter("usr_name");
					System.out.println(name);
					String addrs = request.getParameter("usr_addrs");
					System.out.println( addrs);
					String serverip = request.getParameter("usr_serverip");
					String linkman = request.getParameter("usr_linkman");
					String tel = request.getParameter("usr_tel");
					String email = request.getParameter("usr_email");
			ni.update(usr_id,name,addrs,serverip,linkman,tel,email);
			return "update";
		}
		
			//删除厂商记录
		public String delete() throws Exception {
			//1 获取manuf_id参数
			String usr_id = ServletActionContext.getRequest().getParameter("usr_id");
			ni.delete(Long.parseLong(usr_id));
			return "toDelete";
		}
	@Override
	public Usrinfo getModel() {
		// TODO Auto-generated method stub
		return usrinfo;
	}
}
