<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/easyui.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/icon.css">
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.easyui.min.js"></script>
</head>
<script type="text/javascript">
	$(function(){
		$("#btn1").linkbutton();
		$("#btn2").linkbutton({
			iconCls:"icon-save",
			disabled:true
		});
		
		$("#btn3").linkbutton({
			onClick:function(){
				$("#btn4").linkbutton({
					disabled:true
				})
			}
		})
		
		$('#btn5').linkbutton('disable');
	})
</script>
<body>
	<button class="easyui-linkbutton">静态按钮</button><br/>
	<button id="btn1">动态按钮</button>
	<hr>
	<button class="easyui-linkbutton" data-options="iconCls:'icon-add'">组件属性的使用(静态方式)</button><br/>
	<a id="btn2">组件属性的使用(动态的方式)</a>
	<hr/>
	<button id="btn3" class="easyui-linkbutton">点击我</button>
	<button id="btn4" class="easyui-linkbutton">禁用我</button>
	<hr>
	<button id="btn5" class="easyui-linkbutton">组件方法的使用</button>
</body>
</html>