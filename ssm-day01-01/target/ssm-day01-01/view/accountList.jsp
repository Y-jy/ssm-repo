<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <script src="/js/jquery.min.js"></script>

    <script>
        $(function () {

        })
    </script>
</head>
<body>

    <h3 style="color: red">${flag}</h3>

    <a href="${pageContext.request.contextPath}/view/saveAccount.jsp">添加用户</a>
    <table border="1" cellpadding="0" cellspacing="0">
        <tr>
            <th>编号</th>
            <th>姓名</th>
            <th>余额</th>
            <th>操作</th>
        </tr>

        <c:forEach items="${accounts}" var="account">
            <tr>
                <td>${account.id}</td>
                <td>${account.name}</td>
                <td>${account.money}</td>
                <td>
                <a href="${pageContext.request.contextPath}/account/findByid?id=${account.id}">修改</a>
                <a href="${pageContext.request.contextPath}/account/delByid?id=${account.id}">删除</a>
                <button id="del_btn" onclick="del(${account.id})">删除2</button>
                </td>
            </tr>
        </c:forEach>

    </table>


</body>
</html>
