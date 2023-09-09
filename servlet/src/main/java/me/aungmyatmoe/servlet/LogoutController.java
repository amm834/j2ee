package me.aungmyatmoe.servlet;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "LogoutController", urlPatterns = "/logout")
public class LogoutController extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        var session = request.getSession();
        session.removeAttribute("token");
        session.invalidate();
        response.sendRedirect("/login");
    }
}
