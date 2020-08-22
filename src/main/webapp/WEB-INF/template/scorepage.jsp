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
    <div class="panel panel-primary">
        <div id="ids" class="panel-body">
            <c:if test="${not empty li}">
                <div>
                    <div style="width: auto;height: 40px;background-color: #1b6d85">
                        <span style="text-align: center;margin-left: 20px;margin-top: 20px;font-size: x-large">${li[0].papernames}  满分:(${li[0].remarks})</span>
                    </div>
                    <hr>
                    <div>
                        <c:forEach items="${li}" var="list" varStatus="v">
                            <div style="width: 100%;height: 200px;border: #3c763d">
                                <div style="float:left;width: 100%;background-color: #843534">
                                    <span> ${v.count}</span>
                                    <span>. ${list.ename} </span>
                                    <c:if test="${list.etype ==3}">
                                        <span>【单选题】</span>
                                    </c:if>
                                    <c:if test="${list.etype ==1}">
                                        <span>【填空题】</span>
                                    </c:if>
                                    <c:if test="${list.etype ==2}">
                                        <span>【判断题】</span>
                                    </c:if>
                                    <c:if test="${list.etype ==4}">
                                        <span>【多选题】</span>
                                    </c:if>
                                    <span> (${list.score}分)</span>
                                    </br>
                                </div>
                                <div style="background-color: #c1e2b3;width: 100%; height:auto;float: left">
                                    <div style="margin-left: 40px;float: left;">
                                        <c:if test="${list.ekeys==list.ea }">
                                            <input type="radio" name="${list.eid}" disabled="true" checked="checked" style="position: display: none" ><span>${list.ea}</span><br>
                                        </c:if>
                                        <c:if test="${list.ekeys!=list.ea}">
                                            <input type="radio" name="${list.eid}" disabled="true"><span>${list.ea}</span><br>
                                        </c:if>

                                        <c:if test="${list.ekeys==list.eb}">
                                            <input type="radio" name="${list.eid}" disabled="true" checked="checked" ><span>${list.eb}</span><br>
                                        </c:if>
                                        <c:if test="${list.ekeys!=list.eb}">
                                            <input type="radio" name="${list.eid}" disabled="true"><span>${list.eb}</span><br>
                                        </c:if>

                                        <c:if test="${list.ekeys==list.ec}">
                                            <input type="radio" name="${list.eid}" disabled="true" checked="checked" ><span>${list.ec}</span><br>
                                        </c:if>
                                        <c:if test="${list.ekeys!=list.ec}">
                                            <input type="radio" name="${list.eid}" disabled="true"><span>${list.ec}</span><br>
                                        </c:if>

                                        <c:if test="${list.ekeys==list.ed}">
                                            <input type="radio" name="${list.eid}" disabled="true" checked="checked" ><span>${list.ed}</span><br>
                                        </c:if>
                                        <c:if test="${list.ekeys!=list.eb}">
                                            <input type="radio" name="${list.eid}" disabled="true"><span>${list.ed}</span><br>
                                        </c:if>

                                        <c:if test="${list.ekeys==list.ee}">
                                            <input type="radio" name="${list.eid}" disabled="true" checked="checked" ><span>${list.ee}</span><br>
                                        </c:if>
                                        <c:if test="${list.ekeys!=list.ee}">
                                            <input type="radio" name="${list.eid}" disabled="true"><span>${list.ee}</span><br>
                                        </c:if>

                                        <c:if test="${list.ekeys==list.ey}">
                                            <input type="radio" name="${list.eid}" disabled="true" checked="checked" ><span>${list.ey}</span><br>
                                        </c:if>
                                        <c:if test="${list.ekeys!=list.ey}">
                                            <input type="radio" name="${list.eid}" disabled="true"><span>${list.ey}</span><br>
                                        </c:if>


                                    </div>
                                </div>
                                <div style="background-color: #8a6d3b;width: 100%; height: 110px;float: left">
                                    <div style="float: left;margin-left: 20px;margin-top: 15px;width: 50%">
                                        <span>我的答案: ${list.uanswer}</span></br>
                                        <span>正确答案：${list.ekeys}</span></br>
                                        <span>实际得分：${list.upoint}</span></br>
                                        <span>题目解析: ${list.ehints}</span></br>
                                    </div>
                                        <%--<div style="background-color: #2b669a;width: auto;height: 30px"></div>--%>
                                    <div style="float: right;width: 10%;right: 30px">
                                        <c:if test="${list.upoint ==0}">
                                            <span style="color: #843534;padding-top: 20px">错误</span>
                                        </c:if>
                                        <c:if test="${list.upoint !=0}">
                                            <span style="color: #4cae4c">正确</span>
                                        </c:if>
                                    </div>
                                </div>
                                <hr>
                            </div>
                        </c:forEach>
                    </div>
                </div>
            </c:if>
            <c:if test="${empty li}">
                <span>没有试题</span>
                <a href="/admin.html">返回主页</a>
            </c:if>
        </div>
    </div>
    <div style="float: right"><a href="/admin.html" class="btn btn-info" >返回主页</a></div>
</div>

<script>

</script>

</body>
</html>
