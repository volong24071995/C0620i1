<%--
  Created by IntelliJ IDEA.
  User: MSII
  Date: 28/09/2020
  Time: 1:53 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit MissWorld</title>
    <style>
        .message{
            color:green;
        }
        input{
            height: 2rem;
            width: 20rem;
        }
        img{
            height: 300px;
            width: 200px;
        }
    </style>
</head>
<body>
<h1>Edit MissWorld</h1>
<p>
    <c:if test='${requestScope["message"] != null}'>
        <span class="message">${requestScope["message"]}</span>
    </c:if>
</p>
<p>
    <a href="/missWorlds">Back to MissWorld list</a>
</p>
<form method="post">
    <fieldset>
        <legend>MissWorld information</legend>
        <table>
            <tr>
                <td> Ảnh cá nhân: </td>
                <td><img src="${requestScope["missWorld"].getImage()}"></td>
            </tr>
            <tr>
                <td>Họ tên </td>
                <td>
                    <input type="text" name="name" value="${requestScope["missWorld"].getName()}" required>
                </td>
            </tr>
            <tr>
                <td> Ngày sinh: </td>
                <td>
                    <input name="birthday" type="text" value="${requestScope["missWorld"].getDob()}" required >
                </td>
            </tr>
            <tr>
                <td>Địa chỉ cư trú: </td>
                <td><input type="text" name="address" id="address" value="${requestScope["missWorld"].getAddress()}" required></td>
            </tr>
            <tr>
                <td>Địa chỉ liên lạc: </td>
                <td>
                    <p>Email</p>
                    <input type="text" name="email" id="email" value="${requestScope["missWorld"].getEmail()}" placeholder="Email" required>
                </td>
                <td>
                    <p>Phone</p>
                    <input type="text" name="phone" id="phone" value="${requestScope["missWorld"].getPhone()}" placeholder="Phone" required>
                </td>
            </tr>
            <tr>
                <td>Số CMT/hộ chiếu </td>
                <td><input type="text" name="cmnd" id="cmnd" value="${requestScope["missWorld"].getIdentityCard()}" required></td>
            </tr>
            <tr>
                <td>Nghề nghiệp: </td>
                <td><input type="text" name="job" id="job" value="${requestScope["missWorld"].getJob()}" required></td>
            </tr>
            <tr>
                <td>Trình độ văn hóa: </td>
                <td><input type="text" name="vanhoa" id="vanhoa" value="${requestScope["missWorld"].getEducationalLevel()}" required></td>
            </tr>
            <tr>
                <td>Dân tộc: </td>
                <td><input type="text" name="dantoc" id="dantoc" value="${requestScope["missWorld"].getNation()}" required></td>
            </tr>
            <tr>
                <td>Đơn vị công tác/học tập: </td>
                <td><input type="text" name="donvicongtac" id="dv" value="${requestScope["missWorld"].getWorkUnit()}" required></td>
            </tr>
            <tr>
                <td>Chiều cao, cân nặng: </td>
                <td>
                    <p>Cân nặng</p>
                    <input type="text" name="cannang" id="weight" value="${requestScope["missWorld"].getWeight()}" placeholder="Cân nặng" required>
                </td>
                <td>
                    <p>Chiều cao</p>
                    <input type="text" name="chieucao" id="height" value="${requestScope["missWorld"].getHeight()}" placeholder="Chiều cao" required>
                </td>
            </tr>
            <tr>
                <td> Năng khiếu khác: </td>
                <td><input type="text" name="nangkhieu" id="nangkhieu" value="${requestScope["missWorld"].getGifted()}" required></td>
            </tr>
            <tr>
                <td> Đại diện tỉnh thành: </td>
                <td>
                    <select name="tinh">
                        <option value="${requestScope["missWorld"].getTinh()}">${requestScope["missWorld"].getTinh()}</option>
                    <c:forEach items="${myList}" var="list">
                        <option value="${list.getName()}">${list.getName()}</option>
                    </c:forEach>
                    </select>
                </td>
            </tr>
            <tr>
                <td> Ảnh cá nhân: </td>
                <td><input type="text" name="img" id="img" value="${requestScope["missWorld"].getImage()}"></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Update MissWorld"></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
