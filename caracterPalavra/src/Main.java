/***
 * FOR
 * Solicitar uma palavra e mostrar caracter por caracter utilizando o charAt
 * ***/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        String palavra;

        System.out.println("Me informe uma palavra:");
        palavra = sc.nextLine();

        for (i = 0; i < palavra.length(); i++){
            System.out.println(palavra.charAt(i));
        }

        sc.close();
    }
}
