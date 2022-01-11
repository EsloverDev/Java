
package colegio;

public class Matematica extends Profesor{
    
    private int codigo;
    private String jornada;

    public Matematica(int codigo, String jornada, String nombre, int edad, int experiencia) {
        super(nombre, edad, experiencia);
        this.codigo = codigo;
        this.jornada = jornada;
    }
   
    public void mostrarDatos()
    {
        System.out.println("Los datos del profesor son: "+getNombre()+getEdad()+getExperiencia()+codigo+jornada);
    }
    public void soportePago()
    {
        System.out.println("Los datos del profesor son: "+codigo+jornada);
    }
}
