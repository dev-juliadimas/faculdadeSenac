/*
 * WHILE
 * Mostre os números ímpares de 100 a 200
 * */

public class Main {
    public static void main(String[] args) {
        int num = 100;
        while (num >= 100 && num <= 200){
            while (num % 2 == 1) {
                System.out.println(num);
                break;
            }
            num++;
        }
    }
}
