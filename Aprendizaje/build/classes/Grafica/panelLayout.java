/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafica;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Equipo
 */
public class panelLayout extends JFrame
{
    public panelLayout(String string) throws HeadlessException 
    {
        super(string);
        Dimension d = new Dimension (500, 500);
        this.setSize(d);
        this.setLocation(300, 300);
        iniciarPaneles();
        iniciarlayout();
    }

    public double suma(double n, double num)
    {
        double resultado = n + num;
        return resultado;
    }
    
    public double resta(double n, double num)
    {
        double resultado = n - num;
        return resultado;
    }
    
    public double división(double n, double num)
    {
        double resultado = 0;
        if (num == 0)
        {
            System.out.println("No se puede dividir por 0");
        }
        else
        {
            resultado = n / num;
        }
        return resultado;
    }
    
    public double multiplicacion(double n, double num)
    {
        double resultado = n * num;
        return resultado;
    }
    
    public static void main(String[] args)
    {
        panelLayout v = new panelLayout("Calculadora");
        v.setVisible(true);
    }
    
    protected void iniciarPaneles()
    {
//        JPanel contenedor = new JPanel();
//        this.getContentPane().add(contenedor);
//        contenedor.setBackground(Color.BLACK);
//        JPanel panel1 = new JPanel();
//        JPanel panel2 = new JPanel();
//        JPanel panel3 = new JPanel();
//        contenedor.add(panel1);
//        contenedor.add(panel2);
//        contenedor.add(panel3);
//        panel1.setBackground(Color.RED);
//        panel2.setBackground(Color.yellow);
//        panel3.setBackground(Color.GREEN);
//        contenedor.setLayout(new BoxLayout(contenedor, BoxLayout.Y_AXIS));
//        //panel3.setVisible(false);
    }
    
    protected void iniciarlayout()
    {
//        //SIN NINGÚN LAYOUT
//        this.setLayout(null);
//        JLabel label1 = new JLabel("1");
//        label1.setBounds(100, 100, 1000, 200); //ESTO SE USA CUANDO EL LAYOUT ES NULL
//        add(label1);
//        JButton boton1 = new JButton("Boton 1");
//        boton1.setBounds(200, 40, 200, 200);
//        add(boton1);
//        JLabel label2 = new JLabel("2");
//        label2.setBounds(300, 200, 100, 200);
//        add(label2);
//        JButton boton2 = new JButton("Boton 2");
//        boton2.setBounds(400, 30, 100, 20);
//        add(boton2);

        
//        //CON FLOWLAYOUT
//        this.setLayout(new FlowLayout());
//        JLabel label8 = new JLabel("8");
//        add(label8);
//        JButton boton8 = new JButton("Boton 8");
//        add(boton8);
//        JLabel label9 = new JLabel("9");
//        add(label9);
//        JButton boton9 = new JButton("Boton 9");
//        add(boton9);
        
//        // CON GRIDLAYOUT
//        this.setLayout(new GridLayout(2, 2));
//        JLabel label10 = new JLabel("10");
//        add(label10);
//        JButton boton10 = new JButton("Boton 10");
//        add(boton10);
//        JLabel label11 = new JLabel("11");
//        add(label11);
//        JButton boton11 = new JButton("Boton 11");
//        add(boton11);
//        JButton boton3 = new JButton("Boton 3");
//        add(boton3);


//        // GRID BAG LAYOUT
//        this.setLayout(new GridBagLayout());
//        GridBagConstraints gbc = new GridBagConstraints();
//        
//        gbc.gridx = 2;
//        gbc.gridy = 0;
//        gbc.gridwidth = 1;
//        gbc.gridheight = 1;
//        JLabel label3 = new JLabel("3");
//        add(label3,gbc);
//        
//        gbc.gridx = 0;
//        gbc.gridy = 0;
//        gbc.gridwidth = 1;
//        gbc.gridheight = 1;
//        JButton boton4 = new JButton("Boton 4");
//        add(boton4,gbc);
//        
//        gbc.gridx = 2;
//        gbc.gridy = 0;
//        gbc.gridwidth = 1;
//        gbc.gridheight = 1;
//        JLabel label4 = new JLabel("4");
//        add(label4,gbc);
//        
//        gbc.gridx = 0;
//        gbc.gridy = 0;
//        gbc.gridwidth = 1;
//        gbc.gridheight = 1;
//        JButton boton5 = new JButton("Boton 5");
//        add(boton5,gbc);
        
//        //BORDER LAYOUT
//        this.setLayout(new BorderLayout());
//        JLabel label5 = new JLabel("ponga un texto largo.");
//        add(label5,BorderLayout.NORTH);
//        JButton boton6 = new JButton("Boton 6");
//        add(boton6,BorderLayout.WEST);
//        JLabel label6 = new JLabel("6");
//        add(label6,BorderLayout.SOUTH);
//        JButton boton7 = new JButton("Boton 7");
//        add(boton7,BorderLayout.CENTER);
//        JLabel label7 = new JLabel("7");
//        add(label7,BorderLayout.EAST);

//        //BOX LAYOUT
//        this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
//        JLabel label12 = new JLabel("12");
//        label12.setAlignmentX(LEFT_ALIGNMENT);
//        add(label12);
//        JButton boton12 = new JButton("Boton 12");
//        boton12.setAlignmentX(RIGHT_ALIGNMENT);
//        add(boton12);
//        JLabel label13 = new JLabel("13");
//        label13.setAlignmentX(CENTER_ALIGNMENT);
//        add(label13);
//        JButton boton13 = new JButton("Boton 13");
//        boton13.setAlignmentX(LEFT_ALIGNMENT);
//        add(boton13);
        
//        //CARD LAYOUT
//        CardLayout cards = new CardLayout();
//        this.setLayout(cards);
//        JLabel label14 = new JLabel("14");
//        add(label14,"LABEL 14");
//        JButton boton14 = new JButton("Boton 14");
//        add(boton14,"BOTON 14");
//        JLabel label15 = new JLabel("15");
//        add(label15,"LABEL 15");
//        JButton boton15 = new JButton("Boton 15");
//        add(boton15,"BOTON 15");
//        cards.show(this.getContentPane(),"");
    }
}
