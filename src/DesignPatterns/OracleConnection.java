package DesignPatterns;

public class OracleConnection implements DBConnection{
    @Override
    public void connect() {
        System.out.println("Connecting to Oracle database...");
    }
}
