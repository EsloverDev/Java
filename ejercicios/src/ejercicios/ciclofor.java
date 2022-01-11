
package ejercicios;

import java.util.Scanner;

public class ciclofor 
{

    public static void main(String[] args) 
    {
       /* 
    //Programa que imprime los números desde el 3 hasta n (siendo n un número entero ingresado por el usuario)
    //y que además vaya realizando una sumatoria. Al final se debe imprimir el resultado de la sumatoria total
        Scanner operacion = new Scanner(System.in);
        System.out.println("Digite un número mayor a 3: ");
        int numero = operacion.nextInt();
        
        while(numero<4)
        {
            System.out.println("digite un número mayor a 3: ");
            numero = operacion.nextInt();
        }
        int acumulador = 0;
        for (int i=3;i<=numero;i++)
        {
            System.out.println(i);
            acumulador += i;
        }
        System.out.println("Suma total: "+acumulador);
        
        //Solucion propuesta
        Scanner sc = new Scanner(System.in);
        int entrada = Integer.parseInt(sc.nextLine());
        int sumatoria = 0;
        
        for (int i=3;i<=entrada;i++)
        {
            System.out.println(i);
            sumatoria += i;
        }
        System.out.println("Suma total: "+String.valueOf(sumatoria));
    
    //Programa que Lee un número y calcula su factorial
        Scanner num1 = new Scanner(System.in);
        System.out.println("Digite un número para calcular su factorial: ");
        int num = num1.nextInt();
        int factorial = 1;
        
        for (int i=1;i<=num;i++)
        {
            factorial = factorial * i;
        }
        System.out.println("El factorial del número "+num+" es: "+factorial);
    
    //programa que muestra por pantalla todos los múltiplos de 5 entre 1 y 100.
        System.out.println("LOS MÚLTIPLOS DE 5 DESDE 1 HASTA 100.");
        for (int i=1; i<=100; i++)
        {
            if (i%5==0)
            {
                System.out.println(i+" es múltiplo de 5.");
            }
        }
    
    // programa que solicita al usuario introducir el número de alumnos de una clase. A continuación,
    //pide la altura de cada uno de los alumnos. El programa debe mostrar: Número de alumnos con altura mayor a 1,80.
    //Número de alumnos con altura menor a 1,80. El promedio de alturas de la clase.
         Scanner alumnos = new Scanner(System.in);
        System.out.println("¿Cuántos alumnos va a ingresar?: ");
        int cantidad = alumnos.nextInt();
        float alto = 0;
        float bajo = 0;
        float suma = 0;
        
        for (int i=0; i<cantidad; i++)
        {
            System.out.println("Digite la altura del alumno "+(i+1)+" dada en m.");
            float altura = alumnos.nextFloat();
            if (altura<1.80)
            {
                bajo ++;
                suma += altura;
            }
            else if (altura>=1.80)
            {
                alto ++;
                suma += altura;
            }
        }
        double promedio = suma/cantidad;
        System.out.println("En total hay: "+alto+" estudiantes que miden 1.80m o más, y \n"+bajo+" estudiantes que miden menos de 1.80m. \nel promedio de altura de la clase es: "+promedio);
        
    //programa que solicita una cadena de texto e imprime la cantidad de vocales.
        Scanner texto = new Scanner(System.in);
        System.out.println("Digite un texto: ");
        String cadena = texto.nextLine();
        int vocales = 0;
        
        for (int i=0; i<cadena.length(); i++)
        {
            if (cadena.charAt(i)=='a'||cadena.charAt(i)=='e'||cadena.charAt(i)=='i'||cadena.charAt(i)=='o'||cadena.charAt(i)=='u')
            {
                vocales++;
            }
        }
        System.out.println("En total son "+vocales+" vocales.");
    
    //programa que pide una oración por teclado y a continuación muestra por pantalla cuantos espacios en blanco se ingresaron.
        Scanner t = new Scanner(System.in);
        System.out.println("Digite una oración: ");
        String oracion = t.nextLine();
        int espacios = 0;
        
        for (int i=0; i<oracion.length(); i++)
        {
            if (oracion.charAt(i)==' ')
                espacios++;
        }
        System.out.println("La oración tiene "+espacios+" espacios.");
     */ 

        
    // Pedir 10 números por teclado y obtener la suma, media aritmética, el número menor, el número  mayor y 
    //cuántas veces se repite cada número.
    
    }
}
