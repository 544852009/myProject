<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/head.jsp"%>

<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/4/004
  Time: 18:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户登录</title>
</head>
<style>
    button{width: 20px;height: 10px;background-color: #1E9FFF;}
</style>
<body>
    <span>恭喜登录成功!${user.username}</span>
    <span><a href="/my/logOut">点击注销</a></span>
</body>
</html>
