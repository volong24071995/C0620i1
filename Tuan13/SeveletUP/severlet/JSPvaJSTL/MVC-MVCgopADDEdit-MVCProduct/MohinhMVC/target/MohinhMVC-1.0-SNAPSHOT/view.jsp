<%--
  Created by IntelliJ IDEA.
  User: nhat
  Date: 4/20/18
  Time: 8:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View customer</title>
</head>
<body>
<h1>Customer details</h1>
<p>
    <a href="/products">Back to product list</a>
</p>
<table>
    <tr>
        <td>Name: </td>
        <td>${requestScope["product"].getName()}</td>
    </tr>
    <tr>
        <td>Price: </td>
        <td>${requestScope["product"].getPrice()}</td>
    </tr>
    <tr>
        <td>Mo ta: </td>
        <td>${requestScope["product"].getMota()}</td>
    </tr>
    <tr>
        <td>Nha san xuat: </td>
        <td>${requestScope["product"].getNhasx()}</td>
    </tr>
</table>
</body>
</html>