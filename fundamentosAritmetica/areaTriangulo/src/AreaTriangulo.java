import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base, altura, area;

        System.out.print("Qual a base:");
        base = sc.nextDouble();
        System.out.print("Qual a altura:");
        altura = sc.nextDouble();

        area = (base * altura)/2;

        System.out.printf(  "  BASE: %.2f" +
                            "ALTURA: %.2f" +
                            "  ÁREA: %.2f",
                            base, altura, area);

        sc.close();
    }
}
