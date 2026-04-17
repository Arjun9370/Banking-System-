package com.bank.dao;

import com.bank.util.DBconnection;
import java.sql.*;

public class DataBase {

    public void show() {
        System.out.println("welcome to the DataBase class");
    }

    public void getAccount(int accNo) {
        try {
            Connection con = DBconnection.getConnection();

            PreparedStatement ps = con.prepareStatement(
                "SELECT * FROM account WHERE accNo=?"
            );

            ps.setInt(1, accNo);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                System.out.println("Account No: " + rs.getInt("accNo"));
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Balance: " + rs.getDouble("balance"));
            } else {
                System.out.println("Account not found");
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deposit(int accNo, double amount) {
        try {
            Connection con = DBconnection.getConnection();

            PreparedStatement ps = con.prepareStatement(
                "UPDATE account SET balance = balance + ? WHERE accNo=?"
            );

            ps.setDouble(1, amount);
            ps.setInt(2, accNo);

            int rows = ps.executeUpdate();

            if (rows > 0)
                System.out.println("Deposit successful");
            else
                System.out.println("Account not found");

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    } // ✅ FIXED

    public void withdraw(int accNo, double amount) {
        try {
            Connection con = DBconnection.getConnection();

            PreparedStatement ps = con.prepareStatement(
                "UPDATE account SET balance = balance - ? WHERE accNo=?"
            );

            ps.setDouble(1, amount);
            ps.setInt(2, accNo);

            ps.executeUpdate();

            System.out.println("Withdraw successful");

            // System.out.println(balance);

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    public void checkBalance(int accNo) {
    try {
        Connection con = DBconnection.getConnection();

        PreparedStatement ps = con.prepareStatement(
            "SELECT balance FROM account WHERE accNo=?"
        );

        ps.setInt(1, accNo);

        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            double balance = rs.getDouble("balance");
            System.out.println("Available Balance: " + balance);
        } else {
            System.out.println("Account not found");
        }

        con.close();

    } catch (Exception e) {
        e.printStackTrace();
    }
}
}