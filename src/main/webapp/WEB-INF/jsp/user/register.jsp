<%--
  User: jiangyukun
  Date: 2014/11/23 11:21
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>注册</title>
    <link href="../static/css/app.css" rel="stylesheet" type="text/css"/>
</head>
<body>
<div class="center">
    <div>注册</div>
    <form action="addUser" method="post">
        <div class="input_line"><span>用户名</span><input type="text" name="username"/></div>
        <div class="input_line"><span>密码</span><input type="password" name="password"/></div>
        <div class="input_line"><span>电子邮件</span><input type="email" name="email"/></div>
        <div class="input_line"><span>手机号</span><input type="text" name="mobile"/></div>
        <div><input type="submit" value="提交"/></div>
    </form>
</div>
</body>
</html>
