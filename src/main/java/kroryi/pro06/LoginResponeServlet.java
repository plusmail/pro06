package kroryi.pro06;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "loginRespone", value = "/loginRespone")
public class LoginResponeServlet extends HttpServlet {

    public void init() {
        System.out.println("init 호출");
    }

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        req.setCharacterEncoding("utf-8");
        res.setContentType("text/html;charset=utf-8");


        PrintWriter out = res.getWriter();
        String user_id = req.getParameter("user_id");
        String user_pw = req.getParameter("user_pw");

        System.out.println("아이디 :" + user_id);
        System.out.printf("비밀번호 : %s", user_pw);

        String data = "<html>";
        data +="<body>";
        data +="아이디 : " + user_id + "<br>";

        data +="비밀번호 : " + user_pw + "<br>";
        data +="</body>";
        data +="</html>";

        out.print(data);


    }

    public void destroy() {
        System.out.println("destory 호출");
    }
}

