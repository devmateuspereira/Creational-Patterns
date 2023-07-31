package br.com.cod3r.factory.database.before.model;

public class OracleDB {

    public void query(String sql) {
        System.out.println("Querying " + sql + " in Oracle database");
    }

    public void update(String sql) {
        System.out.println("Update query " + sql + " in Oracle database");
    }

}