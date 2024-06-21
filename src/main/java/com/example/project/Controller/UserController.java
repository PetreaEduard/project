package com.example.project.Controller;

import com.example.project.Entity.Users;
import com.example.project.Service.UserService;
import jakarta.enterprise.context.RequestScoped;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("/users")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@RequestScoped
public class UserController {
    private final UserService userService;

    public UserController() {
        this.userService = new UserService();
    }

    @POST
    public Response createUser(Users user) {
        userService.save(user);
        return Response.status(Response.Status.CREATED).build();
    }

    @GET
    public List<Users> getAllUsers() {
        return userService.findAll();
    }
}