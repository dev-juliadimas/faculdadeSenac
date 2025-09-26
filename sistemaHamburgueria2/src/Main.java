import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<ItemPedido> carrinho = new ArrayList<>();
        int opcao, codPedido, qtdPedido;
        double porcDesconto = 0, vlFinal, preco = 0, vlTotal = 0;;
        String item = "";
        boolean valido = true;

        System.out.println("🍔 Bem-vindo à Lanchonete!");

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Adicionar item");
            System.out.println("2 - Remover item");
            System.out.println("3 - Finalizar pedido");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    AdicionarItem.executar(carrinho, sc);
                    break;

                case 2:
                    RemoverItem.executar(carrinho, sc);
                    break;

                case 3:
                    FinalizarPedido.executar(carrinho, sc);
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 3);

        sc.close();
    }
}
