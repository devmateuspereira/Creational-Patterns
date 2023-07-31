package br.com.cod3r.factory.database.before;

import br.com.cod3r.factory.database.before.model.OracleDB;

public class BeforeClient {

    public static void main(String[] args) {
        OracleDB database = new OracleDB();
        System.out.println("");
        database.query("SELECT * FROM users");
        System.out.println("");
        database.update("INSERT INTO users VALUES ('User', 25)");
    }

}