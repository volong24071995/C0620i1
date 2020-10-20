<%--
  Created by IntelliJ IDEA.
  User: ltphuc
  Date: 10/6/2020
  Time: 11:06 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Caculator</h2>
<form action="/greeting" method="get">
    <input type="number" name="first">
    <input type="number" name="second"><br>
    <hr>
    <input type="submit" value="Addition(+)" name="operator">
    <input type="submit" value="Subtraction(-)" name="operator">
    <input type="submit" value="Multiplication(x)" name="operator">
    <input type="submit" value="Division(/)" name="operator">
</form>
</body>
</html>
