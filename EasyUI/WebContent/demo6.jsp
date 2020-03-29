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
		$("#tt").tree({
			onClick:function(node){
				//alert(node.text);
				var flag=$("#xx").tabs("exists",node.text);
				if(flag){
					$("#xx").tabs("select",node.text);
				}else{
					$("#xx").tabs("add",{
						title:node.text,
						/* 在选项卡体中如果需要把对应的页面链接进来  需要使用iframe */
						content:"<iframe width='100%' height='100%' src='${pageContext.request.contextPath}/demo5.jsp'/>"
					});
				}
			}
		});
	})
</script>
<body>
	<div id="cc" class="easyui-layout" data-options="fit:true" style="width:600px;height:400px;">   
	    <div data-options="region:'north',title:'logo',split:true" style="height:100px;"></div>   
	    <div data-options="region:'south',title:'foot',split:true" style="height:100px;"></div>   
	    <div data-options="region:'west',title:'menu',split:true" style="width:170px;">
	    	<div id="aa" class="easyui-accordion" data-options="fit:true" style="width:300px;height:200px;">   
			    <div title="Title1" data-options="iconCls:'icon-save'" style="overflow:auto;padding:10px;">   
			        <h3 style="color:#0099FF;">Accordion for jQuery</h3>   
			        <p>Accordion is a part of easyui framework for jQuery.     
			        It lets you define your accordion component on web page more easily.</p>   
			    </div>   
			    <div title="Title2" data-options="iconCls:'icon-reload',selected:true" style="padding:10px;">   
			        <ul id="tt" class="easyui-tree">   
					    <li>   
					        <span>Folder</span>   
					        <ul>   
					            <li>   
					                <span>Sub Folder 1</span>   
					                <ul>   
					                    <li>   
					                        <span>File 11</span>   
					                    </li>   
					                    <li>   
					                        <span>File 12</span>   
					                    </li>   
					                    <li>   
					                        <span>File 13</span>   
					                    </li>   
					                </ul>   
					            </li>   
					            <li>   
					                <span>File 2</span>   
					            </li>   
					            <li>   
					                <span>File 3</span>   
					            </li>   
					        </ul>   
					    </li>   
					    <li>   
					        <span>File21</span>   
					    </li>   
					</ul>    
			    </div>   
			    <div title="Title3">   
			        content3    
			    </div>   
			</div>  
	    </div>   
	    <div data-options="region:'center',title:'content'" style="padding:5px;background:#eee;">
			<div id="xx" class="easyui-tabs" data-options="fit:true" style="width:500px;height:250px;">   
			</div>  
	    </div>   
	</div>  
</body>
</html>