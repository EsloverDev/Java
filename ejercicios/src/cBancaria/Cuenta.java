
package cBancaria;

public class Cuenta 
{
    //ATRIBUTOS:
    private String titular;
    private double cantidad;

    //CONSTRUCTOR SIN PARÁMETROS:
    public Cuenta()
    {
    
    }

    //CONSTRUCTOR CON PARÁMETROS
    public Cuenta(String titular)
    {
        this.titular = titular;
    }

    //MÉTODOS SET, SIRVEN PARA INGRESAR ARGUMENTOS UNA VEZ SE HA CREADO EL OBJETO EN EL MAIN.
    public void setTitular(String titular) 
    {
        this.titular = titular;
    }
    
    public void setCantidad(double cantidad) 
    {
        this.cantidad = cantidad;
    }
    
    //MÉTODO INGRESAR (FUNCIÓN QUE NO RETORNA NADA PORQUE ES VOID)
    public void ingresar(double cantidad)
    {
        if (cantidad > 0)
        {
            this.cantidad = this.cantidad + cantidad;
        }
    }
    
    //MÉTODO RETIRAR
    public void retirar(double cantidad)
    {
        if (this.cantidad - cantidad < 0)
        {
            this.cantidad = 0;
        }
        else
        {
            this.cantidad = this.cantidad - cantidad;
        }
    }

  
    @Override
    public String toString() 
    {
        return "Cuenta{" + "titular=" + titular + ", cantidad=" + cantidad + '}';
    }
    
}
