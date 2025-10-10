import java.util.List;
import java.util.Scanner;

public class FinalizarPedido {
    public static void executar(List<ItemPedido> carrinho, Scanner sc) {
        double porcDesconto = 0;
        double vlFinal;
        String catDesconto = "Cliente Comum";

        if (carrinho.isEmpty()) {
            System.out.println("⚠️ Você não adicionou nenhum item!");
            return; // sai do método
        }

        double vlTotal = 0;
        for (ItemPedido p : carrinho) {
            vlTotal += p.getTotal();
        }

        System.out.println("\nVocê tem direito a algum desconto?");
        System.out.println("1 - Estudante (10%)");
        System.out.println("2 - Idoso (20%)");
        System.out.println("3 - Nenhum");
        int codDesconto = sc.nextInt();

        if (codDesconto == 1) {
            porcDesconto = 10;
            catDesconto = "Estudante";
        } else if (codDesconto == 2) {
            porcDesconto = 20;
            catDesconto = "Idoso";
        }

        vlFinal = vlTotal - ((vlTotal * porcDesconto) / 100);

        // Comprovante
        System.out.println("\n=== COMPROVANTE DE COMPRA ===");
        for (ItemPedido p : carrinho) {
            System.out.printf("%dx %s  -  R$%.2f%n", p.quantidade, p.nome, p.getTotal());
        }
        System.out.printf("Categoria: %s%n", catDesconto);
        System.out.printf("Desconto aplicado: %.2f%%%n", porcDesconto);
        System.out.printf("Valor final: R$%.2f%n", vlFinal);
        System.out.println("=============================");
        System.out.println("🍟 Bom apetite!");
    }
}
