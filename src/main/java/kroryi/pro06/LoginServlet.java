package kroryi.pro06;

import java.io.*;
import java.rmi.ServerException;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "login", value = "/login")
public class LoginServlet extends HttpServlet {

    public void init() {
        System.out.println("init 호출");
    }

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        req.setCharacterEncoding("utf-8");
        String user_id = req.getParameter("user_id");
        String user_pw = req.getParameter("user_pw");
        System.out.println("아이디 :" + user_id);
        System.out.printf("비밀번호 : %s", user_pw);
        res.setContentType("text/html");

    }

    public void destroy() {
        System.out.println("destory 호출");
    }
}

