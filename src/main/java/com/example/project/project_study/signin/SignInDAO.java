package com.example.project.project_study.signin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

@Repository
public class SignInDAO {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setDataSource(DataSource dataSource){
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public int createUser(SignInData signInData){
        String createUserQuery = "insert into user(name, id, password, email) values (?,?,?,?)";
        Object[] params = new Object[]{
                signInData.getName(),
                signInData.getId(),
                signInData.getPassword(),
                signInData.getEmail()
        };
        return this.jdbcTemplate.update(createUserQuery, params);
    }

}
