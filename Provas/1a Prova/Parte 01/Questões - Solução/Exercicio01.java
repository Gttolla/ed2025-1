import java.util.Scanner;

public class Exercicio01 {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[10];
        int[] pares = new int[10]; // tamanho máximo possível de pares
        int count = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            vetor[i] = sc.nextInt();
            if (vetor[i] % 2 == 0) {
                pares[count] = vetor[i];
                count++;
            }
        }

        System.out.print("Vetor original: ");
        for (int n : vetor) {
            System.out.print(n + " ");
        }

        System.out.print("\nVetor com pares: ");
        for (int i = 0; i < count; i++) {
            System.out.print(pares[i] + " ");
        }
    } 
}

