package com.example.project.project_study.signin;

import lombok.Data;
import lombok.NonNull;

@Data
public class SignInData {

    @NonNull
    private String name;

    @NonNull
    private String id;

    @NonNull
    private String password;

    @NonNull
    private String email;

    public SignInData(){}
}
