
package Polimorfismo;


public class VehiculoDeportivoexp  extends Vehiculoexp
{
  private int cilindraje;  

    public VehiculoDeportivoexp(int cilindraje, String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.cilindraje = cilindraje;
    }

    public int getCilindraje() {
        return cilindraje;
    }
  
  @Override
      public String mostrarDatos(){
       return "Matricula: "+matricula+"\nMarca: "+marca+"\nModelo: "+modelo+"\nCilindraje"+cilindraje; 
    }
}
