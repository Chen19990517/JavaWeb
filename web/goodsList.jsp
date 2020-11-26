<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/11/25
  Time: 14:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    Cookie[] cookies=request.getCookies();
    if(cookies!=null){
        for (Cookie cookie:cookies) {
            if("goods".equals(cookie.getName())){
                String value =cookie.getValue();
                String[] names=value.split("&");
%>
<table>
    <tr>
        <th><b>您已经浏览的商品:</b></th>
    </tr>
    <%
        for (int i = 0; i < names.length; i++) {
    %>
    <tr>
        <td>
            <%=names[i]%>
        </td>
    </tr>
    <%
        }
    %>
</table>
<%
            }
        }
    }
%>
<a href="GoodsServlet?name=car"><img src="comm/img/car.jpg"/></a>
<br/>汽车<br/>
<a href="GoodsServlet?name=grape"><img src="comm/img/grape.jpg"/></a>
<br/>葡萄<br/>
<a href="GoodsServlet?name=sausage"><img src="comm/img/sausage.jpg"/></a>
<br/>香肠<br/>
<a href="GoodsServlet?name=toy"><img src="comm/img/toy.jpg"/></a>
<br/>玩具<br/>
<a href="GoodsServlet?name=wash"><img src="comm/img/wash.jpg"/></a>
<br/>香水<br/>


</body>
</html>
