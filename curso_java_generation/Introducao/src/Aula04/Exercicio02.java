/*
    Elabore um algoritmo que leia 10 números inteiros e armazene em um vetor. Em seguida, mostre na tela:
        Todos os elementos dos índices ímpares do vetor
        Todos os elementos do vetor que são números pares
        A Soma de todos os elementos do vetor
        A Média de todos os elementos do vetor, armazenada em uma variável do tipo real

 */

package Aula04;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio02 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] vetor = new int[10], vetorImpar = new int[5];
        int k=0, j=0;
        int soma = 0, media = 0;
        boolean ent = true;

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextInt();

            if(i%2 == 1){
                vetorImpar[j] = vetor[i];
                j++;
            }

            if (vetor[i] % 2 == 0) {
                k ++;
            }

            soma += vetor[i];
        }
        int[] vetorPar = new int[k];
        j = 0;
        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i] % 2 == 0){
                vetorPar[j] = vetor[i];
                j ++;
            }
        }
        System.out.print("Elementos nas posições ímpares: " + Arrays.toString(vetorImpar) +
                "\nElementos pares: " + Arrays.toString(vetorPar) +
                "\nSoma: " + soma + "\nMédia: " + (soma/ vetor.length));
    }
}
