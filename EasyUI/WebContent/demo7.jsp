<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>面板</title>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/easyui.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/icon.css">
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.easyui.min.js"></script>
</head>
<script type="text/javascript">
	$(function(){
		$("#btn1").linkbutton({
			onClick:function(){
				$("#dd").dialog("open");
			}
		});
	})
</script>
<body>
	<!-- modal:蒙板 -->
	<button id="btn1" class="easyui-linkbutton" >打开面板</button>
	<div id="dd" class="easyui-dialog" title="My Dialog" style="width:400px;height:200px;"   
	        data-options="iconCls:'icon-save',draggable:false,resizable:true,closed:true,modal:true">   
	    Dialog Content.    
	</div>  

	
</body>
</html>