package com.crimedata.utils;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class QueryExecutor {

    // Method to execute SELECT queries and return the result set
    public static ResultSet executeSelectQuery(String query, Object[] params) {
        try (Connection connection = DatabaseUtil.getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {

            // Set the parameters for the query
            if (params != null) {
                for (int i = 0; i < params.length; i++) {
                    statement.setObject(i + 1, params[i]);
                }
            }

            return statement.executeQuery();  // Return ResultSet

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    // Method to execute INSERT, UPDATE, DELETE queries
    public static int executeUpdateQuery(String query, Object[] params) {
        try (Connection connection = DatabaseUtil.getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {

            // Set the parameters for the query
            if (params != null) {
                for (int i = 0; i < params.length; i++) {
                    statement.setObject(i + 1, params[i]);
                }
            }

            return statement.executeUpdate();  // Return the number of rows affected

        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }
}
