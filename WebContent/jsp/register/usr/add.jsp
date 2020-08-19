<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<TITLE>节点信息注册</TITLE> 
<script type="text/javascript">

function showTips(id,info){
	//获取span元素，给出提示信息
	document.getElementById(id+"span").innerHTML="<font color='gray'>"+info+"</font>";
	
}
function checkForm(){
	if(check3()){
		document.form2.submit();
	}else{
		alert("您输入的信息格式有误，返回为false!");
	}
	
}
function check3(){
	//获取用户输入的数据
	var usr_name = document.getElementById("usr_name").value;
	//进行判断
	if(usr_name==""){
		//在span位置给出提示信息
		document.getElementById("usr_namespan").innerHTML="<font color='red'>应用厂家公司全名不能为空！</font>";
		return false;
	}else {
		document.getElementById("usr_namespan").innerHTML="";
		}
	
	var usr_addrs = document.getElementById("usr_addrs").value;
	//进行判断
	if(usr_addrs==""){
		//在span位置给出提示信息
		document.getElementById("usr_addrsspan").innerHTML="<font color='red'>公司地址不能为空！</font>";
		return false;
	}else {
		document.getElementById("usr_addrsspan").innerHTML="";
		}
	
	var usr_linkman = document.getElementById("usr_linkman").value;
	//进行判断
	if(usr_linkman==""){
		//在span位置给出提示信息
		document.getElementById("usr_linkmanspan").innerHTML="<font color='red'>联系人不能为空！</font>";
		return false;
	}else {
		document.getElementById("usr_linkmanspan").innerHTML="";
		}
	
		var usr_tel = document.getElementById("usr_tel").value;
	//进行判断
	if(usr_tel==""){
		//在span位置给出提示信息
		document.getElementById("usr_telspan").innerHTML="<font color='red'>联系电话不能为空！</font>";
		return false;
	}else {
		document.getElementById("usr_telspan").innerHTML="";
		}
	
	
	
	
	var IpValue = document.getElementById("usr_serverip").value;
	if(! /^\s*((([0-9A-Fa-f]{1,4}:){7}([0-9A-Fa-f]{1,4}|:))|(([0-9A-Fa-f]{1,4}:){6}(:[0-9A-Fa-f]{1,4}|((25[0-5]|2[0-4]\d|1\d\d|[1-9]?\d)(\.(25[0-5]|2[0-4]\d|1\d\d|[1-9]?\d)){3})|:))|(([0-9A-Fa-f]{1,4}:){5}(((:[0-9A-Fa-f]{1,4}){1,2})|:((25[0-5]|2[0-4]\d|1\d\d|[1-9]?\d)(\.(25[0-5]|2[0-4]\d|1\d\d|[1-9]?\d)){3})|:))|(([0-9A-Fa-f]{1,4}:){4}(((:[0-9A-Fa-f]{1,4}){1,3})|((:[0-9A-Fa-f]{1,4})?:((25[0-5]|2[0-4]\d|1\d\d|[1-9]?\d)(\.(25[0-5]|2[0-4]\d|1\d\d|[1-9]?\d)){3}))|:))|(([0-9A-Fa-f]{1,4}:){3}(((:[0-9A-Fa-f]{1,4}){1,4})|((:[0-9A-Fa-f]{1,4}){0,2}:((25[0-5]|2[0-4]\d|1\d\d|[1-9]?\d)(\.(25[0-5]|2[0-4]\d|1\d\d|[1-9]?\d)){3}))|:))|(([0-9A-Fa-f]{1,4}:){2}(((:[0-9A-Fa-f]{1,4}){1,5})|((:[0-9A-Fa-f]{1,4}){0,3}:((25[0-5]|2[0-4]\d|1\d\d|[1-9]?\d)(\.(25[0-5]|2[0-4]\d|1\d\d|[1-9]?\d)){3}))|:))|(([0-9A-Fa-f]{1,4}:){1}(((:[0-9A-Fa-f]{1,4}){1,6})|((:[0-9A-Fa-f]{1,4}){0,4}:((25[0-5]|2[0-4]\d|1\d\d|[1-9]?\d)(\.(25[0-5]|2[0-4]\d|1\d\d|[1-9]?\d)){3}))|:))|(:(((:[0-9A-Fa-f]{1,4}){1,7})|((:[0-9A-Fa-f]{1,4}){0,5}:((25[0-5]|2[0-4]\d|1\d\d|[1-9]?\d)(\.(25[0-5]|2[0-4]\d|1\d\d|[1-9]?\d)){3}))|:)))(%.+)?\s*$/.test(IpValue)){
		document.getElementById("usr_serveripspan").innerHTML="<font color='red'>您输入的ipv6格式不正确</font>";return false;
	}
	var emailValue = document.getElementById("usr_email").value;
	if(!/^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+(.[a-zA-Z0-9_-])+/.test(emailValue)){
		document.getElementById("usr_emailspan").innerHTML="<font color='red'>邮箱格式不正确</font>";return false;
}
	return true;
	}


</script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<LINK href="${pageContext.request.contextPath }/css/Style.css" type=text/css rel=stylesheet>
<LINK href="${pageContext.request.contextPath }/css/Manage.css" type=text/css
	rel=stylesheet>


<META content="MSHTML 6.00.2900.3492" name=GENERATOR>
</HEAD>
<BODY>
	<FORM id=form2 name=form2 action="${pageContext.request.contextPath }/UsrinfoAction_add" method=post>
		<TABLE cellSpacing=0 cellPadding=0 width="98%" border=0>
			<TBODY>
				<TR>
					<TD width=15><IMG src="${pageContext.request.contextPath }/images/new_019.jpg"
						border=0></TD>
					<TD width="100%" background="${pageContext.request.contextPath }/images/new_020.jpg"
						 height=20></TD>
					<TD width=15><IMG src="${pageContext.request.contextPath }/images/new_021.jpg"
						border=0></TD>
				</TR>
			</TBODY>
		</TABLE>
		<TABLE cellSpacing=0 cellPadding=0 width="98%" border=0>
			<TBODY>
				<TR>
					<TD width=15 background=${pageContext.request.contextPath }/images/new_022.jpg><IMG
						src="${pageContext.request.contextPath }/images/new_022.jpg" border=0></TD>
					<TD vAlign=top width="100%" bgColor=#ffffff>
						<TABLE cellSpacing=0 cellPadding=5 width="100%" border=0>
							<TR>
								<TD class=manageHead>当前位置：应用厂商信息注册 &gt; 应用厂商信息注册</TD>
							</TR>
							<TR>
								<TD height=2></TD>
							</TR>
						</TABLE>
						<TABLE cellSpacing=0 cellPadding=5  border=0>
						  
						    
							<TR>
								<td>应用厂家公司全名：</td>
								<td>
								<INPUT class=textbox  style="WIDTH: 180px" maxLength=50 name="usr_name" id="usr_name" onfocus="showTips('usr_name','应用厂家公司全名必填！')" onblur="check3()"><span id="usr_namespan"></span>
								</td>
								<td>公司地址：</td>
								<td>
								<INPUT class=textbox id="usr_addrs" style="WIDTH: 180px" maxLength=50 name="usr_addrs" onfocus="showTips('usr_addrs','公司地址必填！')" onblur="check3()"><span id="usr_addrsspan"></span>
								</td>
							</TR>
							
							<TR>
								
								<td>公司服务器IPv6地址：</td>
								<td>
								<INPUT class=textbox id=usr_serverip
														style="WIDTH: 180px" maxLength=50 name="usr_serverip"  onfocus="showTips('usr_serverip','ipv6地址必填！')" onblur="check3()"><span id="usr_serveripspan"></span>
								</td>
								<td>公司联系人姓名：</td>
								<td>
								<INPUT class=textbox id=usr_linkman style="WIDTH: 180px" maxLength=50 name="usr_linkman" onfocus="showTips('usr_linkman','联系人必填！')" onblur="check3()"><span id="usr_linkmanspan"></span>
								</td>
							</TR>
							
							<TR>
								
								<td>公司联系电话：</td>
								<td>
								<INPUT class=textbox id=usr_tel
														style="WIDTH: 180px" maxLength=50 name="usr_tel"  onfocus="showTips('usr_tel','联系电话必填！')" onblur="check3()"><span id="usr_telspan"></span>
								</td>
								<td>公司电子邮箱：</td>
								<td>
								<INPUT class=textbox id=usr_email
														style="WIDTH: 180px" maxLength=50 name="usr_email" onfocus="showTips('usr_email','公司邮箱必填！')" onblur="check3()"><span id="usr_emailspan"></span>
								
								</td>
								
							</TR>
							
							<tr>
								<td rowspan=2>
								<INPUT type="button" value=" 提交 " onclick="checkForm()"/>
								</td>
							</tr>
						</TABLE>
					<div>
					<p style="color:#2a8dc8;font-size:15px;"> 说明：SNDMS：Sensor Node Deploy Management Server，是传感节点应用厂商所管理的传感节点部署管理服务器，用于存储传感节点动态感知属性信息的服务器</p>
					</div>						
					</TD>
					<TD width=15 background="${pageContext.request.contextPath }/images/new_023.jpg">
					<IMG src="${pageContext.request.contextPath }/images/new_023.jpg" border=0></TD>
				</TR>
			</TBODY>
		</TABLE>
		<TABLE cellSpacing=0 cellPadding=0 width="98%" border=0>
			<TBODY>
				<TR>
					<TD width=15><IMG src="${pageContext.request.contextPath }/images/new_024.jpg"
						border=0></TD>
					<TD align=middle width="100%"
						background="${pageContext.request.contextPath }/images/new_025.jpg" height=15></TD>
					<TD width=15><IMG src="${pageContext.request.contextPath }/images/new_026.jpg"
						border=0></TD>
				</TR>
			</TBODY>
		</TABLE>
	</FORM>
</BODY>
</HTML>
