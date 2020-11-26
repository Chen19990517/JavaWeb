package com.day1125;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 作者：czw
 * 日期: 2020/11/25 9:52
 * 描述:
 */
@WebServlet("/GetCookieServlet")
public class GetCookieServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie[] cookies = request.getCookies();
        for (Cookie cookie: cookies){
            response.getWriter().write("Cookie["+cookie.getName()+"="+cookie.getValue()+"]");
        }
        Cookie cookie = CookieUtils.findCookie("key1",cookies);
        if (cookie != null){
            response.getWriter().write(cookie.toString());
        }
    }
}
