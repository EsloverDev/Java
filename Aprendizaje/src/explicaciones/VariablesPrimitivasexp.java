/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package explicaciones;

/**
 *
 * @author LENOVO
 */
public class VariablesPrimitivasexp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        byte espacio;
        espacio=(byte)126.55;
        System.out.println("espacio="+espacio);
        //
        short corto;
        corto=(short)32000.55;
        System.out.println("corto="+corto);
        //
        int entero;
        entero=32000;
        System.out.println("entero="+entero);
        //
        long largo;
        largo=32000;
        System.out.println("largo="+largo);
//
        float flotante;
        flotante=32000.55f;//Es necesario hacer un casting o coversion, podria ser =(float)32000.55
        System.out.println("flotante="+flotante);
//
        double doble;
        doble=32000.55;
        System.out.println("doble="+doble);
//
        char caracter;
        caracter='c'; //No puede ser con comillas dobles, las "" son para los strings
        System.out.println("caracter="+caracter);

        boolean boleano;
        boleano=false;
        System.out.println("boleano="+boleano);
        //VARIABLES DE ENVOLTORIO
        //byte mordida;
        Byte mordida;
        mordida=(byte)126.55;
        System.out.println("mordida="+mordida);

        //short corto;
        Short cortos;
        cortos=(short)32000.55;
        System.out.println("corto="+cortos);

        //int entero;
        Integer enteros;
        enteros=32000;
        System.out.println("entero="+enteros);

        //long largo;
        //largo=32000;
        Long largos;
        largos=(long)32000;
        System.out.println("largo="+largos);

        //float flotante;
        //flotante=32000.55f;
        Float flotantes;
        flotantes=mordida.floatValue();
        System.out.println("flotante="+flotantes);

       // double doble;
        Double dobles;
        dobles=32000.55;
        System.out.println("doble="+dobles);

        char caracteres;
        caracteres='c';
        System.out.println("caracter="+caracteres);

        //boolean boleano;
        Boolean boleanos;
        boleanos=false;
        System.out.println("boleano="+boleanos);

        String cadena;
        cadena="cadena";
        System.out.println("cadena="+cadena);
        //constantes
        final float pi=3.14f;
    }
    
}
