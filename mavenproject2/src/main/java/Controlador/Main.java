/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

/**
 *
 * @author Equipo
 */
import java.sql.*;

public class Main
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException
    {
        try(Connection connection = DbConection.getConnection())
        {
            
            if(connection != null)
            {
                System.out.println("Conectado con la BD!");
            }
            FabricaJDBC.insertar(connection, 5, 3, "Afganistan", "Ali Ba Ba"); //insertamos datos.
            FabricaJDBC.getAll(connection, 2); //obtenemos todos los datos del id 2.
            FabricaJDBC.update(connection, 1, 40, "Argentina", "Leo Messi"); //actualizamos datos del id 1
            FabricaJDBC.delete(connection, 3); // borramos el id 3
            
            System.out.println("Programa finalizado");
        }
        catch (SQLException e)
        {
            System.err.print(e);
        }
        finally
        {

        }
    }
}
