/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reto3;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.*;

/**
 *
 * @author Eslover
 */
public class Interfaz3 extends JFrame
{

    public Interfaz3(String title) throws HeadlessException
    {
        super(title);
        this.setBounds(250,150,500,500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args)
    {
        Interfaz3 Ventana = new Interfaz3("La mini tienda de Pepe");
        Ventana.setVisible(true);
    }
    
    private void app()
    {
        JPanel main = new JPanel();
        this.getContentPane().add(main);
        main.setLayout(new GridLayout(0,2));
        
        JPanel panel1 = new JPanel();
        panel1.setLayout(new BorderLayout());
        panel1.add(new JLabel("¡Bienvenido a la APP de inventario!"),BorderLayout.NORTH);
        main.add(panel1);
    }
}
