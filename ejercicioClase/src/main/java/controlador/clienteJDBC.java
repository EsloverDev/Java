/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Eslover
 */
public class clienteJDBC
{
    public String nombre;
    public String direccion;
    public int telefono;
    public String email;
    public Date nacimiento;
    public String genero;
    
    public void get(Connection connection, int idCliente) throws SQLException
    {
        String query = "SELECT * FROM cliente WHERE idCliente = ?";
        PreparedStatement ps = connection.prepareStatement(query);
        ps.setInt(1, idCliente);
        ResultSet rs = ps.executeQuery();
        
        while (rs.next())
        {            
          StringBuffer cliente = new StringBuffer();
          nombre = rs.getString("nombreCliente");
          direccion = rs.getString("direccionCliente");
          telefono = rs.getInt("telefonoCliente");
          email = rs.getString("emailCliente");
          nacimiento = rs.getDate("nacimientoCliente");
          genero = rs.getString("generoCliente");
          
          System.out.println(cliente);
        }
    }
    
    public void insertar(Connection connection, String nombreCliente, String direccionCliente, int telefonoCliente, String emailCliente, Date nacimientoCliente, String generoCliente) throws SQLException
    {
        String query = "INSERT INTO cliente VALUES(?,?,?,?,?,?)";
        PreparedStatement ps = connection.prepareStatement(query);
        ps.setString(1, nombreCliente);
        ps.setString(2, direccionCliente);
        ps.setInt(3, telefonoCliente);
        ps.setString(4, emailCliente);
        ps.setDate(5, nacimientoCliente);
        ps.setString(6, generoCliente);
        
        if(ps.executeUpdate()>0)
        {
            System.out.println("Fila agregada!");
        }
    }
    
    public void update(Connection connection, String nombreCliente, String direccionCliente, int telefonoCliente, String emailCliente, Date nacimientoCliente, String generoCliente, int idCliente) throws SQLException
    {
        String update ="UPDATE Fabrica SET Cantidad_Empleados = ?, Pais = ?, Gerente = ? WHERE Numero_Fabrica = ?";
        PreparedStatement ps = connection.prepareStatement(update);
        ps.setString(1, nombreCliente);
        ps.setString(2, direccionCliente);
        ps.setInt(3, telefonoCliente);
        ps.setString(4, emailCliente);
        ps.setDate(5, nacimientoCliente);
        ps.setString(6, generoCliente);
        ps.setInt(8, idCliente);
        
        if(ps.executeUpdate()>0)
        {
            System.out.println("Fila actualizada!");
        }
    }
    public void delete(Connection connection, int idCliente) throws SQLException
    {
        String delete ="DELETE FROM cliente WHERE idCliente = ?";
        PreparedStatement ps = connection.prepareStatement(delete);
        
        ps.setInt(1, idCliente);
        
        if(ps.executeUpdate()>0)
        {
            System.out.println("Fila borrada!");
        }
    }

}
