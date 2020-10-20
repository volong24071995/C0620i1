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
<h2>Sandwich Condiments</h2>
<form action="/save" method="post">
    <input type="checkbox" name="condiment" value="lettuce">lettuce
    <input type="checkbox" name="condiment" value="tomato">tomato
    <input type="checkbox" name="condiment" value="mustard">mustard
    <input type="checkbox" name="condiment" value="sprouts">sprouts
    <hr>
    <input type="submit" value="Save">
</form>
</body>
</html>
