import java.util.Scanner;

/***
 * FOR
 * Pedir 10 números e mostrar o resultado da soma
 ***/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        double num, soma = 0;

        for (i = 1; i <= 10; i++){
            System.out.printf("Me informe o %dº número: ", i);
            num = sc.nextInt();
            soma += num;
        }

        System.out.println("O resultado da soma é: " + soma);

        sc.close();
    }
}
