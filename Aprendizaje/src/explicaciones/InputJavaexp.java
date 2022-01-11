/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package explicaciones;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class InputJavaexp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Para recibir un entero
       Scanner inInt=new Scanner (System.in);
        int entero;
        System.out.println("Escriba un numero entero");
        entero=inInt.nextInt();
        System.out.println("Su numero es: "+entero);
        
//        //Un flotante
        Scanner inFloat=new Scanner (System.in);
        float flotante;
        System.out.println("Escriba un numero flotante");
        flotante=inFloat.nextFloat();
        System.out.println("Su numero es: "+flotante);
//
//        //Un String
        Scanner inCadena=new Scanner (System.in);
        String cadena;
        System.out.println("Escriba una cadena");
        cadena=inCadena.nextLine();//Si escribimos next solamente nos va a tomar la primer palabra, debemos colocar nextLine para que nos tome las diferentes palabras que escribamos
        System.out.println("Su cadena es: "+cadena);
//
//        //Un caracter
        Scanner inCaracter=new Scanner (System.in);
        char caracter;
        caracter='c';
        System.out.println("caracter="+caracter);
        System.out.println("Escriba un caracter");
        caracter=inCaracter.next().charAt(0);//charArt(0) obtenemos el caracter que esta en la posicion cero de la palabra que digitamos
        System.out.println("Su caracter es: "+caracter);
        // Para obtener los datos mediante una ventana 
        
//        String cadena=JOptionPane.showInputDialog("Ingresa una cadena");
//        JOptionPane.showMessageDialog(null,"Esta es tu cadena"+cadena);
//        //Para enteros debemos usar un wraper para poder manejar enteros
//        int entero= Integer.parseInt(JOptionPane.showInputDialog("Ingresa un entero"));
//        JOptionPane.showMessageDialog(null,"Este es tu numero"+entero);
//        //Para flotantes es necesario hacerlo asi:
//        float flotante= Float.parseFloat(JOptionPane.showInputDialog("Ingresa un numero flotante"));
//        JOptionPane.showMessageDialog(null,"Este es tu numero flotante"+flotante);
//        //Para caracter
//        char caracter= JOptionPane.showInputDialog("Mete un caracter").charAt(0);
//        JOptionPane.showMessageDialog(null,"Este es tu caracter "+caracter);
  }
    
}
