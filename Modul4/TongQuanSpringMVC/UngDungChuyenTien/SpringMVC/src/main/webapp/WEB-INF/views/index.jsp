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
    <title>User Form</title>
</head>
<body>
<h2>Chuyen tien</h2>
<form action="/result">
    <h3>USD</h3>
    <input type="number" name="usd" placeholder="$">
    <h3>Ti gia</h3>
    <input type="number" name="tigia" placeholder="VND">
    <input type="submit" value="Submit">
</form>
</body>
</html>
