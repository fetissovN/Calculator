package com.springapp.DAO;


import com.springapp.login.User;

public interface ConnectionDB {
//    User getUser();

    User getUserByMail(String email);

    User saveNewUser(String email);

    User deleteUser();
    boolean checkUserExists();

}
