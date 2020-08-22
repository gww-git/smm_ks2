
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
    <div class="panel panel-primary">
        <div id="ids" class="panel-body" style="float: left;width: 100%">
            <c:if test="${not empty li}">
            <div>
                <table class="table table-bordered table-responsive table-hover">
                    <tr>
                    <td>编号</td>
                    <td>试卷编号</td>
                    <td>试卷名称</td>
                    <td>试卷总分</td>
                    <td>我的分数</td>
                    <td>答对题数</td>
                    <td>答错题数</td>
                    <td>
                    </tr>
                        <c:forEach items="${li}" var="ll" varStatus="v">
                        <tr>
                            <td>${v.count}</td>
                            <td>${ll.paperid}</td>
                            <td>${ll.naem}</td>
                            <td>${ll.remarks}</td>
                            <td>${ll.score}</td>
                            <td>${ll.pights}</td>
                            <td>${ll.errors}</td>
                            <td>
                                <a href="/admin/scoredata?id=${ll.scoreid}" class="btn">我要查看所有试卷</a>
                            </td>
                        </tr>
                        </c:forEach>
                </table>
            </div>
            </c:if>
            <c:if test="${empty li}">
                <span>没有考过的试卷</span>
                <a href="/admin.html">去答卷...</a>
            </c:if>
        </div>
        <div style="float: right"><a href="/admin.html" class="btn btn-info" >返回主页</a></div>

    </div>
</div>

<script>

</script>

</body>
</html>
