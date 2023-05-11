package com.library.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {

    private static final String url = "jdbc:postgresql://localhost:5432/library";
    private static final String user = "postgres";
    private static final String password = "04071982";

    private static Connection connection;

    private ConnectionUtil() {
    }


    /**
     * singleton design pattern: Using static keyword
     *
     * @return sigleton object
     */
    public static Connection getConnection() {

        /**
         *  create object if it's not already created
         */
        if (connection == null) {
            connection = getConnection();
        }

        /**
         *  returns the singleton object
         */
        else {
            try {
                Class.forName("org.postgresql.Driver");
                connection = DriverManager.getConnection(url, user, password);
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }
}
