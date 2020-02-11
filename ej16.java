import java.util.Scanner;

public class ej16 {
    public static void main(String[] args) {
        boolean correcto = false;
        String contrasena = "hola";
        System.out.println("Escribe la contraseña:");
        Scanner lector = new Scanner(System.in);
        String miVariable = lector.next();
        int intentos = 2;
        for (int i = 0; i < intentos && !correcto; i++) {

            if (miVariable.equals(contrasena)){ //igual que poner ==
                System.out.println("Contraseña correcta");
                    correcto = true;
            }
            else {
                System.out.println("Contraseña incorrecta, inténtalo de nuevo");
                System.out.println("Escribe la contraseña:");
                miVariable = lector.next();

            }
        }

    }
}
