package org.launchcode.spaday.models;

public class User {

    private static int nextId = 1001;

    private int id;

    private String username;
    private String email;
    private String password;

    public User() {
        this.id = nextId;
        nextId++;
    }

    public User(String username, String email, String password) {
        this();
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
