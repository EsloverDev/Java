/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reto2;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Eslover
 */
public class Reto2
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
                if(bdpro.verificarExistencia(pro))
                {
                    System.out.println("ERROR");
                }
                else
                {
                    bdpro.agregar(pro);
                    bdpro.generarInforme();
                }
                break;
            case "ACTUALIZAR":
                if(bdpro.verificarExistencia(pro))
                {
                    bdpro.actualizar(pro);
                    bdpro.generarInforme();
                }
                else
                {
                    System.out.println("ERROR");
                }
                break;
            case "BORRAR":
                if(bdpro.verificarExistencia(pro))
                {
                    bdpro.eliminar(pro);
                    bdpro.generarInforme();
                }
                else
                {
                    System.out.println("ERROR");
                }
        }
    }
}// Fin de la clase Reto2

class Producto
{
    //Atributos
    private int codigo;
    private String nombre;
    private double precio;
    private int inventario;

    //Constructor
    public Producto() 
    {
    
    }
    
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
    
}// Fin de la clase Producto

class BaseDatosProductos
{
    private HashMap<Integer,Producto> listaProductos = new HashMap<Integer,Producto>();

    //Constructor
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
    
    public boolean verificarExistencia(Producto pr)
    {
        return listaProductos.containsKey(pr.getCodigo()); //Verifica si la llave contiene (containsKey) el código del producto que se le está ingresando.
    }
    
    public void agregar(Producto pr)
    {
        listaProductos.put(pr.getCodigo(), pr);
    }
    
    public void actualizar(Producto pr)
    {
        listaProductos.replace(pr.getCodigo(), pr); //Seleccionamos la llave (pr.getcodigo) y reemplazamos su valor por los datos que le estamos pasando en pr.
    }
    
    public void eliminar(Producto pr)
    {
        listaProductos.remove(pr.getCodigo());
    }
    
    public void generarInforme()
    {
        String may = "";
        String men = "";
        double prom = 0;
        double pMen = listaProductos.values().iterator().next().getPrecio();
        double pAux = 0;
        double sPrecios = 0;
        double sInv = 0;
        
        for (Producto pr : listaProductos.values())
        {
            if (pr.getPrecio() > pAux)
            {
                may = pr.getNombre();
                pAux = pr.getPrecio();
            }
            else if (pr.getPrecio() < pMen)
            {
                men = pr.getNombre();
                pMen = pr.getPrecio();
            }
            sPrecios += pr.getPrecio(); //sPrecios = sPrecios + pr.getPrecio();
            sInv += (pr.getPrecio() * pr.getInventario());
        }
        prom = sPrecios/listaProductos.size();
        String promedio = String.format("%.1f", prom).replace(",", ".");
        String.format("%.1f", sInv);
        System.out.println(may+" "+men+" "+promedio+" "+sInv);
        
    }
    
}//Fin de la clase BaseDatosProductos