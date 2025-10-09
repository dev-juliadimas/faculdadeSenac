import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int codVeiculo, qtVeiculo, codTipoPessoa;
        String nomeVeiculo = "", tipoPessoa = "";
        double vlCarro = 0, porcDesconto = 0, vlFinal = 0, vlTotalCarro = 0;

        System.out.println("Código | Veículo        | Preço Base");
        System.out.println("1 - Hatch Compacto      (R$65.000,00)");
        System.out.println("2 - Sedan Médio         (R$85.000,00)");
        System.out.println("3 - SUV                 (R$120.000,00)");
        System.out.println("4 - Picape              (R$110.000,00)");
        System.out.println("5 - Motocicleta         (R$25.000,00)");
        System.out.println("6 - Elétrico Compacto   (R$140.000,00)");
        System.out.println("7 - Utitário Comercial  (R$95.000,00)");
        System.out.println("Digite somente o código");
        codVeiculo = sc.nextInt();

        switch (codVeiculo){
            case 1:
                nomeVeiculo = "Hatch Compacto";
                vlCarro = 65000.00;
                break;
            case 2:
                nomeVeiculo = "Sedan Médio";
                vlCarro = 85000.00;
                break;
            case 3:
                nomeVeiculo = "SUV";
                vlCarro = 120000.00;
                break;
            case 4:
                nomeVeiculo = "Picape";
                vlCarro = 110000.00;
                break;
            case 5:
                nomeVeiculo = "Motocicleta";
                vlCarro = 25000.00;
                break;
            case 6:
                nomeVeiculo = "Elétrico Compacto";
                vlCarro = 140000.00;
                break;
            case 7:
                nomeVeiculo = "Utitário Comercial";
                vlCarro = 95000.00;
                break;
            default:
                System.out.println("Você inseriu um código inválido!");
                break;
        }

        if (vlCarro > 0){
            System.out.printf("Quantos %s você deseja?", nomeVeiculo);
            qtVeiculo = sc.nextInt();

            System.out.println("Qual das situações se aplicam a você?");
            System.out.println("1 - Pessoa Física");
            System.out.println("2 - Pessoa Jurídica");
            System.out.println("3 - Funcionário da Concessionária");
            System.out.println("Digite apenas o número");
            codTipoPessoa = sc.nextInt();

            switch (codTipoPessoa){
                case 1:
                    tipoPessoa = "Pessoa Física";
                    porcDesconto = 0;
                    break;
                case 2:
                    tipoPessoa = "Pessoa Jurídica";
                    porcDesconto = 5;
                    break;
                case 3:
                    tipoPessoa = "Funcionário da Concessionária";
                    porcDesconto = 15;
                default:
                    System.out.println("Você inseriu um código inválido!");
                    break;
            }

            if (codTipoPessoa == 1 || codTipoPessoa == 2 || codTipoPessoa == 3){
                vlTotalCarro = vlCarro * qtVeiculo;
                vlFinal = vlTotalCarro - (vlTotalCarro * porcDesconto / 100.0);

                System.out.printf(  "==Comprovante de Compra ================   \n" +
                                    "VEÍCULO: %s            QUANTIDADE: %d      \n" +
                                    "CATEGORIA: %s                              \n" +
                                    "DESCONTO APLICADO: %.2f%%                  \n" +
                                    "VALOR TOTAL: %.2f                          \n" +
                                    "=========================================",
                                    nomeVeiculo, qtVeiculo, tipoPessoa, porcDesconto, vlFinal);
            }

        }

        sc.close();
    }
}
