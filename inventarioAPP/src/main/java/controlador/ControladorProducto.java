/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Producto;
import modelo.RepositorioProducto;
import org.springframework.data.relational.core.conversion.DbActionExecutionException;
import vista.Interfaz;

/**
 *
 * @author Eslover
 */
public class ControladorProducto implements ActionListener
{

    RepositorioProducto repositorioPro;
    Interfaz vista;
    DefaultTableModel tablaPorDefecto;
    
    private int codigo;
    private String nombre;
    private double precio;
    private int inventario;
    
    public ControladorProducto()
    {
        super();
    }
    
    public ControladorProducto(RepositorioProducto repositorioPro, Interfaz vista)
    {
        super();
        this.repositorioPro = repositorioPro;
        this.vista = vista;
        vista.setVisible(true);
        eventos();
        rellenar();
    }
    
    private void eventos() {
        vista.getBtnAdd().addActionListener(this);
        vista.getBtnUpdate().addActionListener(this);
        vista.getBtnDelete().addActionListener(this);
        vista.getBtnInvent().addActionListener(this);
        vista.getTblTable().addMouseListener(new MouseAdapter()
        {
            public void mouseClicked(MouseEvent e)
            {
                fillCell(e);
            }
        });
    }
    
    public void rellenar()
    {
        String[] Titles = new String[]{"Codigo", "Nombre", "Precio", "Inventario"};
        tablaPorDefecto = new DefaultTableModel(Titles, 0);
        List<Producto> listaProductos = (List<Producto>) repositorioPro.findAll();
        for (Producto prod : listaProductos)
        {
            tablaPorDefecto.addRow(new Object[]{prod.getCodigo(), prod.getNombre(), prod.getPrecio(), prod.getInventario()});
        }
        vista.getTblTable().setModel(tablaPorDefecto);
        vista.getTblTable().setPreferredSize(new Dimension(350, tablaPorDefecto.getRowCount() * 16));
    }
    
    private void fillCell(MouseEvent e)
    {
        JTable objetivo = (JTable) e.getSource();
        vista.getTxtCode().setText(vista.getTblTable().getModel().getValueAt(objetivo.getSelectedRow(), 0).toString());
        vista.getTxtName().setText(vista.getTblTable().getModel().getValueAt(objetivo.getSelectedRow(), 1).toString());
        vista.getTxtPrice().setText(vista.getTblTable().getModel().getValueAt(objetivo.getSelectedRow(), 2).toString());
        vista.getTxtInvent().setText(vista.getTblTable().getModel().getValueAt(objetivo.getSelectedRow(), 3).toString());
    }
    
    //metodo para validar que no existan campos vacios en las celdas de nombre, precio e inventario.
    private boolean rectificarDat()
    {
        if ("".equals(vista.getTxtName().getText()) || "".equals(vista.getTxtPrice().getText()) || "".equals(vista.getTxtInvent().getText()))
        {
            JOptionPane.showMessageDialog(null, "Debe llenar todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
    
    //metodo para cargar los datos y para validar que precio e inventario tengan caracteres numéricos
    private boolean chargeDat()
    {
        try
        {
            codigo = Integer.parseInt("".equals(vista.getTxtCode().getText()) ? "0" : vista.getTxtCode().getText());
            nombre = vista.getTxtName().getText();
            precio = Double.parseDouble(vista.getTxtPrice().getText());
            inventario = Integer.parseInt(vista.getTxtInvent().getText());
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }
    
    //metodo para dejar las celdas en blanco
    private void cleanCell()
    {
        vista.getTxtCode().setText("");
        vista.getTxtName().setText("");
        vista.getTxtPrice().setText("");
        vista.getTxtInvent().setText("");
    }
    
    private void Agregar()
    {
        try
        {
            if (rectificarDat())
            {
                if (chargeDat())
                {
                    Producto produ = new Producto(nombre, precio, inventario);
                    repositorioPro.save(produ);
                    JOptionPane.showMessageDialog(null, "Producto agregado exitosamente");
                    cleanCell();
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Los campos precio e inventario deben ser numéricos", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        catch (DbActionExecutionException e)
        {
            JOptionPane.showMessageDialog(null, "El producto ya existe");
        }
        finally
        {
            rellenar();
        }
    }
    
    private void Actualizar()
    {
        try
        {
            if(rectificarDat())
            {
                if (chargeDat())
                {
                    Producto produ = new Producto(codigo, nombre, precio, inventario);
                    repositorioPro.save(produ);
                    JOptionPane.showMessageDialog(null, "Producto actualizado con exito");
                    cleanCell();
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Los campos precio e inventario deben ser numéricos", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        catch (DbActionExecutionException e)
        {
            JOptionPane.showMessageDialog(null, "El producto ya existe");
        }
        finally
        {
            rellenar();
        }
    }
    
    private void Eliminar()
    {
        try
        {
            if(rectificarDat())
            {
                if (chargeDat())
                {
                    Producto produ = new Producto(codigo, nombre, precio, inventario);
                    repositorioPro.delete(produ);
                    JOptionPane.showMessageDialog(null, "Producto eliminado exitosamente");
                    cleanCell();
                }
            }
        }
        catch (DbActionExecutionException e)
        {
            JOptionPane.showMessageDialog(null, "Ocurrio un error");
        }
        finally
        {
            rellenar();
        }
    }
    
    private void Informe()
    {
        String proMay = precioMay();
        String proMen = precioMen();
        String prome = promedio();
        String total = inventTot();
        JOptionPane.showMessageDialog(null, proMay+" "+proMen+" "+prome+" "+total);
    }
    
    private String precioMay()
    {
        String nombre = "";
        double precioAu = 0;
        List<Producto> listaPro = (List<Producto>) repositorioPro.findAll();
        for (Producto prod : listaPro)
        {
            if (prod.getPrecio() > precioAu)
            {
                nombre = prod.getNombre();
                precioAu = prod.getPrecio();
            }
        }
        return nombre;
    }
    
    private String precioMen()
    {
        String nombre = "";
        double precioAu = 99999999;
        List<Producto> listaPro = (List<Producto>) repositorioPro.findAll();
        for (Producto prod : listaPro)
        {
            if (prod.getPrecio() < precioAu)
            {
                nombre = prod.getNombre();
                precioAu = prod.getPrecio();
            }
        }
        return nombre;
    }
    
    private String promedio()
    {
        double pluss = 0;
        double result = 0;
        List<Producto> listaProd = (List<Producto>) repositorioPro.findAll();
        
        for (Producto produ : listaProd)
        {
            pluss += produ.getPrecio();
        }
        result = pluss / listaProd.size();
        return String.format("%.1f", result);
    }
    
    private String inventTot()
    {
        double mult = 0;
        double total = 0;
        List<Producto> listaProd = (List<Producto>) repositorioPro.findAll();
        
        for (Producto produ : listaProd)
        {
            mult = produ.getPrecio() * produ.getInventario();
            total += mult;
        }
        return String.format("%.1f", total);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae)
    {
        if (ae.getSource() == vista.getBtnAdd())
        {
            Agregar();
        }
        if (ae.getSource() == vista.getBtnUpdate())
        {
            Actualizar();
        }
        if (ae.getSource() == vista.getBtnDelete())
        {
            Eliminar();
        }
        if (ae.getSource() == vista.getBtnInvent())
        {
            Informe();
        }
    }
}
