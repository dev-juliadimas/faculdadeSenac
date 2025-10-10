import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int codPedido, qtdPedido, codDesconto;
        double vlLanche = 0, vlTotalItem = 0, porcDesconto = 0, vlFinal;
        String item = "", catDesconto = "Cliente Comum";
        boolean verifica = false;

        System.out.println("Seja bem vindo!");
        System.out.println("Nossos lanches são os seguintes:");
        System.out.println("1 - Hambúrguer          R$18,00");
        System.out.println("2 - Cheeseburguer       R$20,00");
        System.out.println("3 - Batata-frita        R$12,00");
        System.out.println("4 - Refrigerante        R$8,00");
        System.out.println("5 - Suco Natural        R$8,00");
        System.out.println("6 - Milkshake           R$15,00");
        System.out.println("7 - Salada              R$16,00");
        System.out.println("Insira somente o número");
        codPedido = sc.nextInt();

        switch (codPedido){
            case 1:
                vlLanche = 18.00;
                item = "Hambúrguer";
                verifica = true;
                break;
            case 2:
                vlLanche = 20.00;
                item = "Cheeseburguer";
                verifica = true;
                break;
            case 3:
                vlLanche = 12.00;
                item = "Batata-frita";
                verifica = true;
                break;
            case 4:
                vlLanche = 8.00;
                item = "Refrigerante";
                verifica = true;
                break;
            case 5:
                vlLanche = 8.00;
                item = "Suco Natural";
                verifica = true;
                break;
            case 6:
                vlLanche = 15.00;
                item = "Milkshake";
                verifica = true;
                break;
            case 7:
                vlLanche = 16.00;
                item = "Salada";
                verifica = true;
                break;
            default:
                if(verifica == false) {
                    System.out.println("Você inseriu um código inválido");
                }else {
                    break;
                }
        }

        if(verifica){
            System.out.printf("Quantos %s você deseja?", item);
            qtdPedido = sc.nextInt();
            vlTotalItem = qtdPedido * vlLanche;

            System.out.println("Digite o número se você se aplicar a uma dessas opções:");
            System.out.println("1 - Estudante");
            System.out.println("2 - Idoso (60 ou mais)");
            System.out.println("3 - Cliente Comum");
            codDesconto = sc.nextInt();

            if (codDesconto == 1){
                porcDesconto = 10;
                catDesconto = "Estudante";
            } else if (codDesconto == 2) {
                porcDesconto = 20;
                catDesconto = "Idoso";
            }

            vlFinal = vlTotalItem - ((vlTotalItem * porcDesconto) / 100.0);

            System.out.printf(  "== Comprovante de Compra ==================== \n" +
                                "PRODUTO: %s                 QUANTIDADE: %s       \n" +
                                "CATEGORIA: %s                                     \n" +
                                "DESCONTO APLICADO: %.2f%%                     \n" +
                                "VALOR FINAL: R$ %.2f                          \n" +
                                "===========================================   \n" +
                                "Bom apetite!", item, qtdPedido, catDesconto, porcDesconto, vlFinal);
        }

        sc.close();
    }
}
