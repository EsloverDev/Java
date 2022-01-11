/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Eslover
 */
public class Colecciones
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        Map<String,Integer> alum = new HashMap<String,Integer>();
        Scanner t = new Scanner(System.in);
        
        int op = 0;
        
        while (op!=2)
        {
            System.out.println("Digite la opción que desea: ");
            System.out.println("1 - Introducir asignatura y créditos.");
            System.out.println("2 - Salir.");
            op = t.nextInt();
            t.nextLine(); //Si quito esta línea no funciona pero no entiendo la función ni el porqué de esta línea.
            if (op==1)
            {
                System.out.println("Digite el nombre de la asignatura: ");
                String as = t.nextLine();
                System.out.println("Digite los créditos de "+as+": ");
                int cre = t.nextInt();
                alum.put(as, cre);
            }
        }
        int tcre = 0;
        for(String a: alum.keySet())
        {
            tcre += alum.get(a);
        }
        System.out.println("El total de créditos que está cursando es: "+tcre);
    }
    
}
