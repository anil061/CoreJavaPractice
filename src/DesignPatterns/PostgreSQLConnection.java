package DesignPatterns;

public class PostgreSQLConnection implements DBConnection{
    @Override
    public void connect() {
        System.out.println("Connecting to PostgreSQL database...");
    }
}
