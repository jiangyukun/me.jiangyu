<%--
  User: jiangyukun
  Date: 2014/11/22 17:13
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>nodeType</title>
</head>
<body>
<div id="a"><!-- dd -->aa</div>

<input id="t" type="text"/>
<script>
    var type = document.getElementById("a").childNodes[1].nodeName;
    console.info(type);
    var type1 = document.nodeName;
    console.info(type1);
</script>
</body>
</html>
