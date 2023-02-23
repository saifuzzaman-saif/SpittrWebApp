<%--
  User: SAIFUZZAMAN SAIF
  Date: 03-Mar-23
  Time: 12:27 PM
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
    <title>New Spittle</title>
</head>
<body>

<form:form method="post" modelAttribute="spittle" action="/spittles">
    Message : <form:input path="message"/> <br><br>
    <form:errors path="message" cssClass="error"/> <br><br>

    <input type="submit" value="Save Post"/>
</form:form>

</body>
</html>
