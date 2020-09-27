<%--
  Created by IntelliJ IDEA.
  User: MSII
  Date: 26/09/2020
  Time: 9:22 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="edit" method="post">
    <p>Name</p>
    <input class="input" type="text" name="FullName" value="${customer.name}" placeholder="Vidu: Vo Long"><br>
    <p>Address</p>
    <input class="input" type="text" name="Address" value="${customer.address}" placeholder="Vidu: TP Hue"><br>
    <p>Email</p>
    <input class="input" type="text" name="Email" value="${customer.email}" placeholder="Vidu: xxx@gmail.com"><br>
    <input type="hidden" name="Id" value="${customer.id}"><br>
    <br>
    <input id="submit" type="submit" name="Submit" value="Submit">
</form>
</body>
</html>
