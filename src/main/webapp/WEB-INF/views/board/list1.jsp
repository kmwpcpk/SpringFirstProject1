<%--
  Created by IntelliJ IDEA.
  User: kmwpc
  Date: 2022-11-27
  Time: 오전 1:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>${title}</h1>
<img src="./img/Love.jpg" width="200" />
<c:forEach var="name" items="${classList}" varStatus="status">
    <p>${status.count} : ${name}</p>
</c:forEach>

</body>
</html>
