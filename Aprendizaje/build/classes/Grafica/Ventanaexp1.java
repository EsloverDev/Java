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
 * @author LENOVO
 */
public class Ventanaexp1 extends JFrame 
{

    
//    public Ventana() throws HeadlessException {
//        Dimension d=new Dimension(500, 500);
//        this.setSize(d);
//       // this.setDefaultCloseOperation(EXIT_ON_CLOSE);// para cerrar la ventana
//    }
    //Para poder colocar un titulo a la ventana 

    public Ventanaexp1(String string) throws HeadlessException {
        super(string);
       this.setDefaultCloseOperation(EXIT_ON_CLOSE);// para cerrar la ventana
        Dimension d=new Dimension(500, 500);
        this.setSize(d);
        this.setLocation(300, 300);
        //Para trabajar paneles
        //iniciarPaneles();
        iniciarlayouts();
        }

    


    public static void main(String[] args) 
    {
        //Ventana v=new Ventana();
       Ventanaexp1 v=new Ventanaexp1("Este es el titulo que hemos definido");
        v.setVisible(true);
    }

    protected void iniciarPaneles() 
    {
        JPanel contenedor=new JPanel();//Creamos un nuevo panel llamado contenedor
        this.getContentPane().add(contenedor);
        contenedor.setBackground(Color.MAGENTA);
        JPanel panel1=new JPanel();
        JPanel panel2=new JPanel();
        JPanel panel3=new JPanel();
        contenedor.add(panel1);
        contenedor.add(panel2);
        contenedor.add(panel3);
        panel1.setBackground(Color.blue);
//        //panel1.setBackground(new Color(0,102,255));
        panel2.setBackground(Color.green);
       panel3.setBackground(Color.pink);
       contenedor.setLayout(new BoxLayout(contenedor,BoxLayout.Y_AXIS));
       panel3.setVisible(false);
        
        
    }

    protected void iniciarlayouts() {
        //Al colocar setLayout null estamos diciendo que no utilice ningun layout
//       this.setLayout(null);
//        JLabel label1 = new JLabel("1");
//        label1.setBounds(10,10,100,20);
//        add(label1);
//        JButton boton1 = new JButton("Boton1");
//        boton1.setBounds(200, 40, 100,20);
//        add(boton1);
//        JLabel label2 = new JLabel("2");
//        label2.setBounds(300,20,100,20);
//        add(label2);
//        JButton boton2 = new JButton("Boton2");
//        boton2.setBounds(400, 30, 100,20);
//        add(boton2);

        // con FlowLayout
//         this.setLayout(new FlowLayout());
//        JLabel label1 = new JLabel("1");
//        add(label1);
//        JButton boton1 = new JButton("Boton1");
//        add(boton1);
//        JLabel label2 = new JLabel("2");
//        add(label2);
//        JButton boton2 = new JButton("Boton2");
//        add(boton2);

        //GridLayout
//        this.setLayout(new GridLayout(2,2));
//        JLabel label1 = new JLabel("1");
//        //label1.setBounds(10,10,100,20);
//        add(label1);
//        JButton boton1 = new JButton("Boton1");
//        //boton1.setBounds(200, 40, 100,20);
//        add(boton1);
//        JLabel label2 = new JLabel("2");
//        //label2.setBounds(300,20,100,20);
//        add(label2);
//        JButton boton2 = new JButton("Boton2");
//        //boton2.setBounds(400, 30, 100,20);
//        add(boton2);
//        JButton boton3 = new JButton("Boton 3");
//        add(boton3);


//GridBagLayout 
//        this.setLayout(new GridBagLayout());
//        GridBagConstraints gbc = new GridBagConstraints();
        
        
//        gbc.gridx=2;
//        gbc.gridy=0;
//        gbc.gridwidth=1;
//        gbc.gridheight=1;
//        JLabel label1 = new JLabel("1");
//        //label1.setBounds(10,10,100,20);
//        add(label1,gbc);
//        
//        gbc.gridx=0;
//        gbc.gridy=0;
//        gbc.gridwidth=1;
//        gbc.gridheight=1;
//        JButton boton1 = new JButton("Boton1");
//        //boton1.setBounds(200, 40, 100,20);
//        add(boton1,gbc);
//        
//        gbc.gridx=1;
//        gbc.gridy=1;
//        gbc.gridwidth=1;
//        gbc.gridheight=2;
//        JLabel label2 = new JLabel("2");
//        //label2.setBounds(300,20,100,20);
//        add(label2,gbc);
//        
//        gbc.gridx=0;
//        gbc.gridy=2;
//        gbc.gridwidth=1;
//        gbc.gridheight=2;
//        JButton boton2 = new JButton("Boton2");
//        //boton2.setBounds(400, 30, 100,20);
//        add(boton2,gbc);

//BORDER LAYOUT
//        this.setLayout(new BorderLayout());
//        JLabel label1 = new JLabel("1kfkdkdkdskldkdskldkldlkdslkdslkds");
//        //label1.setBounds(10,10,100,20);
//        add(label1,BorderLayout.NORTH);
//        JButton boton1 = new JButton("Boton1");
//        //boton1.setBounds(200, 40, 100,20);
//        add(boton1,BorderLayout.WEST);
//        JLabel label2 = new JLabel("2");
//        //label2.setBounds(300,20,100,20);
//        add(label2,BorderLayout.SOUTH);
//        JButton boton2 = new JButton("Boton2");
//        //boton2.setBounds(400, 30, 100,20);
//        add(boton2,BorderLayout.CENTER);
        
//        //BOX LAYOUT
//        this.setLayout(new BoxLayout(this.getContentPane(),BoxLayout.Y_AXIS));
//        JLabel label1 = new JLabel("1");
//        label1.setAlignmentX(LEFT_ALIGNMENT);
//        //label1.setBounds(10,10,100,20);
//        add(label1);
//        JButton boton1 = new JButton("Boton1");
//        boton1.setAlignmentX(RIGHT_ALIGNMENT);
//        //boton1.setBounds(200, 40, 100,20);
//        add(boton1);
//        JLabel label2 = new JLabel("2");
//        label2.setAlignmentX(CENTER_ALIGNMENT);
//        //label2.setBounds(300,20,100,20);
//        add(label2);
//        JButton boton2 = new JButton("Boton2");
//        boton2.setAlignmentX(LEFT_ALIGNMENT);
//        //boton2.setBounds(400, 30, 100,20);
//        add(boton2); 
        
        //CARDLAYOUT
        CardLayout cards = new CardLayout();
        this.setLayout(cards);
        JLabel label1 = new JLabel("1");
        //label1.setBounds(10,10,100,20);
        add(label1,"LABEL1");
        JButton boton1 = new JButton("Boton1");
        //boton1.setBounds(200, 40, 100,20);
        add(boton1, "BOTON1");
        JLabel label2 = new JLabel("2");
        //label2.setBounds(300,20,100,20);
        add(label2,"LABEL2");
        JButton boton2 = new JButton("Boton2");
        //boton2.setBounds(400, 30, 100,20);
        add(boton2,"BOTON2"); 
        
        cards.show(this.getContentPane(), "");
         
    }
    
}
