package cn.itheima.web.action;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.struts2.ServletActionContext;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import cn.itheima.domain.Manufinfo;
import cn.itheima.service.ManufinfoService;
import cn.itheima.service.impl.ManufinfoServiceImpl;

	public class OidAction extends ActionSupport implements ModelDriven<Manufinfo>{
		private ManufinfoService ms = new ManufinfoServiceImpl();
		private Manufinfo manufinfo = new Manufinfo();
		private String oid;//res_welcome.jsp界面输入的OID字串值
		
		public String getOid() {
			return oid;
		}
		public void setOid(String oid) {
			this.oid = oid;
		}
		public String execute() throws Exception {
			String input = getOid();		
	    	return "resolve"; 	
		}
	public String list() throws Exception {
		//1 接受参数
		String manuf_id = ServletActionContext.getRequest().getParameter("manuf_id");
		String name = ServletActionContext.getRequest().getParameter("name");
		//2 创建离线查询对象
		DetachedCriteria dc =DetachedCriteria.forClass(Manufinfo.class);
		//3 判断参数拼装条件
		if(StringUtils.isNotBlank(manuf_id)){
			dc.add(Restrictions.like("manuf_id", "%"+manuf_id+"%"));
		}
		//4 调用Service将离线对象传递
		List<Manufinfo> list = ms.getAll(dc);
		//5 将返回的list放入request域.转发到list.jsp显示
		//ServletActionContext.getRequest().setAttribute("list", list);		
		// 放到ActionContext
		ActionContext.getContext().put("list", list);
		return "list";
	}
	@Override
	public Manufinfo getModel() {
		// TODO Auto-generated method stub
		return manufinfo;
	}
}
