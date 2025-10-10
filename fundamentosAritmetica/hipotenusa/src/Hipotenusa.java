import java.util.Scanner;

public class Hipotenusa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double cateto1, cateto2, hipotenusa;

        System.out.print("Me informe o cateto 1:");
        cateto1 = sc.nextDouble();
        System.out.print("Me informe o cateto 2:");
        cateto2 = sc.nextDouble();

        hipotenusa = Math.pow(cateto1, 2) + Math.pow(cateto2, 2);
        hipotenusa = Math.sqrt(hipotenusa);

        System.out.printf("Hipotenusa: %.2f", hipotenusa);

        sc.close();
    }
}
