/*
 * WHILE
 * Solicita um valor e faz a tabuada dele
 * */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num, tab = 1;

        System.out.println("PARA A TABUADA");
        System.out.println("Insira um número");
        num = sc.nextDouble();

        while (tab <= 10){
            System.out.printf("%.2f X %.2f = %.2f \n", num, tab, num*tab);
            tab++;
        }

        sc.close();
    }
}
