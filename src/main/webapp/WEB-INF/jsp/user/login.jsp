<%--
  User: jiangyukun
  Date: 2014/11/23 19:04
--%>
<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <title>登陆</title>
    <link href="../static/css/app.css" rel="stylesheet" type="text/css"/>
</head>
<body>
<div class="center">
    <div>登录</div>
    <div class="warning">${info}</div>
    <form action="userLogin" method="post">
        <div class="input_line"><span>手机号</span><input type="text" name="mobile"/></div>
        <div class="input_line"><span>密码</span><input type="password" name="password"/></div>
        <div><a href="../user/register">点击注册</a></div>
        <div><input type="submit" value="提交"/></div>
    </form>
</div>
</body>
</html>
