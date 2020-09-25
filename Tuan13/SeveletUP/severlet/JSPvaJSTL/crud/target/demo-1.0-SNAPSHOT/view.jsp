<%@ page import="service.CustomerSevice" %>
<%@ page import="java.util.Map" %>
<%@ page import="model.Customer" %><%--
  Created by IntelliJ IDEA.
  User: MSII
  Date: 24/09/2020
  Time: 8:41 SA
  To change this template use File | Settings | File Templates.
--%>
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
    <%!
        Map<Integer, Customer> list=CustomerSevice.lisCustomers;
    %>
    <a href="add.jsp">ADD</a>
    <table>
        <tr>
            <td>FullName</td>
            <td>Address</td>
            <td>Email</td>
            <td>Action</td>
        </tr>
        <%
            for (Map.Entry<Integer, Customer> customerEntry :list.entrySet()) {
        %>
        <tr>
            <td>
                <%=customerEntry.getValue().getName()%>
            </td>
            <td>
                <%=customerEntry.getValue().getAddress()%>
            </td>
            <td>
                <%=customerEntry.getValue().getEmail()%>
            </td>
            <td>
                <a href="/edit.jsp?idEdit=<%=customerEntry.getKey()%>">edit</a>
                <a href="/add?idDelete=<%=customerEntry.getKey()%>">delete</a>
            </td>
        </tr>
        <%}%>
    </table>
</body>
</html>
