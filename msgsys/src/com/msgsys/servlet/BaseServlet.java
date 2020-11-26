package com.msgsys.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 作者：czw
 * 日期: 2020/11/26 20:42
 * 描述:
 */
@WebServlet("/BaseServlet")
public abstract class BaseServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String action = request.getParameter("action");
        try {
            //获取action业务鉴别字符串 获取相应的业务 方法放射对象
            Method method = this.getClass().getDeclaredMethod(action, HttpServletRequest.class, HttpServletResponse.class);
            System.out.println("method = " + method);
            method.invoke(this, request, response);
        }catch (Exception e) {
            e.printStackTrace();
        }
        }
    }

