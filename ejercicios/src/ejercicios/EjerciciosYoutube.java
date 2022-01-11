/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Eslover
 */
public class EjerciciosYoutube 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner entra = new Scanner(System.in);
        int i = 1;
    /*
    //ejercicio 1
        
        
        while (i<=10)
        {
            System.out.println("i = "+i);
            i++;
        }
    
    //ejercicio 2
        System.out.println("¿Cuantas veces quieres que se repita?");
        int repeticiones = entra.nextInt();
        
        
        while (i <= repeticiones)
        {
            System.out.println("i = "+i);
            i++;
        }
    
    //ejercicio 3 do while
        do
        {
            System.out.println("i = "+i);
            i++;
        }
        while (i<10);
    
    
    //ejercicio 4 do while
        Random rand = new Random();
        int aleatorio = rand.nextInt(6);
        System.out.println("aleatorio = "+aleatorio);
        
        do
        {
            System.out.println("i = "+i);
            i++;
        }
        while (i <= aleatorio);
    
    //ejercicio 5 ciclo for
    
        System.out.println("Humano, cuantas repeticiones quieres?");
        int repeticiones = entra.nextInt();
        
        for(int ite = 1; ite<=repeticiones; ite++)
        {
            System.out.println("ite = "+ite);
        } 
    */
    //Aplicación que dibuja una escalera de asteriscos
        String texto = JOptionPane.showInputDialog("Humano dame la altura de tu pinche escalera: ");
        int altura = Integer.parseInt(texto);
        
    }
}
