
package Grafica;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author LENOVO
 */
public class Eventos extends JFrame {

    JPanel contenedor;
    JButton boton;
    JLabel etiqueta;
    JTextField caja;
    JTextArea areaTexto;
    public Eventos(){
        contenedor=new JPanel();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setBounds(300, 300, 500, 500);
        this.setLocationRelativeTo(null);
        this.getContentPane().add(this.contenedor);
        this.contenedor.setLayout(null);
        //accionBoton();
        //accionMouse();
        //accionesTeclado();
        //validarNumero();
        //validarCorreo();
    }
    protected void accionBoton(){
        boton =new JButton("Regalanos tu nombre ");
        contenedor.add(boton);
       boton.setBounds(10, 10, 400, 30);

        caja =new JTextField();
        contenedor.add(caja);
       caja.setBounds(10, 50, 400, 30);

        etiqueta =new JLabel();
        contenedor.add(etiqueta);
       etiqueta.setBounds(10, 100, 400, 30);

        ActionListener accion=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etiqueta.setText("Hola "+caja.getText());
            }
        };

        boton.addActionListener(accion);
    }
    public static void main(String[] args) {
        Eventos e= new Eventos();
        e.setVisible(true);
    }

    protected void accionMouse() {
       boton =new JButton("Eventos del raton ");
       contenedor.add(boton);
       boton.setBounds(10, 10, 400, 30);

       caja =new JTextField();
       contenedor.add(caja);
       caja.setBounds(10, 50, 400, 30);
           MouseListener l = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
               //caja.setText("mouseClicked");//El cliked sobre escribe al released 
            }

            @Override
            public void mousePressed(MouseEvent e) {
                caja.setText("mousePressed");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                caja.setText("mouseReleased");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                caja.setText("mouseEntered");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                caja.setText("mouseExited");
            }
        };
           boton.addMouseListener(l);
       
    }

    protected void accionesTeclado()
    {
       caja =new JTextField();
       contenedor.add(caja);
       caja.setBounds(10, 50, 400, 30);
       areaTexto =new JTextArea();
       contenedor.add(areaTexto);
       areaTexto.setBounds(10, 80, 400, 200);

        KeyListener l=new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {//Funciona para teclas que se muestran(a,b,c,..) y enter
                areaTexto.append("keyTyped\n");
            }

            @Override
            public void keyPressed(KeyEvent e) {// cuando mantenemos presionada una tecla
                areaTexto.append("keyPressed\n");
            }

            @Override
            public void keyReleased(KeyEvent e) {// Se activa cuando suelto la tecla
                areaTexto.append("keyReleased\n");
                if(e.getKeyChar()=='*'){
                    areaTexto.append("Presionaste el asterico\n");
                }
                if(e.getKeyChar()=='\n'){
                    areaTexto.append("Presionaste enter\n");
                }
                if(e.getKeyChar()==' '){
                    areaTexto.append("Presionaste espacio\n");
                }
            }
        };
        caja.addKeyListener(l);
    }

    protected void validarNumero() 
    {
     caja =new JTextField();
     contenedor.add(caja);
     caja.setBounds(10, 50, 400, 30);
     areaTexto =new JTextArea();
     contenedor.add(areaTexto);
     areaTexto.setBounds(10, 80, 400, 200);
     
     KeyListener l=new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                if(esNumero(caja.getText())==true){
                    areaTexto.append("Si es numero\n");
                }else{
                    areaTexto.append("No, esto no es un numero\n");
                }
            }
        };
        caja.addKeyListener(l);
    }
        public boolean esNumero(String texto)
        {
            boolean resultado;
            try {
                Integer.parseInt(texto);
                resultado=true;
            } catch (Exception e) {
                resultado=false;
            }
            return resultado;
        }

    protected void validarCorreo() 
    {
     caja =new JTextField();
     contenedor.add(caja);
     caja.setBounds(10, 50, 400, 30);
     areaTexto =new JTextArea();
     contenedor.add(areaTexto);
     areaTexto.setBounds(10, 80, 400, 200);
     KeyListener l=new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
            if(e.getKeyChar()=='\n'){
                if(esCorreo(caja.getText())==true){
                    areaTexto.append("Efectivamente es un correo\n");
                }
                else{
                    areaTexto.append("Corrige, no es un correo\n");
                }
            }
            }
            };
            caja.addKeyListener(l);
            }
    public boolean esCorreo(String correo){
        Pattern patroncito = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        //Lo anterior es una expresion regular, con varias expresiones regulares, con el fin de comprobar que se haya escrito un correo 
        Matcher comparar=patroncito.matcher(correo);
        return comparar.find();
    }
     
}



    

