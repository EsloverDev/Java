/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Date;

/**
 *
 * @author Equipo
 */
public class cliente
{
    int idCliente;
    String nombreCliente;
    String direccionCliente;
    int telefonoCliente;
    String emailCliente;
    Date nacimientoCliente;
    String generoCliente;

    public cliente()
    {
        
    }

    public cliente(int idCliente, String nombreCliente, String direccionCliente, int telefonoCliente, String emailCliente, Date nacimientoCliente, String generoCliente)
    {
        this.idCliente = idCliente;
        this.nombreCliente = nombreCliente;
        this.direccionCliente = direccionCliente;
        this.telefonoCliente = telefonoCliente;
        this.emailCliente = emailCliente;
        this.nacimientoCliente = nacimientoCliente;
        this.generoCliente = generoCliente;
    }

    public int getIdCliente()
    {
        return idCliente;
    }

    public void setIdCliente(int idCliente)
    {
        this.idCliente = idCliente;
    }

    public String getNombreCliente()
    {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente)
    {
        this.nombreCliente = nombreCliente;
    }

    public String getDireccionCliente()
    {
        return direccionCliente;
    }

    public void setDireccionCliente(String direccionCliente)
    {
        this.direccionCliente = direccionCliente;
    }

    public int getTelefonoCliente()
    {
        return telefonoCliente;
    }

    public void setTelefonoCliente(int telefonoCliente)
    {
        this.telefonoCliente = telefonoCliente;
    }

    public String getEmailCliente()
    {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente)
    {
        this.emailCliente = emailCliente;
    }

    public Date getNacimientoCliente()
    {
        return nacimientoCliente;
    }

    public void setNacimientoCliente(Date nacimientoCliente)
    {
        this.nacimientoCliente = nacimientoCliente;
    }

    public String getGeneroCliente()
    {
        return generoCliente;
    }

    public void setGeneroCliente(String generoCliente)
    {
        this.generoCliente = generoCliente;
    }

    @Override
    public String toString()
    {
        return "cliente{" + "idCliente=" + idCliente + ", nombreCliente=" + nombreCliente + ", direccionCliente=" + direccionCliente + ", telefonoCliente=" + telefonoCliente + ", emailCliente=" + emailCliente + ", nacimientoCliente=" + nacimientoCliente + ", generoCliente=" + generoCliente + '}';
    }
    
}
