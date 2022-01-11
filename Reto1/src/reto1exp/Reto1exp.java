package reto1exp;
import java.util.Scanner;

public class Reto1exp { //cambiar por el numero del reto
    private final Scanner scanner = new Scanner(System.in);
    protected String salida; // Esto lo requiro yo

    public String read(){
        return this.scanner.nextLine();
    }

    public void print(Object objeto) {
        this.salida = (String)objeto;
        System.out.println(objeto);
    }

    public void run(){
        //Aqui todo su codigo y calculos
        print(""); //Aqui tu respuesta
    }
}