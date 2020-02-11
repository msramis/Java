import java.util.Scanner;

public class Practica1_ej5 {
    public static void main(String[] args) {
        int[] arrayPrimero = new int[10];
        int[] arraySegundo = new int[10];
        int[] arrayTercero = new int[20];
        //guardamos valores primer array
        for (int i = 0; i <= 9 ; i++) {
            System.out.println("PRIMER ARRAY");
            System.out.print("Dime un número: ");
            Scanner lector = new Scanner(System.in);
            int miVariable = lector.nextInt();
            System.out.println(miVariable);
            arrayPrimero[i]=miVariable;//metemos todos los valores (empezando desde 0) de miVariable en arryPrimero
        }
        //guardamos valores segundo array
        for (int i = 0; i <= 9 ; i++) {
            System.out.println("SEGUNDO ARRAY");
            System.out.print("Dime un número: ");
            Scanner lector = new Scanner(System.in);
            int miVariable = lector.nextInt();
            System.out.println(miVariable);
            arraySegundo[i]=miVariable;//metemos todos los valores (empezando desde 0) de miVariable en arrySegundo
        }

        //intercalación de valores de dos arrays en un tercero
        int j = 0;
        for (int i = 0; i <= 9 ; i++) {
            //añadimos valor de primer array en el tercer array en posicion 0
            arrayTercero[j] = arrayPrimero[i];
            j++; //la incrementacion es importante para que no se pisen los valores
            //añadimos el valor del segundo array en el tercer array en posicion 0
            arrayTercero[j] = arraySegundo[i];
            j++; //la incrementacion es importante para que no se pisen los valores
        } //así conseguimos el tercer array con la incrementación que deseabamos (1º arrayPrimero, el 1º arraySegundo, el 2º P , el 2º S..etc)
        System.out.println("TERCER ARRAY CON INTERCALACIÓN");
        for (int i = 0; i < arrayTercero.length; i++) {
            System.out.println(arrayTercero[i]);
        }
    }
}
