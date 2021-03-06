package com.exercise;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Rafal on 2017-10-03.
 */
@WebServlet(name = "JSPServlet", value = "/")
public class HelloJSP extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = httpServletRequest.getRequestDispatcher("index.jsp");
        requestDispatcher.forward(httpServletRequest,httpServletResponse);
        httpServletResponse.getWriter()
    }
}
