import java.util.Scanner;

public class ej17 {
    public static void main(String[] args) {
        System.out.println("Escribe un día de la semana:");
        Scanner lector = new Scanner(System.in);
        String miVariable = lector.next();
        switch (miVariable) {
            case "lunes":
                System.out.println("Día laborable");
                break;
            case "martes":
                System.out.println("Día laborable");
                break;
            case "miercoles":
                System.out.println("Día laborable");
                break;
            case "jueves":
                System.out.println("Día laborable");
                break;
            case "viernes":
                System.out.println("Día laborable");
                break;
            case "sabado":
                System.out.println("Día no laborable");
                break;
            case "domingo":
                System.out.println("Día no laborable");
                break;
        }
    }
}
