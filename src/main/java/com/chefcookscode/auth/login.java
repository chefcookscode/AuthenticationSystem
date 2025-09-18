package com.chefcookscode.auth;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.RequestDispatcher;

@WebServlet("/login")
public class login extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException, IOException {

        String username = req.getParameter("username");
        String password = req.getParameter("password");

        if ("priyanshu".equals(username) && "123".equals(password)) {
            // Store username in request scope
            req.setAttribute("user", username);

            // Forward to profile servlet
            RequestDispatcher rd = req.getRequestDispatcher("profile");
            rd.forward(req, resp);
        } else {
            resp.setContentType("text/html");
            resp.getWriter().println("<h3 style='color:red;'>Invalid username or password</h3>");
            RequestDispatcher rd = req.getRequestDispatcher("index.html");
            rd.include(req, resp);
        }
    }
}
