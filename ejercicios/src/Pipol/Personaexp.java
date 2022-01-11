
package Pipol;


public class Personaexp
{
    private String nombre;
    private String apellido;
    private int edad;
    
    //Vamos a generar el constructor para todos los atributos y los getter 

    public Personaexp(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }
    


    
}
