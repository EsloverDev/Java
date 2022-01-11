
package colegio;

public class Profesor 
{
    String nombre;
    int edad;
    int experiencia;

    public Profesor(String nombre, int edad, int experiencia) 
    {
        this.nombre = nombre;
        this.edad = edad;
        this.experiencia = experiencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }
    
}
