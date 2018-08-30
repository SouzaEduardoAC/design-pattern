package br.com.souzaeduardoac.designpattern.objectpool;

import java.sql.Connection;

public class Run {
    public static void main(String[] args) {
        // Do something

            // Create the connection pool
        JDBCConnectionPool pool = new JDBCConnectionPool(
                "org.hsqldb.jdbcDriver",
                "jdbc:hsqldb://localhost/mydb",
                "sa",
                "secret");

        // Get a connection
        Connection con = pool.checkOut();

        // Use the connection



        // Return the connection
        pool.checkIn(con);
    }
}
