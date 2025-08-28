import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double soma = 0,
                media,
                nota;
        int i;

        for(i = 1; i <=3; i++){
            System.out.printf("Me informe a nota %d:", i);
            nota = sc.nextDouble();

            soma = soma + nota;
        }
        media = soma / 3;

        System.out.printf("A média é: %.2f", media);
    }
}
