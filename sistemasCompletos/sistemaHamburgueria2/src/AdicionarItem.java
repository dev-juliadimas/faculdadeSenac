import java.util.List;
import java.util.Scanner;

public class AdicionarItem {
    public static void executar(List<ItemPedido> carrinho, Scanner sc) {
        String item = "";
        double preco = 0;
        boolean valido = true;
        int codPedido;

        System.out.println("\nNossos lanches são os seguintes:");
        System.out.println("1 - Hambúrguer          R$18,00");
        System.out.println("2 - Cheeseburguer       R$20,00");
        System.out.println("3 - Batata-frita        R$12,00");
        System.out.println("4 - Refrigerante        R$8,00");
        System.out.println("5 - Suco Natural        R$8,00");
        System.out.println("6 - Milkshake           R$15,00");
        System.out.println("7 - Salada              R$16,00");
        System.out.print("Digite o código do produto: ");

        codPedido = sc.nextInt();


        switch (codPedido) {
            case 1: item = "Hambúrguer"; preco = 18; break;
            case 2: item = "Cheeseburguer"; preco = 20; break;
            case 3: item = "Batata-frita"; preco = 12; break;
            case 4: item = "Refrigerante"; preco = 8; break;
            case 5: item = "Suco Natural"; preco = 8; break;
            case 6: item = "Milkshake"; preco = 15; break;
            case 7: item = "Salada"; preco = 16; break;
            default:
                System.out.println("⚠️ Código inválido!");
                valido = false;
        }

        if (valido) {
            System.out.printf("Quantos %s você deseja? ", item);
            int qtdPedido = sc.nextInt();
            carrinho.add(new ItemPedido(item, qtdPedido, preco));
            System.out.println("✅ Item adicionado ao carrinho!");
        }
    }
}
