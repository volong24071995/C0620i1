<%--
  Created by IntelliJ IDEA.
  User: MSII
  Date: 22/09/2020
  Time: 6:39 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<head>
    <title>Simple Dictionary</title>
    <style>
        input, .submit{
            height:2rem ;
        }
    </style>
</head>
<body>
<h2>Vietnamese Dictionary</h2>
<form method="post" action="${pageContext.request.contextPath}/search_and_add">
    <label>
        <input type="text" name="txtSearch" placeholder="Enter your word: "/>
    </label>
    <input type = "submit" class= "submit" name="Search" value = "Search"/>

    <label>
        <input type="text" name="txtAddKey" placeholder="Enter your word key: "/>
    </label>
    <label>
        <input type="text" name="txtAddValue" placeholder="Enter your word value: "/>
    </label>
    <input type = "submit" class = "submit" name="Add" value = "Add"/>
</form>
</body>
</html>
