<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/12
  Time: 11:15
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
    <a href="tuichu">退出</a>
    <a href="shanchu">删除</a>
    <a href="getcook">获取Cookie</a>
<a href="gerhander">获取头信息</a>
<a href="pathparam/1/龙珠">通过路径获取参数</a>
<a href="precise/8/9?id=5&cid=6">发动精准请求</a>
<div>
    <h1>ant风格测试</h1>
    <a href="antask/1abc">匹配？的操作</a>
    <a href="antask/4abc">匹配？的操作</a>
    <a href="antstar/548123">匹配*的操作</a>
    <a href="antstar/a123">匹配*的操作</a>
    <a href="kongrong/longyuan/doublestar">匹配双星号操作</a>
    <a href="doublestar">匹配双星号操作</a>
</div>
<div>
    <h1>RESTful</h1>
    <form action="RESTfulPut" method="post">
        <input type="text" value="45" name="id">
        <input type="hidden" name="_method" value="PUT">
    </form>
</div>
</body>
</html>
