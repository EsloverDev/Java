/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafica;

import java.awt.Dimension;
import java.awt.HeadlessException;
import javax.swing.JFrame;

/**
 *
 * @author LENOVO
 */
public class Ventanaexp extends JFrame 
{

    
    public Ventanaexp() throws HeadlessException 
    {
        Dimension d=new Dimension(500, 500);
        this.setSize(d);
       // this.setDefaultCloseOperation(EXIT_ON_CLOSE);// para cerrar la ventana           
    }
    //Para poder colocar un titulo a la ventana 

    public Ventanaexp(String string) throws HeadlessException 
    {
        super(string);
       // this.setDefaultCloseOperation(EXIT_ON_CLOSE);// para cerrar la ventana
        Dimension d=new Dimension(500, 500);
        this.setSize(d);
        this.setLocation(300, 300);
    }

    


    public static void main(String[] args) 
    {
        //Ventana v=new Ventana();
       Ventanaexp v=new Ventanaexp("Este es el titulo que hemos definido");
        v.setVisible(true);
    }
    
}
