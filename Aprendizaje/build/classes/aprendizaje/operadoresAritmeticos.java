
package aprendizaje;

import java.util.Scanner;

public class operadoresAritmeticos 
{

    public static void main(String[] args) 
    {
        
        Scanner variable = new Scanner(System.in);
        /*  float num1, num2, suma, resta, mult, div, residuo;
        System.out.println("Digite dos números: ");
        num1 = variable.nextFloat();
        num2 = variable.nextFloat();
        suma = num1 + num2;
        resta = num1 - num2;
        mult = num1 * num2;
        div = num1 / num2;
        residuo = num1 % num2;
        System.out.println("Suma = "+suma);
        System.out.println("Resta = "+resta);
        System.out.println("Multiplicación = "+mult);
        System.out.println("División = "+div);
        System.out.println("Residuo = "+residuo);
        
        float num;
        System.out.println("Digite un número");
        num = variable.nextFloat();
        num = num+1;
        num+=1;
        num++;
        num-=3;
        num--;
        num*=5;
        num/=2;
        num%=2;
        System.out.println("Resultado = "+num);
        
        int numero = 5;
        int numero2 = 0;
        int numero3 = 0;
        numero2 = ++numero;
        numero3 = --numero;
        System.out.println("numero = "+numero);
        System.out.println("numero 2 = "+numero2);
        System.out.println("numero 3 = "+numero3);
        */
        //no es necesario importar la libreria Math para hacer uso de sus funciones
        double radical = 8;
        double resultado = 0;
        int resul = 0; //se debe hacer un casting porque la función solo recibe doubles
        resultado = Math.sqrt(radical); // Sacar la raiz cuadrada de un número con Math.sqrt()
        resul = (int)Math.sqrt(radical); // Esto es hacer un casting
        System.out.println("Raiz cuadrada = "+resultado);
        System.out.println("Raiz cuadrada parte entera = "+resul);
        
        // Operaciones de potenciación
        double base = 5;
        double expo = 2;
        double solucion;
        solucion = Math.pow(base, expo);
        System.out.println("El resultado de: "+base+" elevado a la: "+expo+" es: "+solucion);
        
        //Valor absoluto
        float absoluto = -5.5f;
        float abso = Math.abs(absoluto);
        System.out.println("El valor absoluto del número "+absoluto+" es: "+abso);
        
        // Redondeo
        float redondo = 5.5f;
        int redondeado = Math.round(redondo);
        System.out.println("La aproximación de "+redondo+" es: "+redondeado);
        
        //Números aleatoreos
        double aleatoreo = Math.random();
        System.out.println("Aleatoreo: "+Math.round(aleatoreo*10));
    }
    
}
