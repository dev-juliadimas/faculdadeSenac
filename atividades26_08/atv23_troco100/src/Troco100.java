import java.util.Scanner;

public class Troco100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valor, troco;

        System.out.print("Valor da compra:");
        valor = sc.nextDouble();

        if(valor <= 100 && valor > 0){
            troco = 100 - valor;
            System.out.printf("TROCO: R$%.2f", troco);
        }else if(valor > 100){
            System.out.print("Desculpe, só tenho troco para R$100,00");
        }else{
            System.out.print("Não posso dar troco");
        }

        sc.close();
    }
}
