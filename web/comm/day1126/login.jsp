<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/11/26
  Time: 10:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="get" action="/LoginServlet">
    用户名：<input type="text" name="username"><br/>
    密码 ：<input type="password" name="password"><br/>
    <img src="/kaptcha.jpg" style="width: 100px;height: 30px">
    <input type="text" name="code">
<input type="submit" value="登录">
</form>
</body>
</html>
