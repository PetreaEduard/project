//package com.example.project;
//
//import com.example.project.entity.User;
//import com.example.project.Service.UserService;
//import jakarta.servlet.ServletContextEvent;
//import jakarta.servlet.ServletContextListener;
//import jakarta.servlet.annotation.WebListener;
//
//@WebListener
//public class UserInitializer implements ServletContextListener {
//
//    @Override
//    public void contextInitialized(ServletContextEvent sce) {
//        // Initialize the user
//        UserService userService = new UserService();
//
//        // Check if the user already exists to avoid duplicates
//        if (userService.findAll().isEmpty()) {
//            User user = new User("admin", "adminpassword", "email");
//            userService.save(user);
//        }
//    }
//
//    @Override
//    public void contextDestroyed(ServletContextEvent sce) {
//        // Perform cleanup if necessary
//    }
//}