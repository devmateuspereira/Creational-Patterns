package br.com.cod3r.factory.app.dbadapter.before;

import br.com.cod3r.factory.app.dbadapter.before.database.OracleDB;

public class BeforeClient {

    public static void main(String[] args) {
        OracleDB database = new OracleDB();
        System.out.println("");
        database.query("SELECT * FROM users");
        System.out.println("");
        database.update("INSERT INTO users VALUES ('User', 25)");
    }

}