<%--
  Created by IntelliJ IDEA.
  User: MSII
  Date: 28/09/2020
  Time: 11:48 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create new MissWorld</title>
    <style>
        .message{
            color:green;
        }
        input{
            height: 2rem;
            width: 20rem;
        }
    </style>
</head>
<body>
<h1>Create new MissWorld</h1>
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
                <td>Họ tên </td>
                <td><input type="text" name="name" id="name"></td>
            </tr>
            <tr>
                <td> Ngày sinh: </td>
                <td><input type="text" name="birthday" id="birthday"></td>
            </tr>
            <tr>
                <td>Địa chỉ cư trú: </td>
                <td><input type="text" name="address" id="address"></td>
            </tr>
            <tr>
                <td>Địa chỉ liên lạc: </td>
                <td>
                    <p>Email</p>
                    <input type="text" name="email" id="email" placeholder="email">
                </td>
                <td>
                    <p>Phone</p>
                    <input type="text" name="phone" id="phone" placeholder="Phone">
                </td>
            </tr>
            <tr>
                <td>Số CMT/hộ chiếu </td>
                <td><input type="text" name="cmnd" id="cmnd"></td>
            </tr>
            <tr>
                <td>Nghề nghiệp: </td>
                <td><input type="text" name="job" id="job"></td>
            </tr>
            <tr>
                <td>Trình độ văn hóa: </td>
                <td><input type="text" name="vanhoa" id="vanhoa"></td>
            </tr>
            <tr>
                <td>Dân tộc: </td>
                <td><input type="text" name="dantoc" id="dantoc"></td>
            </tr>
            <tr>
                <td>Đơn vị công tác/học tập: </td>
                <td><input type="text" name="donvicongtac" id="dv"></td>
            </tr>
            <tr>
                <td>Chiều cao, cân nặng: </td>
                <td>
                    <p>Can nang</p>
                    <input type="text" name="cannang" id="weight" placeholder="Can nang">
                </td>
                <td>
                    <p>Chieu cao</p>
                    <input type="text" name="chieucao" id="height" placeholder="Chieu cao">
                </td>
            </tr>
            <tr>
                <td> Năng khiếu khác: </td>
                <td><input type="text" name="nangkhieu" id="nangkhieu"></td>
            </tr>
            <tr>
                <td> Ảnh cá nhân.: </td>
                <td><input type="text" name="img" id="img"></td>
            </tr>
            <tr>
                <td>
                    Dai dien tinh thanh:
                </td>
                <td>
                    <select name="tinh">
                        <c:forEach items="${myList}" var="list">
                            <option value="${list.getName()}">${list.getName()}</option>
                        </c:forEach>
                    </select>
                </td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Create MissWorld"></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
