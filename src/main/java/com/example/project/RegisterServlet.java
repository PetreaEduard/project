//package com.example.project;
//
//
//import com.example.project.entity.User;
//import jakarta.servlet.annotation.WebServlet;
//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.Persistence;
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.util.Objects;
//
//@WebServlet("/registerServlet")
//public class RegisterServlet extends HttpServlet {
//
//    protected void doPost(HttpServletRequest request,
//                          HttpServletResponse response) throws IOException {
//
//
//        String htmlRespone = "<html>";
//        String username = request.getParameter("username");
//        String password = request.getParameter("password");
//        String password2 = request.getParameter("password2");
//        String email = request.getParameter("email");
//        PrintWriter writer = response.getWriter();
//
//       // if (Objects.equals(password, password2)){
////
//       // } else htmlRespone += "Password does not match";
//
//
//        htmlRespone += "<h2>Your username is: " + username + "</h2>";
//        htmlRespone += "<h2>Your email is: " + email + "</h2>";
//        htmlRespone += "<h2>Your password is: " + password + "</h2>";
//        htmlRespone += "</html>";
//
//        writer.println(htmlRespone);
//    }}