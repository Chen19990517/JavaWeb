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
 * 日期: 2020/11/25 9:32
 * 描述:
 */
@WebServlet("/CookieServlet")
public class CookieServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie cookie = new Cookie("key1","value1");
        response.addCookie(cookie);
        response.getWriter().write("Cookie创建成功！！！");
    }
}
