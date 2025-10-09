import java.util.Scanner;

public class Velocidade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double kmh, ms;

        System.out.print("Qual o km/h:");
        kmh = sc.nextDouble();

        ms = kmh / 3.6;

        System.out.printf(  "KM/H: %.2f \n" +
                            "M/S : %.2f ",
                kmh, ms);

        sc.close();
    }
}
