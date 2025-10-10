/***/
/*
* DO WHILE
* Repetir até que insira a capital correta
* */

import java.util.Scanner;

/***/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String capitalCorreta = "Brasília", capital = "";

        do {
            System.out.println("Qual a capital do Brasil?");
            capital = sc.nextLine();

            if (!capital.equalsIgnoreCase(capitalCorreta)) {
                System.out.println("Resposta incorreta. Tente novamente!");
            }

        }while (!capital.equalsIgnoreCase(capitalCorreta));

        System.out.println("Capital correta!");
        sc.close();
    }
}
