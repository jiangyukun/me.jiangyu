<%--
  User: jiangyukun
  Date: 2014/12/01 19:19
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>添加备忘</title>
    <link href="../static/css/app.css" rel="stylesheet" type="text/css"/>
</head>
<body>
<div class="center">
    <h1>添加备忘</h1>

    <form method="post" action="addMemo">
        <div class="input_line">标题：<input name="title" type="text"/></div>
        <div class="input_line">内容：<textarea name="content" rows="10" cols="40"></textarea></div>
        <input type="submit"/>
    </form>
</div>
</body>
</html>
