import java.util.Scanner;

public class EnergiaPotencial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double massa, altura, gravidade, energia;

        System.out.print("Me informe a massa em kilograma:");
        massa = sc.nextDouble();
        System.out.print("Me informe a altura em metros:");
        altura = sc.nextDouble();

        gravidade = 9.8;

        energia = massa * altura * gravidade;

        System.out.printf(  "massa           : %.2fkg\n" +
                            "altura          : %.2fm\n" +
                            "gravidade       : %.2fm/s\n" +
                            "ENEGIA POTENCIAL: %.2fJ",
                            massa, altura, gravidade, energia);

        sc.close();
    }
}
