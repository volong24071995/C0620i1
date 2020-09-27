<%--
  Created by IntelliJ IDEA.
  User: MSII
  Date: 26/09/2020
  Time: 8:53 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List customer</title>
    <style>
        table,tr,td{
            border: 1px solid red;
            border-collapse: collapse;
        }
    </style>
</head>
<body>
<h1>List customer</h1>
<a href="add.jsp">ADD</a>
<table>
    <tr>
        <td>FullName</td>
        <td>Address</td>
        <td>Email</td>
        <td>Action</td>
    </tr>

    <c:forEach items="${list}" var="customer">
        <tr>
            <td>
                    ${customer.name}
            </td>
            <td>
                    ${customer.address}
            </td>
            <td>
                    ${customer.email}
            </td>
            <td>
                <a href="/edit?Id=${customer.id}">edit</a>
                <a href="/add?Id=${customer.id}">delete</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
