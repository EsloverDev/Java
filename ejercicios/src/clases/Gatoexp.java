
package explicaciones;

/**
 *
 * @author LENOVO
 */
public class Gatoexp {
    int edad;
    String nombre;
    String color;
    
    public Gatoexp(int edad, String nombre, String color) {
    	this.edad = edad;
	this.nombre = nombre;
        this.color=color;
    }
    public static void main(String[] args) {
        Gatoexp gato1= new Gatoexp(5,"ronro","gris");
        Gatoexp gato2 = new Gatoexp(1,"motas","negro");
        System.out.println("El gato 1 se llama: "+gato1.nombre);
    }
}
