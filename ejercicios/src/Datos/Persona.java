
package Datos;

public class Persona 
{
    String nombre, apellido;
    Fecha nacimiento;

    public Persona(String nombre, String apellido, Fecha nacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacimiento = nacimiento;
    }

    public Fecha getNacimiento() 
    {
        return nacimiento;
    }

    @Override
    public String toString() 
    {
        return nombre + " " + apellido + ", nació el " + nacimiento.toString();
    }

}
