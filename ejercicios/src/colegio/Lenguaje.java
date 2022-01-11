
package colegio;

public class Lenguaje extends Profesor
{
    
    private int horas_semana;
    private String escolaridad;

    public Lenguaje(int horas_semana, String escolaridad, String nombre, int edad, int experiencia) {
        super(nombre, edad, experiencia);
        this.horas_semana = horas_semana;
        this.escolaridad = escolaridad;
    }

    public int getHoras_semana() {
        return horas_semana;
    }

    public void setHoras_semana(int horas_semana) {
        this.horas_semana = horas_semana;
    }

    public String getEscolaridad() {
        return escolaridad;
    }

    public void setEscolaridad(String escolaridad) {
        this.escolaridad = escolaridad;
    }
    
}
