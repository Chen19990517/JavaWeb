package com.day1125;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * 作者：czw
 * 日期: 2020/11/25 14:36
 * 描述:
 */
@WebServlet("/GoodsServlet")
public class GoodsServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String goodsName = request.getParameter("name");
        Cookie goodsNameCookie = CookieUtils.findCookie("goods", request.getCookies());
        if (goodsNameCookie == null) {
            Cookie cookie = new Cookie("goods", goodsName);
            cookie.setMaxAge(3 * 24 * 60 * 60);
            response.addCookie(cookie);
            response.sendRedirect("/goodsList.jsp");
            return;
        }
        String goods = goodsNameCookie.getValue();
        if (goods != null) {
            String[] arr = goods.split("&");
//            Set<String> goodsSet = new LinkedHashSet<>(Arrays.asList(arr));
//            goodsSet.add(goodsName);
//            goods = goodsSet.toString();
            goods = goods.substring(1, goods.length() - 1);
            goods = goods.replaceAll(", ", "&");
        } else {
            goods = goodsName;
        }
        Cookie cookie = new Cookie("goods", goods);
        cookie.setMaxAge(60*60);
        response.addCookie(cookie);
        response.sendRedirect("/goodsList.jsp");
    }
}
