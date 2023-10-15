package com.in28minutes.rest.webservices.restfulwebservices.helloWorld.controllers;

import com.in28minutes.rest.webservices.restfulwebservices.helloWorld.beans.HelloWorldBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping(path = "/hello-world-bean")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("Hello World Bean!");
    }

    // Path Parameters
    // /users/{id}/todos/{id} ==> /users/2/todos/201
    // /hello-world/path-variable/{name}
    // /hello-world/path-variable/Ranga

    @GetMapping(path = "/hello-world/path-variable/{name}")
    public HelloWorldBean helloWorldPathVariable(@PathVariable String name){
        return new HelloWorldBean(String.format("hello World, %s", name));
    }
}
