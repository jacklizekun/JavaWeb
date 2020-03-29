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
		$('#dg').datagrid({    
		    url:'${pageContext.request.contextPath}/json1.json',    
		    columns:[[    
		        {field:'id',title:'商品编号',width:100},    
		        {field:'pname',title:'商品名称',width:100},    
		        {field:'price',title:'商品价格',width:100,align:'right'},
		        {field:'image',title:'商品图片',width:100,
		        	formatter: function(value,row,index){
						/* return "<img width=20px heigth=20px src='"+value+"'/>"; */
						return "<a href='#'>修改</a>--<a href='#'>删除</a>";
					}
	
		        }
		    ]],
		    striped:true,
		    pagination:true,
		    pageList:[2,3,4,5,6,7,8]
		});  


	})
</script>
<body>
	<table id="dg" class="easyui-datagrid" data-options="fitColumns:true">   
	    <thead>   
	        <tr>   
	            <th width="20px" data-options="field:'code'">编码</th>   
	            <th width="20px" data-options="field:'name'">名称</th>   
	            <th width="20px" data-options="field:'price'">价格</th>   
	        </tr>   
	    </thead>   
	    <tbody>   
	       <!--  <tr>   
	            <td>001</td><td>name1</td><td>2323</td>   
	        </tr>   
	        <tr>   
	            <td>002</td><td>name2</td><td>4612</td>   
	        </tr>    -->
	    </tbody>   
	</table>  

	
</body>
</html>