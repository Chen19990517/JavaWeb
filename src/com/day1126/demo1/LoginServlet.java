package com.day1126.demo1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

import static com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY;

/**
 * 作者：czw
 * 日期: 2020/11/26 10:12
 * 描述:
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        request.setCharacterEncoding("utf-8");

        String token = (String) request.getSession().getAttribute(KAPTCHA_SESSION_KEY);
        System.out.println("谷歌生成的验证码值："+token);
        String code = request.getParameter("code");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if (token!=null&&token.equalsIgnoreCase(code)){
            if ("admin".equals(username) && "123".equals(password)){
                User user = new User(username,password);
                HttpSession session = request.getSession();
                session.setAttribute("user" , user);
                response.sendRedirect("/comm/day1126/index01.jsp");
             }
        }else {
            response.getWriter().println("验证码输入错误！");
        }
    }
}
