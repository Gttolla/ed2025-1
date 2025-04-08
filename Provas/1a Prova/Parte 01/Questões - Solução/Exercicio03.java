import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[8];
        int count = 0;

        System.out.println("Digite 8 números:");
        for (int i = 0; i < 8; i++) {
            vetor[i] = sc.nextInt();
        }

        System.out.print("Número a ser buscado: ");
        int busca = sc.nextInt();

        for (int i = 0; i < 8; i++) {
            if (vetor[i] == busca) {
                count++;
            }
        }

        if (count == 0) {
            System.out.println("Número não encontrado.");
        } else {
            System.out.println("O número aparece " + count + " vez(es).");
        }
    }
}
