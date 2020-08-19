<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div style="background: #337ab7;border-radius:0;height:30px">
	<a>OID为：<%String name1 = request.getParameter("oid");%><%=name1 %>的传感器网络节点应用属性信息：</a>
	</div>
<div>
		<table  style=" width: 100%; border-collapse: collapse; border-spacing: 0;" >
			<tr>
				<td colspan="2" style="text-align: center;padding: 8px; width:20%;line-height: 20px;background-color: #F5F5F5;  border-top: 1px solid #ddd;    display: table-cell;">OID：</td>
				<td colspan="2" style="text-align: left; padding: 8px;width:80%;line-height: 20px;background-color: #F5F5F5; border-top: 1px solid #ddd;display: table-cell;">
			
				</td>
			</tr>
			<tr>
				<td colspan="2" style="text-align: center;padding: 8px; width:20%;line-height: 20px;background-color: #fff;  border-top: 1px solid #ddd;    display: table-cell;">管理机构代码：</td>
				<td colspan="2" style="text-align: left; padding: 8px;width:80%;line-height: 20px;background-color: #fff; border-top: 1px solid #ddd;display: table-cell;">01100000 10000010 00011100 10000110 10011011 00111010  </td>
			</tr>
			<tr>
				<td colspan="2" style="text-align: center;padding: 8px; width:20%;line-height: 20px;background-color: #F5F5F5;  border-top: 1px solid #ddd;    display: table-cell;">版本号：</td>
				<td colspan="2" style="text-align: left; padding: 8px;width:80%;line-height: 20px;background-color: #F5F5F5; border-top: 1px solid #ddd;display: table-cell;">01</td>
			</tr>
			<tr>
			<td colspan="2" style="text-align: center;padding: 8px; width:20%;line-height: 20px;background-color: #fff;  border-top: 1px solid #ddd;    display: table-cell;">生产厂商代码：</td>
				<td colspan="2" style="text-align: left; padding: 8px;width:80%;line-height: 20px;background-color: #fff; border-top: 1px solid #ddd;display: table-cell;">1111 1111 1111 1111 1111 1111</td>
			</tr>
			<tr>
			<td colspan="2" style="text-align: center;padding: 8px; width:20%;line-height: 20px;background-color: #F5F5F5;  border-top: 1px solid #ddd;    display: table-cell;">描述符类型：</td>
				<td colspan="2" style="text-align: left; padding: 8px;width:80%;line-height: 20px;background-color: #F5F5F5; border-top: 1px solid #ddd;display: table-cell;">0000</td>
			</tr>
			<tr>
				<td colspan="2" style="text-align: center;padding: 8px; width:20%;line-height: 20px;background-color: #fff;  border-top: 1px solid #ddd;    display: table-cell;">描述符版本号：</td>
				<td colspan="2" style="text-align: left; padding: 8px;width:80%;line-height: 20px;background-color: #fff; border-top: 1px solid #ddd;display: table-cell;">0001</td>
			</tr>
			<tr>
				<td colspan="2" style="text-align: center;padding: 8px; width:20%;line-height: 20px;background-color: #F5F5F5;  border-top: 1px solid #ddd;    display: table-cell;">信号接口通道数量：</td>
				<td colspan="2" style="text-align: left; padding: 8px;width:80%;line-height: 20px;background-color: #F5F5F5; border-top: 1px solid #ddd;display: table-cell;">1111 1111</td>
			</tr>
			<tr>
			<td colspan="2" style="text-align: center;padding: 8px; width:20%;line-height: 20px;background-color: #fff;  border-top: 1px solid #ddd;    display: table-cell;">供电方式：</td>
				<td colspan="2" style="text-align: left; padding: 8px;width:80%;line-height: 20px;background-color: #fff; border-top: 1px solid #ddd;display: table-cell;">可充电电池    非总线供电  外部可供电  外部交流供电</td>
			</tr>
			<tr>
			<td colspan="2" style="text-align: center;padding: 8px; width:20%;line-height: 20px;background-color: #F5F5F5;  border-top: 1px solid #ddd;    display: table-cell;">外壳防护等级：</td>
				<td colspan="2" style="text-align: left; padding: 8px;width:80%;line-height: 20px;background-color: #F5F5F5; border-top: 1px solid #ddd;display: table-cell;">没有保护</td>
			</tr>
			<tr>
				<td colspan="2" style="text-align: center;padding: 8px; width:20%;line-height: 20px;background-color: #fff;  border-top: 1px solid #ddd;    display: table-cell;">无线频段：</td>
				<td colspan="2" style="text-align: left; padding: 8px;width:80%;line-height: 20px;background-color: #fff; border-top: 1px solid #ddd;display: table-cell;">支持频段A B C</td>
			</tr>
			<tr>
				<td colspan="2" style="text-align: center;padding: 8px; width:20%;line-height: 20px;background-color: #F5F5F5;  border-top: 1px solid #ddd;    display: table-cell;">防爆型式：</td>
				<td colspan="2" style="text-align: left; padding: 8px;width:80%;line-height: 20px;background-color: #F5F5F5; border-top: 1px solid #ddd;display: table-cell;">本质安全型</td>
			</tr>
			<tr>
			<td colspan="2" style="text-align: center;padding: 8px; width:20%;line-height: 20px;background-color: #fff;  border-top: 1px solid #ddd;    display: table-cell;">保留位：</td>
				<td colspan="2" style="text-align: left; padding: 8px;width:80%;line-height: 20px;background-color: #fff; border-top: 1px solid #ddd;display: table-cell;">12位保留码</td>
			</tr>
			<tr>
			<td colspan="2" style="text-align: center;padding: 8px; width:20%;line-height: 20px;background-color: #F5F5F5;  border-top: 1px solid #ddd;    display: table-cell;">说明：</td>
				<td colspan="2" style="text-align: left; padding: 8px;width:80%;line-height: 20px;background-color: #F5F5F5; border-top: 1px solid #ddd;display: table-cell;"></td>
			</tr>
		</table>
</div>
</body>
</html>