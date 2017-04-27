package com.springapp.DAO;


import com.springapp.login.User;

public interface ConnectionDB {
//    User getUser();

    User getUserByMail(String email);

    User saveNewUser(User user);

    User getUserById(int id);

    User deleteUser();

    boolean checkUserExists(String email);

    boolean checkUserIsReg(String email);

}
