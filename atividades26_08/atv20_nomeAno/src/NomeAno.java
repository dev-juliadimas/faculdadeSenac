import java.util.Scanner;

public class NomeAno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome, ano;

        System.out.print("Qual o seu nome:");
        nome = sc.nextLine();
        System.out.print("Em que ano você nasceu:");
        ano = sc.nextLine();

        System.out.printf("Sugestão de senha: %s@%s", nome, ano);
    }
}
