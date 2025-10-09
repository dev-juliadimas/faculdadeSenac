import java.util.Scanner;

public class ValorComissao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double vlVenda, comissao;

        System.out.print("Me informe o valor da venda:");
        vlVenda = sc.nextDouble();

        comissao = (vlVenda/100) * 5;

        System.out.printf("O valor da comissão ficou: R$%.2f", comissao);

        sc.close();
    }
}
