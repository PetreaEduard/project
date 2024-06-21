package com.example.project;
import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Application;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.UriInfo;

import java.io.IOException;
import java.io.InputStream;

@ApplicationPath("/")
public class HelloApplication extends Application {
    @Context
    private UriInfo context;


    @GET
    @Produces(MediaType.TEXT_HTML)
    public InputStream getHtml() throws IOException {
        InputStream is = getClass().getResourceAsStream("/login.html");
        return is;


    }

}