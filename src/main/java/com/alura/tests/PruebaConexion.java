package com.alura.tests;

import java.sql.DriverManager;
import java.sql.SQLException;

public class PruebaConexion {
    public static void main(String[] args) throws SQLException {
        Connection con = DriverManager.getConnection(
                "jdbc.mysql://loclahost/control_de_stock?useTimeZone=true&serverTimeZone=UTC",
                "root",
                "root1234");

        con.close();
    }
}
