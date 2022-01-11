
package Biblioteca;

public class MainBiblioteca 
{

    public static void main(String[] args) 
    {
        //ACÁ ESTOY CREANDO UN NUEVO OBJETO DE LA CLASE LIBRO Y DEBO PASARLE LOS ARGUMENTOS QUE ME PIDE
        Libro l1 = new Libro("152 - 354","La Odisea","Homero",448);
        Libro l2 = new Libro("975 - 354","El factor X","Dr Camilo Cruz",192);
        Libro l3 = new Libro("456 - 753","Piense y hagase rico","Napoleon Hill",265);
        
        //ACÁ CREE UN ARREGLO DE LA CLASE LIBRO CON UN TAMAÑO DE 3
        Libro[] li = new Libro[3];
        //ACÁ LE ASIGNO A CADA POSICIÓN DEL ARRECLO UN OBJETO CON TODOS SUS ARGUMENTOS
        li[0] = l1;
        li[1] = l2;
        li[2] = l3;
        
        //ACÁ CREE UNA VARIABLE DEL TIPO LIBRO Y LA INICIALIZÉ CON EL LIBRO 1
        Libro mp = l1;
        
        for (Libro l : li)
        {
            System.out.println(l.toString());
            if (l.getPaginas()>mp.getPaginas())
            {
                mp = l;
            }
        }
        System.out.println("El libro con más páginas es "+mp.getTitulo());
    }
    
}
