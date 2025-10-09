import java.util.Scanner;

/***
 * CAIXA ELETRÔNICO
 * WHILE
 *      Manter o menu ativo até que o usuário aperte sair
 * IF/ELSE
 *      Para verificar se realmente vai querer realizar a operação
 * SWITCH-CASE
 *      Para selecionar as opções
 * FOR
 *      Para as tentativas de login
 *      Máximo 3
 ***/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String senhaCorreta = "Dimas@123", senha, operacao = "";
        String strComprovante = "=== Comprovante Caixa Eletrônico ======================";
        int i, codOperacao = 1, confirmacao, qtOperacao = 0;
        boolean senhaConfirmada = false, operacaoRealizada = false;
        double saldo = 1000, valor;

        for(i = 1; i <= 3; i++){
            System.out.println("Informe a senha:");
            senha = sc.nextLine();

            if(senhaCorreta.equals(senha)){
                senhaConfirmada = true;
                break;
            }
        }

        if(senhaConfirmada){
            while (codOperacao > 0 && codOperacao != 5){
                System.out.println("CÓDIGO          OPERAÇÃO");
                System.out.println("1 -             Consultar Saldo");
                System.out.println("2 -             Realizar depósito");
                System.out.println("3 -             Realizar saque");
                System.out.println("4 -             Emitir comprovante");
                System.out.println("5 -             Sair");
                System.out.println("Por favor informar somente o número");
                codOperacao = sc.nextInt();

                switch (codOperacao){
                    case 1:
                        operacao = "Consultar saldo";
                        System.out.printf("Saldo: R$%.2f \n", saldo);
                        System.out.println("-----------------------------------------");
                        break;
                    case 2:
                        operacao = "Depósito";
                        operacaoRealizada = true;

                        System.out.println("Qual o valor que você deseja depositar?");
                        valor = sc.nextDouble();

                        do{
                            System.out.printf("Você tem certeza que deseja depositar R$%.2f \n", valor);
                            System.out.println("1 - Sim");
                            System.out.println("2 - Não");
                            System.out.println("Favor inserir somente o número");
                            confirmacao = sc.nextInt();

                            if (confirmacao == 1){
                                System.out.println("Deposito realizado com sucesso!");
                                System.out.printf("Saldo anterior: R$%.2f", saldo);
                                System.out.printf("\n Valor depositado: R$%.2f, ", valor);
                                saldo += valor;
                                System.out.printf("\n Saldo atualizado: R$%.2f", saldo);
                                System.out.println("\n");
                                qtOperacao++;
                                strComprovante += "\n OPERAÇÃO " + qtOperacao + ": " + operacao + " ............ VALOR: R$" + valor;
                            }else if(confirmacao == 2){
                                System.out.println("Deposito cancelado com sucesso!");
                            }else {
                                System.out.println("Você não escolheu nenhuma opção!");
                            }
                        }while (confirmacao != 1 && confirmacao != 2);

                        System.out.println("-----------------------------------------");
                        break;
                    case 3:
                        operacao = "Saque";
                        operacaoRealizada = true;

                        System.out.println("Qual o valor que você deseja sacar?");
                        valor = sc.nextDouble();

                        if(saldo >= valor){
                            do{
                                System.out.printf("Você tem certeza que deseja sacar R$%.2f \n", valor);
                                System.out.println("1 - Sim");
                                System.out.println("2 - Não");
                                System.out.println("Favor inserir somente o número");
                                confirmacao = sc.nextInt();

                                if (confirmacao == 1){
                                    System.out.println("Saque realizado com sucesso!");
                                    System.out.printf("Saldo anterior: R$%.2f", saldo);
                                    System.out.printf("\n Valor sacado: R$%.2f, ", valor);
                                    saldo -= valor;
                                    System.out.printf("\n Saldo atualizado: R$%.2f", saldo);
                                    System.out.println("\n");
                                    qtOperacao++;
                                    strComprovante += "\n OPERAÇÃO " + qtOperacao + ": " + operacao + " ............... VALOR: R$" + valor;
                                    System.out.println(saldo);
                                }else if(confirmacao == 2){
                                    System.out.println("Saque cancelado com sucesso!");
                                }else {
                                    System.out.println("Você não escolheu nenhuma opção!");
                                }
                            }while (confirmacao != 1 && confirmacao != 2);
                        }else{
                            System.out.println("Você não pode sacar mais do que seu saldo");
                        }

                        System.out.println("-----------------------------------------");
                        break;
                    case 4:
                        if(operacaoRealizada){
                            System.out.println(strComprovante);
                            System.out.printf("\n SALDO RESTANTE: R$%.2f", saldo);
                            System.out.println("\n ====================================================");
                            System.out.println("Obrigado por utilizar nossos serviços!");
                        }else {
                            System.out.println(strComprovante);
                            System.out.println("Nenhuma operação realizada");
                            System.out.printf("Saldo atual: R$%.2f", saldo);
                            System.out.println("\n ====================================================");
                            System.out.println("Obrigado por utilizar nossos serviços!");
                        }
                        System.out.println("-----------------------------------------");
                        break;
                    case 5:
                        System.out.println("Obrigado por utilizar nossos serviços!");
                        break;
                    default:
                        System.out.println("Você não escolheu nenhuma operação.");
                        break;
                }
            }
        }else {
            System.out.println("Você inseriu a senha errada!");
        }

        sc.close();
    }
}
