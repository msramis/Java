import java.util.Scanner;

public class ej22 {
    public static void main(String[] args) {
        System.out.print("Escribe una frase:");
        Scanner lector = new Scanner(System.in);
        String frase = lector.nextLine(); //nextLine para que saque la linea entera
        System.out.println(frase);
        int contador=0;

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i)==('a') || frase.charAt(i)==('e') || frase.charAt(i)==('i'))  {
                contador++;
            }

       }
        System.out.println(contador);

    }
}
