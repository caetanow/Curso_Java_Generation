/*
    Escreva um algoritmo em Java, que leia 2 números inteiros via teclado,
    onde o primeiro número deve ser menor que o segundo número. Caso contrário,
    deve ser exibida uma mensagem na tela informando que o intervalo é inválido
    e sair do programa. Dentro do intervalo informado, mostre na tela todes os
    números que são múltiplos de 3 e 5.

 */

package Aula03;

import java.util.Scanner;


public class Exercicio01 {
    public static void main(String[] args) {
        int inicioIntervalo, finalIntervalo, multiplo5, multiplo3;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número do intervalo: ");
        inicioIntervalo = sc.nextInt();
        System.out.print("\nDigite o último número do intervalo: ");
        finalIntervalo = sc.nextInt();

        if(inicioIntervalo >= finalIntervalo){
            System.out.println("\nIntervalo inválido!");
        }else {
            for (int i = 0; i < inicioIntervalo; i++) {

            }
        }

    }
}
