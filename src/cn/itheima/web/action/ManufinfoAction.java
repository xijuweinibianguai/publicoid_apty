package cn.itheima.web.action;

import java.util.ArrayList;
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
import cn.itheima.domain.PageBean;
import cn.itheima.service.ManufinfoService;
import cn.itheima.service.impl.ManufinfoServiceImpl;

	public class ManufinfoAction extends ActionSupport implements ModelDriven<Manufinfo> {
		
		private ManufinfoService ms = new ManufinfoServiceImpl();
		private Manufinfo manufinfo = new Manufinfo();
		HttpServletRequest request = ServletActionContext.getRequest(); 
		HttpServletResponse response = ServletActionContext.getResponse(); 
	public String list() throws Exception {
		//1 接受参数
		String manuf_name = ServletActionContext.getRequest().getParameter("manuf_name");
		//2 创建离线查询对象
		DetachedCriteria dc =DetachedCriteria.forClass(Manufinfo.class);
		//3 判断参数拼装条件
		if(StringUtils.isNotBlank(manuf_name)){
			dc.add(Restrictions.like("manuf_name", "%"+manuf_name+"%"));
		}
		//4 调用Service将离线对象传递
		List<Manufinfo> list = ms.getAll(dc);
		//5 将返回的list放入request域.转发到list.jsp显示
		//ServletActionContext.getRequest().setAttribute("list", list);	
		
		
		// 放到ActionContext
		ActionContext.getContext().put( "list", list);
		
		return "list";
	}
	
	//添加厂商（厂商注册）
	public String add() throws Exception {
		
		//1 调用Service
		ms.save(manufinfo);
		//2 重定向到列表action方法
		
		List<Manufinfo> list1=ms.getById();
		
		ActionContext.getContext().put( "list1", list1);
		return "save";
	}

	
	//修改厂商信息
	public String toEdit() throws Exception {
		//1调用Service根据id获得客户对象
		Manufinfo c = ms.getManufinfo(manufinfo.getManuf_id());
		//2 将客户对象放置到request域,并转发到编辑页面
//		List<Manufinfo>list3 = new ArrayList<Manufinfo>();
//		list3.add(c);
//		ActionContext.getContext().put("list3", list3);
		ActionContext.getContext().put("list3", c);
		return "edit";
	}
	
	
	public String update() throws Exception {
		//修改页面执行保存操作将修改的信息更新到数据库中
		String manuf_id = request.getParameter("manuf_id");
				System.out.println(manuf_id);
				String name = request.getParameter("manuf_name");
				System.out.println(name);
				String addrs = request.getParameter("manuf_addrs");
				System.out.println( addrs);
				String serverip = request.getParameter("manuf_serverip");
				String linkman = request.getParameter("manuf_linkman");
				String tel = request.getParameter("manuf_tel");
				String email = request.getParameter("manuf_email");
		ms.update(manuf_id,name,addrs,serverip,linkman,tel,email);
		return "update";
	}
	
	
	//删除厂商记录
	public String delete() throws Exception {
		//1 获取manuf_id参数
		String manuf_id = ServletActionContext.getRequest().getParameter("manuf_id");
		
		System.out.println(manuf_id);
		ms.delete(Long.parseLong(manuf_id));
		return "toDelete";
	}
	
	
		
	@Override
	public Manufinfo getModel() {
		return manufinfo;
	}

	
	
}
