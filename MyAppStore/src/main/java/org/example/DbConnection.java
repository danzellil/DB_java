package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public interface DbConnection {
    default Connection connect(){
        try{
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/products_db",
                    "postgres",
                    "admin"
            );

            System.out.println("Connection succesed");

            return connection;
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Connection failed :( try again!");

            return null;
        }
    }
    void select();
    void insert();
    void update();
    void delete();
}
