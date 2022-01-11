
package ejercicios;

import java.util.Random;
import java.util.Scanner;


public class condicionales 
{

    public static void main(String[] args) 
    {
        Scanner teclados = new Scanner(System.in);
    /*
    //Programa que saluda de vuelta al usuario
        Scanner saludo = new Scanner(System.in);
        System.out.println("Digite su saludo: ");
        String hola = saludo.nextLine();
        if (hola.equals("Hola mundo")) //Para comparar dos strings se usa .equals no sirve ==
                {
                    System.out.println("Hola usuario");
                }
        
    //Programa que dice cual de los dos números es el mayor o si son iguales
        Scanner comparar = new Scanner(System.in);
        System.out.println("Digite dos números: ");
        int A = comparar.nextInt();
        int B = comparar.nextInt();
        
        if(A>B)
        {
            System.out.println(A+" es mayor que "+B);
        }
        else if (B>A)
        {
            System.out.println(B+" es mayor que "+A);
        }
        else
        {
            System.out.println("Los números son iguales.");
        }
        
    // Programa que opera los números 20 y 66 según la operación que se seleccione "suma" "resta" o " multiplicación"
        int C = 20;
        int D = 66;
        Scanner operacion = new Scanner(System.in);
        System.out.println("Digite \"sumar\", \"restar\" o \"multiplicar\".");
        String seleccion = operacion.nextLine();
        
        if(seleccion.equals("sumar"))
        {
            System.out.println(C+"+"+D+"="+(C+D));
        }
        else if(seleccion.equals("restar"))
        {
            System.out.println(C+"-"+D+"="+(C-D));
        }
        else if(seleccion.equals("multiplicar"))
        {
            System.out.println(C+"*"+D+"="+(C*D));
        }
        else
        {
            System.out.println("Operación desconocida.");
        }
        
    // Programa que opera los números 20 y 66 según la operación que se seleccione "suma" "resta" o " multiplicación"
    //ESTA VEZ CON LA ESTRUCTURA SWITCH
        int E = 20;
        int F = 66;
        Scanner operar = new Scanner(System.in);
        System.out.println("Digite \"sumar\", \"restar\" o \"multiplicar\".");
        String seleccionar = operar.nextLine();
        
        switch(seleccionar)
        {
            case "sumar":
                System.out.println(E+"+"+F+"="+(E+F));
                break;
            case "restar":
                System.out.println(E+"-"+F+"="+(E-F));
                break;
            case "multiplicar":
                System.out.println(E+"*"+F+"="+(E*F));
                break;
            default:
                System.out.println("Operación desconocida.");
        
        }
        
    //Programa que lee tres números e imprime el mayor
        Scanner comparacion = new Scanner(System.in);
        System.out.println("Digite tres números: ");
        int num = comparacion.nextInt();
        int num1 = comparacion.nextInt();
        int num2 = comparacion.nextInt();
        
        if ((num>num1)&&(num>num2))
        {
            System.out.println(num+" es el mayor.");
        }
        else if ((num1>num)&&(num1>num2))
        {
            System.out.println(num1+" es el mayor.");
        }
        else if ((num2>num)&&(num2>num1))
        {
            System.out.println(num2+" es el mayor.");
        }
        else
        {
            System.out.println("Los números son iguales.");
        }
        
    //Programa que lee dos números enteros y determina si la diferencia entre ambos es un divisor exacto de alguno de
    //los dos números.
    //Después de hacer el código me dí cuenta de que debí haber buscado primero las propiedades de los divisores
    //debido a que Si un número es divisor de otros dos, también lo es de su suma y de su diferencia.
    //y eso me hubiera ahorrado algunas lineas de código que creo que nunca se van a ejecutar en este ejemplo
    //sin embargo las voy a dejar a modo de recordatorio para el futuro.
    //nota mental... futuro Edwin no seas tonto... Deberias documentarte antes de empezar a "tirar" codigo...
        Scanner numeros = new Scanner(System.in);
        System.out.println("Digite dos números: ");
        int numero = numeros.nextInt();
        int numero1 = numeros.nextInt();
        
        if (numero > numero1)
        {
            int diferencia = numero - numero1;
            if((numero%diferencia==0)&&(numero1%diferencia==0))
            {
                System.out.println("La diferencia de los números es "+diferencia+" y "+diferencia+" es divisor de "+numero+" y de "+numero1);
            }
            else if (numero%diferencia==0)
            {
                System.out.println("La diferencia de los números es "+diferencia+" y "+diferencia+" es divisor de "+numero);
            }
            else if(numero1%diferencia==0)
            {
                System.out.println("La diferencia de los números es "+diferencia+" y "+diferencia+" es divisor de "+numero1);
            }
            else
            {
                System.out.println("La diferencia de los números es "+diferencia+" y "+diferencia+" no es divisor de "+numero+" ni de "+numero1);
            }
        }
        else if (numero1 > numero)
        {
            int diferencia = numero1 - numero;
            if ((numero1%diferencia==0)&&(numero%diferencia==0))
            {
                System.out.println("La diferencia de los números es "+diferencia+" y "+diferencia+" es divisor de "+numero+" y de "+numero1);
            }
            else if (numero%diferencia==0)
            {
                System.out.println("La diferencia de los números es "+diferencia+" y "+diferencia+" es divisor de "+numero);
            }
            else if (numero1%diferencia==0)
            {
                System.out.println("La diferencia de los números es "+diferencia+" y "+diferencia+" es divisor de "+numero1);
            }
            else
            {
                System.out.println("La diferencia de los números es "+diferencia+" y "+diferencia+" no es divisor de "+numero+" ni de "+numero1);
            }
        }
        
    //Programa que pide al usuario un número y muestra por pantalla si es negativo y múltiplo de 3 o si no lo es.
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite un número: ");
        int G = sc.nextInt();
        if(G<0&&G%3==0)
        {
            System.out.println(G+" es un número negativo y es múltiplo de 3.");
        }
        else if(G>0&&G%3==0)
        {
            System.out.println(G+" es un número positivo y es múltiplo de 3.");
        }
        else if (G<0&&G%3!=0)
        {
            System.out.println(G+" es un número negativo y no es múltiplo de 3.");
        }
        else if (G>0&&G%3!=0)
        {
            System.out.println(G+" es un número positivo y no es múltiplo de 3.");
        }
        else
        {
            System.out.println("El número es cero.");
        }
        
    //programa que lee una nota numérica y devuelve la calificación a la que corresponde, sabiendo que:
    //0 <= nota < 3: Deficiente, 3 <= nota < 5: Insuficiente, 5 <= nota < 6: Suficiente, 6 <= nota < 7: Bien
    //7 <= nota < 9: Excelente 9 <= nota <=10: Sobresaliente
        Scanner nota = new Scanner(System.in);
        System.out.println("Digite una nota entre 0 y 10: ");
        float calificacion = nota.nextFloat();
        
        if (calificacion>=0 && calificacion<3)
        {
            System.out.println("Deficiente");
        }
        else if (calificacion>=3 && calificacion<5)
        {
            System.out.println("Insuficiente");
        }
        else if (calificacion>=5 && calificacion<6)
        {
            System.out.println("Suficiente");
        }
        else if (calificacion>=6 && calificacion<7)
        {
            System.out.println("Bien");
        }
        else if (calificacion>=7 && calificacion<9)
        {
            System.out.println("Excelente");
        }
        else if (calificacion>=9 && calificacion<=10)
        {
            System.out.println("Sobresaliente");
        }
        else
        {
            System.out.println("Nota incorrecta.");
        }
        
    //programa que pregunta por el precio de un producto y el número de unidades que se desea comprar. A partir de esos
    //datos, calcula el precio final, sabiendo que se aplica un descuento según los siguientes condicionantes:
    //Si el costo de la compra < de 100, no hay descuento. Si el costo de la compra > 200 el descuento será del 15%.
    //En cualquier otro caso, el descuento será del 10%.
        Scanner producto = new Scanner(System.in);
        System.out.println("Digite el precio del producto: ");
        float precio = producto.nextFloat();
        System.out.println("¿Cuántos productos va a ingresar?: ");
        int cantidad = producto.nextInt();
        float total = precio * cantidad;
        
        if (total>=100 && total<=200)
        {
            float descuento = total * 0.1f;
            float factura = total - descuento;
            System.out.println("El precio es: $"+total+"\nEl descuento es del 10% y corresponde a: $"+descuento+"\nEl total a pagar es: $"+factura);
        }
        else if (total>200)
        {
            float descuento = total * 0.15f;
            float factura = total - descuento;
            System.out.println("El precio es: $"+total+"\nEl descuento es del 15% y corresponde a: $"+descuento+"\nEl total a pagar es: $"+factura);
        }
        else
        {
            System.out.println("El total a pagar es: $"+total);
        }
        
    //programa que valida contraseñas. Una contraseña será válida cuando tenga entre 10 y 20 caracteres y contenga
    //alguno de los 3 siguientes caracteres: *,-,_. En caso de que la contraseña no sea válida, mostrar mensaje de error.
        Scanner te = new Scanner(System.in);
        System.out.println("Digite una contraseña entre 10 y 20 caracteres y que contenga alguno de estos caracteres: *,-,_");
        String contraseña = te.nextLine();
        
        if(contraseña.length()>9 && contraseña.length()<21)
        {
            if ((contraseña.contains("*"))||(contraseña.contains("-"))||(contraseña.contains("_")))
            {
                System.out.println("Contraseña correcta. Bienvenido.");
            }
            else
            {
                System.out.println("La contraseña no tiene los caracteres necesarios.");
            }
        }
        else
        {
            System.out.println("La contraseña no tiene la longitud necesaria.");
        }
       
    //programa que lee dos números enteros y si la suma de ambos números es par, imprime el producto de ambos números,
    //de lo contrario imprime el doble del número menor
        Scanner tec = new Scanner(System.in);
        System.out.println("Digite dos números: ");
        int x = tec.nextInt();
        int y = tec.nextInt();
        
        if ((x+y)%2==0)
            System.out.println(x+"*"+y+"="+(x*y));
        else
            if(x<y)
                System.out.println("El doble de "+x+" es: "+(x*2));
            else
                System.out.println("El doble de "+y+" es: "+(y*2));
        
    // programa que escribe el equivalente cualitativo de una nota ingresada por el usuario. Las calificaciones tienen
    //los siguientes rangos: entre 1 y 1.9 = deficiente, 2 y 2.9 = regular, 3 y 3.9 = aceptable, 4 y 5 = excelente
        Scanner tecl = new Scanner(System.in);
        System.out.println("Digite una nota entre 1 y 5: ");
        double z = Double.parseDouble(tecl.nextLine());
        
        if (z>=1 && z<=1.9)
            System.out.println("Deficiente");
        else if (z>=2 && z<=2.9)
            System.out.println("Regular");
        else if (z>=3 && z<=3.9)
            System.out.println("Aceptable");
        else if (z>=4 && z<=5)
            System.out.println("Excelente");
        else
            System.out.println("Nota inválida.");
    
    //ejemplo
        Scanner teclad = new Scanner(System.in);
        int nUsuario, nSistema;
        nSistema = (int)(Math.random()*10);
        System.out.print("Ingresa éste número: "+nSistema);
        nUsuario = teclad.nextInt();
        
        if(nUsuario == nSistema)
        {
            System.out.println("¡Muy bien!");
        }
        else
        {
            System.out.println("¡Muy mal!");
        }
    //ejemplo switch
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite una opción\n1: Acceso\n2: Configuración\n3: Ayuda");
        int seleccion = teclado.nextInt();
        
        switch(seleccion)
        {
            case 1:
                System.out.println("Seleccionaste el Acceso");
                break;
            case 2:
                System.out.println("Seleccionaste la Configuración");
                break;
            case 3:
                System.out.println("Seleccionaste la Ayuda");
                break;
            default:
                System.out.println("Ésta no es una opción.");
                break;
        }
    //Ejemplo de switch con String
        Scanner teclados = new Scanner(System.in);
        System.out.println("Escribe una opción\nacceso\nconfiguracion\nayuda");
        String selecciona = teclados.nextLine().toLowerCase();
        
        switch (selecciona)
        {
            case "acceso":
                System.out.println("Seleccionaste acceso");
                break;
            case "configuracion":
                System.out.println("Seleccionaste configuración");
                break;
            case "ayuda":
                System.out.println("Seleccionaste ayuda");
                break;
            default:
                System.out.println("No escribiste una opción.");
                break;
        }
    //Ejemplo de como crear una conversación con java
        System.out.println("Salúdame por favor");
        String saludo = teclados.nextLine().toLowerCase();
        
        if (saludo.equals("hola"))
        {
            System.out.println("¿Cómo estás?");
        }
        else
        {
            System.out.println("No te entiendo.");
        }
    //Programa que pide un número y luego dice si pertenece a las unidades, decenas, centenas o unidades de mil.
        System.out.println("Escribe un número entre 1 y 9999");
        int numero = teclados.nextInt();
        
        if (numero>=0 && numero<10)
        {
            System.out.println("Tu número pertenece a las unidades");
        }
        else if (numero>=10 && numero<100)
        {
            System.out.println("Tu número pertenece a las decenas");
        }
        else if (numero>=100 && numero<1000)
        {
            System.out.println("Tu número pertenece a las centenas");
        }
        else if (numero>=1000 && numero <10000)
        {
            System.out.println("Tu número pertenece a las unidades de mil");
        }
    */
    //Ejercicio de condicionales con random
        Random aleatorio = new Random();
        int dado1 = aleatorio.nextInt(7);
        int dado2 = aleatorio.nextInt(7);
        int dado3 = aleatorio.nextInt(7);
        System.out.println("Dado 1 = "+dado1);
        System.out.println("Dado 2 = "+dado2);
        System.out.println("Dado 3 = "+dado3);
        
        if (dado1 == 6 && dado2 == 6 && dado3 == 6)
        {
            System.out.println("Excelente");
        }
        else if(dado1 == 6 && dado2 == 6 || dado1 == 6 && dado3 == 6 || dado2 == 6 && dado3 == 6)
        {
            System.out.println("Muy bien");
        }
        else if(dado1 == 6 || dado2 == 6 || dado3 == 6)
        {
            System.out.println("Regular");
        }
        else
        {
            System.out.println("Pesimo");
        }
    }
}
