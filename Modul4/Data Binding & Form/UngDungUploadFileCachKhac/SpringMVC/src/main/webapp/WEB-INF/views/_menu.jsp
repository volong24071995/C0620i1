<%--
  Created by IntelliJ IDEA.
  User: ltphuc
  Date: 10/6/2020
  Time: 11:12 AM
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<div style="border:1px solid #ccc;padding:5px;">
    <c:if test="${Link!=null}">
        <a href="test.jsp">Click xem</a>
    </c:if>
    <c:if test="${err!=null}">
        <p>${err}</p>
        <a href="/upload">Back</a>
    </c:if>
</div>
