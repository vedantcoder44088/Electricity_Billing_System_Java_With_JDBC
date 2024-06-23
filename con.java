package com.electricity.billing.system;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class con{

    static Connection c;
    static Statement s;

    public con(){
        // Load driver
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create connection
            String user = "root";  // Change this to your MySQL username
            String password = "Ved@44088";  // Change this to your MySQL password
            String url = "jdbc:mysql://localhost:3306/electricity";
            this.c = DriverManager.getConnection(url, user, password);
            this.s = c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
