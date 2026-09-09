// Preencha dois vetores de 10 posições cada. Some os elementos das posições
// correspondentes em cada vetor e armazene num terceiro vetor de 10 posições.
// Apresente os 3 vetores na tela.

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        int[] vetorC = new int[10];

        // Leitura do vetor A
        System.out.println("Preenchendo o Vetor A:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "° número do Vetor A: ");
            vetorA[i] = input.nextInt();
        }

        // Leitura do vetor B
        System.out.println();
        System.out.println("Preenchendo o Vetor B:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "° número do Vetor B: ");
            vetorB[i] = input.nextInt();
        }

        // Soma das posições correspondentes
        for (int i = 0; i < 10; i++) {
            vetorC[i] = vetorA[i] + vetorB[i];
        }

        // Apresenta o Vetor A
        System.out.println();
        System.out.println("Vetor A:");
        for (int i = 0; i < 10; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        // Apresenta o Vetor B
        System.out.println();
        System.out.println("Vetor B:");
        for (int i = 0; i < 10; i++) {
            System.out.print(vetorB[i] + " ");
        }
        System.out.println();

        // Apresenta o Vetor C (soma)
        System.out.println();
        System.out.println("Vetor C (A + B):");
        for (int i = 0; i < 10; i++) {
            System.out.print(vetorC[i] + " ");
        }
        System.out.println();

        input.close();

    }
}