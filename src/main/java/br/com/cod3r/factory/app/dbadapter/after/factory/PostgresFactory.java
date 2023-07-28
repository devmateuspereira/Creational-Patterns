package main.java.br.com.cod3r.factory.app.dbadapter.after.factory;

import main.java.br.com.cod3r.factory.app.dbadapter.after.database.Database;
import main.java.br.com.cod3r.factory.app.dbadapter.after.database.PostgresDB;

public class PostgresFactory implements DatabaseFactory {

    @Override
    public Database getDatabase() {
        return new PostgresDB();
    }

}