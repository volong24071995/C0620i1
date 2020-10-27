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
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>Form</title>
</head>
<body>
<form:form method="POST" action="/greeting" modelAttribute="pagesEmail">
    <table border="1">
        <tr>
            <td><form:label path="languages">Languages: </form:label></td>
            <td><form:select path="languages">
                <form:options items="${languages}" />
            </form:select></td>
        </tr>
        <tr>
            <td><form:label path="pageSize">Pages Size: </form:label></td>
            <td><form:select path="pageSize">
                <form:options items="${size}" />
            </form:select></td>
        </tr>
        <tr>
            <td><form:label path="spamsFilter">Spams Filter: </form:label></td>
            <td><form:checkbox path="spamsFilter" value="Enable spams filter"/>Enable spams filter</td>
        </tr>
        <tr>
            <td><form:label path="signature">Signature: </form:label></td>
            <td><form:textarea path="signature"></form:textarea></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="Submit"/></td>
        </tr>
    </table>
</form:form>
</body>
</html>
