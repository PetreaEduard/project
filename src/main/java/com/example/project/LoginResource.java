package com.example.project;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.*;

import java.io.IOException;
import java.io.InputStream;

@Path("/login")
public class LoginResource {
    @Context
    private UriInfo context;

    @GET
    @Produces(MediaType.TEXT_HTML)
    public InputStream getHtml() throws IOException {
        return getClass().getResourceAsStream("/login.html");
    }
}