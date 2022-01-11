/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recuperaciondianahdez;

import java.util.HashMap;

/**
 *
 * @author Equipo
 */
class BaseDatosProductos 
{   
    private HashMap<Integer,Producto> listaProductos = new HashMap <Integer,Producto> ();

    public BaseDatosProductos() 
    {
        listaProductos.put(1, new Producto(1, "Manzanas", 5000, 25));
        listaProductos.put(2, new Producto(2, "Limones", 2300, 15));
        listaProductos.put(3, new Producto(3, "Peras", 2700, 33));
        listaProductos.put(4, new Producto(4, "Arandanos", 9300, 5));
        listaProductos.put(5, new Producto(5, "Tomates", 2100, 42));
        listaProductos.put(6, new Producto(6, "Fresas", 4100, 3));
        listaProductos.put(7, new Producto(7, "Helado", 4500, 41));
        listaProductos.put(8, new Producto(8, "Galletas", 500, 8));
        listaProductos.put(9, new Producto(9, "Chocolates", 3500, 80));
        listaProductos.put(10, new Producto(10, "Jamon  ", 15000, 10));
            
    }
    
    public boolean verificarExistencia(Producto exi)
    {
        return listaProductos.containsKey(exi.getCodigo());
        
    }
    
    public void agregar(Producto exi)
    {
        listaProductos.put(exi.getCodigo(), exi);
    }
    
    public void actualizar(Producto exi)
    {
        listaProductos.replace(exi.getCodigo(), exi);
    }
    
    public void eliminar(Producto exi)
    {
        listaProductos.remove(exi.getCodigo());        
    }    
    public void generarInforme()
    {
        String mayor = "";
        String menor = "";
        double promedio =0;
        double precMenor = listaProductos.values().iterator().next().getPrecio();
        double precAux =0;
        double SumaPre =0;
        double SumaInven =0;
        
        for (Producto exi : listaProductos.values())
        {
            if (exi.getPrecio() > precAux)
            {
                mayor = exi.getNombre();
                precAux = exi.getPrecio();
            }
            else if (exi.getPrecio() < precMenor)
            {
                precMenor = exi.getPrecio();
                menor = exi.getNombre();
            }
            SumaPre += exi.getPrecio();
            SumaInven += (exi.getPrecio() * exi.getInventario());
            
        }
        promedio = SumaPre/listaProductos.size();
        String pro = String.format("%.1f", promedio).replace(",",".");
        String.format("%,1f",SumaInven);
        System.out.println(mayor+" "+menor+" "+pro+" "+SumaInven);
    }
}



