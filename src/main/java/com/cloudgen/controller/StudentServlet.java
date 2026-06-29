package com.cloudgen.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/students")
public class StudentServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        response.getWriter().println("<h2>College Management System</h2>");
        response.getWriter().println("<h3>Student List</h3>");
        response.getWriter().println("<ul>");
        response.getWriter().println("<li>Ravi - B.Tech</li>");
        response.getWriter().println("<li>Anitha - MBA</li>");
        response.getWriter().println("<li>Rahul - MCA</li>");
        response.getWriter().println("</ul>");
    }
}