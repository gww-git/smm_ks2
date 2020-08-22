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
    <div class="panel panel-primary" id="yy">
        <c:if test="${not empty items}">
            <div id="ids" class="panel-body">

                <div>
                    <form action="/xx" method="post" name="form">
                        <div>
                            <table class="table table-bordered table-responsive table-hover">
                                <c:forEach items="${items}" var="a" varStatus="x">
                                    <tr style="background-color: #8a6d3b">
                                        <td>
                                                ${x.count}.&nbsp;
                                                ${a.ename}
                                            <c:if test="${a.etype==1}">【填空】</c:if>
                                            <c:if test="${a.etype==2}">【判断题】</c:if>
                                            <c:if test="${a.etype==3}">【单选题】</c:if>
                                            <c:if test="${a.etype==4}">【多选题】</c:if>
                                            <c:if test="${a.etype==5}">【问答题】</c:if>

                                               (${a.escore}分)
                                        </td>

                                    </tr>
                                    <tr style="height: 60px">
                                        <td style="padding-top: 20px">&nbsp;&nbsp;&nbsp;&nbsp;
                                            <input type="radio" name="${a.eid}" value="${a.ea}">${a.ea}&nbsp;&nbsp;&nbsp;&nbsp;
                                            <input type="radio" name="${a.eid}" value="${a.eb}">${a.eb}&nbsp;&nbsp;&nbsp;&nbsp;
                                            <input type="radio" name="${a.eid}" value="${a.ec}">${a.ec}&nbsp;&nbsp;&nbsp;&nbsp;
                                            <input type="radio" name="${a.eid}" value="${a.ed}">${a.ed}&nbsp;&nbsp;&nbsp;&nbsp;
                                            <input type="radio" name="${a.eid}" value="${a.ee}">${a.ee}&nbsp;&nbsp;&nbsp;&nbsp;
                                            <input type="radio" name="${a.eid}" value="${a.ey}">${a.ey}&nbsp;&nbsp;&nbsp;&nbsp;

                                        </td>
                                    </tr>
                                </c:forEach>
                            </table>
                        </div>
                        <input type="submit" value="提交" name="xxxx">
                    </form>
                </div>
            </div>
        </c:if>
    </div>
</div>

<c:if test="${empty items}">
    <div>
        <span>暂时没有试卷</span>
        <span> <a href="/admin.html">返回首页</a></span>
    </div>

</c:if>


</body>
<script>



    $(function () {


        $("form").submit(function () {
            var a = false;
            var da = [];

            <c:forEach items="${items}" var="it" varStatus="c">
            <%--alert("${it.eid}");--%>
            if ($("input[name='${it.eid}']:checked").val() != null) {
                var nn = {};
                nn["id"] = "${it.eid}";
                nn["epaperid"] = "${it.epaperid}";
                nn["name"] = $("input[name='${it.eid}']:checked").val();
                nn['score'] = "${it.escore}";
                nn["value"] = "${it.ekeys}";
                da.push(nn);
            } else {
                alert("选项不能为空")
                return false;
            }
            </c:forEach>

            if (da.length == "${items.size()}") {
                $.ajax({
                    url: "/admin/score",
                    data: JSON.stringify(da),
                    contentType: "application/json;charset=utf-8",
                    type: "post",
                    dataType: "json",
                    success: function (da) {
                        // $("input[name='sc']").val(da);
                        document.location.href = '<%=request.getContextPath()%>/xx?a=' + da;

                    },
                    error: function () {
                        return false;
                    }

                })
            } else {
                return false;
            }

            return false;
        })


    })

</script>
</html>
