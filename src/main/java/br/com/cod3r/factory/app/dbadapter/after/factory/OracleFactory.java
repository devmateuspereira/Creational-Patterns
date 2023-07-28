package main.java.br.com.cod3r.factory.app.dbadapter.after.factory;

import main.java.br.com.cod3r.factory.app.dbadapter.after.database.Database;
import main.java.br.com.cod3r.factory.app.dbadapter.after.database.OracleDB;

public class OracleFactory implements DatabaseFactory {

    @Override
    public Database getDatabase() {
        return new OracleDB();
    }

}