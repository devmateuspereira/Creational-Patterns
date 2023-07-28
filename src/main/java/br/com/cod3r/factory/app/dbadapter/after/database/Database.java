package br.com.cod3r.factory.app.dbadapter.after.database;

public interface Database {

    void query(String sql);

    void update(String sql);

}