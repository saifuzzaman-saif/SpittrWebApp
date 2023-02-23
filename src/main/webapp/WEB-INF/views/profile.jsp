<%--
  User: SAIFUZZAMAN SAIF
  Date: 17-Feb-23
  Time: 10:13 AM
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Profile</title>
</head>
<body>

<h2>Your Profile</h2>
FirstName : <c:out value="${spitter.firstName}"/> <br>
LastName : <c:out value="${spitter.lastName}"/>
</body>
</html>
