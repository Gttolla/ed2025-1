import java.util.Scanner;


public class Exercicio02 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[5];
        double soma = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Nota do aluno " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
            soma += notas[i];
        }

        double media = soma / 5;
        System.out.println("Média das notas: " + media);

        System.out.println("Notas acima da média:");
        for (double nota : notas) {
            if (nota > media) {
                System.out.println(nota);
            }
        }
    }
}
