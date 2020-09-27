<%--
  Created by IntelliJ IDEA.
  User: MSII
  Date: 26/09/2020
  Time: 12:57 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product List</title>
</head>
<body>
<h1>Customers</h1>
<p>
    <a href="/products?action=create">Create new customer</a>
</p>
<form action="/products?action=search" method="post">
    <input type="text" name="name" placeholder="Enter name product">
    <input type="submit" value="Search">
</form>
<table border="1">
    <tr>
        <td>Name</td>
        <td>Price</td>
        <td>Mo ta</td>
        <td>Nha san xuat</td>
        <td>Edit</td>
        <td>Delete</td>
    </tr>
    <c:forEach items='${requestScope["productList"]}' var="product">
        <tr>
            <td><a href="/products?action=view&id=${product.getId()}">${product.getName()}</a></td>
            <td>${product.getPrice()}</td>
            <td>${product.getMota()}</td>
            <td>${product.getNhasx()}</td>
            <td><a href="/products?action=edit&id=${product.getId()}">edit</a></td>
            <td><a href="/products?action=delete&id=${product.getId()}">delete</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
