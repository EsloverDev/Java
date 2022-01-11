
package Polimorfismo;


public class PpalPoliexp
{


    public static void main(String[] args) 
    {
       Vehiculoexp misVehiculos[]= new Vehiculoexp[3];
       
       misVehiculos[0]= new Vehiculoexp("FGT452","Audi","R13");
       misVehiculos[1]= new VehiculoTurismoexp(4,"RRR123","Ford","G45");
       misVehiculos[2]= new VehiculoDeportivoexp(2000,"abc123","BMW","2021");
//Aqui ya tenemos polimorfismo porque estamos creando en un arreglo de tipo vehiculo, un objeto de una de sus hijas
    for(Vehiculoexp vehiculo:misVehiculos){
        System.out.println(vehiculo.mostrarDatos());
        System.out.println("");
    }
    }
    
}
