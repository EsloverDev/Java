/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Plattform;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Eslover
 */
class Reto3 
{
    public static void main(String[] args)
    {
        Scanner t = new Scanner(System.in);
        String op = t.nextLine();
        String[] dat = t.nextLine().split(" ");
    
        int codigoI = Integer.parseInt(dat[0]);
        String nombreI = dat[1];
        double precioI = Double.parseDouble(dat[2]);
        int inventarioI = Integer.parseInt(dat[3]);
        Producto pro = new Producto(codigoI, nombreI, precioI, inventarioI);
        BaseDatosProductos bdpro = new BaseDatosProductos();
        
        switch(op)
        {
            case "AGREGAR":
                if(bdpro.verificarProducto(pro))
                {
                    System.out.println("ERROR");
                }
                else
                {
                    bdpro.Agregar(pro);
                    System.out.println(bdpro.generarInfo());
                }
                break;
            case "ACTUALIZAR":
                if(bdpro.verificarProducto(pro))
                {
                    bdpro.Actualizar(pro);
                    System.out.println(bdpro.generarInfo());
                }
                else
                {
                    System.out.println("ERROR");
                }
                break;
            case "BORRAR":
                if(bdpro.verificarProducto(pro))
                {
                    bdpro.Eliminar(pro);
                    System.out.println(bdpro.generarInfo());
                }
                else
                {
                    System.out.println("ERROR");
                }
        }
    }
    
}

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

class BaseDatosProductos
{
    private HashMap<Integer,Producto> listaProductos = new HashMap<Integer, Producto>();

    public BaseDatosProductos()
    {
        listaProductos.put(1, new Producto(1, "Manzanas", 8000, 65));
        listaProductos.put(2, new Producto(2, "Limones", 2300, 15));
        listaProductos.put(3, new Producto(3, "Granadilla", 2500, 38));
        listaProductos.put(4, new Producto(4, "Arandanos", 9300, 55));
        listaProductos.put(5, new Producto(5, "Tomates", 2100, 42));
        listaProductos.put(6, new Producto(6, "Fresas", 4100, 3));
        listaProductos.put(7, new Producto(7, "Helado", 4500, 41));
        listaProductos.put(8, new Producto(8, "Galletas", 500, 8));
        listaProductos.put(9, new Producto(9, "Chocolates", 3500, 806));
        listaProductos.put(10, new Producto(10, "Jamon", 15000, 10));
    }
    
    public List<Producto> obtenerLP()
    {
        return new ArrayList<>(this.listaProductos.values());
    }
    
    public void establecerLP(HashMap<Integer,Producto> listaProductos)
    {
        this.listaProductos = listaProductos;
    }
    
    public boolean verificarProducto (Producto pr)
    {
        return this.listaProductos.containsKey(pr.getCodigo());
    }
    
    public boolean verificarProducto(String nombre)
    {
        for (Producto pro : this.listaProductos.values())
        {
            if (nombre.toLowerCase().equals(pro.getNombre().toLowerCase()))
            {
                return true;
            }
        }
        return false;
    }
    
    public int ultCod()
    {
        int codigo = 0;
        for(Producto pro : this.listaProductos.values())
        {
            codigo = pro.getCodigo();
        }
        return codigo;
    }
    
    public void Agregar(Producto pro)
    {
        this.listaProductos.put(pro.getCodigo(), pro);
    }
    
    public void Actualizar(Producto pro)
    {
        this.listaProductos.replace(pro.getCodigo(), pro);
    }
    
    public void Eliminar(Producto pro)
    {
        this.listaProductos.remove(pro.getCodigo());
    }
    
    private List<Producto> obtenerMay()
    {
        List<Producto> Lista = new ArrayList<>(this.listaProductos.values()); //Esta es una copia del HashMap
        List<Producto> ListaMayor = new ArrayList<>(); //acá se guardarán los tres productos con el precio mayor
        
        for(int i=0; i<3; i++)
        {
            Producto pro = new Producto();
            for (Producto proTemp : Lista)
            {
                if(proTemp.getPrecio() > pro.getPrecio())
                {
                    pro = proTemp;
                }
            }
            ListaMayor.add(pro);
            Lista.remove(pro);
        }
        return ListaMayor;
    }
    
    public String generarInfo()
    {
        List<Producto> listaMay = obtenerMay();
        return listaMay.get(0).getNombre()+" "+listaMay.get(1).getNombre()+" "+listaMay.get(2).getNombre();
    }
}

