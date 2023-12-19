package kroryi.pro06;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "loginResponeGetPostScript", value = "/loginResponeGetPostScript")
public class LoginResponeGetPostScriptServlet extends HttpServlet {

    public void init() {
        System.out.println("init 호출");
    }

//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
////        super.doGet(req, resp); //사용하면 안됨.
//        System.out.println("doGet호출");
//        doHandle(req, resp);
//    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doPost(req, resp); //사용하면 안됨.
        System.out.println("doPost호출");
        doHandle(req, resp);
    }


    private void doHandle(HttpServletRequest req, HttpServletResponse res) throws IOException {
        req.setCharacterEncoding("utf-8");
        String user_id = req.getParameter("user_id");
        String user_pw = req.getParameter("user_pw");
        String user_address = req.getParameter("user_address");


        System.out.println("아이디 :" + user_id);
        System.out.printf("비밀번호 : %s", user_pw);
        System.out.printf("주소 : %s", user_address);

        res.setContentType("text/html;charset=utf-8");
        PrintWriter out = res.getWriter();

        String data = "<html>";
        data +="<body>";
        data +="아이디 확인3: " + user_id + "<br>";

        data +="비밀번호 확인4: " + user_pw + "<br>";
        data +="주소 확인1: " + user_address + "<br>";
        data +="</body>";
        data +="</html>";

        out.print(data);

    }

    public void destroy() {
        System.out.println("destory 호출");
    }
}

