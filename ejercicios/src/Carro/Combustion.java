/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Carro;

/**
 *
 * @author Equipo
 */
public class Combustion extends Vehiculo
{
    int cilindrada;

    public Combustion(int cilindrada, String matricula, double peso) {
        super(matricula, peso);
        this.cilindrada = cilindrada;
    }
    
    public double tributoc(int cilindrada)
    {
        double impuestoc = cilindrada * 3;
        double imptotal = impuestoc + super.impuestobase();
        return imptotal;
    }

    @Override
    public String toString() {
        return super.toString()+" y su cilindrada es "+cilindrada;
    }
    
}
