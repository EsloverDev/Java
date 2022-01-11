/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafica;

/**
 *
 * @author Equipo
 */
import java.awt.GridLayout;
import java.awt.EventQueue;
import javax.swing.*;
import java.awt.event.*;

public class EjemploEvento extends JFrame
{
    private JPanel contentPane;
    private JTextField textField;
    private JButton btnGuardar;
    private JButton btnValidar;
    private JLabel lblPregunta;
    private JLabel lblSalida;
    private String respuesta = "";
    
    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                try
                {
                    EjemploEvento frame = new EjemploEvento();
                    frame.setVisible(true);
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
        });
    }
    
    public EjemploEvento()
    {
        setTitle("Pregunta de seguridad");
        setBounds(40, 100, 655, 520);
        /*
        * Indica que cuando se cierre la ventana se acaba la aplicacion,
        * si no lo indicamos cuando cerremos la ventana la aplicacion seguira funcionando
        */
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        GridLayout ejemploLayout = new GridLayout(0,2);
        contentPane =new JPanel(ejemploLayout);
        setContentPane(contentPane);
        
        //Componentes
        lblPregunta = new JLabel("¿Cuál es el nombre de tu primera mascota?");
        contentPane.add(lblPregunta);
        textField = new JTextField();
        contentPane.add(textField);
        btnGuardar = new JButton("Guardar");
        contentPane.add( btnGuardar);
        btnValidar = new JButton("Validar");
        contentPane.add( btnValidar);
        lblSalida = new JLabel("---");
        contentPane.add(lblSalida);
        
        //Eventos
        btnGuardar.addActionListener(new ActionListener()
        {
            public void actionPerformed (ActionEvent e)
            {
                lblSalida.setText("Respuesta guardada");
                respuesta = textField.getText();
            }
        });
        
        btnValidar.addActionListener(new ActionListener()
        {
            public void actionPerformed (ActionEvent e)
            {
                
                if (textField.getText().equals(respuesta))
                {
                    lblSalida.setText("Respuesta correcta");
                }
                else
                {
                lblSalida.setText("Respuesta incorrecta");
                }
            }
        });
    }
}