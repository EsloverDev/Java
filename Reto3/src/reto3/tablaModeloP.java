/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reto3;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Equipo
 */
class tablaModeloP extends AbstractTableModel
{
    private String[] NombreCol = {"Codigo","Nombre", "Precio", "Inventario"};
    private List<Producto> prods = new ArrayList<>();

    public tablaModeloP(List<Producto> producto)
    {
        this.prods = producto;
    }
    
    @Override
    public int getRowCount()
    {
        return this.prods.size();
    }

    @Override
    public int getColumnCount()
    {
        return this.NombreCol.length;
    }

    @Override
    public Object getValueAt(int filas, int columnas)
    {
        Object respuesta;
        
        switch(columnas)
        {
            case 0:
                respuesta = this.prods.get(filas).getCodigo();
                break;
            case 1:
                respuesta = this.prods.get(filas).getNombre();
                break;
            case 2:
                respuesta = this.prods.get(filas).getPrecio();
                break;
            default:
                respuesta = this.prods.get(filas).getInventario();
        }
        return respuesta;
    }
    
    @Override
    public String getColumnName(int colum)
    {
        return this.NombreCol[colum];
    }
    
    public void actTabla()
    {
        fireTableDataChanged();
    }
    
    public Producto detalle (int fila)
    {
        return this.prods.get(fila);
    }
}
