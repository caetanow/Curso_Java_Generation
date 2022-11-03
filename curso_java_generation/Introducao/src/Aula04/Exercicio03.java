/*
    Elabore um algoritmo que leia uma Matriz 3x3 de números inteiros e em seguida, mostre na tela:
        Todos os elementos da Diagonal Principal
        Todos os elementos da Diagonal Secundária
        A Soma de todos os elementos da Diagonal Principal
        A Soma de todos os elementos da Diagonal Secundária

 */

package Aula04;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Exercicio03 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int m[][] = new int[3][3];
        int[] diagPrincipal = new int[3], diagSecundaria = new int[3];
        int somaP = 0, somaS = 0, k = 0;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.print("Digite um valor para a posição [" + i + "][" + j + "]: ");
                m[i][j] = sc.nextInt();

                if(i == j){
                    diagPrincipal[i] = m[i][j];
                    somaP += m[i][j];
                }

                if (i + j == m.length - 1) {
                    diagSecundaria[k] = m[i][j];
                    k ++;
                    somaS += m[i][j];
                }
            }
        }

        System.out.print("Elementos da diagonal principal: " + Arrays.toString(diagPrincipal) +
                "\nElementos da diagonal secundária: " + Arrays.toString(diagSecundaria) +
                "\nA soma dos elemementos da diagonal principal: " + somaP +
                "\nA soma dos elementos da diagonal secundária: " + somaS);
    }
}