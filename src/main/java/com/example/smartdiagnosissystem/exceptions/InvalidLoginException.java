package com.example.smartdiagnosissystem.exceptions;

public class InvalidLoginException {
    private  String email;
    private  String password;

    public InvalidLoginException(){
        this.email="Invalid Email";
      this.password="Invalid Password";
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
