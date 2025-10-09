import java.util.Scanner;

public class ArqExtensao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String arquivo, extensao, nomeCompleto;

        System.out.print("Nome do arquivo: ");
        arquivo = sc.nextLine();
        System.out.println("Extensão:");
        extensao = sc.nextLine();

        nomeCompleto = arquivo + "." + extensao;

        System.out.printf("ARQUIVO: %s", nomeCompleto);
        sc.close();
    }
}
