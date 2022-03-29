package com.example.project.project_study.signin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SignInService {
    private final SignInDAO signInDAO;

    @Autowired
    public SignInService(SignInDAO signInDAO){
        this.signInDAO = signInDAO;
    }

    public int createUser(SignInData signInData){
        return signInDAO.createUser(signInData);
    }
}
