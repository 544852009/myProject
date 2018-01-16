<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


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
<body>
    <span>恭喜登录成功!${a}</span>
    <c:forEach items="${list}" var="temp">
        <span>${temp}</span>
    </c:forEach>
</body>
</html>
