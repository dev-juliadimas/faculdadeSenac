import java.util.Scanner;

public class VolumeCaixa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double largura, altura, profundidade, volume;

        System.out.print("Qual a largura da caixa:");
        largura = sc.nextDouble();
        System.out.print("Qual a altura da caixa:");
        altura = sc.nextDouble();
        System.out.print("Qual a profundidade da caixa:");
        profundidade = sc.nextDouble();

        volume = largura * altura * profundidade;

        System.out.printf(  "Largura     : %.2f \n" +
                            "Altura      : %.2f \n" +
                            "Profundidade: %.2f \n" +
                            "VOLUME      : %.2f"
                            , largura, altura, profundidade, volume);

        sc.close();
    }
}
