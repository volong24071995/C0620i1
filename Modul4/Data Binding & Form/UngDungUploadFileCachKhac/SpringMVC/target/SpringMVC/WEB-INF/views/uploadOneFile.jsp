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
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Upload Multi File</title>
</head>
<body>

<h3>Upload Multiple File:</h3>
<!-- MyUploadForm -->
<%--@elvariable id="myUploadForm" type=""--%>
<%--modelAttribute="myUploadForm"--%>
<form:form  method="POST" action="upload" enctype="multipart/form-data">
    Description:
    <br>
<%--    <label>--%>
<%--        <form:input path="name" type="text" style="width:300px;"/>--%>
<%--    </label>--%>
    <br/><br/>
    File to upload (1): <input name="fileUpdate" type="file"/><br />
    <input type="submit" value="Upload">
</form:form>
</body>

</html>