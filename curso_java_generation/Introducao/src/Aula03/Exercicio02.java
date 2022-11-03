/*
    Escreva um algoritmo em Java, que leia 10 números inteiros via teclado
    e mostre na tela quantos números são pares e quantos número são ímpares.
 */

package Aula03;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        int[] numero = new int[10];
        int numPar = 0, numImpar = 0;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < numero.length; i++) {
            System.out.print("Digite um número inteiro: ");
            numero[i] = sc.nextInt();

            if (numero[i]%2 == 0) {
                numPar ++;
            }else numImpar ++;
        }

        System.out.println("\n\nTotal de números pares: " + numPar + "\nTotal dde números ímpares: " + numImpar);
    }
}
