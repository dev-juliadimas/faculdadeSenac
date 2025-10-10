/***/
/*
* FOR
* Exibir os 10 primeiros números da Sequencia Fibonacci
* */
/***/
public class Main {
    public static void main(String[] args) {
        int qtdNumero = 10, numInicial = 0, numProximo = 1;
        System.out.println("Os 10 primeiros números da sequência Fibonacci são:");

        for (int i = 1; i <= qtdNumero; i++) {
            System.out.println(numInicial); // exibe o número atual

            int proximo = numInicial + numProximo; // calcula o próximo número
            numInicial = numProximo;               // atualiza a
            numProximo = proximo;         // atualiza b
        }
    }
}
