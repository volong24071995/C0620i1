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
    <title>Add-customer</title>
    <style>
        form{
            border: 1px darkorchid solid;
            width: 20rem;
        }
        h1{
            color: indigo;
            font-family: cursive;
        }
        p{
            font-family: cursive;
            color: crimson;
        }
        .input{
            height: 2rem;
            width: 20rem;
        }
        #submit{
            height: 2rem;
            font-family: cursive;
            color: crimson;
            width: 4rem;
            position: relative;
            left: 40%;
        }
    </style>
</head>
<body>
<h1>ADD NEW CUSTOMER</h1>
<form action="${pageContext.request.contextPath}/add" method="post">
    <p>Name</p>
    <input class="input" type="text" name="FullName" value="${customer.name}" placeholder="Vidu: Vo Long"><br>
    <p>Address</p>
    <input class="input" type="text" name="Address" value="${customer.address}" placeholder="Vidu: TP Hue"><br>
    <p>Email</p>
    <input class="input" type="text" name="Email" value="${customer.email}" placeholder="Vidu: xxx@gmail.com"><br>
    <input type="hidden" name="Id" value="${customer.id}">
    <br>
    <input id="submit" type="submit" name="Submit" value="Submit">
</form>
<a href="/view">Back view</a>
</body>
</html>
