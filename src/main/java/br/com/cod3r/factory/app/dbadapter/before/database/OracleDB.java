package br.com.cod3r.factory.app.dbadapter.before.database;

public class OracleDB {

    public void query(String sql) {
        System.out.println("Querying " + sql + " in Oracle database");
    }

    public void update(String sql) {
        System.out.println("Update query " + sql + " in Oracle database");
    }

}