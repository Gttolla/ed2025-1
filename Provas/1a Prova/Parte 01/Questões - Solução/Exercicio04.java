
import java.util.Scanner;


public class Exercicio04 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int somaTotal = 0;
        int somaDiagonal = 0;

        System.out.println("Digite os valores da matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
                somaTotal += matriz[i][j];
                if (i == j) {
                    somaDiagonal += matriz[i][j];
                }
            }
        }

        System.out.println("Soma total dos elementos: " + somaTotal);
        System.out.println("Soma da diagonal principal: " + somaDiagonal);
    }
}
