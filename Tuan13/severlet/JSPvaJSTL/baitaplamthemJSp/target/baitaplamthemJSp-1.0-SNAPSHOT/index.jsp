<%--
  Created by IntelliJ IDEA.
  User: MSII
  Date: 23/09/2020
  Time: 3:51 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        input{
            height: 2rem;
        }
    </style>
</head>
<body>
<form method="post" action="${pageContext.request.contextPath}/login">
    <div class="login">
        <h2>Login</h2>
        <p>Username</p>
        <label>
            <input type="text" name="username" size="30"  placeholder="Email" />
        </label>
        <p>Password</p>
        <label>
            <input type="password" name="password" size="30" placeholder="password" />
        </label>
        <input type="submit" value="Sign in"/>
    </div>
</form>
</body>
</html>
