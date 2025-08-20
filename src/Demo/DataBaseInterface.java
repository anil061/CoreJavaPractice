/*
package Demo;

import Java8.DataBase;

import static Demo.DbType.Oracle;

public class DataBaseInterface {
    public Object getDBinstance(DbType dbtype){
        switch(dbtype){
            case Oracle:
                return new OracleDB();
            case Dynamo:
                return new Dynamodb();
            case PostGress:
                return new postgress();
            default:
                throw new IllegalArgumentException("DB type not available");
        }
    }

    public static void main(String[] args) {
        Object dBinstance = getDBinstance(Oracle);
    }
}
*/
