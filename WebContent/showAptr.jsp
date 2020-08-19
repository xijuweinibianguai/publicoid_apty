<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib  prefix="s" uri="/struts-tags" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>正在解析中...</title>
</head>
<body  >		

								
						<div >
							<img src="images/aptr/1.png" id="img1"/>						
						</div>																		
<script type="text/javascript">
var arr = [
           'images/aptr/2.png',
           'images/aptr/3.png',
           'images/aptr/4.png',
           'images/aptr/5.png',
           'images/aptr/6.png'
           ];
var imgs=[];
preloadImg(arr);
function preloadImg(arr){
	for(i=0;i<arr.length;i++){
		imgs[i]=new Image();
		imgs[i].src = arr[i];
	}
}
i=0;
setInterval(function(){
	i++
	document.getElementById("img1").src="images/aptr/"+i+".png";
	
	if(i>6){
		/*获取后台的参数，转换成js变量；并将变量的值赋给a标签中的href属性*/
	    var apturl = '<%=session.getAttribute("apturl")%>';
		window.location.href=apturl;
		
		
	}
},1200);
            



</script>
				
					
	</body>

</html>