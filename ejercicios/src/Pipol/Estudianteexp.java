package Pipol;


//Con extends le estamos indicando que la clase estudiante va a heredar de la clase persona
//por tanto no hace falta agregarle los atributos de persona
public class Estudianteexp extends Personaexp{
    private int codigoEstudiante;
    private float nota;
    
    //El constructor de una clase hija o subclase no es igual
    public Estudianteexp(String nombre,String apellido,int edad,int codigoEstudiante,float nota){
        //Como ya inicializamos los atributos en la clase persona hacemos 
        super(nombre,apellido,edad);
        this.codigoEstudiante=codigoEstudiante;
        this.nota=nota;
        
    }
    public void mostrarDatos(){
    // System.out.println("Nombre del estudiante "+nombre);//Nos genera error si lo tenemos como private
        System.out.println("El nombre es: "+getNombre());
        System.out.println("El apellido es: "+getApellido());
        System.out.println("La Edad es: "+getEdad());
        System.out.println("El codigo es: "+codigoEstudiante);
        System.out.println("La nota es:"+nota);
    }
    
}
