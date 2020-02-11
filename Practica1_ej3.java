import java.util.Scanner;
public class Practica1_ej3 {
    public static void  main(String[] arge) {
        int contNegativos = 0;
        int sumaNegativos = 0;
        int contPositivos = 0;
        int sumaPositivos = 0;
        int contCeros = 0;
        int sumaCeros = 0;
        //Creamos el array fuera para que no se pise dentro del for
        for( int i = 0; i <= 4;  i++){
            //leer datos por teclado
            System.out.print("Dime un número: ");
            Scanner lector = new Scanner(System.in);
            int miVariable = lector.nextInt();
            System.out.println("Vuelta número: " + i);
            if (miVariable < 0) {
                sumaNegativos = sumaNegativos + miVariable;
                contNegativos++;
            }
            if (miVariable > 0) {
                sumaPositivos = sumaPositivos + miVariable;
                contPositivos++;
            }
            if (miVariable == 0) {
                sumaCeros = sumaCeros + miVariable;
                contCeros++;
            }
        }
        int mediaNegativos = sumaNegativos/contNegativos;
        int mediaPositivos = sumaPositivos/contPositivos;
        int mediaCeros = sumaCeros/contCeros;
        System.out.println("La media de negativos es: "+mediaNegativos);
        System.out.println("La media de positivos es: "+mediaPositivos);
        System.out.println("La media de ceros es: "+mediaCeros);
    }
}
