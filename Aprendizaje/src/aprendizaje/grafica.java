
package aprendizaje;

import javax.swing.JOptionPane;

public class grafica 
{

    public static void main(String[] args) 
    {
        String cadena = JOptionPane.showInputDialog("Digite una frase: ");
        JOptionPane.showMessageDialog(null,"Tu frase es: "+cadena);
        
        int entero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número entero: "));
        JOptionPane.showMessageDialog(null,"El número que digitó es: "+entero);
        
        float flotante = Float.parseFloat(JOptionPane.showInputDialog("digite un número decimal: "));
        JOptionPane.showMessageDialog(null, "El decimal que digitó es: "+flotante);
        
        double doble =Double.parseDouble(JOptionPane.showInputDialog("digite un número decimal: "));
        JOptionPane.showMessageDialog(null, "El decimal que digitó es: "+doble);
        
        char caracter = JOptionPane.showInputDialog("Digite un caracter: ").charAt(0);
        JOptionPane.showMessageDialog(null, "El caracter que digitó es: "+caracter);
    }
    
}
