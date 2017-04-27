package com.springapp.DAO.impl;

import com.springapp.DAO.ConnectionDB;
import com.springapp.DB.MySqlConnect;
import com.springapp.login.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.*;

@Repository
public class MySqlImpl implements ConnectionDB {
    @Autowired
    MySqlConnect mySqlConnect;

    @Override
    public User getUserByMail(String mail) {

        mySqlConnect.connect();
        try {
            PreparedStatement preparedStatement1 = mySqlConnect.getConnection().prepareStatement("SELECT * FROM users WHERE email=?");
            preparedStatement1.setString(1,mail);
            ResultSet resultSet = preparedStatement1.executeQuery();
            if (resultSet.next()){
                User user = new User(resultSet.getString("name"),resultSet.getString("email"), resultSet.getString("password"));
                return user;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public User saveNewUser(User user) {

        mySqlConnect.connect();
        try {
            PreparedStatement preparedStatement = mySqlConnect.getConnection().prepareStatement("INSERT INTO users (name, email, password) VALUES (?,?,?)");
            preparedStatement.setString(1,user.getUsernameReg());
            preparedStatement.setString(2,user.getEmailReg());
            preparedStatement.setString(3,user.getPasswordReg());
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public User deleteUser() {
        return null;
    }

    @Override
    public boolean checkUserExists() {
        return false;
    }
}
