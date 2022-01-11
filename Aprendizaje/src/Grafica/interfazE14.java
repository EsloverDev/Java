/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafica;

import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Eslover
 */
public class interfazE14 extends JFrame
{
    private JPanel ContentPane;
    private JTextField textField;
    private JButton btnGuardar;
    private JButton btnValidar;
    private JLabel lblSalida;
    private String respuesta = "";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        interfazE14 frame = new interfazE14();
        frame.setVisible(true);
    }
    public interfazE14()
    {
        setTitle("Pregunta de seguridad");
        setBounds(40, 100, 600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        /*
        * Indica que cuando se cierre la ventana se acaba la aplicacion,
        * si no lo indicamos cuando cerremos la ventana la aplicacion seguira funcionando
        */
        setVisible(true);
        GridLayout ejemploLayout = new GridLayout(0,2);
        ContentPane = new JPanel(ejemploLayout);
        setContentPane(ContentPane); //esto es para añadir el panel a la ventana
        
        //componentes
        JLabel lblPregunta = new JLabel("¿Cuál es el nombre de tu primera mascota?");
        ContentPane.add(lblPregunta);
        textField = new JTextField();
        ContentPane.add(textField);
        btnGuardar = new JButton("Guardar");
        ContentPane.add(btnGuardar);
        btnValidar = new JButton("Validar");
        ContentPane.add(btnValidar);
        lblSalida = new JLabel("---");
        ContentPane.add(lblSalida);
        
        //Eventos
        btnGuardar.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                lblSalida.setText("Respuesta guardada.");
                respuesta = textField.getText();
            }
        });
        
        btnValidar.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(textField.getText().equals(respuesta))
                {
                    lblSalida.setText("Respuesta Correcta.");
                }
                else
                {
                    lblSalida.setText("Respuesta Incorrecta.");
                }
            }
        });
    }
}
