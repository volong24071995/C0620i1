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
<h2>List Customer</h2>
<h2><a href="/customers/create">Create Customer</a></h2>
<c:if test="${customers.size()>0}">
    <table border="1">
        <tr>
            <td>Id</td>
            <td>Name</td>
            <td>Email</td>
            <td>Address</td>
            <td>Action</td>
        </tr>
        <c:forEach items="${customers}" var="customer">
            <tr>
                <td>
                        ${customer.id}
                </td>
                <td>
                        ${customer.name}
                </td>
                <td>
                        ${customer.email}
                </td>
                <td>
                        ${customer.address}
                </td>
                <td>
                    <a href="/customers/edit?id=${customer.id}">Edit</a>
                    <a href="/customers/delete?id=${customer.id}">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</c:if>
<c:if test="${customers.size()<=0}">
    <h3>No data</h3>
</c:if>
</body>
</html>
