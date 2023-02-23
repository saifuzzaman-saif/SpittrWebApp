<%--
  User: SAIFUZZAMAN SAIF
  Date: 03-Mar-23
  Time: 11:06 AM
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Spittle</title>
</head>
<body>

<h2>Your Spittle</h2>
Message : <c:out value="${spittle.message}"/> <br>
Time : <c:out value="${spittle.time}"/>
</body>
</html>