
package Polimorfismo;


public class VehiculoTurismoexp extends Vehiculoexp
{
    private int puertas;

    public VehiculoTurismoexp(int puertas, String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.puertas = puertas;
    }

    public int getPuertas() {
        return puertas;
    }
    
    @Override
    public String mostrarDatos(){
       return "Matricula: "+matricula+"\nMarca: "+marca+"\nModelo: "+modelo+"\nPuertas"+puertas; 
    }
    
}
