package com.example.project.project_study.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/signin")
    public String signInPage(){
        return "signin";
    }

    @ResponseBody
    @PostMapping("/a")
    public String signIn(@RequestBody User user){
        System.out.println("abcd");
        userService.createUser(user);
        return "redirect:index";
    }

}
