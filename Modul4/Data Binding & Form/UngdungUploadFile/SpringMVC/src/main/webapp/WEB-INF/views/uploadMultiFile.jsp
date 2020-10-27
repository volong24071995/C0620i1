<%--
  Created by IntelliJ IDEA.
  User: MSII
  Date: 22/10/2020
  Time: 2:22 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>

<head>

    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    <title>Upload One File</title>

</head>

<body>

<jsp:include page="_menu.jsp"/>

<h3>Upload One File:</h3>

<!-- MyUploadForm -->

<%--@elvariable id="myUploadForm" type="-"--%>
<form:form modelAttribute="myUploadForm" method="POST" action="" enctype="multipart/form-data">
    Description:
    <br>
    <form:input path="description" style="width:300px;"/>
    <br/><br/>
    File to upload: <form:input path="fileDatas" type="file"/><br />
    <input type="submit" value="Upload">
</form:form>

</body>

</html>
