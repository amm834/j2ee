package me.aungmyatmoe.servlet;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");

        var name = request.getParameter("name");

        request.setAttribute("name", name);
        request.getRequestDispatcher("/hello.jsp")
                .forward(request, response);
    }

    public void destroy() {
    }
}