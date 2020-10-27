<%--
  Created by IntelliJ IDEA.
  User: ltphuc
  Date: 10/6/2020
  Time: 11:12 AM
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta charset="UTF-8">
    <title>Infor</title>
</head>
<body>
<h2>Submitted Employee Information</h2>
<table>
    <tr>
        <td>Name :</td>
        <td>${name}</td>
    </tr>
    <tr>
        <td>ID :</td>
        <td>${id}</td>
    </tr>
    <tr>
        <td>Contact Number :</td>
        <td>${contactNumber}</td>
    </tr>
</table>
</body>
</html>
