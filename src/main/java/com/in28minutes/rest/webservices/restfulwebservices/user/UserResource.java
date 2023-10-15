package com.in28minutes.rest.webservices.restfulwebservices.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserResource {
    private UserDAOService service;

    public UserResource(UserDAOService service){
        this.service = service;
    }

    // GET -> / users
    @GetMapping("/users")
    public List<User> retrieveAllUsers(){
        return service.findAll();
    }

    // GET -> users/1
    @GetMapping("users/{id}")
    public User retrieveUser(@PathVariable int id  ){
        return service.findOneUser(id);
    }

}
