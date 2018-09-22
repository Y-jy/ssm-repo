<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
        <form action="${pageContext.request.contextPath}/account/saveAccount">
            姓名:<input type="text" name="name">
            余额:<input type="text" name="money">
            <input type="submit" value="添加">
        </form>
</body>
</html>
