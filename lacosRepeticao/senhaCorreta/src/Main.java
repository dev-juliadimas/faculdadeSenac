/*
 * WHILE
 * Pede a senha até que esteja correta
 * */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String senhaCorreta = "123", senha = "";

        while (!senha.equals(senhaCorreta)) {
            System.out.print("Digite a senha: ");
            senha = sc.nextLine();

            if (!senha.equals(senhaCorreta)) {
                System.out.println("Senha incorreta. Tente novamente!");
            }
        }

        System.out.println("Acesso permitido!");
        sc.close();
    }
}
