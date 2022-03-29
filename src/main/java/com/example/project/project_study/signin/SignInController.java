package com.example.project.project_study.signin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
public class SignInController {

    private final SignInService signInService;

    @Autowired
    public SignInController(SignInService signInService){
        this.signInService = signInService;
    }

    @GetMapping("/signin")
    public String signInPage(){
        return "signin";
    }

    @ResponseBody
    @PostMapping("/a")
    public String signIn(@RequestBody SignInData signInData){
        signInService.createUser(signInData);
        return "redirect:index";
    }

}
