package com.springapp.DAO;


import com.springapp.login.User;

public interface ConnectionDB {
//    User getUser();

    User getUserByMail(String email);

    User saveNewUser(User user);

    User deleteUser();
    boolean checkUserExists();

}
