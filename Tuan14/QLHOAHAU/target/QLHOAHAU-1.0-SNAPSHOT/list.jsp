<%--
  Created by IntelliJ IDEA.
  User: MSII
  Date: 28/09/2020
  Time: 10:41 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>MissWorld List</title>
    <style>
        img{
            width: 200px;
            height: 300px;
        }
        table tr td{
            text-align: center;
        }
    </style>
</head>
<body>
<h1>MissWorld</h1>
<p>
    <a href="/missWorlds?action=create">Create new MissWorld</a>

</p>
<p>
    <a href="/missWorlds?action=listYes">Show list status Yes</a>
</p>

<table border="1">
    <tr>
        <td rowspan="2">Họ tên</td>
        <td rowspan="2">Ngày sinh</td>
        <td rowspan="2">Địa chỉ cư trú</td>
        <td colspan="2">Địa chỉ liên lạc</td>
        <td rowspan="2">Số CMT/hộ chiếu</td>
        <td rowspan="2">Nghề nghiệp</td>
        <td rowspan="2">Trình độ văn hóa</td>
        <td rowspan="2">Dân tộc</td>
        <td rowspan="2">Đơn vị công tác/học tập</td>
        <td colspan="2">Chiều cao, cân nặng</td>
        <td rowspan="2">Năng khiếu khác</td>
        <td rowspan="2">Đại diện tỉnh thành</td>
        <td rowspan="2">Ảnh cá nhân</td>
        <td rowspan="2">Edit</td>
        <td rowspan="2">Delete</td>
        <td rowspan="2">Duyệt</td>
    </tr>
    <tr>
        <td>Email</td>
        <td>Sđt</td>
        <td>Chiều cao</td>
        <td>Cân nặng</td>
    </tr>
    <c:forEach items="${missList}" var="missWorld">
        <tr>
            <td><a href="/missWorlds?action=view&id=${missWorld.getIdentityCard()}">${missWorld.getName()}</a></td>
            <td>${missWorld.getDob()}</td>
            <td>${missWorld.getAddress()}</td>
            <td>${missWorld.getEmail()}</td>
            <td>${missWorld.getPhone()}</td>
            <td>${missWorld.getIdentityCard()}</td>
            <td>${missWorld.getJob()}</td>
            <td>${missWorld.getEducationalLevel()}</td>
            <td>${missWorld.getNation()}</td>
            <td>${missWorld.getWorkUnit()}</td>
            <td>${missWorld.getHeight()}</td>
            <td>${missWorld.getWeight()}</td>
            <td>${missWorld.getGifted()}</td>
            <td>${missWorld.getTinh()}</td>
            <td>
                <img src="${missWorld.getImage()}" alt="img">
            </td>
            <td><a href="/missWorlds?action=edit&id=${missWorld.getIdentityCard()}">Edit</a></td>
            <td><a href="/missWorlds?action=delete&id=${missWorld.getIdentityCard()}">Delete</a></td>
            <td><a href="/missWorlds?action=duyet&id=${missWorld.getIdentityCard()}">${missWorld.getStatus()}</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
