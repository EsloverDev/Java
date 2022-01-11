
package clases;

public class Cerdo 
{
    int peso;
    int edad;
    String nombre;
    char genero;
    String raza;

    public Cerdo(int peso, int edad, String nombre, char genero, String raza) 
    {
        this.peso = peso;
        this.edad = edad;
        this.nombre = nombre;
        this.genero = genero;
        this.raza = raza;
    }
    public void verinfo(String nombre)
    {
        System.out.println("El nombre del cerdo es: "+nombre);
    }
    public void comer (String nombre, String comida)
    {
        System.out.println("El cerdo "+nombre+" come: "+comida);
    }
    public static void main(String[] args)
    {
        Cerdo cerdo1 = new Cerdo(70, 5, "Porky", 'M', "duroc");
        Cerdo cerdo2 = new Cerdo(85, 7, "Jamón", 'F', "berkshr");
        cerdo1.verinfo(cerdo1.nombre);
        cerdo2.comer(cerdo2.nombre, "cereal");
    }
}
