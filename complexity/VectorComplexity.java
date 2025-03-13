import java.util.Scanner;

public class VectorComplexity {
    public static void main(String[] args) {
        // criando um vetor de números inteiros
        // int vector[];
        // int vector[10];
        /*
         * Declara o vetor
         * Cria o vetor
         */
        //int[] vector; // declarar
        //vector = new int[10]; // criar
        int[] vector = new int[10]; 
        int valor = 0;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Informe " + vector.length + " valores separados por um espaço: \n");

        for (int indx=0; indx < vector.length; indx++)
        {
            vector[indx] = keyboard.nextInt();
        }

        System.out.println("\nInforme o valor a ser pesquisado: ");
        valor = keyboard.nextInt();

        for (int indx=0; indx < vector.length; indx++)
        {
            if (vector[indx] == valor)
            {
                System.out.printf("\nvector[%d] = %d", indx, vector[indx]);
            }

        }
    }
}
