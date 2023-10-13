package com.in28minutes.rest.webservices.restfulwebservices.helloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

// REST API
@RestController
public class HelloWorldController {


    // /hello-world  <-- when a user types this, into browser
    //"Hello World"   <-- this text should be returned
    @GetMapping(path = "/hello-world")
    public String helloWorld(){ // this is the helloWorld() method
        return "Hello World";
    }
}
