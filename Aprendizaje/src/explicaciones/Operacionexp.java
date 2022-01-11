
package explicaciones;

import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class Operacionexp {
    //Atributos
    int suma, num1, num2, resta;
    
    //Metodos
    public void leerNumeros(){
       num1= Integer.parseInt(JOptionPane.showInputDialog("Ingresa un entero"));
       num2= Integer.parseInt(JOptionPane.showInputDialog("Ingresa un entero"));
    }
    //Metodo para pedir los dos numeros
    public void sumar(){
        suma=num1+num2;
    }
    public void restar(){
        resta=num1-num2;
    }
    
    public void mostrarArgumentos(){
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
    }
    
    public static void main(String[] args) {
        Operacionexp opera= new Operacionexp();
        opera.leerNumeros();
        opera.sumar();
        opera.restar();
        opera.mostrarArgumentos();
                
        
    }
}
