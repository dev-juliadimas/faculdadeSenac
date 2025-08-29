import java.util.Scanner;

public class CompraTaxaServico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double vlConta, taxaServico, vlFinal;

        System.out.print("Qual o valor da conta:");
        vlConta = sc.nextDouble();

        taxaServico = (vlConta * 10)/100;
        vlFinal = vlConta + taxaServico;

        System.out.printf("O valor final ficou: R$%.2f", vlFinal);

        sc.close();
    }
}
