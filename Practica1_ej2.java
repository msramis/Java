import java.util.Scanner;
public class Practica1_ej2 {
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
        for (int i = arrayNumeros.length-1; i >= 0; i--) {
            System.out.println(arrayNumeros[i]);

        }
    }
}
