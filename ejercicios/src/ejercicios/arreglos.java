
package ejercicios;

import java.util.Scanner;

public class arreglos 
{

    public static void main(String[] args) 
    {
      /*  
//programa que a partir de un arreglo de N números determina qué porcentaje de los números son cero, qué porcentajes
//son positivos y qué porcentajes son negativos
        Scanner pregunta = new Scanner(System.in);
        System.out.println("¿Cuántos números va a ingresar?: ");
        int longitud = pregunta.nextInt();
        float [] Ar = new float[longitud];
        
        for (int i=0; i<longitud; i++)
        {
            System.out.println("Digite un número: ");
            Ar[i] = pregunta.nextFloat();
        }
        float pos = 0;
        float neg = 0;
        float cero = 0;
        
        for (float i: Ar)
        {
            if (i>0)
                pos++;
            else if (i<0)
                neg++;
            else
                cero++;
        }
        float porpos = Math.round((pos/Ar.length)*100);
        float porneg = Math.round((neg/Ar.length)*100);
        float porcer = Math.round((cero/Ar.length)*100);
        System.out.println("El porcentaje de números positivos es: "+porpos+"%\nnegativos: "+porneg+"%\ncero: "+porcer+"%");
    
//programa que solicita al usuario 10 números enteros positivos, los almacene en un arreglo e imprime, el promedio
//y la desviación estándar del arreglo de números
        float arreglo[] = new float[5];
        
        for (int i=0; i<5; i++)
        {
            Scanner pedir = new Scanner(System.in);
            System.out.println("Digite un número: ");
            arreglo[i] = pedir.nextInt();
        }
        float total = 0;
        
        for (float i:arreglo)
        {
            total += i;
        }
        float prom = total/arreglo.length;
        float acum = 0;
        for (float i:arreglo)
        {
            float s =(float) Math.pow((i-prom), 2);
            acum += s;
        }
        float p = acum/arreglo.length;
        float desv = (float)Math.sqrt(p);
        System.out.print("El promedio de los números ingresados es: "+prom+" y la desviación estandar es: "+desv);
    
//programa que crea e inicializa un Array de 10 elementos enteros con valores aleatorios entre 1 y 10, e imprime el
//contenido del Array y la suma de todos sus elementos.
        double a[] = new double[10];
        for (int i=0; i<10; i++)
        {
            double al = Math.round(Math.random()*10);//Math.round = redondeo; Math.random = aleatoreo solo de doubles
            a[i] = al;
        }
        double su = 0;
        
        for (int i=0; i<10; i++)
        {
            su += a[i];
            System.out.print(a[i]+"; ");
        }
        System.out.println("La suma de los elementos del arreglo es: "+su);
*/
//SOLUCIÓN PROPUESTA EN LA PLATAFORMA
        int[] arr = new int[10];
        for (int i=0; i<arr.length; i++)
        {
            arr[i] = (int)Math.floor(Math.random()*10+1);
        }
        int sum = 0;
        for (int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+"; ");
            sum += arr[i];
        }
        System.out.println();
        System.out.println("La suma de los elementos del arreglo es: "+sum);
    }
}
