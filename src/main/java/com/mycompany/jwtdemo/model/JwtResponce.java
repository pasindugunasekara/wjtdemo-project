package com.mycompany.jwtdemo.model;

public class JwtResponce {

    private String token;

    public JwtResponce() {
    }

    public JwtResponce(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
