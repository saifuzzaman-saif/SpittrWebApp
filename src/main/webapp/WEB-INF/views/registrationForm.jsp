<%--
  User: SAIFUZZAMAN SAIF
  Date: 17-Feb-23
  Time: 9:42 AM
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<html>
<head>
    <title>Spitter</title>
</head>
<body>
<form:form method="POST" modelAttribute="spitter" enctype="multipart/form-data">

    FirstName : <form:input path="firstName"/> <br> <br>
    <form:errors path="firstName" cssClass="errors"/><br>

    LastName : <form:input path="lastName"/> <br> <br>
    <form:errors path="lastName" cssClass="errors"/><br>

    UserName : <form:input path="userName"/> <br> <br>
    <form:errors path="userName" cssClass="errors"/><br>

    Password : <form:password path="password"/> <br> <br>
    <form:errors path="password" cssClass="errors"/><br>

    Profile Picture : <input type="file"
                             name="profilePicture"
                             accept="image/jpeg, image/png"/><br><br>

    <input type="submit" value="register"/>
</form:form>
</body>
</html>
