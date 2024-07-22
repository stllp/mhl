package com.lp.mhl.utils;

import org.junit.Test;

import java.sql.Connection;
import java.sql.SQLException;

public class TestConnect {
    @Test
    public void connectTest() throws SQLException {
        Connection connection = null;
        long start = System.currentTimeMillis();
        for (int i = 0; i < 500000; i++) {
            connection = JdbcUtilesByDruid.getConnection();
            connection.close();
        }
        long end = System.currentTimeMillis();
        System.out.println("耗时="+(end - start));
    }
}
