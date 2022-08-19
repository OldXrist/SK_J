package com.javacodegeeks.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PostgreSqlExample {
    private static final String INSERT_NEW="INSERT INTO dish VALUES(?,?)";
    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgresql")) {

            System.out.println("Java JDBC PostgreSQL Example");


            System.out.println("Connected to PostgreSQL database!");
            Statement statement = connection.createStatement();
            System.out.println("Reading car records...");
            System.out.printf("%-30.30s  %-30.30s%n", "type_users", "role_users");
            ResultSet resultSet = statement.executeQuery("SELECT * FROM public.reg");

            while (resultSet.next()) {
                System.out.printf("%-30.30s  %-30.30s%n", resultSet.getString("type_users"), resultSet.getString("role_users"));
            }

        } catch (SQLException e) {
            System.out.println("Connection failure.");
            e.printStackTrace();
        }
    }
}