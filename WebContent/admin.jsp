<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<LINK href="${pageContext.request.contextPath }/css/index.css" type=text/css rel=stylesheet>
<title>系统管理员管理标识首页</title>
<STYLE type=text/css>
BODY {
	PADDING-RIGHT: 0px;
	PADDING-LEFT: 0px;
	PADDING-BOTTOM: 0px;
	MARGIN: 0px;
	PADDING-TOP: 0px;
}

TD {
	FONT-SIZE: 12px;
	COLOR: #003366;
	FONT-FAMILY: Verdana, Arial, Helvetica, sans-serif
}

</STYLE>
</head>
<body>		
<div>
		<TABLE cellSpacing=0 cellPadding=0 width="100%" border=0>
			<TBODY>
				<TR>
					<TD width=10><IMG src="images/new_001.jpg" border=0></TD>
					<TD background=images/new_002.jpg align="left"><FONT size=5><B>基于IPv6的物联网传感节点标识管理系统
</B></FONT></TD>
					<TD background=images/new_002.jpg>
						<TABLE cellSpacing=0 cellPadding=0 width="100%" border=0>
							<TBODY>
								<TR>
									<TD align=right height=35></TD>
								</TR>
								<TR>
									<TD height=35 align="right">
										当前用户：${user.user_code }
										&nbsp;&nbsp;&nbsp;&nbsp;
										<A href="${pageContext.request.contextPath }/changePassword.jsp" target=_top><FONT color=red>修改密码</FONT></A>
										&nbsp;&nbsp;&nbsp;&nbsp;
										<A href="${pageContext.request.contextPath }/login.jsp" target=_top><FONT color=red>安全退出</FONT></A>
									</TD>
								</TR>
							</TBODY>
						</TABLE>
					</TD>
					<TD width=10><IMG src="images/new_003.jpg" border=0></TD>
				</TR>
			</TBODY>
		</TABLE>
	</div>
			<div id="main">
				
				<div id="back">
					<div id="textback">	
						<div id="text">
						<p align="left" style="font-size:30px;color:#fff;">基于IPv6的物联网传感节点标识管理系统提供联网的传感节点标识信息注册、解析、查询等工作</p>
						<p align="left" style="font-size:19px;color:#fff;">传感节点OID的定义遵循《信息技术 传感器网络 第501部分：标识：传感节点标识符编制规则》，隶属于标识管理机构“2.16.156.101818”</p>
						<a class="aa" href="http://www.baidu.com">详情点击</a>
						</div>					
						<div class="pic">
							<a href="#" style="display:block"><img alt="" src="images/index1.jpg" /></a>
							<a href="#"><img alt="" src="images/index2.jpg" /></a>
							<a href="#"><img alt="" src="images/index3.jpg" /></a>
							<a href="#"><img alt="" src="images/index4.jpg" /></a>
							<a href="#"><img alt="" src="images/index5.jpg" /></a>							
						</div>																		
						<div class="btn">
							<ul>
								<li class="one"></li>
								<li></li>
								<li></li>
								<li></li>
								<li></li>
							</ul>
						</div>
					</div>
				</div>
			</div>
	<script type="text/jscript" src="js/jquery-3.2.1.min.js"></script>
    <script type="text/jscript">
      $(function () {
          $("#all li").mouseover(function () {//鼠标进入离开事件
              $(this).css("background-color", "#ff00ff").siblings().css("background-color", "white");
              $(this).css({ "background-color": "red", "font-size": "9px" }).siblings().hide();
          });
          $(window).scroll(function () {//鼠标滚动事件
              var _top = $(window).scrollTop(); //获得鼠标滚动的距离
          });
          //手动播放图片
          $(".btn ul li").hover(function () {
              $(this).addClass("one").siblings().removeClass("one");
              index = $(this).index();
              i = index;
              $(".pic a").eq(index).stop().fadeIn(500).show().siblings().stop().fadeIn(500).hide();
          });

          //自动播放图片
          var i = 0;
          var t = setInterval(autoplay, 3000);
          function autoplay() {
              i++;
              if (i > 4) i = 0;
              $(".btn ul li").eq(i).addClass("one").siblings().removeClass("one");
              $(".pic a").eq(i).stop().fadeIn(500).show().siblings().stop().fadeIn(500).hide();
          }
          $("#banner").hover(function () {
              clearInterval(t);
          }, function () {
              t = setInterval(autoplay, 3000);
          });
      });
    </script>
				<div class="t"></div>			
			<div id="footer">
			
				<div id="left">			
				<p><a  href="${pageContext.request.contextPath}/jsp/register/reg_admin.jsp">OID标识注册管理</a>	</p>	
				</div>
				<div id="center"><p><a href="${pageContext.request.contextPath}/jsp/resolve/res_index.jsp">OID标识解析管理</a></p></div>
				<div id="right"><p><a href="https://baike.baidu.com/item/OID/2723970?fr=aladdin">OID简介</a></p></div>
			</div>	
<div id="bottom">
<br>
<br>
  <p>  版权所有 | 重庆邮电大学 | 重庆市南岸区崇文路2号 | 400065 |<a href="http://ac.cqupt.edu.cn/">联系我们</a></p>

   </div> 					
	</body>

</html>