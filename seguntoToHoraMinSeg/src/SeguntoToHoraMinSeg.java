import java.util.Scanner;

public class SeguntoToHoraMinSeg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double segundoInit, horas, minutos, segundos;

        System.out.print("Me informe os segundos:");
        segundoInit = sc.nextDouble();

        horas = segundoInit / 3600;
        minutos = (segundoInit % 3600)/60;
        segundos = segundoInit % 60;

        System.out.printf(  "   HORAS: %.0f \n" +
                            " MINUTOS: %.0f \n" +
                            "SEGUNDOS: %.0f \n",
                            horas, minutos, segundos);

        sc.close();
    }
}
