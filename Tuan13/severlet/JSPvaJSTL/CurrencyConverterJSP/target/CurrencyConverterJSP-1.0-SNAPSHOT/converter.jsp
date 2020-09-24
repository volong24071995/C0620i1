<%--
  Created by IntelliJ IDEA.
  User: MSII
  Date: 23/09/2020
  Time: 11:29 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Converter</title>
    <style>
        h2{
            height: 2rem;
        }
    </style>
</head>
<body>
<%
    float rate = Float.parseFloat(request.getParameter("rate"));
    float usd = Float.parseFloat(request.getParameter("usd"));
    float vnd = rate * usd;
%>
<h2 style="color: cornflowerblue">Rate: <%=rate%></h2>
<h2 style="color: crimson">USD: <%=usd%></h2>
<h2 style="color: indigo">VND: <%=vnd%></h2>
</body>
</html>
