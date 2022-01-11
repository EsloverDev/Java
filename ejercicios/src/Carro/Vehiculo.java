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
public class Vehiculo 
{
    String matricula;
    double peso;
    
    public double impuestobase()
    {
        double impuesto = peso * 0.45;
        return impuesto;
    }

    public Vehiculo(String matricula, double peso) {
        this.matricula = matricula;
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "El vehiculo con matricula "+matricula+", pesa "+peso;
    }
    
}
