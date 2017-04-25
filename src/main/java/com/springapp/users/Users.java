package com.springapp.users;

import com.springapp.login.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;


@Component
public class Users {

    private ArrayList<User> users;

    public Users() {
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    public void addUser(User user){
        users.add(user);
    }
}
