package me.aungmyatmoe.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/dashboard")
public class DashboardController extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (request.getSession().getAttribute("token") == null) {
            response.sendRedirect("${pageContext.request.contextPath}");
            return;
        }

        request.getRequestDispatcher("/dashboard.jsp").forward(request, response);
    }
}
