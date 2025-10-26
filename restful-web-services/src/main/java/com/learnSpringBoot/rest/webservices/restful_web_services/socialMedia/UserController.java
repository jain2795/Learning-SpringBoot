package com.learnSpringBoot.rest.webservices.restful_web_services.socialMedia;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    private UserDaoService userDaoService;

    public UserController(UserDaoService service) {
        this.userDaoService = service;
    }

    @GetMapping(path = "/users")
    public List<User> getUsers() {
        return userDaoService.getAllUsers();
    }

    @GetMapping(path = "/users/{id}")
    public User getUser(@PathVariable Integer id) {
        return userDaoService.getUserById(id);
    }
}
