import java.util.Scanner;

public class NumConcatenado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        String numConcatenado;

        System.out.print("Me informe o primeiro número:");
        num1 = sc.nextInt();
        System.out.print("Me informe o segundo número:");
        num2 = sc.nextInt();

        numConcatenado = num1 + "" + num2;

        System.out.printf("Os números concatenados ficam assim: %d%d", numConcatenado);

        sc.close();
    }
}
