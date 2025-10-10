import java.util.Scanner;

public class CelsiusFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double tpCelcius, tpFahrenheit;

        System.out.print("Me informe a temperatura em CELCIUS:");
        tpCelcius = sc.nextDouble();

        tpFahrenheit = tpCelcius * 1.8 + 32;

        System.out.printf( "Temperatura em Celcius: %.1fºC \n " +
                            "Temperatura em Fahrenheit : %.1fºF", tpCelcius, tpFahrenheit);

        sc.close();
    }
}
