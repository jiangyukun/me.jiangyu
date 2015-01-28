<%--
  User: jiangyukun
  Date: 2014/12/01 23:11
--%>
<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>备忘详情</title>
    <script src="../static/js/jquery-2.1.1.js"></script>
    <script>
        $.ajax({
            url: "getMemoContent",
            data: {
                memoId: "${memoId}"
            },
            success: function (memoDto) {
                $("#title").text(memoDto.title);
                $("#content").text(memoDto.content);
                $("#date").text(memoDto.date);
            },
            dataType: "json"
        });
    </script>
</head>
<body>
<h1>标题：
    <pre><div id="title"></div></pre>
</h1>
<h1>内容：
    <pre><div id="content"></div></pre>
</h1>
<h1>时间：
    <pre><div id="date"></div></pre>
</h1>
</body>
</html>
