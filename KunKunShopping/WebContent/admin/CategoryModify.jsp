<%@ page language="java" import="category.*" pageEncoding="GBK"%>
<%@ page import="java.util.*"%>

<%
request.setCharacterEncoding("GBK");
int id = Integer.parseInt(request.getParameter("id"));
Category c = CategoryService.getInstance().loadById(id);
String action = request.getParameter("action");

if(action != null && action.trim().equals("modify")) {
	String name = request.getParameter("name");
	String descr = request.getParameter("descr");
	c.setName(name);
	c.setDescr(descr);
//	CategoryService service = CategoryService.getInstance();
//	service.update(c);
	c.update();
	out.println("����޸ĳɹ�!��ϲ!");
	%>
	<script language="javascript">
		parent.main.location.reload();	
	</script>
	<%
	return;
}
%>

<html><head><title>���������̳����Ӹ����</title>

<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<meta name="keywords" content="Discuz!,Board,Comsenz,forums,bulletin board,">
<meta name="description" content="�ѿ���̳ר��  - Discuz! Board">
<meta name="generator" content="Discuz! 4.0.0RC4 with Templates 4.0.0">
<meta name="MSSmartTagsPreventParsing" content="TRUE">
<meta http-equiv="MSThemeCompatible" content="Yes">

<style type="text/css"><!--
a			{ text-decoration: none; color: #000000 }
a:hover			{ text-decoration: underline }
body			{ scrollbar-base-color: #F3F6FA; scrollbar-arrow-color: #4D76B3; font-size: 12px; background-color: #ffffff }
table			{ font: 12px Verdana,Tahoma; color: #000000 }
input,select,textarea	{ font: 11px Verdana,Tahoma; color: #000000; font-weight: normal; background-color: #F3F6FA }
select			{ font: 11px Verdana,Tahoma; color: #000000; font-weight: normal; background-color: #F3F6FA }
.nav			{ font: 12px Verdana,Tahoma; color: #000000; font-weight: bold }
.nav a			{ color: #000000 }
.header			{ font: 11px Verdana,Tahoma; color: #FFFFFF; font-weight: bold; background-image: url("images/green/bg01.gif") }
.header a		{ color: #FFFFFF }
.category		{ font: 11px Verdana,Tahoma; color: #000000; background-color: #EFEFEF }
.tableborder		{ background: #4D76B3; border: 0px solid #4D76B3 } 
.singleborder		{ font-size: 0px; line-height: 0px; padding: 0px; background-color: #F3F6FA }
.smalltxt		{ font: 11px Verdana,Tahoma }
.outertxt		{ font: 12px Verdana,Tahoma; color: #000000 }
.outertxt a		{ color: #000000 }
.bold			{ font-weight: bold }
.altbg1			{ background: #F3F6FA }
.altbg2			{ background: #FFFFFF }
--></style><script language="JavaScript" src="images/common.js"></script><style type="text/css" id="defaultPopStyle">.cPopText { font-family: Tahoma, Verdana; background-color: #FFFFCC; border: 1px #000000 solid; font-size: 12px; padding-right: 4px; padding-left: 4px; height: 20px; padding-top: 2px; padding-bottom: 2px; visibility: hidden; filter: Alpha(Opacity=80)}</style></head><body leftmargin="0" rightmargin="0" topmargin="0" onkeydown="if(event.keyCode==27) return false;"><div id="popLayer" style="position: absolute; z-index: 1000;" class="cPopText"></div>



<table style="table-layout: fixed;" align="center" border="0" cellpadding="0" cellspacing="0" width="97%"> 
<tbody><tr><td class="nav" align="left" nowrap="nowrap" width="90%">&nbsp;&#37329;&#23578;&#21830;&#22478; &#187; ע��</td>
<td align="right" width="10%">&nbsp;<a href="#bottom"><img src="images/arrow_dw.gif" align="absmiddle" border="0"></a></td>        
</tr></tbody></table><br>
<form method="post" name="register" action="CategoryModify.jsp" onSubmit="this.regsubmit.disabled=true;">
<input type="hidden" name="action" value="modify"/>
<input type="hidden" name="id" value="<%=id%>"/>
<table class="tableborder" align="center" cellpadding="4" cellspacing="1" width="97%">
<tbody><tr>
<td colspan="2" class="header">������� - ��������</td>
</tr>
<tr>
<td class="altbg1" width="21%">�������:</td>
<td class="altbg2"><input name="name" size="25" maxlength="25" type="text" value="<%=c.getName()%>"> 
</tr>

<tr>
<td class="altbg1" valign="top">�������:</td>
<td class="altbg2"><textarea name="descr" cols="60" rows="5" id="descr"><%=c.getDescr()%></textarea></td>
</tr>
</tbody></table>
<br>
<center><input name="regsubmit" value="�� &nbsp; ��" type="submit"></center>
</form>

<script language="JavaScript">
document.register.username.focus();
</script>


</body></html>