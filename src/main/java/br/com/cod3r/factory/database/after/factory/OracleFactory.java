package br.com.cod3r.factory.database.after.factory;

import br.com.cod3r.factory.database.after.model.Database;
import br.com.cod3r.factory.database.after.model.OracleDB;

public class OracleFactory implements DatabaseFactory {

    @Override
    public Database getDatabase() {
        return new OracleDB();
    }

}