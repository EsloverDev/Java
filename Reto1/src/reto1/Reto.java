
package reto1;

import java.util.Scanner;

public class Reto 
{


    public static void main(String[] args) 
    {
        int e;
        double imc, p, a;
        Scanner t = new Scanner(System.in);
        e = Integer.parseInt(t.nextLine());
        p = Double.parseDouble(t.nextLine());
        a = Double.parseDouble(t.nextLine());
        
        //String informacion = t.nextLine();
    
        //System.out.println("ingres numero");
//     Scanner sc=new Scanner(System.in);
//     float r = sc.nextFloat();
//     String caracteres =sc.nextLine();
//     int Numero = sc.nextInt();

       //String[] lista= informacion.split(" ");
      
//        p = Double.parseDouble(lista[0]);
//        a = Double.parseDouble(lista[1]);  
//        e = Integer.parseInt(lista[2]);

        
        if ((p>=0 && p<=150)&&(a>=0.1 && a<=2.5)&&(e>=0 && e<=110))
    {
        imc = p/(Math.pow(a,2));
        if (imc<=22 && e<45)
        {
            String mens="Bajo";
            String impresion = String.format("%.1f", imc).replace(",", ".");
            System.out.println(impresion+" "+mens);
        }
        else if (imc<=22 && e>=45)
        {
            String mens = "Medio";
            String impresion = String.format("%.1f", imc).replace(",", ".");
            System.out.println(impresion+" "+mens);
        }
        else if (imc>22 && e<45)
        {
            String mens = "Medio";
            String impresion = String.format("%.1f", imc).replace(",", ".");
            System.out.println(impresion+" "+mens);
        }
            
        else
        {
            String mens = "Alto";
            String impresion = String.format("%.1f", imc).replace(",", ".");
            System.out.println(impresion+" "+mens);
        }
    }
    else
            System.out.println("ERROR");
    }
    
}
