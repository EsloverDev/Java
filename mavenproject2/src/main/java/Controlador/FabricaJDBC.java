/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.sql.*;

/**
 *
 * @author Eslover
 */

public class FabricaJDBC
{
    public void get(Connection connection, Integer Numero_Fabrica) throws SQLException
    {
        String query = "SELECT * FROM Fabrica WHERE numero_fabrica = ?";
        PreparedStatement ps = connection.prepareStatement(query);
        ps.setInt(1, Numero_Fabrica);
        ResultSet rs = ps.executeQuery();
        
        while (rs.next())
        {            
          StringBuffer fabrica = new StringBuffer();
          fabrica.append("Numero Fabrica: " + rs.getInt("numero_fabrica"));
          fabrica.append("Numero empleados: " + rs.getInt("cantidad_empleados"));
          fabrica.append("Pais: " + rs.getString("pais"));
          fabrica.append("Gerente: " + rs.getString("gerente"));
          System.out.println(fabrica);
        }
    }
    
    public static void getAll(Connection connection, Integer Numero_Fabrica) throws SQLException
    {
        String query = "SELECT * FROM Fabrica";
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery(query);
        
        while (rs.next())
        {            
          StringBuffer fabrica = new StringBuffer();
          fabrica.append("Numero Fabrica: " + rs.getInt("numero_fabrica"));
          fabrica.append("Numero empleados: " + rs.getInt("cantidad_empleados"));
          fabrica.append("Pais: " + rs.getString("pais"));
          fabrica.append("Gerente: " + rs.getString("gerente"));
          System.out.println(fabrica);
        }
    }
    
    public static void insertar(Connection connection, int Numero_Fabrica, int Cantidad_Empleados, String Pais, String Gerente) throws SQLException
    {
        String query = "INSERT INTO Fabrica VALUES(?,?,?,?)";
        PreparedStatement ps = connection.prepareStatement(query);
        ps.setInt(1, Numero_Fabrica);
        ps.setInt(2, Cantidad_Empleados);
        ps.setString(3, Pais);
        ps.setString(4, Gerente);
        
        if(ps.executeUpdate()>0)
        {
            System.out.println("Fila agregada!");
        }
    }
    
    public static void update(Connection connection, int Numero_Fabrica, int Cantidad_Empleados, String Pais, String Gerente) throws SQLException
    {
        String update ="UPDATE Fabrica SET Cantidad_Empleados = ?, Pais = ?, Gerente = ? WHERE Numero_Fabrica = ?";
        PreparedStatement ps = connection.prepareStatement(update);
        ps.setInt(1, Cantidad_Empleados);
        ps.setString(2, Pais);
        ps.setString(3, Gerente);
        ps.setInt(4, Numero_Fabrica);
        
        if(ps.executeUpdate()>0)
        {
            System.out.println("Fila actualizada!");
        }
    }
    public static void delete(Connection connection, int Numero_Fabrica) throws SQLException
    {
        String delete ="DELETE FROM Fabrica WHERE Numero_Fabrica = ?";
        PreparedStatement ps = connection.prepareStatement(delete);
        
        ps.setInt(1, Numero_Fabrica);
        
        if(ps.executeUpdate()>0)
        {
            System.out.println("Fila borrada!");
        }
    }
}
