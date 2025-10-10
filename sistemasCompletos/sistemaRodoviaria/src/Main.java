import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String horarioEscolhido, horarioDisponivel = "00", destino = "";
        int codDestino, idade;
        double vlPassagem = 0, porcDesconto, vlFinal;

        System.out.println( "Escolha o seu destino: \n" +
                            "1 - Florianópolis       - R$75,00 \n" +
                            "2 - Porto Alegre        - R$120,00 \n" +
                            "3 - Curitiba            - R$150,00 \n" +
                            "4 - São Paulo           - R$180,00 \n" +
                            "5 - Rio de Janeiro      - R$220,00 \n" +
                            "6 - Belo Horizonte      - R$200,00 \n" +
                            "Digite apenas o número");
        codDestino = sc.nextInt();
        sc.nextLine();

        switch (codDestino){
            case 1:
                vlPassagem = 75.00;
                horarioDisponivel = "08:00 14:00 18:00";
                destino = "Florianópolis";

                System.out.println("Horários disponíveis para Florianópolis: ");
                System.out.println("08:00   -   14:00   -   18:00");
                break;
            case 2:
                vlPassagem = 120.00;
                horarioDisponivel = "07:30 13:30 20:00";
                destino = "Porto Alegre";

                System.out.println("Horários disponíveis para Porto Alegre:");
                System.out.println("07:30   -   13:30   -   20:00");
                break;
            case 3:
                vlPassagem = 150.00;
                horarioDisponivel = "06:00 12:00 22:00";
                destino = "Curitiba";

                System.out.println("Horários disponíveis para Curitiba:");
                System.out.println("06:00   -   12:00   -   22:00");
                break;
            case 4:
                vlPassagem = 180.00;
                horarioDisponivel = "05:00 11:00 17:00 23:00";
                destino = "São Paulo";

                System.out.println("Horários disponíveis para São Paulo:");
                System.out.println("05:00   -   11:00   -   17:00   -   23:00");
                break;
            case 5:
                vlPassagem = 220.00;
                horarioDisponivel = "06:30 13:00 19:00";
                destino = "Rio de Janeiro";

                System.out.println("Horários disponíveis para Rio de Janeiro:");
                System.out.println("06:30   -   13:00   -   19:00");
                break;
            case 6:
                vlPassagem = 200.00;
                horarioDisponivel = "09:00 15:00 21:00";
                destino = "Belo Horizonte";

                System.out.println("Horários disponíveis para Belo Horizonte:");
                System.out.println("09:00   -   15:00   -   21:00");
                break;
            default:
                System.out.println("Você inseriu um número inválido");
        }

        if(vlPassagem != 0){
            System.out.println("Em qual desses horários você deseja ir (HH:mm)?");
            horarioEscolhido = sc.nextLine();

            if(horarioDisponivel.contains(horarioEscolhido)) {
                System.out.println("Qual a idade do passageiro:");
                idade = sc.nextInt();

                if (idade < 6) {
                    porcDesconto = 100;
                } else if (idade >= 6 && idade <= 17) {
                    porcDesconto = 50;
                }else if (idade >= 60) {
                    porcDesconto = 30;
                }else{
                    porcDesconto = 0;
                }

                vlFinal = vlPassagem - (vlPassagem * porcDesconto / 100.0);

                System.out.printf(  "== Bilhete Rodoviário ==================== \n" +
                                    "DESTINO: %s                 HORÁRIO: %s    \n" +
                                    "IDADE: %d                                  \n" +
                                    "DESCONTO APLICADO: %.2f%%                  \n" +
                                    "VALOR FINAL: R$ %.2f                       \n" +
                                    "========================================== \n" +
                                "Boa viagem!",
                                    destino, horarioEscolhido, idade, porcDesconto, vlFinal);
            }else {
                System.out.println("Horário indisponível");
            }
        }


        sc.close();
    }
}
