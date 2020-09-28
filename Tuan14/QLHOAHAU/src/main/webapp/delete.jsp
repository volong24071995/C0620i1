<%--
  Created by IntelliJ IDEA.
  User: MSII
  Date: 28/09/2020
  Time: 2:23 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete MissWorld</title>
    <style>
        .message{
            color:green;
        }
        img{
            height: 300px;
            width: 200px;
        }
        input{
            height: 2rem;
            width: 20rem;
        }
    </style>
</head>
<body>
<h1>Delete MissWorld</h1>
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
                <td> Ảnh cá nhân.: </td>
                <td>
                    <img src="${missWorld.getImage()}" alt="img">
                </td>
            </tr>
            <tr>
                <td>Họ tên </td>
                <td>
                    <input type="text" name="name" value="${requestScope["missWorld"].getName()}">
                </td>
            </tr>
            <tr>
                <td> Ngày sinh: </td>
                <td>
                    <input type="text" name="birthday" id="birthday" value="${requestScope["missWorld"].getDob()}" >
                </td>
            </tr>
            <tr>
                <td>Địa chỉ cư trú: </td>
                <td><input type="text" name="address" id="address" value="${requestScope["missWorld"].getAddress()}"></td>
            </tr>
            <tr>
                <td>Địa chỉ liên lạc: </td>
                <td>
                    <p>Email</p>
                    <input type="text" name="email" id="email" value="${requestScope["missWorld"].getEmail()}" placeholder="Email">
                </td>
                <td>
                    <p>Phone</p>
                    <input type="text" name="phone" id="phone" value="${requestScope["missWorld"].getPhone()}" placeholder="Phone">
                </td>
            </tr>
            <tr>
                <td>Số CMT/hộ chiếu </td>
                <td><input type="text" name="cmnd" id="cmnd" value="${requestScope["missWorld"].getIdentityCard()}"></td>
            </tr>
            <tr>
                <td>Nghề nghiệp: </td>
                <td><input type="text" name="job" id="job" value="${requestScope["missWorld"].getJob()}"></td>
            </tr>
            <tr>
                <td>Trình độ văn hóa: </td>
                <td><input type="text" name="vanhoa" id="vanhoa" value="${requestScope["missWorld"].getEducationalLevel()}"></td>
            </tr>
            <tr>
                <td>Dân tộc: </td>
                <td><input type="text" name="dantoc" id="dantoc" value="${requestScope["missWorld"].getNation()}"></td>
            </tr>
            <tr>
                <td>Đơn vị công tác/học tập: </td>
                <td><input type="text" name="donvicongtac" id="dv" value="${requestScope["missWorld"].getWorkUnit()}"></td>
            </tr>
            <tr>
                <td>Chiều cao, cân nặng: </td>
                <td>
                    <p>Can nang</p>
                    <input type="text" name="cannang" id="weight" value="${requestScope["missWorld"].getWeight()}" placeholder="Cân nặng">
                </td>
                <td>
                    <p>Chieu cao</p>
                    <input type="text" name="chieucao" id="height" value="${requestScope["missWorld"].getHeight()}" placeholder="Chiều cao">
                </td>
            </tr>
            <tr>
                <td> Năng khiếu khác: </td>
                <td><input type="text" name="nangkhieu" id="nangkhieu" value="${requestScope["missWorld"].getGifted()}"></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Delete MissWorld"></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
