package com.day1125;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 作者：czw
 * 日期: 2020/11/25 11:09
 * 描述:
 */
@WebServlet("/Demo01Servlet")
public class Demo01Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().append("Served at: ").append(request.getContextPath());
        Cookie[] cookie1 = request.getCookies();
        Cookie cookie2 = null;
        String ip = request.getRemoteAddr();
        for (int i = 0; cookie1 != null && i < cookie1.length; i++) {
            if ("IP".equals(cookie1[i].getName())) {
                ip = cookie1[i].getValue();
                break;
            }
        }
            if (ip == null) {
                String IPS = cookie2.getName();
                response.getWriter().println("您使用的IP地址是" + IPS);
            } else {
                response.getWriter().println("您使用的IP地址是" + ip);
            }
            Cookie cookie = new Cookie("IP",request.getRemoteAddr());
            cookie.setMaxAge(30);
            response.addCookie(cookie);



        String lastVistiTime = null;
        // 获取Cooikes
        Cookie[] cookies = request.getCookies();
        // 判断cookies是否符合条件
        for (int i = 0; cookies != null && i < cookies.length; i++) {
            if ("lastVisit".equals(cookies[i].getName())) {
                lastVistiTime = cookies[i].getValue();
                break;
            }
        }
        // 判断是否为初次访问
        if (lastVistiTime == null) {
            response.getWriter().println("欢迎,这是您第一次访问本网站。");
        } else {
            response.getWriter().println("欢迎，您上次访问的时间为：" + lastVistiTime);
        }
        // 设置本次访问的时间
        Cookie cookie3 = new Cookie("lastVisit", new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss").format(new Date()));
        // Cookie存活时间30s
        cookie3.setMaxAge(30);
        response.addCookie(cookie3);


    }
}
