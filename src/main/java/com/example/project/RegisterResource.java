package com.example.project;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.UriInfo;

import java.io.IOException;
import java.io.InputStream;

@Path("/register")
public class RegisterResource {
    @Context
    private UriInfo context;


    @GET
    @Produces(MediaType.TEXT_HTML)
    public InputStream getHtml() throws IOException {
        return getClass().getResourceAsStream("/register.html");
    }
}
