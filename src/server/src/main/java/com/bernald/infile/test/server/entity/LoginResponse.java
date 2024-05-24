package com.bernald.infile.test.server.entity;

public class LoginResponse {
    private String token;

    private long expiresIn;

    private Integer id;

    public String getToken() {
        return token;
    }

    public LoginResponse setToken(String token) {
        this.token = token;
        return this;
    }

    public long getExpiresIn() {
        return expiresIn;
    }

    public LoginResponse setExpiresIn(long expiresIn) {
        this.expiresIn = expiresIn;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public LoginResponse setId(Integer id) {
        this.id = id;
        return this;
    }
}