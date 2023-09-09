package me.aungmyatmoe.servlet;

import java.io.*;
import java.util.ArrayList;

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

        var session = request.getSession();

        session.setAttribute("name", "Mg Mg");


        var products = new String[]{"iPhone", "iPad", "iMac"};
        request.setAttribute("products", products);


        var users = new ArrayList<User>();
        users.add(new User("Mg Mg", "1"));
        users.add(new User("Aung Aung", "2"));
        users.add(new User("Tun Tun", "3"));
        session.setAttribute("users", users);

        request.getRequestDispatcher("/hello.jsp")
                .forward(request, response);
    }

    public void destroy() {
    }
}