package com.gruszka.egrades.Model;

import java.util.ArrayList;

public class Teacher {

    private String login;
    private String password;
    public String name;
    public String surname;
    public ArrayList<Group> groups;


    public Teacher(String login, String password, String name, String surname) {
        this.login = login;
        this.password = password;
        this.name=name;
        this.surname=surname;
    }

    public Boolean validate(String login, String password)
    {
        if(this.login.equals(login) && this.password.equals(password)) {
            return true;
        }
        return false;
    }
}
