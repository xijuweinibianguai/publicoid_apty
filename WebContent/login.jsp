<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
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
<FORM id=form1 name=form1 action="${pageContext.request.contextPath}/UserAction_login"  method=post>

<div id="header" style="background-image:url(images/head.png)">
    
    </div>
    <div id="main" style="background-image:url(images/login_2.jpg)">
    
    	<table  style=" font-size: 18px; margin:0 auto;" width="458" cellspacing="0" cellpadding="0">
  <tr>
    <td colspan="3" height="52" style="text-align:center"><font color="#3366CC" size="+2" >基于IPv6的物联网传感节点标识管理系统</font></td>
  </tr>
  <tr>
    <td colspan="3" height="52" style="text-align:center"><font color=blue size="+2" >用户登陆</font></td>
  
  </tr>
  <tr>
    <td width="98" height="48">登录名：</td>
    <td width="205"><INPUT id=txtName style="WIDTH: 185px;HEIGHT: 30px" name="user_code"></td>
    <td width="106"><SPAN id=RequiredFieldValidator3 style="FONT-WEIGHT: bold; VISIBILITY: hidden; COLOR: white">请输入登录名</SPAN></td>
  </tr>
  <tr>
    <td height="48">登录密码：</td>
    <td><INPUT id=txtPwd style="WIDTH: 185px;HEIGHT: 30px" type=password name="user_password"></td>
    <td><SPAN id=RequiredFieldValidator4 style="FONT-WEIGHT: bold; VISIBILITY: hidden; COLOR: white">请输入密码</SPAN></td>
  </tr>
  <tr>
    <td height="48">用户角色：</td>
    <td><INPUT type="text" name="user_role" list="list" id=txtcode style="WIDTH: 185px;HEIGHT: 30px" >
    <datalist id="list">
        <option value="普通用户"></option>
        <option value="系统管理员"></option>
    </datalist>
    </td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td colspan="2" height="30"><font color="red" ><s:property value="exception.message" /> </font></td>
    <td height="30">&nbsp;</TD>

  </tr>
   <tr>
    <td colspan="3" height="70" style="text-align:center"><INPUT id=btn style="BORDER-TOP-WIDTH: 0px; BORDER-LEFT-WIDTH: 0px;BORDER-BOTTOM-WIDTH: 0px; BORDER-RIGHT-WIDTH: 0px" type=image src="images/login_button.gif" name=btn></td>

  </tr>
 
   
</table>
</div>
 <div id="bottom">
    <span style="font-size:14px">版权所有 | 重庆邮电大学 | 重庆市南岸区崇文路2号 | 400065 | <span class="inner"><a href="http://www.cqupt.edu.cn/cqupt/index.shtml">联系我们</a></span></span> 

   </div> 
</FORM>
<s:debug></s:debug>
</BODY></HTML>
