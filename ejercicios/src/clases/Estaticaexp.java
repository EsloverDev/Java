
package clases;

/**
 *
 * @author LENOVO
 */
public class Estaticaexp {

    private static String frase="Mi frase";

    //METODOS ESTATICOS
    public static int sumar (int n1,int n2){
           int suma= n1+n2;
           return suma;
       }
//    
    public static void main(String[] args) {
//       Estaticaexp objeto1= new Estaticaexp();
//       Estaticaexp objeto2 =new Estaticaexp();
//       objeto2.frase="Ya no es mi frase";
//       System.out.println(objeto1.frase);
//       System.out.println(objeto2.frase);
        
//Un atributo estático como ya no le pertenece al objeto sino a la clase no es necesario instanciarlo 
//Es decir no tenemos que crear un objeto para llamar el atributo(static)
       // System.out.println(Estaticaexp.frase);
       
       //METODOS ESTATICOS
      System.out.println("La suma es: "+Estaticaexp.sumar(3,4));
        //Como sumar es un metodo estatico no es necesario instanciarlos 
        //con un objeto porque ya no le pertenece a los obejtos sino a la clase
        
    }
    
}
