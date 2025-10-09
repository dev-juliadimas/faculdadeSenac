import java.util.Scanner;

public class ArqAluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nomeCompleto, arquivo;
        double nota, soma, media, presenca;
        int i, cargaHoraria, faltas;
        soma = 0;

        System.out.print("Nome completo: ");
        nomeCompleto = sc.nextLine();

        for (i = 1; i <= 3; i++) {
            System.out.print("Nota 0" + i + ": ");
            nota = sc.nextDouble();
            soma = soma + nota;
        }
        media = soma / 3;

        System.out.println("Qual a carga horária da disciplina? ");
        cargaHoraria = sc.nextInt();
        System.out.println("Quantas faltas o aluno teve?");
        faltas = sc.nextInt();

        presenca = ((double)(cargaHoraria - faltas) / cargaHoraria) * 100;
        arquivo = nomeCompleto + "_" + media + "_" + presenca + ".pdf";

        System.out.printf(  "NOME COMPLETO: %s \n" +
                            "        MÉDIA: %.2f \n" +
                            "     PRESENÇA: %.0f%% \n" +
                            "      ARQUIVO: %s",
                            nomeCompleto, media, presenca, arquivo);

        sc.close();
    }
}
