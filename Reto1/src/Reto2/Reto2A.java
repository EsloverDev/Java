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
 * @author Edgar Guevara
 */
public class Reto2A
{
    private final Scanner scanner = new Scanner(System.in);

    public static String read() //para la hoja negra debe quitar el static 
    {
       // return this.scanner.nextLine(); //Este codigo debe dejarse para hoja negra
        Scanner sc=new Scanner(System.in); //Este codigo debe borrarse para la hoja negra
        return sc.nextLine();//Este codigo debe borrarse para la hoja negra
    }

    public void run() {
    //insertar logica aqui.
        BaseDatos bd = new BaseDatos();
        //Ingreso de la primera linea
        String operacion = read();
        //Ingreso de la segunda linea
        //"11 Melon 70 13"
        // 11  MElon 70 13
        //valorIngresado=["11","Melon", "70", "13"]
        String[] valorIngresado = read().split(" ");
           //str.equals("") "".equals(str)
        int codigoIngresado=Integer.parseInt(valorIngresado[0]);
        String productoIngresado=valorIngresado[1];
        float precioIngresado = Float.parseFloat(valorIngresado[2]);
        int inventarioIngresado=Integer.parseInt(valorIngresado[3]);
        Productos p = new Productos(codigoIngresado, productoIngresado, precioIngresado, inventarioIngresado);
        //Productos p = new Productos(Integer.parseInt(valorIngresado[0]), valorIngresado[1], Float.parseFloat(valorIngresado[2]), Integer.parseInt(valorIngresado[3]));
        switch (operacion) {
            case "AGREGAR":
                if (bd.verificarExistencia(p)) {
                    System.out.println("ERROR");
                } else {
                    bd.agregarProducto(p);
                    bd.generarInforme();
                }
                break;
            case "BORRAR":
                if (!bd.verificarExistencia(p)){
                    System.out.println("ERROR");
                } else{
                bd.borrarProducto(p);
                bd.generarInforme();
                }
                break;
            case "ACTUALIZAR":
                bd.actualizarProducto(p);
                bd.generarInforme();
                break;
        }
    }
}
// fin del public run()
class BaseDatos
{
    //{clave, dato}={129838: edgar, 34566: Edwin}
    //{12979:[gris 30 13], 3456:{rojo, 20, 11]
    //listaProductos ={---,----}
    private HashMap<Integer, Productos> listaProductos=new HashMap<>();
            
    public BaseDatos() 
    {
        
        listaProductos.put(1, new Productos(1, "Manzana", (float) 8000.0, 65));
        listaProductos.put(2, new Productos(2, "Limones", (float)2300.0, 15));
        listaProductos.put(3, new Productos(3, "Granadilla", (float) 2500.0, 38));
        listaProductos.put(4, new Productos(4, "Arandanos", (float) 9300.0, 55));
        listaProductos.put(5, new Productos(5, "Tomates", (float) 2100.0, 42));
        listaProductos.put(6, new Productos(6, "Fresas", (float) 4100.0, 3));
        listaProductos.put(7, new Productos(7, "Helado", (float) 4500.0, 41));
        listaProductos.put(8, new Productos(8, "Galletas", (float) 500.0, 8));        
        listaProductos.put(9, new Productos(9, "Chocolates", (float) 3500.0, 806));
        listaProductos.put(10, new Productos(10, "Jamon", (float) 15000.0, 10));
    }

    public boolean verificarExistencia(Productos p)
        {
          return this.listaProductos.containsKey(p.getCodigo());
          /*for(Productos pro : listaProductos.values()){
            if(pro.getCodigo() == p.getCodigo()){
                return true;
            }
        }
          return false;*/
        }
        
    public void actualizarProducto(Productos p) 
    {
        
        this.listaProductos.remove(p.getCodigo());// primero remueve y luego pone el nuevo
        this.listaProductos.put(p.getCodigo(), p);
    }
    
    public void borrarProducto(Productos p) 
    {
        
        this.listaProductos.remove(p.getCodigo());
        
    }
            
    public void agregarProducto(Productos p) 
    {
        this.listaProductos.put(p.getCodigo(), p);
    }

    public void generarInforme()
    {
        double sumaPrecios=0;
        double sumaInventario=0;
        int contador;
        contador=0;
        double precioMayor=0;
        double precioMenor=0;
        double promedio=0;
        double valorInventario=0;
        String productoMenor="";
        String productoMayor="";
        precioMenor=listaProductos.get(1).getPrecio();
        precioMayor=listaProductos.get(1).getPrecio();
        
        
        for(Productos prod : listaProductos.values())
        {
            
            if(prod.getPrecio() < precioMenor)
            {
              precioMenor=prod.getPrecio();
              productoMenor = prod.getProducto();
                            
            }
            else if(prod.getPrecio()>=precioMayor)
            {
                precioMayor=prod.getPrecio();
                productoMayor = prod.getProducto();
            
            } 
              contador += 1;    
              sumaPrecios=sumaPrecios+prod.getPrecio();
              valorInventario=valorInventario+(prod.getPrecio()*prod.getInventario());
        }
        //String imcconPunto=String.format("%.1f",imc).replace(",",".");
        promedio=sumaPrecios/contador;
        String promedioConPunto=String.format("%.1f",promedio).replace(",",".");
        String valorInventarioConPunto=String.format("%.1f",valorInventario).replace(",",".");
        System.out.print(productoMayor+" "+productoMenor+" "+promedioConPunto+" "+valorInventarioConPunto);
       // System.out.println("");
       // for(Productos prod:listaProductos.values())
         // {    
         //    int llave = prod.getKey();  
          //   System.out.println(llave+" Detalle: ");  
          //    System.out.println(prod.getCodigo()+" "+prod.getProducto+" "+b.autor+" "+b.publicacion+" "+b.cantidad);   
         // }    
    }
}    
//fin de la clase BaseDatos
class Productos 
{
    private int codigo;
    private String producto;
    private float precio;
    private int inventario;

    public Productos(int codigo, String producto, float precio, int inventario) 
    {
        this.codigo = codigo;
        this.producto = producto;
        this.precio = precio;
        this.inventario = inventario;
    }

    /**
     * 
     * @return 
     */
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }
    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    public int getInventario() {
        return inventario;
    }

    public void setInventario(int nombre) {
        this.inventario = nombre;
    }
}
//fin clase productos
