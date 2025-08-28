import java.util.Scanner;

public class TempoDowload {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double arqMB, velocidade, dowload;

        System.out.print("Me informe o tamanho do arquivo em Megabytes:");
        arqMB = sc.nextDouble();
        System.out.print("Me informe a velocidade da internet em Megabits por segundo:");
        velocidade = sc.nextDouble();

        dowload = arqMB / (velocidade / 8);

        System.out.printf(   "       Tamanho arquivo: %.2fMB\n" +
                            "   Velocidade internet: %.2fMbps\n" +
                            "Velocidade do download: %.2fs",
                            arqMB, velocidade, dowload);
        sc.close();
    }
}
