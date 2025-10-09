/*
* WHILE
* Número Positivo ------ SOMA
* Número Negativo ------ PARA
* */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double soma = 0, num;

        System.out.print("Digite um número (negativo para parar): ");
        num = sc.nextInt();

        while (num >= 0) {
            soma += num;
            System.out.print("Digite outro número (negativo para parar): ");
            num = sc.nextInt();
        }

        System.out.println("A soma dos números positivos é: " + soma);

        sc.close();
    }
}
