import java.util.Scanner;

public class Desconto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double vlProduto, pctDesconto, vlFinal, porcentagem;

        System.out.print("Qual o valor do produto:");
        vlProduto = sc.nextDouble();
        System.out.print("Qual a porcentagem de desconto:");
        pctDesconto = sc.nextDouble();

        porcentagem = (vlProduto/100) *pctDesconto;
        vlFinal = vlProduto - porcentagem;

        System.out.printf("O valor ficou: R$%.2f", vlFinal);

        sc.close();
    }
}
