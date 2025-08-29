import java.util.Scanner;

public class NumAnteriorPosterior {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num, numAnterior, numDepois;

        System.out.print("Número: ");
        num = sc.nextInt();

        numAnterior = num - 1;
        numDepois = num + 1;

        System.out.printf(  "NÚMERO   : %d \n" +
                            "ANTERIOR : %d \n" +
                            "POSTERIOR: %d",
                            num, numAnterior, numDepois);

        sc.close();
    }
}
