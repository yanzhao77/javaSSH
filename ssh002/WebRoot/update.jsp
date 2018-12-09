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
    
    <title>My JSP 'update.jsp' starting page</title>
    
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
   <br>
    <br>
 
  <form action="updateUser" method="post" >
  
   <input type="hidden" name="user.uaid" value="${user.uaid }"/>
   <input type="text" name="user.uname" value="${ user.uname}"/>
   <input type="text" name="user.upwd" value="${ user.upwd}"/>
    <input type="text" name="user.uage" value="${ user.uage}"/>
   <input type="submit" value="修改信息" />
 
   </form>
    </center>
  </body>
</html>
