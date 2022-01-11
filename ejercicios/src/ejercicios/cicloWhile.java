
package ejercicios;

import java.util.Scanner;

public class cicloWhile 
{

    public static void main(String[] args) 
    {
/*
// Programa que lee 10 números enteros ingresados por teclado e imprime la suma de estos, el nro de positivos y negativos
//ingresados.
        int contador = 0;
        int acumulador = 0;
        int negativo = 0;
        int positivo = 0;
        
        while (contador<10)
        {
            Scanner num = new Scanner(System.in);
            System.out.println("digite un número: ");
            int numero = num.nextInt();
            acumulador += numero;
            contador ++;
            if (numero < 0)
            {
                negativo++;
            }
            else if (numero > 0)
            {
                positivo++;
            }
            
        }
        System.out.println("La suma es: "+acumulador+"\nla cantidad de números positivos es: "+positivo+"\nLa cantidad de números negativos es: "+negativo);
        
//Programa que repite lo que dice el usuario.
        Scanner repetir = new Scanner(System.in);
        System.out.println("Digite un texto o digite \"Salir del juego\": ");
        String texto = repetir.nextLine();
        
        while (!texto.equals("Salir del juego"))
        {
            System.out.println(texto);
            System.out.println("Digite un texto o digite \"Salir del juego\": ");
            texto = repetir.nextLine(); // no se define nuevamente la variable texto como string porque genera un error
        }
        System.out.println("Adios.");
        
//Programa que repite lo que dice el usuario. ESTA VEZ CON DO WHILE
        Scanner repita = new Scanner(System.in);
        String frase = "";
        
        do
        {
            System.out.println(frase); //al iniciar el programa imprimirá la primera línea en blanco
            System.out.println("Digite un texto o digite \"Salir del juego\": ");
            frase = repita.nextLine(); //No se debe crear la variable “frase” varias veces, solo modificarla
                                        //por eso la creación está fuera del ciclo.
        }
        while (!frase.equals("Salir del juego"));
//programa que dado un número, diga si es o no un número de Armstrong. Un número de n dígitos es un número de Armstrong
//si la suma de las potencias n-ésimas de los dígitos que lo componen es igual al mismo número. Ejemplo: 1634 es un número
//de Armstrong
        Scanner arm = new Scanner(System.in);
        System.out.println("Digite un número");
        int str = arm.nextInt();
        
        int res = str%10;
        int numAux = str/10;
        int aArmstrong = 0;
        String potencia = Integer.toString(str);
        
        aArmstrong += Math.pow(res, potencia.length());
        
        while (numAux>0)
        {
            res = numAux%10;
            numAux = numAux/10;
            aArmstrong += Math.pow(res, potencia.length());
        }
        if (aArmstrong == str)
        {
            System.out.println("El número "+str+" si es un número armstrong.");
        }
        else
        {
            System.out.println("El número "+str+" no es un número armstrong.");
        }
    
//En 2022 el país A tendrá una población de 25 millones de habitantes y el país B de 18.9 millones. Las tasas de
//crecimiento anual de la población serán de 2% y 3% respectivamente. Desarrollar un algoritmo para informar en que
//año la población del país B superará a la dé A.
        int año, pobA, pobB, crecA, crecB; //el pais B nunca alcanza al pais A
        año = 2022;
        pobA = 25000000;
        pobB = 18900000;
        crecA = 0;
        crecB = 0;
    
        while (pobB<=pobA)
        {
            crecA += pobA * 1.2;
            crecB += pobB * 1.3;
            año++;
        }
        System.out.println("El año en el que la población del país B supera a la del país A es: "+(año+1));
  
//programa que lee números constantemente mientras no se introduzca un 0 e imprime cuantos de los números introducidos
//son pares y cuantos impares.
        Scanner t = new Scanner(System.in);
        System.out.println("Digite un número distinto a 0: ");
        int a = t.nextInt();
        int par = 0;
        int impar = 0;
        
        while (a!=0)
        {
            if (a%2==0)
            {
                par++;
            }
            else
            {
                impar++;
            }
            System.out.println("Digite un número distinto a 0: ");
            a = t.nextInt();
        }
        System.out.println("En total hay "+par+" números pares y "+impar+" números impares.");
        
//programa que lee notas comprendidas entre 0 y 10 hasta que se introduzca una nota no válida, e imprime la nota válida
//más alta y la más baja.
        Scanner te = new Scanner(System.in);
        System.out.println("Digite una nota entre 0 y 10: ");
        float no = te.nextFloat();
        float max = -1;
        float min = 11;
        
        while (no>=0 && no<=10)
        {
            if (no>max)
                max = no;
            if (no<min)
                min = no;
            System.out.println("Digite una nota entre 0 y 10: ");
            no = te.nextFloat();
        }
        System.out.println("La nota mayor es: "+max+" y la nota menor es: "+min);
        */
//programa que Lee un número natural y determina cuál es el mayor de sus dígitos.
        Scanner tec = new Scanner(System.in);
        System.out.println("Digite un número: ");
        long n = tec.nextLong();
        long nu = n%10;
        long num = n/10;
        long maxi = 0;
        
        if (nu>maxi)
            maxi = nu;
        
        while (num>0)
        {
            nu = num%10;
            if (nu>maxi)
                maxi = nu;
            num = num/10;
        System.out.println(""+num+" "+nu);
        }
        System.out.println("El dígito mayor del número "+n+" es: "+maxi);
    }   
}
