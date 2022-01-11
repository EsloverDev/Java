
package Datos;

public class Fecha 
{
    int dia, mes, anio;

    public Fecha(int dia, int mes, int anio) 
    {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    @Override
    public String toString() 
    {
        String resultado = "";
        if (dia<10)
        {
            resultado = resultado + "0" + dia;
        }
        else
        {
            resultado = resultado + dia;
        }
        resultado = resultado + "/";
        if (mes<10)
        {
            resultado = resultado + "0" + mes;
        }
        else
        {
            resultado = resultado + mes;
        }
        resultado += "/" + anio;
        
        return resultado;
    }
    
}
