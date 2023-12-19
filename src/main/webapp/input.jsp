<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<form name="frmLogin" method="get" action="/input" enctype="UTF-8">
    아이디 : <input type="text" name="user_id"><br>
    비밀번호 : <input type="password" name="user_pw"><br>
    <label>
        <input type="checkbox" name="subject" value="자바언어" checked>
    </label>자바언어
    <input type="checkbox" name="subject" value="C언어" >C언어
    <input type="checkbox" name="subject" value="JSP">JSP
    <input type="checkbox" name="subject" value="안드로이드">안드로이드
    <br><br>
    <input type="submit" value="전송">
    <input type="reset" name="" id="초기화">
</form>
</body>
</html>
