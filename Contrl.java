package com.klu.PropertyMS;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Contr {

    @Autowired
    private UserService userService;  

    @PostMapping("/insert")
    public String insertUser(@RequestBody User user) {
        return userService.insert(user);
    }

    @GetMapping("/home")
    public String home() {
        return "home";
    }
}
