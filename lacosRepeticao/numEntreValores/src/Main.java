/*
 * WHILE
 * Solicita dois número e mostra todos
 * */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, num;
        boolean numDiferente = false;

        System.out.print("Insira o primeiro número:");
        num1 = sc.nextInt();
        System.out.print("Insira o segundo número:");
        num2 = sc.nextInt();

        if(num1 == num2){
            System.out.println("Você inseriu números iguais");
        }else if(num1 > num2){
            num = num1;
            num1 = num2;
            num2 = num;
            numDiferente = true;
        } else if (num1 < num2) {
            numDiferente = true;
        }

        if (numDiferente){
            while (num1 <= num2){
                System.out.println(num1);
                num1++;
            }
        }


        sc.close();
    }
}
