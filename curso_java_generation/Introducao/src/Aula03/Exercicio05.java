/*
    Escreva um algoritmo em Java, que leia números inteiros via teclado,
    até que o número zero seja digitado. Ao final, mostre na tela a soma
    de todos os números digitados, que sejam positivos.
 */

package Aula03;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        int numero, soma = 0, i = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Digite um número inteiro (Digite 0 para sair): ");
            numero = sc.nextInt();
            if(numero > 0){
                soma ++;
            }else if (numero == 0){
                System.out.println("\n\nA soma dos números positivos é: " + soma);
                break;
            }
        }while (true);
    }
}
