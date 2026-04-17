package com.bank.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnection {

    public static Connection getConnection() {
        Connection conn = null;

        try {
            String url = "jdbc:mysql://localhost:3306/bankdb";
            String userName = "root";
            String password = "Pooja@9370";

            conn = DriverManager.getConnection(url, userName, password);

            System.out.println("Database Connected ✅");

        } catch (Exception e) {
            e.printStackTrace();
        }

        return conn;
    }
    public void show()
    {
        System.out.println("welcome ");
    }
}