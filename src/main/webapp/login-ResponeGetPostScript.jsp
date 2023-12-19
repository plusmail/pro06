<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<script>
    function fn_validate(){
        let frmLogin = document.frmLogin;
        let user_id = frmLogin.user_id.value;
        let user_pw = frmLogin.user_pw.value;
        if((user_id.length == 0  || user_id == "") ||
            (user_pw.length == 0 || user_pw == "")){
            alert("아이디와 비밀번호는 필수 입니다.")
        }else{
            frmLogin.method ="post";
            frmLogin.action = "/loginResponeGetPostScript";
            frmLogin.submit();
        }
    }
</script>
<body>
<form name="frmLogin" method="post" enctype="UTF-8">
    아이디 : <input type="text" name="user_id"><br>
    비밀번호 : <input type="password" name="user_pw">
    <input type="hidden" name="user_address" value="대구광역시 서구">
    <input type="button" onClick = "fn_validate()" value="로그인">
    <input type="reset" value="다시입력">
</form>

</body>
</html>
