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
    <title>Title</title>
</head>
<body>
<img id="img-of-the-day">
<script>
    let query = 'https://api.nasa.gov/planetary/apod?api_key=pqMgHB8F3fFnCYTVsfmazgOS2J8OcYrJIK3apwmi';
    let request = new XMLHttpRequest();
    request.open('GET', query);
    request.onload = function() {
        if (request.status === 200) {
            let response = JSON.parse(request.responseText);
            document.getElementById('img-of-the-day').setAttribute('src', response.url);
        }
    };
    request.send();
</script>
</body>
</html>
