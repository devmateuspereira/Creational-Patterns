package br.com.cod3r.factory.database.after.factory;

import br.com.cod3r.factory.database.after.model.Database;
import br.com.cod3r.factory.database.after.model.PostgresDB;

public class PostgresFactory implements DatabaseFactory {

    @Override
    public Database getDatabase() {
        return new PostgresDB();
    }

}