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
<body>
	<div id="aa" class="easyui-accordion" style="width:300px;height:200px;" data-options="fit:true">   
	    <div title="aaaa" data-options="iconCls:'icon-save'" style="overflow:auto;padding:10px;">   
	        <h3 style="color:#0099FF;">Accordion for jQuery</h3>   
	        <p>Accordion is a part of easyui framework for jQuery.     
	        It lets you define your accordion component on web page more easily.</p>   
	    </div>   
	    <div title="bbbbb" data-options="iconCls:'icon-reload',selected:true" style="padding:10px;">   
	        content2    
	    </div>   
	    <div title="cccccc">   
	        content3    
	    </div>   
	</div> 
</body>
</html>