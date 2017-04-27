package com.springapp.login;

public class User {
    private String usernameReg;
    private String emailReg;
    private String passwordReg;
    private String passwordRegCheck;



    public User() {
    }

    public User(String usernameReg, String emailReg, String passwordReg) {
        this.usernameReg = usernameReg;
        this.emailReg = emailReg;
        this.passwordReg = passwordReg;
    }

    public String getPasswordRegCheck() {
        return passwordRegCheck;
    }

    public void setPasswordRegCheck(String passwordRegCheck) {
        this.passwordRegCheck = passwordRegCheck;
    }

    public String getUsernameReg() {
        return usernameReg;
    }

    public void setUsernameReg(String usernameReg) {
        this.usernameReg = usernameReg;
    }

    public String getEmailReg() {
        return emailReg;
    }

    public void setEmailReg(String emailReg) {
        this.emailReg = emailReg;
    }

    public String getPasswordReg() {
        return passwordReg;
    }

    public void setPasswordReg(String passwordReg) {
        this.passwordReg = passwordReg;
    }
}
