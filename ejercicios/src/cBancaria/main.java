
package cBancaria;

public class main 
{
    public static void main(String[] args)
    {
        //ESTO ES INSTANCIAR, SIGNIFICA CREAR DOS OBJETOS QUE TIENEN LOS ATRIBUTOS ASOCIADOS DE LA CLASE CUENTA
        Cuenta c1 = new Cuenta();
        Cuenta c2 = new Cuenta("Juan");
        //ACÁ LE ESTOY PASANDO ARGUMENTOS DE C1 A LA CLASE CUENTA
        c1.setTitular("Andres");
        c1.setCantidad(100);
        //ACÁ ESTOY LLAMANDO LOS MÉTODOS DEFINIDOS EN LA CLASE CUENTA
        c2.ingresar(500);
        c2.retirar(100);
        
        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }
}
