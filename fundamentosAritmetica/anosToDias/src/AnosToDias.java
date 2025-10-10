/***
 * Transformar Anos em Dias
 ***/
import java.util.Scanner;

public class AnosToDias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double anos, dias;

        System.out.print("Quantos anos você tem:");
        anos = sc.nextDouble();

        dias = anos * 365;

        System.out.printf("Sua idade em dias é: %.0f", dias);
    }
}
