import java.util.List;
import java.util.Scanner;

public class RemoverItem {
    public static void executar(List<ItemPedido> carrinho, Scanner sc) {
        if (carrinho.isEmpty()) {
            System.out.println("⚠️ Seu carrinho está vazio!");
            return; // sai do método sem erro
        }

        System.out.println("\nItens no carrinho:");
        for (int i = 0; i < carrinho.size(); i++) {
            ItemPedido p = carrinho.get(i);
            System.out.printf("%d - %s (x%d) R$%.2f%n",
                    i + 1, p.nome, p.quantidade, p.getTotal());
        }

        System.out.print("Digite o número do item que deseja remover: ");
        int removeIndex = sc.nextInt() - 1;

        if (removeIndex >= 0 && removeIndex < carrinho.size()) {
            carrinho.remove(removeIndex);
            System.out.println("🗑️ Item removido!");
        } else {
            System.out.println("⚠️ Índice inválido!");
        }
    }
}
