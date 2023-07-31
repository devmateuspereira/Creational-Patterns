package br.com.cod3r.factory.database.after.model;

public interface Database {

    void query(String sql);

    void update(String sql);

}