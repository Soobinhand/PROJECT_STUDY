package com.example.project.project_study.signin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Domain {

    @GetMapping("/")
    public String projectStudy(){
        return "index";
    }

}
