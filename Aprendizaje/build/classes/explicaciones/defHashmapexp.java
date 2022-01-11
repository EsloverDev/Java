
package explicaciones;

import java.util.HashMap;

/**
 *
 * @author LENOVO
 */
public class defHashmapexp
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        HashMap<Integer,String> mapaPersonas= new HashMap<Integer,String>();//Para trabajrlo como hashmap se debe importar el hashmap 
        //Pero tambien se puede manejar como map asi:
        //Map<Integer,String> mapaPersonas= new HashMap<Integer,String>;
        //Si queremos añadir datos usamos .put:
        mapaPersonas.put(123, "Persona1");
        mapaPersonas.put(456, "Persona2");
        mapaPersonas.put(789, "Persona3");
        mapaPersonas.put(1234, "Persona4");
        
        //Para imprimir nuestro hashmap completo
//        System.out.println("Completo seria:");
//        System.out.println(mapaPersonas);
        
        //Si queremos imprimir solo las claves 
        System.out.println("Claves: ");
        System.out.println(mapaPersonas.keySet());
        
        //Si queremos imprimir solo los valores:
        System.out.println("Valores:");
        System.out.println(mapaPersonas.values());
        
        //Si queremos remover algun campo seria 
        mapaPersonas.remove(789);
        System.out.println(mapaPersonas);
    }
    
}
