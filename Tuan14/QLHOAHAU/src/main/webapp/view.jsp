<%--
  Created by IntelliJ IDEA.
  User: MSII
  Date: 28/09/2020
  Time: 2:30 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>MissWorld View</title>
    <style>
        .view{
            display:flex;
            width:80%;
            justify-content: center;
            margin-left: 10%;
            border: 3px solid red;
        }
        .img{
            flex: 1;
            display: block;
            text-align: center;
            justify-content: center;
        }
        .information{
            flex: 2;
        }
        h3{
            color: red;
        }

        img{
            width: 200px;
            height: 300px;
        }
        input{
            height: 2rem;
            width: 20rem;
        }

    </style>
</head>
<body>
<h1>MissWorld</h1>
<c:if test = "${missWorld.getStatus().equals('Yes')}">
    <h3 class="message">${requestScope["message"]}</h3>
</c:if>
<p>
    <a href="/missWorlds">Back list MissWorld</a>
</p>
<div class="view">
    <div class="img">
            <img src="${missWorld.getImage()}" alt="img">
            <p>Ảnh cá nhân</p>
    </div>
    <div class="information">
        <p>Trạng Thái: ${missWorld.getStatus()}</p>
        <p>Họ tên: ${missWorld.getName()}</p>
        <p>Ngày sinh: ${missWorld.getDob()}</p>
        <p>Địa chỉ cư trú: ${missWorld.getAddress()}</p>
        <p>Địa chỉ liên lạc:
            <p>Email: ${missWorld.getEmail()}</p>
            <p>Sdt: ${missWorld.getPhone()}</p>
        </p>
        <p>Số CMT/hộ chiếu: ${missWorld.getIdentityCard()}</p>
        <p>Nghề nghiệp: ${missWorld.getJob()}</p>
        <p>Trình độ văn hóa: ${missWorld.getEducationalLevel()}</p>
        <p>Dân tộc: ${missWorld.getNation()}</p>
        <p>Đơn vị công tác/học tập: ${missWorld.getWorkUnit()}</p>
        <p>Chiều cao, cân nặng:
            <p>Chiều cao: ${missWorld.getHeight()}</p>
            <p>Cân nặng: ${missWorld.getWeight()}</p>
        </p>
        <p>Năng khiếu khác: ${missWorld.getGifted()}</p>
        <p>Đại diện tỉnh thành: ${missWorld.getTinh()}</p>
    </div>
</div>
</body>
</html>
