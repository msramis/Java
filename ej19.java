import java.util.Scanner;

public class ej19 {
    public static void main(String[] args) {
        System.out.print("Escribe un número: ");
        Scanner lector = new Scanner(System.in);
        int numero1 = lector.nextInt();
        String.valueOf(numero1).length();
        System.out.print("Las cifras del número introducido son: " + String.valueOf(numero1).length());
    }
}
