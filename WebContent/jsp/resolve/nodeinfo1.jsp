<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib  prefix="s" uri="/struts-tags" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>

<body>

	<div style="background: #337ab7;border-radius:0;height:30px">
	<a> OID描述</a>
	</div>


		<table  style=" width: 100%; border-collapse: collapse; border-spacing: 0;" >
			<tr>
				<td colspan="2" style="text-align: center;padding: 8px; width:20%;line-height: 20px;background-color: #F5F5F5;  border-top: 1px solid #ddd;    display: table-cell;">数字OID：</td>
				<td colspan="2" style="text-align: left; padding: 8px;width:80%;line-height: 20px;background-color: #F5F5F5; border-top: 1px solid #ddd;display: table-cell;">
				<%String name = request.getParameter("node_oid");
				session.setAttribute("name",name);%><%=name %>
				</td>
			</tr>
			<tr>
				<td colspan="2" style="text-align: center;padding: 8px; width:20%;line-height: 20px;background-color: #fff;  border-top: 1px solid #ddd;    display: table-cell;">数字OID：</td>
				<td colspan="2" style="text-align: left; padding: 8px;width:80%;line-height: 20px;background-color: #fff; border-top: 1px solid #ddd;display: table-cell;">
													<%=name %> </td>
			</tr>
			<tr>
				<td colspan="2" style="text-align: center;padding: 8px; width:20%;line-height: 30px;background-color: #F5F5F5;  border-top: 1px solid #ddd;    display: table-cell;">英文OID：</td>
				<td colspan="2" style="text-align: left; padding: 8px;width:80%;line-height: 30px;background-color: #F5F5F5; border-top: 1px solid #ddd;display: table-cell;"><%=name %></td>
			</tr>
			<tr>
			<td colspan="2" style="text-align: center;padding: 8px; width:20%;line-height: 20px;background-color: #fff;  border-top: 1px solid #ddd;    display: table-cell;">描述：</td>
				<td colspan="2" style="text-align: left; padding: 8px;width:80%;line-height: 20px;background-color: #fff; border-top: 1px solid #ddd;display: table-cell;">审核入网的传感节点</td>
			</tr>
			
		</table>

	
	

<div style="background: #337ab7;border-radius:0;height:30px">
	<a> 当前注册机构</a>
	</div>
<div>
		<table  style=" width: 100%; border-collapse: collapse; border-spacing: 0;" >
			<tr>
				<td colspan="2" style="text-align: center;padding: 8px; width:20%;line-height: 20px;background-color: #F5F5F5;  border-top: 1px solid #ddd;    display: table-cell;">名称：</td>
				<td colspan="2" style="text-align: left; padding: 8px;width:80%;line-height: 20px;background-color: #F5F5F5; border-top: 1px solid #ddd;display: table-cell;">传感器网络管理服务器</td>
			</tr>
			<tr>
				<td colspan="2" style="text-align: center;padding: 8px; width:20%;line-height: 20px;background-color: #fff;  border-top: 1px solid #ddd;    display: table-cell;">OID代码：</td>
				<td colspan="2" style="text-align: left; padding: 8px;width:80%;line-height: 20px;background-color: #fff; border-top: 1px solid #ddd;display: table-cell;">2.16.156.101818</td>
			</tr>
			<tr>
				<td colspan="2" style="text-align: center;padding: 8px; width:20%;line-height: 20px;background-color: #F5F5F5;  border-top: 1px solid #ddd;    display: table-cell;">注册时间：</td>
				<td colspan="2" style="text-align: left; padding: 8px;width:80%;line-height: 20px;background-color: #F5F5F5; border-top: 1px solid #ddd;display: table-cell;">2018年10月17日</td>
			</tr>
			<tr>
				<td colspan="2" style="text-align: center;padding: 8px; width:20%;line-height: 20px;background-color: #fff;  border-top: 1px solid #ddd;    display: table-cell;">地址：</td>
				<td colspan="2" style="text-align: left; padding: 8px;width:80%;line-height: 20px;background-color: #fff; border-top: 1px solid #ddd;display: table-cell;">重庆市 南岸区崇文路6号</td>
			</tr>
			<tr>
			<td colspan="2" style="text-align: center;padding: 8px; width:20%;line-height: 20px;background-color: #F5F5F5;  border-top: 1px solid #ddd;    display: table-cell;">电话号码：</td>
				<td colspan="2" style="text-align: left; padding: 8px;width:80%;line-height: 20px;background-color: #F5F5F5; border-top: 1px solid #ddd;display: table-cell;">17723088194</td>
			</tr>
			<tr>
			<td colspan="2" style="text-align: center;padding: 8px; width:20%;line-height: 20px;background-color: #fff;  border-top: 1px solid #ddd;    display: table-cell;">传真：</td>
				<td colspan="2" style="text-align: left; padding: 8px;width:80%;line-height: 20px;background-color: #fff; border-top: 1px solid #ddd;display: table-cell;">023-62461882</td>
			</tr>
		</table>
</div>
<div style="background: #337ab7;border-radius:0;height:30px">
	<a> 生产厂商信息</a>
	</div>
<div>

		<table  style=" width: 100%; border-collapse: collapse; border-spacing: 0;" >
		
			<tr>
				<td colspan="2" style="text-align: center;padding: 8px; width:20%;line-height: 20px;background-color: #F5F5F5;  border-top: 1px solid #ddd;    display: table-cell;">生产厂商代码：</td>
				<td colspan="2" style="text-align: left; padding: 8px;width:80%;line-height: 20px;background-color: #F5F5F5; border-top: 1px solid #ddd;display: table-cell;"><s:iterator value="#list1" var="manuf" />	<s:property value="#manuf.manuf_id" /></td>		
			</tr>
			<tr>
				<td colspan="2" style="text-align: center;padding: 8px; width:20%;line-height: 20px;background-color: #fff;  border-top: 1px solid #ddd;    display: table-cell;">名称：</td>
				<td colspan="2" style="text-align: left; padding: 8px;width:80%;line-height: 20px;background-color: #fff; border-top: 1px solid #ddd;display: table-cell;"><s:property value="#manuf.manuf_name" /></td>			
			</tr>			
			<tr>
				<td colspan="2" style="text-align: center;padding: 8px; width:20%;line-height: 20px;background-color: #F5F5F5;  border-top: 1px solid #ddd;    display: table-cell;">地址：</td>
				<td colspan="2" style="text-align: left; padding: 8px;width:80%;line-height: 20px;background-color: #F5F5F5; border-top: 1px solid #ddd;display: table-cell;"><s:property value="#manuf.manuf_addrs" /></td>
			</tr>
			<tr>
				<td colspan="2" style="text-align: center;padding: 8px; width:20%;line-height: 20px;background-color: #fff;  border-top: 1px solid #ddd;    display: table-cell;">联系电话：</td>
				<td colspan="2" style="text-align: left; padding: 8px;width:80%;line-height: 20px;background-color: #fff; border-top: 1px solid #ddd;display: table-cell;"> <s:property value="#manuf.manuf_tel" /></td>
			</tr>
			<tr>
				<td colspan="2" style="text-align: center;padding: 8px; width:20%;line-height: 20px;background-color: #F5F5F5;  border-top: 1px solid #ddd;    display: table-cell;">联系邮箱：</td>
				<td colspan="2" style="text-align: left; padding: 8px;width:80%;line-height: 20px;background-color: #F5F5F5; border-top: 1px solid #ddd;display: table-cell;"><s:property value="#manuf.manuf_email" /></td>
			</tr>
			<tr>
				<td colspan="2" style="text-align: center;padding: 8px; width:20%;line-height: 20px;background-color: #fff;  border-top: 1px solid #ddd;    display: table-cell;">服务器IP地址：</td>
				<td colspan="2" style="text-align: left; padding: 8px;width:80%;line-height: 20px;background-color: #fff; border-top: 1px solid #ddd;display: table-cell;"> <s:property value="#manuf.manuf_serverip" /></td>
			</tr>
		</table>
		
</div>
<div style="background: #337ab7;border-radius:0;height:30px">
	<a> 使用厂商信息</a>
	</div>
<div>

		<table  style=" width: 100%; border-collapse: collapse; border-spacing: 0;" >
		
			<tr>
				<td colspan="2" style="text-align: center;padding: 8px; width:20%;line-height: 20px;background-color: #F5F5F5;  border-top: 1px solid #ddd;    display: table-cell;">生产厂商编码：</td>
				<td colspan="2" style="text-align: left; padding: 8px;width:80%;line-height: 20px;background-color: #F5F5F5; border-top: 1px solid #ddd;display: table-cell;"><s:iterator value="#list2" var="usr" />	<s:property value="#usr.usr_id" /></td>		
			</tr>
			<tr>
				<td colspan="2" style="text-align: center;padding: 8px; width:20%;line-height: 20px;background-color: #fff;  border-top: 1px solid #ddd;    display: table-cell;">名称：</td>
				<td colspan="2" style="text-align: left; padding: 8px;width:80%;line-height: 20px;background-color: #fff; border-top: 1px solid #ddd;display: table-cell;"><s:property value="#usr.usr_name" /></td>			
			</tr>			
			<tr>
				<td colspan="2" style="text-align: center;padding: 8px; width:20%;line-height: 20px;background-color: #F5F5F5;  border-top: 1px solid #ddd;    display: table-cell;">地址：</td>
				<td colspan="2" style="text-align: left; padding: 8px;width:80%;line-height: 20px;background-color: #F5F5F5; border-top: 1px solid #ddd;display: table-cell;"><s:property value="#usr.usr_addrs" /></td>
			</tr>
			<tr>
				<td colspan="2" style="text-align: center;padding: 8px; width:20%;line-height: 20px;background-color: #fff;  border-top: 1px solid #ddd;    display: table-cell;">联系电话：</td>
				<td colspan="2" style="text-align: left; padding: 8px;width:80%;line-height: 20px;background-color: #fff; border-top: 1px solid #ddd;display: table-cell;"> <s:property value="#usr.usr_tel" /></td>
			</tr>
			<tr>
				<td colspan="2" style="text-align: center;padding: 8px; width:20%;line-height: 20px;background-color: #F5F5F5;  border-top: 1px solid #ddd;    display: table-cell;">联系邮箱：</td>
				<td colspan="2" style="text-align: left; padding: 8px;width:80%;line-height: 20px;background-color: #F5F5F5; border-top: 1px solid #ddd;display: table-cell;"><s:property value="#usr.usr_email" /></td>
			</tr>
			<tr>
				<td colspan="2" style="text-align: center;padding: 8px; width:20%;line-height: 20px;background-color: #fff;  border-top: 1px solid #ddd;    display: table-cell;">服务器IP地址：</td>
				<td colspan="2" style="text-align: left; padding: 8px;width:80%;line-height: 20px;background-color: #fff; border-top: 1px solid #ddd;display: table-cell;"> <s:property value="#usr.usr_serverip" /></td>
			</tr>
		</table>
		
</div>
<div style="background: #337ab7;border-radius:0;height:30px">
	<a> 传感节点信息查询</a>
	</div>
<div>
		<table  style=" width: 100%; border-collapse: collapse; border-spacing: 0;" >
			<tr>
				<td colspan="2" style="text-align: center;padding: 8px; width:20%;line-height: 20px;background-color: #F5F5F5;  border-top: 1px solid #ddd;    display: table-cell;">应用属性信息：</td>
				
				<td colspan="2" style="text-align: left; padding: 8px;width:80%;line-height: 20px;background-color: #F5F5F5; border-top: 1px solid #ddd;display: table-cell;">
				<a href="${pageContext.request.contextPath }/showAptr.jsp">点击查看</a>
				
				</tr>
				
				
</table>

</div>
<div>
<table  style=" width: 100%; border-collapse: collapse; border-spacing: 0;" >
			<tr>
				<td colspan="2" style="text-align: center;padding: 8px; width:20%;line-height: 20px;background-color: #F5F5F5;  border-top: 1px solid #ddd;    display: table-cell;">实时感知信息：</td>
				
				<td colspan="2" style="text-align: left; padding: 8px;width:80%;line-height: 20px;background-color: #F5F5F5; border-top: 1px solid #ddd;display: table-cell;">
				<a href="${pageContext.request.contextPath }/showSen.jsp">点击查看</a>
				</tr>

			
		</table>

</div>
<!--href="<s:property value="url"/>"-->
<!--  <a href="<s:url value="#url"></s:url>"> action需要向页面传值-->
</body>
</html>