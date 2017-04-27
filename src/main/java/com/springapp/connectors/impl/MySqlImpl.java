package com.springapp.connectors.impl;

import com.springapp.connectors.ConnectionDB;
import com.springapp.connectors.singleton.MySqlConnect;
import com.springapp.login.User;

import java.sql.*;


public class MySqlImpl implements ConnectionDB {
    MySqlConnect mySqlConnect = new MySqlConnect();
    @Override
    public User getUserByMail(String mail) {

        mySqlConnect.connect();
        try {
            PreparedStatement preparedStatement1 = mySqlConnect.getConnection().prepareStatement("SELECT * FROM user_work WHERE project_id=?");
            preparedStatement1.setString(1,mail);
            ResultSet resultSet = preparedStatement1.executeQuery();
            if (resultSet.next()){
                return
            }
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
