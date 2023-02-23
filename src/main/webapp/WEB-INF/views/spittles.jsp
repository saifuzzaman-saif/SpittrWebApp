<%--
  User: SAIFUZZAMAN SAIF
  Date: 14-Feb-23
  Time: 1:36 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Spittles</title>
</head>
<body>

<h2>Recent Spittles</h2>

<c:forEach items="${spittleList}" var="spittle">
    <li>
        <h3>
            <c:out value="${spittle.message}"/>
        </h3>

        <h6>
            <c:out value="${spittle.time}"/>
        </h6>

    </li>
</c:forEach>

</body>
</html>
