package com.Db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnect {
	Connection c;
    Statement s;

    public DBConnect() {
        try {
            
            c = DriverManager.getConnection("jdbc:mysql:///enotes", "root", "raj@9676");
            s = c.createStatement();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
