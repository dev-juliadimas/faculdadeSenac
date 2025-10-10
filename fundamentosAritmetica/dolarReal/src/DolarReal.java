import java.util.Scanner;

public class DolarReal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double dolar, real, taxaFixa;
        taxaFixa = 4.90;

        System.out.println("Quantos dólar você tem?");
        dolar = sc.nextDouble();

        real = taxaFixa * dolar;

        System.out.printf(  "Dólar: $%.2f \n" +
                            "Taxa fixa: R$%.2f \n" +
                            "Real: R$%.2f",
                            dolar, taxaFixa, real);

        sc.close();
    }
}
