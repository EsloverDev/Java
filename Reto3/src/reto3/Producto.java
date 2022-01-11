/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reto3;

/**
 *
 * @author Eslover
 */
class Producto
{
    private int Codigo;
    private String nombre;
    private double precio;
    private int inventario;

    public Producto(int Codigo, String nombre, double precio, int inventario)
    {
        this.Codigo = Codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.inventario = inventario;
    }

    public Producto()
    {
        
    }

    public int getCodigo()
    {
        return Codigo;
    }

    public void setCodigo(int Codigo)
    {
        this.Codigo = Codigo;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public double getPrecio()
    {
        return precio;
    }

    public void setPrecio(double precio)
    {
        this.precio = precio;
    }

    public int getInventario()
    {
        return inventario;
    }

    public void setInventario(int inventario)
    {
        this.inventario = inventario;
    }
}
