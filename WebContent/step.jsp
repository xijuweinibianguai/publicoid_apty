<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>animation</title>
    <style type="text/css" media="screen">
        *{
            padding: 0;
            margin: 0;
        }

        #box{
            height: 100px;
            width: 100px;
            background: #f00;
            border-radius: 50%;
            position: absolute;
        }
    </style>
</head>
<body>
    <div id="box" style="top:0;left:0"></div>

</body>
<script>
    var box=document.getElementById('box');
    var xSpeed=2;
    setInterval(function(){
        var x=parseInt(box.style.left)+xSpeed;
        //给动画设置边界
        if(x>800) xSpeed*=-1;
        else if(x<0) xSpeed*=-1;
        box.style.left=x+'px';
    },1000/60);
</script>
</html>
