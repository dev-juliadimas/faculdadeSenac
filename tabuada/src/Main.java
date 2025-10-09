import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, num = 0;

        do {
            System.out.println("Digite um número para fazer a tabuada dele:");
            System.out.println("Se não quiser mais fazer tabuada, digite o número 0");
            num = sc.nextInt();

            System.out.println("Tabuada do " + num);
            for (i = 0; i<= 10; i++){
                System.out.printf("%d X %d = %d \n", num, i, num * i);
            }

        }while (num != 0);


        sc.close();
    }
}
