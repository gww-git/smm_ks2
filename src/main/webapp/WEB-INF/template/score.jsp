<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/8/21
  Time: 20:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/bootstrap/css/bootstrap.css">
    <script src="/js/jquery/2.0.0/jquery.min.js"></script>
    <script src="/js/vue/2.5.16/vue.min.js"></script>
</head>
<body>

<div class="container">
    <div>
        <span>你的成绩是:</span><span>${score}分</span>
    </div>
    <div>
        <a href="/admin.html">返回首页</a>
    </div>
</div>

</body>
</html>
