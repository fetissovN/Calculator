package com.springapp.connectors;


import com.springapp.login.User;

public interface ConnectionDB {
//    User getUser();

    User getUserByMail(String email);

    User deleteUser();
    boolean checkUserExists();

}
