package kroryi.pro06;

import java.io.*;
import java.util.Arrays;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "input", value = "/input")
public class InputServlet extends HttpServlet {

    public void init() {
        System.out.println("init");
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("utf-8");
//        String user_id = request.getParameter("user_id");
//        String user_pw = request.getParameter("user_pw");
//        System.out.println("아이디 :" + user_id);
//        System.out.printf("비밀번호 : %s", user_pw);

        String[] subjects = request.getParameterValues("subject");
        System.out.printf(Arrays.toString(request.getCookies()));
        for( String str : subjects){
            System.out.printf("선택한 과목 : %s", str);
        }
//        response.setContentType("text/html");

    }

    public void destroy() {
        System.out.println("desotry");
    }
}