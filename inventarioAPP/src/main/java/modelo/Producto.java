/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

/**
 *
 * @author Eslover
 */

@Table("productos")
public class Producto
{
    @Id
    @Column("Codigo")
    private int codigo;
    @Column("Nombre")
    private String nombre;
    @Column("Precio")
    private double precio;
    @Column("Inventario")
    private int inventario;

    public Producto()
    {
        
    }
    // este es un constructor para agregar un producto
    public Producto(String nombre, double precio, int inventario)
    {
        this.nombre = nombre;
        this.precio = precio;
        this.inventario = inventario;
    }
    // este constructor es para actualizar o eliminar un producto
    public Producto(int codigo, String nombre, double precio, int inventario)
    {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.inventario = inventario;
    }

    public int getCodigo()
    {
        return codigo;
    }

    public void setCodigo(int codigo)
    {
        this.codigo = codigo;
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
