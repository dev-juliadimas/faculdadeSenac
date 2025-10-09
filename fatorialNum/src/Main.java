/***/
/*
* FOR
* Calcular o fatorial do número informado
* */

import java.util.Scanner;

/***/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número para calcular o fatorial: ");
        int numero = sc.nextInt();
        long fatorial = 1;

        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }

        System.out.println("O fatorial de " + numero + " é " + fatorial);
        sc.close();
    }
}
