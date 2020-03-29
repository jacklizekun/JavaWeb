<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<!-- 导入JQuery的支持 -->
<script type="text/javascript" src="js/jquery-1.11.3.min.js"></script>
<script type="text/javascript">

	function checkUserName() {
		//获取输入框的内容
		var name = $("#name").val();
		
		//发送请求
		$.post("/Servlet/CheckUserNameServlet" , {name:name} , function(data , status){
			//alert(data);
			if(data == 1){//用户名存在
				//alert("用户名存在");
				$("#span01").html("<font color='red'>用户名已被注册</font>");
			}else{
				//alert("用户名可用");
				$("#span01").html("<font color='green'>用户名可以使用</font>");
			}
		} );
		// 输出响应的数据到页面上。
	}
	
</script>
</head>
<body>
<body>
	<table border="1" width="500">
		<tr>
			<td>用户名:</td>
			<td><input type="text" name="name" id="name"  onblur="checkUserName()"><span id="span01"></span></td> 
		</tr>
		<tr>
			<td>密码</td>
			<td><input type="text" name=""></td>
		</tr>
		<tr>
			<td>邮箱</td>
			<td><input type="text" name=""></td>
		</tr>
		<tr>
			<td>简介</td>
			<td><input type="text" name=""></td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" value="注册"></td>
		</tr>
	</table>
</body>


</html>