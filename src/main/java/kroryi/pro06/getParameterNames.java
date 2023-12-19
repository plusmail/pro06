package kroryi.pro06;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Enumeration;

@WebServlet(name = "getParameterNames", value = "/getParameterNames")
public class getParameterNames extends HttpServlet {

    public void init() {
        System.out.println("init");
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("utf-8");
        Enumeration<String> enu = request.getParameterNames();
        while (enu.hasMoreElements()){
            String name = enu.nextElement();
            String[] values = request.getParameterValues(name);
            for(String value: values){
                System.out.printf("name=%s value=%s", name, value);
            }
            System.out.println();

        }
    }

    public void destroy() {
        System.out.println("desotry");
    }
}