/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

/**
 *
 * @author Eslover
 */
import java.sql.*;

public class DbConection
{
    final static String user = "root";
    final static String pass = "Pruebas2020";
    final static String url = "jdbc:mysql://localhost:3306/fabrica"+"?serverTimezone=UTC"+"&useSSL=false";
    
    public static Connection getConnection() throws SQLException
    {
        return DriverManager.getConnection(url, user, pass);   
    }

}
