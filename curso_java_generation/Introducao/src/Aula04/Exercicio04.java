/*
    Elabore um algoritmo que leia as notas de uma classe com 10 participantes
    durante 4 bimestres de um ano. As 4 notas de cada participante serão armazenadas
    em uma linha de uma matriz de números reais, logo cada linha da matriz serão
    as notas de um participante. Em um vetor de números reais, armazene as médias
    de cada participante e exiba as médias de na tela.
 */

package Aula04;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class Exercicio04 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = 2, p = 4, soma;

        float notas[][] = new float[n][p], media[] = new float[n];

        for (int i = 0; i < n; i++) {
            soma = 0;
            for (int j = 0; j < p; j++) {
                System.out.print("Digite a "+ (j+1) + "ª nota do " + (i+1) + "º aluno: ");
                notas[i][j] = sc.nextFloat();
                soma += notas[i][j];
            }
            media[i] = (soma / p);
        }

        //for (int i = 0; i < media.length; i++) {
            System.out.printf("%.2f", media + " ");
        //}


    }
}
