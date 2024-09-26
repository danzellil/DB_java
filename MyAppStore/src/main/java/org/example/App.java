package org.example;

public class App {
    public static void main(String[] args) {
        DbConnectionimpl connectionimpl = new DbConnectionimpl();

        connectionimpl.connect();
        connectionimpl.select();
    }
}
