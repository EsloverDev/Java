
package ejercicios;

import java.util.Scanner;

public class funciones 
{
    public static void negativo(double numero)
    {
        if (numero<0)
        {
            System.out.println("el número "+numero+" es negativo");
        }
    }
    public static void positivo(double numero)
    {
        if (numero>0)
        {
            System.out.println("el número "+numero+" es positivo");
        }
    }
    public static void cero(double numero)
    {
        if (numero==0)
        {
            System.out.println("el número "+numero+" es neutro para la suma.");
        }
    }
    public static double rectangulo(double base,double altura)
    {
        double area = base * altura;
        return area;
    }
    
    public static double triangulo(double base, double altura)
    {
        double area = (base * altura) / 2;
        return area;
    }
    public static double cuadrado(double lado1)
    {
        double area = Math.pow(lado1,2);
        return area;
    }
    public static double circulo(double radio)
    {
        double area = Math.PI*Math.pow(radio, 2);
        return area;
    }
    
    public static void main(String[] args) 
    {
    /*    
    //Programa para calcular el area de un rectángulo
        Scanner calculo = new Scanner(System.in);
        System.out.println("Digite la base y la altura del rectángulo: ");
        double lado1 = calculo.nextDouble();
        double lado2 = calculo.nextDouble();
        double resultado = rectangulo(lado1,lado2);
        System.out.println("El area del rectángulo con base "+lado1+" y altura "+lado2+" es: "+resultado);
        
    //Programa para calcular el area de un Circulo, cuadrado o triángulo
        Scanner figura = new Scanner(System.in);
        System.out.println("Digite \"Triangulo\", \"Circulo\" o \"Cuadrado\" para calcular el area");
        String opcion = figura.nextLine();
        
        
        if (opcion.equals("Triangulo"))
        {
            Scanner datos = new Scanner(System.in);
            System.out.println("Digite la base y la altura del triángulo respectivamente: ");
            double base = datos.nextDouble();
            double altura = datos.nextDouble();
            double area = triangulo(base, altura);
            System.out.println("El area del triángulo con base "+base+" y altura "+altura+" es: "+area);
        }
        else if (opcion.equals("Circulo"))
        {
            Scanner circ = new Scanner(System.in);
            System.out.println("Digite el radio del circulo: ");
            double radio = circ.nextDouble();
            double area = circulo(radio);
            System.out.println("El area del circulo con radio "+radio+" es: "+area);
        }
        else if (opcion.equals("Cuadrado"))
        {
            Scanner cuad = new Scanner(System.in);
            System.out.println("Digite la longitud de uno de los lados del cuadrado: ");
            double lado = cuad.nextDouble();
            double area = cuadrado(lado);
            System.out.println("El area del cuadrado cuyos lados miden "+lado+" es: "+area);
        }
        else
        {
            System.out.println("Digite una figura válida");
        }
    */    
    // Dado un número real x, construya una función que permita determinar si el número es positivo, negativo
    //o cero. Para cada caso se debe imprimir el texto que se especifica a continuación:
    //• Positivo: “El número x es positivo”
    //• Negativo: “El número x es negativo”
    //• Cero: “El número x es neutro para la suma”
    
        Scanner tec = new Scanner(System.in);
        System.out.println("Digite un número: ");
        double mynumero = tec.nextDouble();
        
        if (mynumero<0)
        {
            negativo(mynumero);
        }
        else if(mynumero>0)
        {
            positivo(mynumero);
        }
        else
        {
            cero(mynumero);
        }
    }
    
}
