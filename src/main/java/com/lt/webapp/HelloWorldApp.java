package com.lt.webapp;

import com.lt.service.HelloWorldService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/hello")
public class HelloWorldApp {

    private static HelloWorldService helloWorldService = new HelloWorldService();

    @GET()
    public String hello() {
        return helloWorldService.sayHello();
    }
}
