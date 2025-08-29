package dev.sbrenomartins.controller;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/users")
public class UserController {

    @GET
    public String hello() {
        return "Hello World!";
    }

}
