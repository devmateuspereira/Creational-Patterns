package br.com.cod3r.singleton.after;

import br.com.cod3r.singleton.after.connection.Connection;
import br.com.cod3r.singleton.after.connection.ConnectionPool;

public class Client {

    public static void doQuery1() {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection conn = pool.getConnection();
        if (conn != null)
            conn.query("SELECT * FROM A1");
    }

    public static void doQuery2() {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection conn = pool.getConnection();
        if (conn != null)
            conn.query("SELECT * FROM A2");
    }

    public static void doQuery3() {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection conn = pool.getConnection();
        if (conn != null)
            conn.query("SELECT * FROM A3");
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Connection Pool Size: " + ConnectionPool.POOL_SIZE);
        doQuery1();
        doQuery2();
        doQuery3();
    }

}