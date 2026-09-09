// Leia 10 números inteiros e armazene em um vetor. O algoritmo deve:
// a) Imprimir o vetor lido
// b) Somar os números pares
// c) Imprimir as posições que armazenam números negativos
// d) Imprimir o menor e o maior número
// e) Imprimir os elementos armazenados nas posições ímpares do vetor

import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int[] vetor = new int[10];

        // Leitura do vetor
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "° número: ");
            vetor[i] = input.nextInt();
        }

        // a) Imprime o vetor lido
        System.out.println();
        System.out.println("Vetor lido:");
        for (int i = 0; i < 10; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();

        // b) Soma dos números pares
        int somaPares = 0;
        for (int i = 0; i < 10; i++) {
            if (vetor[i] % 2 == 0) {
                somaPares = somaPares + vetor[i];
            }
        }
        System.out.println();
        System.out.println("Soma dos números pares: " + somaPares);

        // c) Posições que armazenam números negativos
        System.out.println();
        System.out.println("Posições com números negativos:");
        for (int i = 0; i < 10; i++) {
            if (vetor[i] < 0) {
                System.out.println("Posição " + i);
            }
        }

        // d) Menor e maior número
        int menor = vetor[0];
        int maior = vetor[0];
        for (int i = 1; i < 10; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }
        System.out.println();
        System.out.println("Menor número: " + menor);
        System.out.println("Maior número: " + maior);

        // e) Elementos das posições ímpares do vetor
        System.out.println();
        System.out.println("Elementos das posições ímpares:");
        for (int i = 1; i < 10; i = i + 2) {
            System.out.println("Posição " + i + ": " + vetor[i]);
        }

        input.close();

    }
}