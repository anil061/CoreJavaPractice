package DesignPatterns;

public class DBConnectionFactory {
    public static DBConnection getConnections(String dbType){
        if(dbType == null) return null;
        switch(dbType.toLowerCase()) {
            case "mysql" :
                return new MySQLConnection();
            case "postgressql" :
                return new PostgreSQLConnection();
            case "oracle" :
                return new OracleConnection();
            default:
                throw new IllegalArgumentException("Unknown DBType " + dbType);
        }
    }
}
