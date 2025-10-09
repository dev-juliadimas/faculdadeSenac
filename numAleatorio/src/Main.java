/*
 * DO WHILE
 * Gerar um número aleatório até que o usuário acerte
 * */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int numAleatorio = (int) (Math.random() * 10);

        System.out.println("Tente adivinhar o número (0 a 9)!");

        do {
            System.out.println("Insira um número");
            num = sc.nextInt();

            if (num < numAleatorio) {
                System.out.println("Tente um número MAIOR!");
            } else if (num > numAleatorio) {
                System.out.println("Tente um número MENOR!");
            }
        }while (numAleatorio != num);

        System.out.println("Você acertou o número");
        sc.close();
    }
}
