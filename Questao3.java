// Leia 10 números inteiros e armazene em um vetor. O algoritmo deve:
// a) Somar os 5 números da primeira metade do vetor
// b) Somar os 5 números da segunda metade do vetor
// c) Calcular a diferença entre a primeira e a segunda soma
// d) Apresentar os 3 valores calculados na tela

import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int[] vetor = new int[10];

        // Leitura do vetor
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "° número: ");
            vetor[i] = input.nextInt();
        }

        // a) Soma da primeira metade (posições 0 a 4)
        int somaPrimeiraMetade = 0;
        for (int i = 0; i < 5; i++) {
            somaPrimeiraMetade = somaPrimeiraMetade + vetor[i];
        }

        // b) Soma da segunda metade (posições 5 a 9)
        int somaSegundaMetade = 0;
        for (int i = 5; i < 10; i++) {
            somaSegundaMetade = somaSegundaMetade + vetor[i];
        }

        // c) Diferença entre as somas
        int diferenca = somaPrimeiraMetade - somaSegundaMetade;

        // d) Apresenta os 3 valores calculados
        System.out.println();
        System.out.println("Soma da primeira metade: " + somaPrimeiraMetade);
        System.out.println("Soma da segunda metade: " + somaSegundaMetade);
        System.out.println("Diferença entre as somas: " + diferenca);

        input.close();

    }
}