<%--
  User: jiangyukun
  Date: 2014/12/01 22:25
--%>
<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>所有备忘</title>
</head>
<body>
<h1>所有备忘</h1>
<c:forEach var="memo" items="${memos}">
    <div><a href="memoDetail?memoId=${memo.uuid}"><c:out value="${memo.title}"/></a></div>
</c:forEach>
</body>
</html>
