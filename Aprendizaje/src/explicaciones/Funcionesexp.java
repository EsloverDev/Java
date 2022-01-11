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
public class Funcionesexp {

    /**
     * @param args the command line arguments
     */
    static void MuestraHolaMundo(){
        System.out.println("Hola mundo bello");
    } //Funcion que no recibe ni devuelve nada
    
    static void MostrarNumero(int numero){
        System.out.println("El numero es: "+numero);
    }//Funcion que recibe un entero y no devuelve nada
    
   static int Suma(int n1,int n2){
       int resultado;
       resultado=n1+n2;
       return resultado;
   }//Funcion que recibe dos numeros y devuelve un resultado
    
    public static void main(String[] args) {
        // TODO code application logic here
        MuestraHolaMundo();// Invocar o llamar la funcion
        int num1=5;
        int num2=3;
        System.out.println("El resultado de la suma es:"+Suma(num1,num2));
                
    }
    
}
