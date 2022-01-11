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
public class VehiculoMain 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Vehiculo v1 = new Electrico(60000000,"ABC123",473);
        Vehiculo v2 = new Electrico(85000000,"DEF456",750);
        Vehiculo v3 = new Combustion(1400,"GHI789",1370);
        Vehiculo v4 = new Combustion(1600,"JKL101",1540);
        
        System.out.println(v1.toString()+" por lo tanto paga de impuesto "+v1.impuestobase());
        System.out.println(v2.toString()+" por lo tanto paga de impuesto "+v2.impuestobase());
        System.out.println(v3.toString()+" por lo tanto paga de impuesto "+v3.impuestobase());
        System.out.println(v4.toString()+" por lo tanto paga de impuesto "+v4.impuestobase());
    }
    
}
