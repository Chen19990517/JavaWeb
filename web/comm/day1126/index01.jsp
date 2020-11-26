<%@ page import="com.day1126.demo1.User" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/11/26
  Time: 10:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    User user= (User) session.getAttribute("user");
    if (user==null){
        out.print("您还没有登录");
    }else {
        out.print("用户名"+user.getUserName());
    }
%>
<a href="/Login2Servlet" >注销</a>
<a href="/comm/day1126/login.jsp">跳转到下一个</a>
</body>
</html>
