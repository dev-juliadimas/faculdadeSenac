import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        double vlTotal,percDesconto, percImposto, vlDesconto, vlImposto, vlFinal, vlParcela, vlJuros, vlTotalJuros, vlFinalJuros;
        int numParcela;

        System.out.print("Nome: ");
        nome = sc.nextLine();
        System.out.print("Valor da compra: ");
        vlTotal = sc.nextDouble();
        System.out.print("Percetual do desconto (%): ");
        percDesconto = sc.nextDouble();
        System.out.print("Percentual do Imposto (%): ");
        percImposto = sc.nextDouble();
        System.out.print("Número de Parcelas: ");
        numParcela = sc.nextInt();

        vlDesconto = (percDesconto * vlTotal) / 100;
        vlImposto = (percImposto * vlTotal) / 100;
        vlFinal = (vlTotal - vlDesconto) + vlImposto;
        vlParcela = vlFinal / numParcela;
        vlJuros = vlFinal * 0.015 * numParcela;
        vlTotalJuros = vlFinal + vlJuros;

        System.out.printf(  "Cliente: %s \n" +
                            "Valor bruto da compra: R$%.2f \n" +
                            "Desconto aplicado: R$%.2f \n" +
                            "Imposto aplicado: R$%.2f \n" +
                            "Valor final da compra: R$%.2f \n" +
                            "Parcelado em: %dx \n" +
                            "Valor de cada parcela (sem juros): R$%.2f \n" +
                            "Total de juros pagos: R$%.2f \n" +
                            "Valor total com juros (1.5%%): R$%.2f",
                            nome, vlTotal, vlDesconto, vlImposto, vlFinal, numParcela, vlParcela,vlJuros, vlTotalJuros);

        sc.close();
    }
}
