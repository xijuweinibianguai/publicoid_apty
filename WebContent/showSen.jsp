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
							<img src="images/sen/11.png" id="img2"/>						
						</div>																		
<script type="text/javascript">
var arr = [
           'images/sen/12.png',
           'images/sen/13.png',
           'images/sen/14.png',
           'images/sen/15.png',
           'images/sen/16.png',
           'images/sen/17.png'
           ];
var imgs1=[];
preloadImg(arr);
function preloadImg(arr){
	for(i=0;i<arr.length;i++){
		imgs1[i]=new Image();
		imgs1[i].src = arr[i];
	}
}
i=11;
setInterval(function(){
	i++
	document.getElementById("img2").src="images/sen/"+i+".png";
	

	
	if(i>17){
		/*获取后台的参数，转换成js变量；并将变量的值赋给a标签中的href属性*/
	    var senurl = '<%=session.getAttribute("senurl")%>';
		window.location.href=senurl;
	}
},1400);
	

</script>
				
					
	</body>

</html>