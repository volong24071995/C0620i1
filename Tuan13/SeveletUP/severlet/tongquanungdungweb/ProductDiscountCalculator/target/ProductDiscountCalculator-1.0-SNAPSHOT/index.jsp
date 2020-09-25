<%--
  Created by IntelliJ IDEA.
  User: MSII
  Date: 22/09/2020
  Time: 7:35 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/product" method="post">
    <p>Product Description:</p>
    <input type="text" name="Product_Description">
    <p>List Price:</p>
    <input type="text" name="List_Price">
    <p>Discount Percent:</p>
    <input type="text" name="Discount_Percent">
    <button type="submit" name="Submit">Submit</button>
</form>
</body>
</html>
