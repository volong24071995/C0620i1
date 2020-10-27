<%--
  Created by IntelliJ IDEA.
  User: MSII
  Date: 22/10/2020
  Time: 3:09 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/uploadOneFile" method="POST" enctype="multipart/form-data">
<%--    <input type="text" name="name">--%>
<%--    <input type="file" name="fileUpdate">--%>
<%--    <button type="submit">Update</button>--%>

    <input type='file' accept='image/*' onchange='openFile(event)' name="fileUpdate" ><br>
    <img id='output' height="150px" width="100px">
    <button type="submit">Update</button>
    <script>
        var openFile = function(event) {
            var input = event.target;

            var reader = new FileReader();
            reader.onload = function(){
                var dataURL = reader.result;
                var output = document.getElementById('output');
                output.src = dataURL;
            };
            reader.readAsDataURL(input.files[0]);
        };
    </script>

</form>
</body>
</html>
