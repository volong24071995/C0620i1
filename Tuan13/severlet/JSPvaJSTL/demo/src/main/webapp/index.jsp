<%--
  Created by IntelliJ IDEA.
  User: MSII
  Date: 23/09/2020
  Time: 2:36 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Bang cuu chuong</title>
</head>
<body>
<h1>Bang cuu chuong</h1>
<table>
    <%
        for (int i=1;i<10;i++){
    %>
    <tr>
        <%
        for (int j=1;j<=10;j++){
        %>
        <td>
            <%=
                j+"x"+i+"="+i*j+"&nbsp;&nbsp;"
            %>
        </td>
        <%
            }
        %>
    </tr>
    <%
        }
    %>
</table>
</body>
</html>