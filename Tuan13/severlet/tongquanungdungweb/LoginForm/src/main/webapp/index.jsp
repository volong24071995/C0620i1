<%--
  Created by IntelliJ IDEA.
  User: MSII
  Date: 22/09/2020
  Time: 5:09 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Page</title>
    <style type="text/css">
        .login {
            height:280px; width:330px;
            margin:0;
            padding:10px;
            border:1px #CCC solid;
        }
        .login input {
            padding:5px; margin:5px
        }
    </style>
</head>
<body>
<form method="post" action="${pageContext.request.contextPath}/login">
    <div class="login">
        <h2>Login</h2>
        <label>
            <input type="text" name="username" size="30"  placeholder="username" />
        </label>
        <label>
            <input type="password" name="password" size="30" placeholder="password" />
        </label>
        <input type="submit" value="Sign in"/>
    </div>
</form>
</body>
</html>
