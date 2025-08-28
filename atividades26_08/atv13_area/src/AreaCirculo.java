import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double raio, area;

        System.out.print("Qual o raio do circulo:");
        raio = sc.nextDouble();

        area = Math.PI * (Math.pow(raio,2));

        System.out.printf(  "RAIO: %.2f \n" +
                            "AREA: %.2f",
                            raio, area);
    }
}
