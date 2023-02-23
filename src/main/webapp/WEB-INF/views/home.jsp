<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>

<html>
<head>
    <title>Spitter</title>
</head>
<body>

<h1><s:message code="welcome.msg"/></h1>

<c:url value="/spittles" var="spittlesUrl">
    <c:param name="count" value="20"/>
</c:url>
<a href="${spittlesUrl}">Spittles</a>

|

<a href="<c:url value="/spitter/register"/>">Register</a>

|

<c:url value="/spittles/find" var="spittleUrl">
    <c:param name="id" value="200"/>
</c:url>
<a href="${spittleUrl}">Find Spittle</a>
|

<c:url value="/spittles/new" var="newSpittleUrl"/>
<a href="${newSpittleUrl}">Post Spittle</a>

</body>
</html>