
package Grafica;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.PopupMenu;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
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
 * @author LENOVO
 */
public class DifLayouts extends JFrame 
{

        JPanel panel1;
        JPanel panel2;
        JPanel panel3;

    public DifLayouts(String title) throws HeadlessException{
        super(title);
        this.setBounds(300, 300, 500, 500);
        this.setLocationRelativeTo(null);
       //iniciarPaneles();
       //iniciaEtiquetas();
       ejercicio13();
    }
        
    

    public static void main(String[] args){
       DifLayouts ventana= new DifLayouts("Titulo de mi nueva ventana");
       ventana.setVisible(true);
    }

    private void iniciarPaneles()
    {
        JPanel contenedor=new JPanel();
        this.getContentPane().add(contenedor);
        contenedor.setBackground(Color.red);
        JPanel panel1=new JPanel();
        JPanel panel2=new JPanel();
        JPanel panel3=new JPanel();
        contenedor.add(panel1);
        contenedor.add(panel2);
        contenedor.add(panel3);
        panel1.setBackground(new Color(0, 51, 102));
        panel2.setBackground(new Color(0, 102, 255));
        panel3.setBackground(new Color(255, 0, 255));
        this.panel1=new JPanel();
        this.panel2=new JPanel();
        this.panel3=new JPanel();
        contenedor.add(this.panel1);
        contenedor.add(this.panel2);
        contenedor.add(this.panel3);
        this.panel1.setBackground(new Color(0, 51, 102));
        this.panel2.setBackground(new Color(0, 102, 255));
        this.panel3.setBackground(new Color(255, 0, 255));
        contenedor.setLayout(new BoxLayout(contenedor, BoxLayout.X_AXIS));
    }

    private void iniciaEtiquetas() {
        //CREAMOS LAS ETIQUETAS
        JLabel e1=new JLabel("<html>Hola soy la etiqueta1</html>");
        JLabel e2=new JLabel("<html>Hola soy la etiqueta2</html>");
        JLabel e3=new JLabel("<html>Hola soy la etiqueta3</html>");
        JLabel e4=new JLabel("<html>Hola soy la etiqueta4</html>");
        
        //AÑADIMOS LAS ETIQUETAS A LOS PANELES
        this.panel1.add(e1);
        this.panel2.add(e2);
        this.panel3.add(e3);
        this.panel3.add(e4);
        
        //CAMBIAMOS EL COLOR DE LAS ETIQUETAS
        e1.setForeground(Color.white);
        e2.setForeground(Color.white);
        e3.setForeground(Color.white);
        e4.setForeground(Color.DARK_GRAY);
        //CAMBIAMOS EL LAYOUT DE CADA PANEL
        this.panel1.setLayout(null);
        this.panel2.setLayout(null);
        this.panel3.setLayout(new FlowLayout());

        e1.setText("<html>Hola chicos</html>");
//        this.panel2.setVisible(false);
    }

    private void ejercicio13() 
    {
    JPanel mainPanel= new JPanel();
    this.getContentPane().add(mainPanel);
    mainPanel.setBorder(new TitledBorder("PanelCaption"));
    mainPanel.setLayout(new GridLayout(2,2));
    
    JPanel panel1 = new JPanel();
    panel1.setBorder(new TitledBorder("Panel"));
    panel1.setLayout(new GridLayout(1,2));
    //this.getContentPane().add(panel1);
    
    JList lista = new JList(new String[]{"Item 1","Item 2","Item 3","Item 4","Item 5"});
    panel1.add(lista);
    
    JPanel radioButtonPanel = new JPanel();
//    this.getContentPane().add(radioButtonPanel);
    JRadioButton radioButton1 = new JRadioButton("RadioButton1");
    radioButton1.setSelected(true);
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
    
    JTabbedPane tabbedPane = new JTabbedPane();
    JPanel tabPanel1 = new JPanel();
    tabPanel1.setLayout(new BorderLayout());
    
    JPanel tabPanelCheckBoxPanel= new JPanel();
    tabPanelCheckBoxPanel.setLayout(new BoxLayout(tabPanelCheckBoxPanel, BoxLayout.Y_AXIS));
    tabPanelCheckBoxPanel.add(new JCheckBox("UncheckedCheckbox"));
    JCheckBox cb = new JCheckBox("CheckedCheckBox");
    cb.setSelected(true);
    tabPanelCheckBoxPanel.add(cb);
    JCheckBox cb2 = new JCheckBox("InactiveCheckBox");
    cb2.setEnabled(false);
    tabPanelCheckBoxPanel.add(cb2);
    tabPanel1.add(tabPanelCheckBoxPanel,BorderLayout.CENTER);
    tabPanel1.add(new JSlider(1,100,70),BorderLayout.SOUTH);
    tabbedPane.addTab("SelectedTab", tabPanel1);
    tabbedPane.addTab("OtherTab", new JPanel());
    mainPanel.add(tabbedPane);
    JPanel panel3 = new JPanel();
    panel3.setLayout(new BoxLayout(panel3, BoxLayout.Y_AXIS));
    panel3.add(new JTextField("TextField"));
    panel3.add(new JPasswordField("PasswordField"));
    JComboBox<String> combo = new JComboBox<String>(new String[]{"item1"});
    panel3.add(combo);
    
    
    JPanel panel4 = new JPanel();
    panel4.setLayout(new BorderLayout());
    panel4.add(panel3, BorderLayout.NORTH);
    mainPanel.add(panel4);
    
    mainPanel.add(new JTextArea("TextArea"));
    
    add(mainPanel);
    }
}
