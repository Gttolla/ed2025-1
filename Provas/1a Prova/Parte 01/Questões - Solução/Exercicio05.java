
import java.util.Scanner;


public class Exercicio05 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] matriz = new double[4][4];
        double soma = 0;

        System.out.println("Digite os valores da matriz 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextDouble();
                soma += matriz[i][j];
            }
        }

        double media = soma / 16;
        System.out.println("Média dos elementos: " + media);
        System.out.println("Elementos acima da média:");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (matriz[i][j] > media) {
                    System.out.println("[" + i + "][" + j + "]: " + matriz[i][j]);
                }
            }
        }
    }
}
