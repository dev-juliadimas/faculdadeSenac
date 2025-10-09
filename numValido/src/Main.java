/*
 * DO WHILE
 * Solicitar um número de 1 a 100 e repetir até o número ser válido
 * */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Digite um número entre 1 e 100: ");
            numero = sc.nextInt();

            if (numero < 1 || numero > 100) {
                System.out.println("Número inválido! Tente novamente.");
            }

        } while (numero < 1 || numero > 100);

        System.out.println("✅ Número válido digitado: " + numero);
        sc.close();
    }
}
