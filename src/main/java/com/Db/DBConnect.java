package com.Db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
    private static Connection c;

    public static Connection getConn() {
        try {
            if (c == null || c.isClosed()) { 
                c = DriverManager.getConnection("jdbc:mysql://localhost:3306/enotes", "root", "raj@9676");
                System.out.println("Connection established successfully!");
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Failed to establish connection.");
        }
        return c; 
    }
}
