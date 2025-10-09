import java.util.Scanner;

public class CompraParcelada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double vlProduto, vlParcelado;

        System.out.print("Qual foi o valor do produto:");
        vlProduto = sc.nextDouble();

        vlParcelado = vlProduto / 3;

        System.out.printf("O valor de cada parcela ficou: R$%.2f", vlParcelado);

        sc.close();
    }
}
