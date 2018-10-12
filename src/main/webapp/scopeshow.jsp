<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/12
  Time: 11:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>展示不同作用域</title>
</head>
<body>
<p>session中值：${requestScope.age}</p>
<p>request中的值：${sessionScope.color}</p>
<P>Applicaontext中的值：${applicationScope.shape}</P>
</body>
</html>
