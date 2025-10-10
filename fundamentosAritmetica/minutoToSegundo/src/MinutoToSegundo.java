import java.util.Scanner;

public class MinutoToSegundo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double minuto, segundo;

        System.out.print("Me informe o minuto:");
        minuto = sc.nextDouble();

        segundo = minuto * 60;

        System.out.printf("%.2f minutos em segundos fica %.2f", minuto, segundo);

        sc.close();
    }
}
