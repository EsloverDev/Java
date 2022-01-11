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
public class Condicionalesexp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entra=new Scanner(System.in);
//        int numUser,numSis;
//        numSis=(int)(Math.random()*10);
//        System.out.println("Ingresa un numero mayor o igual a "+numSis+": ");
//        numUser=entra.nextInt();
//        if(numUser >= numSis){
//            System.out.println("Muy bien");
//        }
//        else{
//            System.out.println("Muy mal");
//        }   
        //SWITCH
        System.out.println("Seleccione una opcion\n1: Acceso\n2: Configuracion\n3: Ayuda");
        int seleleccion=entra.nextInt();
        switch(seleleccion){
            case 1:
                System.out.println("Seleccionaste el acceso");
                break;
            case 2:
                System.out.println("Seleccionaste la configuracion");
                break;
            case 3:
                System.out.println("Seleccionaste la ayuda");
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
    }
    
}
