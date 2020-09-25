<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="entity.Customer" %><%--
  Created by IntelliJ IDEA.
  User: MSII
  Date: 24/09/2020
  Time: 3:14 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        table,tr,td{
            border: 1px solid red;
            border-collapse: collapse;
        }
    </style>
</head>
<body>
<table>

    <tr>
        <td colspan="4">Danh sach khach hang</td>
    </tr>
    <tr>
        <td>Ten</td>
        <td>Ngay sinh</td>
        <td>Dia chi</td>
        <td>Anh</td>
    </tr>
    <c:forEach  items="${list}" var="customer">
        <tr>
            <td>
                    ${customer.name}
            </td>
            <td>
                    ${customer.birthday}
            </td>
            <td>
                    ${customer.address}
            </td>
            <td>
                <img src="Anhtruyen/${customer.urlImg}">
            </td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
