<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<form name="frmLogin" method="get" action="/login" enctype="UTF-8">
    아이디 : <input type="text" name="user_id"><br>
    비밀번호 : <input type="password" name="user_pw">
    <input type="submit" value="로그인">
    <input type="reset" value="다시입력">
    <input type="submit" value="전송">
    <input type="reset" name="" id="초기화">
</form>
<ul>
    <li>
        <a href="/input.jsp">변수 여러개 입력 받기</a><br>
    </li>
    <li>
        <a href="/input-getParametrNames.jsp">파라미터 이름 출력</a><br>
    </li>
    <li>
        <a href="/login-respone.jsp">로그인 응답</a><br>
    </li>
    <li>
        <a href="/login-loginResponeGetPost.jsp">로그인 doGet doPost 응답</a><br>
    </li>
    <li>
        <a href="/login-ResponeGetPostScript.jsp">로그인 doGet doPost Script응답</a><br>
    </li>
    <li>
        <a href="/calc">환률 계산기</a>
    </li>
</ul>
</body>
</html>
