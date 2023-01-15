package com.example.overlapandroidstudio;


import java.time.LocalDateTime;

public class User {
    private int userId;
    private String userName;
    private static LocalDateTime accountAge;
    private String password;
    private String mail;

    public User() {}

    public User(String userName, String password, String mail) {
        this.userName = userName;
        this.password = password;
        this.mail = mail;
        this.accountAge= LocalDateTime.now();
    }

    public int getId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public static LocalDateTime getNow() {
        return accountAge;
    }

    public String getPassword() {
        return password;
    }

    public String getMail() {
        return mail;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
