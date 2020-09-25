<%@ page import="model.Customer" %>
<%@ page import="service.CustomerSevice" %><%--
  Created by IntelliJ IDEA.
  User: MSII
  Date: 24/09/2020
  Time: 2:05 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
  int id=Integer.parseInt(request.getParameter("idEdit"));
  Customer customer= CustomerSevice.lisCustomers.get(id);
//  tao ham nua CustomerSevice.lisCustomers.get(id)
%>
<form action="${pageContext.request.contextPath}/edit" method="post">
    <p>Name</p>
    <input class="input" type="text" name="FullName" value="<%=customer.getName() %>" placeholder="Vidu: Vo Long"><br>
    <p>Address</p>
    <input class="input" type="text" name="Address" value="<%=customer.getAddress() %>" placeholder="Vidu: TP Hue"><br>
    <p>Email</p>
    <input class="input" type="text" name="Email" value="<%=customer.getEmail() %>" placeholder="Vidu: xxx@gmail.com"><br>
    <input type="hidden" name="Id" value="<%=customer.getId()%>"><br>
    <br>
    <input id="submit" type="submit" name="Submit" value="Submit">
</form>
</body>
</html>
