<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<LINK href="${pageContext.request.contextPath }/css/research.css" type=text/css rel=stylesheet>
<title>查询界面</title>

</head>
<body>

		<div id="containter">
			<div id="main">				
				<div id="back">
					<div id="text">	
					<span style="font-size:40px;color:#2a8dc8;font-weight:bold">基于IPv6的物联网传感节点标识管理系统架构</span>																													
					</div>
					<div id="textback">																																
					</div>
				</div>  
				<div class="t"></div>
				<div id="search">
					<div id="searchin">
					<form  action="${pageContext.request.contextPath }/NodeInfoAction_getbyoid" method=post>
						<input class=textbox id=sChannel name="node_oid" style="height:40px;width:410px;outline:0px none;box-shadow:none;overflow:hidden;color:#343434;font-size:15px;border:0;" placeholder="请输入OID，例如：2.16.156.101818.1.1.1" autocomplete="off">	
						<input class=button id=sButton1 type=submit value="搜索" name=sButton2 style="height:78px;width:115px;background:#fff;border-radius:0px 50px 50px 0px; background:#0050A0;">
					</form>
					</div>
				</div>
				
			</div>
			<div class="tt">
			
			</div>
			<div class="tt">
			————————架 构 详 述————————
			</div>
			
			<div id="footer">
				<div id="left"><a href="${pageContext.request.contextPath}/jsp/resolve/res_index.jsp">OID简介</a></div>
				<div id="center">OID</div>
				<div id="right">OID资讯</div>
			</div>
			
		</div>
		<s:debug></s:debug>
	</body>
</html>