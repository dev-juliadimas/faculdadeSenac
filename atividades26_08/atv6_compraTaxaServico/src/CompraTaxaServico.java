import java.util.Scanner;

public class CompraTaxaServico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double vlConta, vlFinal;

        System.out.print("Qual o valor da conta:");
        vlConta = sc.nextDouble();

        vlFinal = vlConta + ((vlConta * 10)/100);

        System.out.printf("O valor final ficou: R$%.2f", vlFinal);

        sc.close();
    }
}
