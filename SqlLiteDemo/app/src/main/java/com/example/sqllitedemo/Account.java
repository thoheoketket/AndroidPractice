package com.example.sqllitedemo;

public class Account {
    int id;
    String username;
    String password;

    public Account(long id, String username, String password) {
        this.id = (int) id;
        this.username = username;
        this.password = password;
    }

    public Account() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = (int) id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
