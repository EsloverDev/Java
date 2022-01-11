
package explicaciones;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class ArraysDinamicosexp
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //listanormal();
      listaDinamica();
    }

    private static void listanormal() {
        int numEle=Integer.parseInt(JOptionPane.showInputDialog("Cuantos elementos vas a ingresar"));
        String lista[]=new String[numEle];
        for(int i=0;i<lista.length;i++){
            lista[i]=new String();
            lista[i]=JOptionPane.showInputDialog("Por favor ingresa el valor del elemento "+(i+1));
        }
        System.out.println("Resultados de la lista normal");
        for(int i=0;i<lista.length;i++){//En la lista normal es .length
            System.out.println(lista[i]);
        }
    }

    private static void listaDinamica() {
        //Como vamos a crear una lista dinamica no neceistamos pedir cuantos datos va a ingresar
        ArrayList <String> lista=new ArrayList<String>();
        char respuesta;
        do{
            lista.add(JOptionPane.showInputDialog("Por favor ingresa el valor para la lista dinamica"));
            respuesta=JOptionPane.showInputDialog("Quieres ingresar mas elementos? s/n").charAt(0);
        }while(respuesta=='s'  || respuesta=='S' );

        System.out.println("Resultados de la lista dinamica");
        for(int i=0;i<lista.size();i++){ //y en el array es size
            System.out.println(lista.get(i));
    }
    }
    
}
