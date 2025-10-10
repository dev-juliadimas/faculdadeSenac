/*
* DO WHILE
* Repetir até que o usuário escolha sair (8)
* */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int codPedido;

        do {
            System.out.println("Seja bem vindo!");
            System.out.println("Nossos lanches são os seguintes:");
            System.out.println("1 - Hambúrguer          R$18,00");
            System.out.println("2 - Cheeseburguer       R$20,00");
            System.out.println("3 - Batata-frita        R$12,00");
            System.out.println("4 - Refrigerante        R$8,00");
            System.out.println("5 - Suco Natural        R$8,00");
            System.out.println("6 - Milkshake           R$15,00");
            System.out.println("7 - Salada              R$16,00");
            System.out.println("8 - Sair");
            System.out.println("Insira somente o número");
            codPedido = sc.nextInt();

        }while (codPedido != 8);
        sc.close();
    }
}
