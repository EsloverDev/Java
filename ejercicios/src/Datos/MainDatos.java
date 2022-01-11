
package Datos;

import java.util.Scanner;

public class MainDatos 
{

    public static void main(String[] args) 
    {
//        Scanner t = new Scanner(System.in);
//        Persona p[] = new Persona[3];
//             
//        for (int i =0; i<3; i++)
//        {
//            System.out.println("Digite el nombre, apellido y la fecha de nacimiento en formato dd mm yyyy todo separado por espacios: ");
//            String texto[] = t.nextLine().split(" ");
//            Fecha f1 = new Fecha(Integer.parseInt(texto[2]),Integer.parseInt(texto[3]),Integer.parseInt(texto[4]));
//            String nombre = texto[0];
//            String apellido = texto[1];
//            p[i] = (nombre,apellido,f1);
//        }
        Fecha f1 = new Fecha(26,6,1989);
        Fecha f2 = new Fecha(10,11,1983);
        Fecha f3 = new Fecha(5,4,2008);
        Persona p1 = new Persona("Edwin","Romero",f1);
        Persona p2 = new Persona("Diana", "Hernández",f2);
        Persona p3 = new Persona("David","Romero",f3);
        
        Persona[] per = {p1,p2,p3};
        
        for (Persona p : per)
        {
            System.out.println(p.toString());
        }
    }
    
}
