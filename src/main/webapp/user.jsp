<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/8/21
  Time: 10:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="bootstrap/css/bootstrap.css">
    <script src="js/jquery/2.0.0/jquery.min.js"></script>
    <script src="js/vue/2.5.16/vue.min.js"></script>
</head>
<body>

<div class="container">

    <div class="col-lg-offset-3"></div>
    <div class="col-md-4" style="margin-left: 350px;margin-top: 100px">
        <form id="form" action="/login" method="post">
            <span style="margin-left: 150px">登陆</span>
            <div class="form-group">
                <label for="exampleInputEmail1">User</label>
                <input type="text" class="form-control" id="exampleInputEmail1" placeholder="Email" name="uname">
                <span id="p1" style="margin-left: 20px; color: red"></span>
            </div>
            <div class="form-group">
                <label for="exampleInputPassword1">Password</label>
                <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Password" name="upwd">
                <span id="p2" style="margin-left: 20px; color: red"></span>
            </div>
            <button type="submit" class="btn btn-default btn-info" style="margin-left: 100px" id="login">登录</button>
            <a class="btn btn-default btn-info" style="margin-left: 40px" id="logup" href="zhuce.jsp">注册</a>
        </form>
        <div style="margin-left: 40px">
            <c:if test="${requestScope.msg ==1}">
            <span>用户不存在</span>
            </c:if>
            <c:if test="${requestScope.msg ==2}">
                <span>用户与密码不匹配</span>
            </c:if>
        </div>


    </div>
</div>
</body>

<script>
    $(function () {

        $("#form").submit(function () {


            if($("#exampleInputEmail1").val().length!=0 || $("#exampleInputEmail1").val()!=''){
                if ($("#exampleInputPassword1").val().length!=0 || $("#exampleInputPassword1").val()!=''){

                    return true;
                }else {
                    $("#p2").html("*.密码不能为空");
                    return false;
                }
            }
            else {
                $("#p1").html("*.用户名不能为空");
                return false;
            }
        })
    })

</script>

</html>
