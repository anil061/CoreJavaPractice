package Demo;

public class OracleDB implements Database{
    @Override
    public void connect() {
        System.out.println("connected to the OracleDb");
    }
}
