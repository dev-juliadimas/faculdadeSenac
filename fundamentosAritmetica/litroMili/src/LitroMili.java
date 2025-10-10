import java.util.Scanner;

public class LitroMili {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double litros, mililitros;

        System.out.print("Me informe os litros:");
        litros = sc.nextDouble();

        mililitros = litros * 1000;

        System.out.printf(  "valor em LITROS    : %.2f\n" +
                            "valor em MILILITROS: %.2f",
                            litros, mililitros);
    }
}
