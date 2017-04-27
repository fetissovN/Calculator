package com.springapp.DB;


import com.mysql.fabric.jdbc.FabricMySQLDriver;

import java.sql.*;
import java.sql.Driver;


public class MySqlConnect {
    private final String url = "jdbc:mysql://localhost/Calculator?autoReconnect=true&useSSL=false";
    private final String userName = "root";
    private final String password = "root";
    Connection conn = null;
    Statement st = null;

    public void connect(){
        try {
            Driver driver = new FabricMySQLDriver();
            DriverManager.registerDriver(driver);
            conn = DriverManager.getConnection(url,userName,password);
            st = conn.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public Connection getConnection(){
        return conn;
    }

    public Statement getSt() {
        return st;
    }

}
