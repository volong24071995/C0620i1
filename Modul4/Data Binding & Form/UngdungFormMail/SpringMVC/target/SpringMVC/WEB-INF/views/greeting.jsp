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
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>Form</title>
</head>
<body>
    <table>
        <tr>
            <td>Languages:${pagesEmail.languages}</td>
        </tr>
        <tr>
            <td>Pages Size:${pagesEmail.pageSize}</td>
        </tr>
        <tr>
            <td>Spams Filter:${pagesEmail.spamsFilter} </td>
        </tr>
        <tr>
            <td>Signature:${pagesEmail.signature} </td>
        </tr>
    </table>
</body>
</html>