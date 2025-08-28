import java.util.Scanner;

public class VlrPessoas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double vlTotal, qtdPessoas, vlPessoa;

        System.out.print("Qual o valor da compra:");
        vlTotal = sc.nextDouble();
        System.out.print("Quantas pessoas fizeram parte dessa compra:");
        qtdPessoas = sc.nextDouble();

        vlPessoa = vlTotal / qtdPessoas;

        System.out.printf("O valor da compra foi R$%.2f e para %.0f pessoas o valor ficou: R$%.2f",
                        vlTotal, qtdPessoas, vlPessoa);
    }
}
