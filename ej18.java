import java.util.Scanner;

public class ej18 {
    public static void main(String[] args) {
        System.out.println("Escribe primer numero:");
        Scanner lector = new Scanner(System.in);
        int numero1 = lector.nextInt();
        System.out.println("Escribe segundo numero:");
        int numero2 = lector.nextInt();
        int aleatorio = 0;
        for (int i = 0; i < 10; i++) {
            aleatorio = (int) Math.floor(Math.random() * (numero1 - numero2) + numero2);
            System.out.println(aleatorio);
        }


    }

}
