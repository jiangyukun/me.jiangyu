<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  User: jiangyukun
  Date: 2014/11/22 17:48
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>AttrAndProp</title>
    <script src="../static/js/jquery-2.1.1.js"></script>
</head>
<body>
<div id="a"></div>
<form>
    <input type="checkbox" checked/>checkbox
</form>
<script>
    var attr = $("#a").attr("attr", "attr");
    var getAttr = $("#a").attr("attr");
    var prop = $("#a").prop("b", "b");
    var getProp = $("#a").prop("b");
    console.info(attr);
    console.info(getAttr);
    console.info(prop);
    console.info(getProp);
    console.info($("input").attr("checked"));
    console.info($("input").prop("checked"));
</script>
</body>
</html>
