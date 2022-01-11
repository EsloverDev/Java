package reto1exp;
public class Pruebasexp {
    public static void main(String [] argv) {
        TestReto r;

        String [][] casosReto1 = {{"-1 -1 -1", "ERROR"},
                                {"73 1.65 45", "26,814 ALTO"},
                                {"73 1.65 44", "26,814 MODERADO"},
                                {"69.2 1.61 32", "26,697 MODERADO"},
                                {"0 0 0", "ERROR"}}; 
        
        String [][] casosReto2 = {{"BORRAR", "3 Peras 2700 33", "Jamon Galletas 5388,9 1331400,0"},
                                {"AGREGAR", "11 Maiz 70000 1", "Maiz Galletas 11018,2 1490500,0"},
                                {"ACTUALIZAR", "15 Papa 1500 10", "ERROR"},
                                {"AGREGAR", "3 Peras 2700 33", "ERROR"},
                                {"BORRAR", "15 Papa 1500 10", "ERROR"},
                                {"ACTUALIZAR", "10 Jamon 500 10", "Arandanos Galletas 3670,0 1275500,0"}};

        // Para el reto 1
        for (String[] caso : casosReto1) {
            System.out.println("--------");
            r = new TestReto(caso);
            r.run();
            System.out.print(caso[0]);
            if (r.salida.equals(caso[1])) {
                System.out.println(" -> OK");
            } else {
                System.err.println(" -> FAIL");
                System.err.println("Obtenido: " + r.salida);
                System.err.println("Esperado: " + caso[1]);
            }
        }

        // Para el reto 2
        /*for (String[] caso : casosReto2) {
            System.out.println("--------");
            r = new TestReto(caso);
            r.run();
            System.out.print(caso[0]);
            if (r.salida.equals(caso[2])) {
                System.out.println(" -> OK");
            } else {
                System.err.println(" -> FAIL");
                System.err.println("Obtenido: " + r.salida);
                System.err.println("Esperado: " + caso[2]);
            }
        }*/

    }
}

class TestReto extends Reto1exp { // cambiar por Reto1, Reto2 o Reto3
    private String [] caso;
    private int indice = -1;

    public TestReto(String [] caso) {
        this.caso = caso;
    }

    @Override
    public String read() {
        this.indice ++;
        return this.caso[this.indice];
    }

    @Override
    public void print(Object objeto) {
        this.salida = (String)objeto;
    }
}