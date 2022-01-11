
package explicaciones;

import javax.swing.JOptionPane;


public class Arraysexp {

    public static void main(String[] args) {
        // Tenemos varias formas de declarar un arreglo o vector
        //1
        int x[];
        x = new int[3];
        x[0]=2;
        x[1]=5;
        x[2]=4;
        //2
        int y[]={6,5,1,7};
        //Si quisieramos imprimir una ubicacion especifica seria:
        System.out.println(y[2]);
        //Para recorrerlo seria:
        //len
        for(int i=0;i<x.length;i++){
            System.out.println("El indice del arreglo es:"+i + " La cual tiene un valor de:"+x[i]);
        }
//        //Para recorrer y seria:
        for(int j=0;j<y.length;j++){
            System.out.println("El indice del arreglo es:"+j + " La cual tiene un valor de:"+y[j]);
        } 
        //por ejemplo
        String texto=JOptionPane.showInputDialog("Amigo!!!! escribe un texto");
        int longitud=texto.length();
        char[] caracteres=new char[longitud];
        int inverso=longitud;
        for(int i=0;i<longitud;i++){
            caracteres[i]=texto.charAt(inverso-1);
            inverso--;
        }
        System.out.println(caracteres);
        
        //for each
        String [] perros={"Pincher","Labrador","Ovejero","pug","Pastor","Golden"};

        for(int i=0;i<perros.length;i++){
            System.out.println((i+1)+" "+perros[i]);
        }
        System.out.println("_________________");
        int i=1;
        for(String perro:perros){
            System.out.println(i+" "+perro);
            i++;
        }
    }
    
}
