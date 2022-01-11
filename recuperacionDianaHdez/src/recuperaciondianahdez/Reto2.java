/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recuperaciondianahdez;

import java.util.Scanner;

/**
 *
 * @author Diana Milena Hernandez
 */
class Reto2
{
    
    /**
    *  Este debe ser el &uacute;nico objeto de tipo Scanner en el c&oacute;digo
    */
    private final Scanner scanner = new Scanner(System.in);

    /**
    * Este m&eacute;todo es usado para solicitar datos al usuario
    * @return  Lectura de la siguiente linea del teclado
    */
    public String read()
    {
        return this.scanner.nextLine();
    }

    /**
    * m&eacute;todo principal
    */
    public void run()
    {
        /*
        soluci&oacute;n propuesta
        */
        String Accion = read();
        String[] Lista = read().split(" ");
        int cod = Integer.parseInt(Lista[0]);
        String nom = Lista[1];
        double pre = Double.parseDouble(Lista[2]);
        int inv = Integer.parseInt(Lista[3]);
        Producto entrante = new Producto(cod, nom, pre, inv);
        BaseDatosProductos newbase = new BaseDatosProductos();
        
        switch(Accion)
        {
            case "AGREGAR":
                if (newbase.verificarExistencia(entrante))
                {
                    System.out.println("ERROR");
                }
                else
                {
                    newbase.agregar(entrante);
                    newbase.generarInforme();
                }
                break;
            case "ACTUALIZAR":
                if (newbase.verificarExistencia(entrante))
                {
                    newbase.actualizar(entrante);
                    newbase.generarInforme();
                }
                else
                {
                    System.out.println("ERROR");
                }
                break;
            case "BORRAR":
                if (newbase.verificarExistencia(entrante))
                {
                    newbase.eliminar(entrante);
                    newbase.generarInforme();
                }
                else
                {
                    System.out.println("ERROR");
                }
                break;
        }      
    }
}
