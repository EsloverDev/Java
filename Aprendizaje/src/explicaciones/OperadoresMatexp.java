/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package explicaciones;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;


/**
 *
 * @author LENOVO
 */
public class OperadoresMatexp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entra=new Scanner(System.in);
        float num1,num2,suma,resta,mul,div,residuo;
        System.out.println("Ingresa 2 numeros:");
        num1=entra.nextFloat();
        num2=entra.nextFloat();
        suma=num1+num2;
        resta=num1-num2;
        mul=num1*num2;
        div=num1/num2;
        residuo=num1%num2;
        //Si lo que queremos realizar es realizar la operacion en base a una constante seria:
        //suma+=3; restara-=3; 
        //Para incrementar o decrementar en uno es: suma++; o resta--
        System.out.println("Suma="+suma);//print("texto",variable)
        System.out.println("Resta="+resta);
        System.out.println("Multiplicacion="+mul);
        System.out.println("Division="+div);
        System.out.println("Residuo="+residuo);
        //OPERACIONES CON MATH
        double numRaiz=8;
        double resRaiz=0;
        resRaiz=Math.sqrt(numRaiz);
        System.out.println("resRaiz="+resRaiz);
        
        double base=5;
        double exp=2;
        double resExpo;
        resExpo=Math.pow(base, exp);
        System.out.println("resExpo="+resExpo);
        
        float numAbs=-5.5f;
        double resAbs=Math.abs(numAbs);
        System.out.println("resAbs="+resAbs);
        
        float numRed=5.5f;
        int resRed=Math.round(numRed);
        System.out.println("resRed="+resRed);
        
        double resAle=Math.random();
        System.out.println("resAle="+Math.round(resAle*100));
        //QUE PASA CUANDO NECESITAMOS SABER LA EDAD DE UNA PERSONA EN BASE A SU FECHA DE NACIMIENTO
        Calendar fechaNac=new GregorianCalendar(2000,01,01);
        Calendar fechaHoy=Calendar.getInstance();
        int anoNac=fechaNac.get(Calendar.YEAR);
        int anoHoy=fechaHoy.get(Calendar.YEAR);
        int edad=anoHoy-anoNac;
        System.out.println("Edad="+edad);
    }
    
}
