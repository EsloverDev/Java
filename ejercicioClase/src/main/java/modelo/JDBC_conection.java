/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.DriverManager;
import java.sql.*;

/**
 *
 * @author Eslover
 */
public class JDBC_conection
{
    final static String user = "root";
    final static String pass = "angie0519*";
    final static String url = "jdbc:mysql://localhost:3306/Clientes"+"?serverTimeZone = UTC"+"&useSSL=false";
    
    public static Connection getConection() throws SQLException
    {
        return DriverManager.getConnection(url, user, pass);
    }
}
