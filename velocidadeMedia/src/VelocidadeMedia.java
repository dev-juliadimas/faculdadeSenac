import java.util.Scanner;

public class VelocidadeMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double distancia, tempo, vlMedia;

        System.out.print("Distância (km): ");
        distancia = sc.nextDouble();
        System.out.print("Tempo (h): ");
        tempo = sc.nextDouble();

        vlMedia = distancia / tempo;

        System.out.printf("Velocidade média: %.2fkm/h", vlMedia);

        sc.close();
    }
}
