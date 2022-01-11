/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafica;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Eslover
 */
public class interfazE13 extends JFrame
{

    public interfazE13(String title) throws HeadlessException
    {
        super(title);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setBounds(250,150,500,500);
        e13();
    }

    public static void main(String[] args)
    {
        // TODO code application logic here
        interfazE13 ve = new interfazE13("Ejercicio de componentes clase 13"); //crear una ventana ve
        ve.setVisible(true);
    }
    
    private void e13()
    {
        JPanel mainPanel = new JPanel(); //crear un panel
        this.getContentPane().add(mainPanel); //añadir el panel mainPanel a la ventana ve
        mainPanel.setBorder(new TitledBorder("PanelCaption")); //ponerle un borde y un título al panel
        mainPanel.setLayout(new GridLayout(2,2)); //Definir un Layout GridLayout(cuadrícula(de 2x2)) al panel mainPanel
        
        JPanel panel1 = new JPanel();
        panel1.setBorder(new TitledBorder("Panel"));
        panel1.setLayout(new GridLayout(1,2));
               
        JList lista = new JList(new String[]{"Item 1","Item 2","Item 3","Item 4","Item 5"}); //Crear una lista de items donde podemos seleccionar uno de ellos.
        panel1.add(lista); //Añadir la lista al panel1.
        
        JPanel radioButtonPanel = new JPanel(); // creamos un panel llamado radioButtonPanel1
        JRadioButton radioButton1 = new JRadioButton("RadioButton1"); // creamos un radio button
        radioButton1.setSelected(true); //el radio button 1 aparecerá seleccionado por defecto.
        JRadioButton radioButton2 = new JRadioButton("RadioButton2");
        JRadioButton radioButton3 = new JRadioButton("RadioButton3");
        JRadioButton radioButton4 = new JRadioButton("InactiveRadio");
        radioButton4.setEnabled(false);
        radioButtonPanel.add(radioButton1);
        radioButtonPanel.add(radioButton2);
        radioButtonPanel.add(radioButton3);
        radioButtonPanel.add(radioButton4);
               
        JPanel panel1_r = new JPanel();
        panel1_r.setLayout(new BorderLayout());
        panel1_r.add(radioButtonPanel,BorderLayout.CENTER);
        panel1_r.add(new JButton("Button"),BorderLayout.SOUTH);
        
        panel1.add(panel1_r);
        mainPanel.add(panel1);
        
        JTabbedPane tabbedPane = new JTabbedPane(); //Creamos un panel en el que insertaremos varias pestañas
        JPanel tabPanel1 = new JPanel(); //Este panel lo insertaremos en el panel de pestañas
        tabPanel1.setLayout(new BorderLayout());
                        
        JPanel tabPanelCheckBoxPanel = new JPanel();
        tabPanelCheckBoxPanel.setLayout(new BoxLayout(tabPanelCheckBoxPanel, BoxLayout.Y_AXIS));
        tabPanelCheckBoxPanel.add(new JCheckBox("UncheckedCheckbox")); //Creamos botones de seleccion
        JCheckBox cb = new JCheckBox("CheckedCheckbox");
        cb.setSelected(true); //El botón aparecera seleccionado por defecto
        tabPanelCheckBoxPanel.add(cb);
        JCheckBox cb2 = new JCheckBox("InactiveCheckbox");
        cb2.setEnabled(false); // El boton estará inactivo y no tendrá la opción de seleccionarse
        tabPanelCheckBoxPanel.add(cb2);
        tabPanel1.add(tabPanelCheckBoxPanel, BorderLayout.CENTER);
        tabPanel1.add(new JSlider(1,100,70), BorderLayout.SOUTH); //Creamos una barra parecida a la del volumen en el reproductor de audio que se desliza hacia la izquierda y derecha y por defecto aparecerá en el 70%.
        tabbedPane.addTab("SelectedTab", tabPanel1); //añadimos el panel tabPanel y estará en forma de pestañas.
        tabbedPane.addTab("OtherTab", new JPanel()); //añadimos otro panel y ahora tendremos 2 pestañas en el panel tabbedPane
        mainPanel.add(tabbedPane);
        JPanel panel3 = new JPanel();
        panel3.setLayout(new BoxLayout(panel3, BoxLayout.Y_AXIS));
        panel3.add(new JTextField("TextField")); //Añadimos una celda para escribir texto
        panel3.add(new JPasswordField("PasswordField")); //Añadimos una celda para escribir una clave
        JComboBox<String> combo = new JComboBox<String>(new String[]{"Item 1"}); //creamos un combo box
        panel3.add(combo);
        
        JPanel panel4 = new JPanel();
        panel4.setLayout(new BorderLayout());
        panel4.add(panel3, BorderLayout.NORTH);
        mainPanel.add(panel4);
        
        mainPanel.add(new JTextArea("TextArea"));
    }
    
}
