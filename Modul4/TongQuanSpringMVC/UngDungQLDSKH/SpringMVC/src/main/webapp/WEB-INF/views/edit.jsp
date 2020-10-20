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
    <title>List</title>
</head>
<body>
<h2>Edit Customer</h2>
<form action="${action}" method="post">
    <table border="1">
        <input name="id" type="hidden" value="${customer.id}">
        <tr>
            <td>Name</td>
            <td>
                <input name="name" type="text" value="${customer.name}">
            </td>
        </tr>
        <tr>
            <td>Email</td>
            <td>
                <input name="email" type="text" value="${customer.email}">
            </td>
        </tr>
        <tr>
            <td>Address</td>
            <td>
                <input name="address" type="text" value="${customer.address}">
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="Submit">
            </td>
        </tr>
    </table>
</form>
</body>
</html>