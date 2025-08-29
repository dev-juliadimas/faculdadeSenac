import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota1, nota2, nota3, soma, media;

        System.out.print("Nota 01: ");
        nota1 = sc.nextDouble();
        System.out.print("Nota 02: ");
        nota2 = sc.nextDouble();
        System.out.print("Nota 03: ");
        nota3 = sc.nextDouble();

        soma = nota1 + nota2 + nota3;
        media = soma / 3;

        System.out.printf("MÉDIA: %.2f", media);

        sc.close();

    }
}
