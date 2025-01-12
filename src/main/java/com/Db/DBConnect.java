package com.Db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class DBConnect {
	private static Connection c;
    private static Statement s;

    public static Connection getConn(){
        try {
            
            c = DriverManager.getConnection("jdbc:mysql:///enotes", "root", "raj@9676");
            System.out.println("donne");
            s = c.createStatement();
            
        } catch (SQLException e) {
            System.out.println(e);
            System.out.println("notdone");
        }
        return c;
    }
}
