/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package explicaciones;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Ciclosexp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // WHILE
        int k=1;
        while(k<=10){
            System.out.println("k="+k);
            k=k+1;
        }
        //
        Scanner entra=new Scanner(System.in);
        System.out.println("Dime cuantas veces quieres que se repita");
        int repeticiones= entra.nextInt();
        int i=1;
        while(i<=repeticiones){
            System.out.println("i="+i);
            i=i+2;
        }
        //DO WHILE
        int j=1;
                do{
                    System.out.println("j="+j);
                }while(j<=10);
        //
        int contador = 0 ;
        do {   
            System.out.println ("Contando... " + (contador+1) );
                contador += 1;
        } while (contador<10);  
        //
        //FOR
        //La sintaxis basica es: 
        //for(inicialización; condición; incremento/decremento){
            //Instrucciones a ejecutar varias veces}
        for(int m=1;m<=10;m++){
            System.out.println("m="+m);
        }
        //Veamos como ejemplo, mostrar los numeros pares entre 
        for(int p=500;p<=1000;p+=2)
        {
            System.out.println(p);
        }

    }
    
}
