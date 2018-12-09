<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'showLong.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  <center>
  id------name-------age
  <br>
    <br>
    <s:iterator value="#request.users" id="user">
    <s:property value="uaid"/>---------<s:property value="uname"/>-------------<s:property value="uage"/>
    <a href="getUserView?uaid=${user.uaid}">个人信息</a>
  <%--   <a href="getUser?uaid=${user.uaid}">修改信息</a> --%>
    <a href="deleteUser?uaid=${user.uaid}">删除</a>
    <br>
    </s:iterator>
    
    </center>
    
  </body>
</html>
