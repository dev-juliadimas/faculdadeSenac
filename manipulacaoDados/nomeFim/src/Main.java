/*
* DO WHILE
* Solicitar nome e idade até que o nome seja "fim"
* */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        int idade;

        do {
            System.out.print("Digite o nome (ou 'fim' para encerrar): ");
            nome = sc.nextLine();

            if (!nome.equalsIgnoreCase("fim")) {
                System.out.print("Digite a idade: ");
                idade = sc.nextInt();
                sc.nextLine();

                System.out.println("Nome: " + nome + ", Idade: " + idade);
                System.out.println();
            }

        } while (!nome.equalsIgnoreCase("fim"));

        System.out.println("Programa encerrado.");
        sc.close();
    }
}
