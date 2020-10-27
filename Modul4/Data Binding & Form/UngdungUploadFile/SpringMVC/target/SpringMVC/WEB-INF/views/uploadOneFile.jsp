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
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Upload Multi File</title>
</head>
<body>

<h3>Upload Multiple File:</h3>
<!-- MyUploadForm -->
<%--@elvariable id="myUploadForm" type=""--%>
<form method="POST" action="${pageContext.request.contextPath}/uploadOneFile" enctype="multipart/form-data">
    Description:
    <br>
    <label>
        <input name="name" type="text" style="width:300px;"/>
    </label>
    <br/><br/>
    File to upload (1): <input name="fileUpdate" type="file"/><br />

<%--    File to upload (2): <form:input path="fileUpdate" type="file"/><br />--%>

<%--    File to upload (3): <form:input path="fileUpdate" type="file"/><br />--%>

<%--    File to upload (4): <form:input path="fileUpdate" type="file"/><br />--%>

<%--    File to upload (5): <form:input path="fileDatas" type="file"/><br />--%>

    <input type="submit" value="Upload">
</form>
</body>

</html>
