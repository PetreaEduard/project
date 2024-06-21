package com.example.project;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response) throws ServletException, IOException {



        String username = request.getParameter("username");
        String password = request.getParameter("password");
        PrintWriter writer = response.getWriter();
        String htmlRespone = "<html>";
        htmlRespone += "<h2>Your username is: " + username + "</h2>";
        htmlRespone += "<h2>Your password is: " + password + "</h2>";
        htmlRespone += "</html>";

        writer.println(htmlRespone);
    }

}