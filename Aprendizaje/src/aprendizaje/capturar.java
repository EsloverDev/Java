
package aprendizaje;

import java.util.Scanner;

public class capturar 
{

    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);
        int entero;
        System.out.println("Digite un número entero: ");
        entero=entrada.nextInt();
        System.out.println("Tu número es: "+entero);
        
        Scanner flotante = new Scanner(System.in);
        float valor;
        System.out.println("Digite un valor: ");
        valor=flotante.nextFloat();
        System.out.println("Tu número es: "+valor);
        
        Scanner cadena = new Scanner(System.in);
        String cad;
        System.out.println("escribe una frase: ");
        cad=cadena.nextLine();
        System.out.println("Tu frase es: "+cad);
        
        Scanner carac = new Scanner(System.in);
        char caracter;
        System.out.println("Digite un caractér: ");
        caracter=carac.next().charAt(0);
        System.out.println("Tu caractér es: "+caracter);
    }
    
}
