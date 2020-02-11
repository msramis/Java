import java.util.Scanner;
public class ej15 {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        //int miVariable = lector.nextInt();
        int miVariable;

        do {
            System.out.println("Dime un número:");
            miVariable = lector.nextInt();

        }
        while (miVariable < 0);
        System.out.println(miVariable);
    }
}
