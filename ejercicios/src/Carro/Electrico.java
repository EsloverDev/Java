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
public class Electrico extends Vehiculo
{
    int precio;

    public Electrico(int precio, String matricula, double peso) {
        super(matricula, peso);
        this.precio = precio;
    }
    public double tributo(double precio)
    {
        double tributot = precio * 0.09;
        double total = tributot + super.impuestobase();
        return total;
    }

    @Override
    public String toString() {
        return super.toString()+" y su precio es de $"+precio;
    }
    
}
