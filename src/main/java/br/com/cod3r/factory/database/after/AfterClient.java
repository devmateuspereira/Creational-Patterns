package br.com.cod3r.factory.database.after;

import br.com.cod3r.factory.database.after.model.Database;
import br.com.cod3r.factory.database.after.factory.OracleFactory;
import br.com.cod3r.factory.database.after.factory.PostgresFactory;

public class AfterClient {

    public static void main(String[] args) {
        Database oracle = new OracleFactory().getDatabase();
        System.out.println("");
        oracle.query("SELECT * FROM users");
        System.out.println("");
        oracle.update("INSERT INTO users VALUES ('User', 25)");

        Database postgre = new PostgresFactory().getDatabase();
        System.out.println("");
        postgre.query("SELECT * FROM books");
        System.out.println("");
        postgre.update("INSERT INTO books VALUES ('Book', 12)");
    }

}