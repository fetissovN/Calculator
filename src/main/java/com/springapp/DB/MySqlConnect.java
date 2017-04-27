package com.springapp.DB;


import com.mysql.fabric.jdbc.FabricMySQLDriver;
import org.springframework.stereotype.Component;

import java.sql.*;
import java.sql.Driver;

@Component
public class MySqlConnect {
    private final String url = "jdbc:mysql://localhost/calc?autoReconnect=true&useSSL=false";
    private final String userName = "root";
    private final String password = "root";
    Connection conn = null;
    Statement st = null;

    public void connect(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Driver driver = new FabricMySQLDriver();
            DriverManager.registerDriver(driver);
            conn = DriverManager.getConnection(url,userName,password);
            st = conn.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
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
