package me.aungmyatmoe.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;


@WebServlet(name = "HomeController", value = "/")
public class HomeController extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        var session = request.getSession();

        session.setAttribute("token", "abcdefg123!");


        request.getRequestDispatcher("/home.jsp").forward(request, response);
    }
}
