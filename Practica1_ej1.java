
import java.util.Arrays;
import java.util.Scanner;
public class Practica1_ej1 {
    public static void  main(String[] arge) {
        //Creamos el array fuera para que no se pise dentro del for
        int[] arrayNumeros = new int[5];
        for( int i = 0; i <= 4;  i++){
            //leer datos por teclado
            System.out.print("Dime un número: ");
            Scanner lector = new Scanner(System.in);
            int miVariable = lector.nextInt();
            System.out.println("Vuelta número: " + i);
            arrayNumeros[i] = miVariable;
        }
        for (int i = 0; i < arrayNumeros.length; i++) {
            System.out.println(arrayNumeros[i]);

        }
    }
}