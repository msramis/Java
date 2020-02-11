import java.util.Scanner;

public class Practica1_ej6 {
    public static void main(String[] args) {
        int[] arrayPrimero = new int[12];
        int[] arraySegundo = new int[12];
        int[] arrayTercero = new int[24];
        //guardamos valores primer array
        for (int i = 0; i <= 11 ; i++) {
            System.out.println("PRIMER ARRAY");
            System.out.print("Dime un número: ");
            Scanner lector = new Scanner(System.in);
            int miVariable = lector.nextInt();
            System.out.println(miVariable);
            arrayPrimero[i]=miVariable;//metemos todos los valores (empezando desde 0) de miVariable en arryPrimero
        }
        //guardamos valores segundo array
        for (int i = 0; i <= 11 ; i++) {
            System.out.println("SEGUNDO ARRAY");
            System.out.print("Dime un número: ");
            Scanner lector = new Scanner(System.in);
            int miVariable = lector.nextInt();
            System.out.println(miVariable);
            arraySegundo[i]=miVariable;//metemos todos los valores (empezando desde 0) de miVariable en arrySegundo
        }

        //intercalación de valores de dos arrays en un tercero
        int j = 0;//k = 0;
        for (int i = 0; i <= 8 ; i+=3 , j+=3) {

            arrayTercero[j+1] = arrayPrimero[i+1];
            arrayTercero[j+2] = arrayPrimero[i+2];
            arrayTercero[j+3] = arrayPrimero[i+3];

            arrayTercero[j+4] = arraySegundo[i+1];
            arrayTercero[j+5] = arraySegundo[i+2];
            arrayTercero[j+6] = arraySegundo[i+3];

            //k++;

            //if (k == 5){
              //  k = 0;
           // }

            //añadimos valor de primer array en el tercer array en posicion 0
            //arrayTercero[j] = arrayPrimero[i];
            //j++; //la incrementacion es importante para que no se pisen los valores
            //añadimos el valor del segundo array en el tercer array en posicion 0
           // arrayTercero[j] = arraySegundo[i];
           // j++; //la incrementacion es importante para que no se pisen los valores
        } //así conseguimos el tercer array con la incrementación que deseabamos (1º arrayPrimero, el 1º arraySegundo, el 2º P , el 2º S..etc)
        System.out.println("TERCER ARRAY CON INTERCALACIÓN");
        for (int i = 0; i < arrayTercero.length; i++) {
            System.out.println(arrayTercero[i]);
        }
    }
}