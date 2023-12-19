<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<form name="frmLoginGet" method="get" action="/loginResponeGetPost" enctype="UTF-8">
    아이디 : <input type="text" name="user_id"><br>
    비밀번호 : <input type="password" name="user_pw">
    <input type="submit" value="로그인">
    <input type="reset" value="다시입력">
</form>

<form name="frmLoginPost" method="Post" action="/loginResponeGetPost" enctype="UTF-8">
    아이디 : <input type="text" name="user_id"><br>
    비밀번호 : <input type="password" name="user_pw">
    <input type="submit" value="로그인">
    <input type="reset" value="다시입력">
</form>
</body>
</html>
