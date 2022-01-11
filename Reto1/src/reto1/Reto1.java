import java.util.Scanner;

class Reto1
{


    private final Scanner scanner = new Scanner(System.in);

    public String read()
    {
        return this.scanner.nextLine();
    }


    public void run()
    {

        String informacion = read();
                   
        String[] lista= informacion.split(" ");
        int e;
        double imc, p, a;
        p = Double.parseDouble(lista[0]);
        a = Double.parseDouble(lista[1]);  
        e = Integer.parseInt(lista[2]);

        
        if ((p>=0 && p<=150)&&(a>=0.1 && a<=2.5)&&(e>=0 && e<=110))
    {
        imc = p/(Math.pow(a,2));
        if (imc<=22 && e<45)
        {
            String mens="Bajo";
            String impresion = String.format("%.1f", imc).replace(",", ".");
            System.out.println(impresion+" "+mens);
        }
        else if (imc<=22 && e>=45)
        {
            String mens = "Medio";
            String impresion = String.format("%.1f", imc).replace(",", ".");
            System.out.println(impresion+" "+mens);
        }
        else if (imc>22 && e<45)
        {
            String mens = "Medio";
            String impresion = String.format("%.1f", imc).replace(",", ".");
            System.out.println(impresion+" "+mens);
        }
            
        else
        {
            String mens = "Alto";
            String impresion = String.format("%.1f", imc).replace(",", ".");
            System.out.println(impresion+" "+mens);
        }
    }
    else
            System.out.println("ERROR");
    
    }
}