/*
* DO WHILE
* Solicitar números até que ultrapasse 1000
* */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num, soma = 0;

        do {
            System.out.print("Informe um número:");
            num = sc.nextDouble();
            soma += num;
        }while (soma <= 1000);

        System.out.println("A soma ultrapassou 1000");
        System.out.println("SOMA: " + soma);

        sc.close();
    }
}
