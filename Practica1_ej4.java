import java.util.Scanner;
public class Practica1_ej4 {
    public static void main(String[] arge) {
        int[] arrayNumeros = new int[10];
        for (int i = 0; i <= 9; i++) {
            //leer datos por teclado
            System.out.print("Dime un número: ");
            Scanner lector = new Scanner(System.in);
            int miVariable = lector.nextInt();
            System.out.println("Vuelta número: " + i);
        }
        for (int i = 0; i < arrayNumeros.length; i++) {
            System.out.println(arrayNumeros[i]);

        }


    }
}
