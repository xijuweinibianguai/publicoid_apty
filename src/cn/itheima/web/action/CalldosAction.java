package cn.itheima.web.action;

import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import cn.itheima.service.CalldosService;
import cn.itheima.service.impl.CalldosServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class CalldosAction extends ActionSupport{
	private CalldosService csi = new CalldosServiceImpl();
	private String calldos;//infores/add.jsp界面输入的OID字串值
	private Map<String,String> map; 

	public String getCalldos() {
		return calldos;
	}

	public void setCalldos(String calldos) {
		this.calldos = calldos;
	}
	@Override
	public String execute() throws Exception {
		String url="http://www.baidu.com";
		//将url传到页面中
		HttpServletRequest request = ServletActionContext.getRequest(); 
	    request.setAttribute("url", url);
	    return null;
	}
	
	
}
