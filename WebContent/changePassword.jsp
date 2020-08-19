<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Frameset//EN" "http://www.w3c.org/TR/1999/REC-html401-19991224/frameset.dtd">
<HTML xmlns="http://www.w3.org/1999/xhtml">
<link href="${pageContext.request.contextPath }/css/layout.css" type="text/css" rel=stylesheet />
<HEAD>
<META http-equiv=Content-Type content="text/html; charset=utf-8">
<STYLE type=text/css>
table{                                    
background-color:#9CF;
filter:alpha(opacity:70); opacity:0.7;
border-radius:10px;overflow:hidden
}
</STYLE>

<META content="MSHTML 6.00.6000.16809" name=GENERATOR>
<script type="text/javascript">
	window.onload=function(){
		if(window.parent != window){// 如果是在框架中
			//就让框架页面跳转到登陆页面
			window.parent.location.href = "${pageContext.request.contextPath}/login.jsp";
		}
		
	};
</script>

</HEAD>
<BODY>
<FORM id=form1 name=form1 action="${pageContext.request.contextPath}/UserAction_changePassword"  method=post>

<div id="header" style="background-image:url(images/head.png)">
    
    </div>
    <div id="main" style="background-image:url(images/login_2.jpg)">
    
    	<table  style=" font-size: 18px; margin:0 auto;" width="458" cellspacing="0" cellpadding="0">
  <tr>
    <td colspan="3" height="52" style="text-align:center"><font color="#3366CC" size="+2" >基于IPv6的物联网传感节点标识管理系统</font></td>
  </tr>
  <tr>
    <td colspan="3" height="52" style="text-align:center"><font color=blue size="+2" >用户修改密码</font></td>
  
  </tr>
  <tr>
    <td width="98" height="48">用户名：</td>
    <td width="205"><INPUT id=txtName style="WIDTH: 185px;HEIGHT: 30px" name="user_code" value="${user.user_code }"></td>
   
  </tr>
  <tr>
    <td height="48">旧密码：</td>
    <td><INPUT id=txtPwd style="WIDTH: 185px;HEIGHT: 30px" type=password name="oldPassword"></td>
  </tr>
  <tr>
    <td height="48">新密码：</td>
     <td><INPUT id=txtPwd style="WIDTH: 185px;HEIGHT: 30px" type=password name="newPassword"></td>
    </td>
    <td>&nbsp;</td>
  </tr>
   <tr>
    <td colspan="3" height="70" style="text-align:center;">
    <INPUT type="submit" value="保存"  ">
    </td>

  </tr>
 
   
</table>
</div>
 <div id="bottom">
    <span style="font-size:14px">版权所有 | 重庆邮电大学 | 重庆市南岸区崇文路2号 | 400065 | <span class="inner"><a href="http://www.cqupt.edu.cn/cqupt/index.shtml">联系我们</a></span></span> 

   </div> 
</FORM>
<s:debug></s:debug>
</BODY></HTML>
