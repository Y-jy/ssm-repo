<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h3 style="color: red">${flag}</h3>
    <form action="${pageContext.request.contextPath}/account/upAccount" method="post">
        <%--使用隐藏表单将id传过去--%>
        <input type="hidden" name="id" value="${account.id}">

        姓名: <input type="text" name="name" value="${account.name}"></br>
        余额: <input type="number" name="money" value="${account.money}"></br>
        <input type="submit" value="修改">
    </form>

</body>
</html>
