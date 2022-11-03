/*
    Dado um vetor contendo 10 números inteiros não ordenados e não repetidos,
    construa um algoritmo que consiga pesquisar dados no vetor, onde o usuário
    irá digitar um número e o programa deve exibir na tela a posição deste número
    no vetor. Caso o número não seja encontrado, a mensagem: “Não foi encontrado!”
    deve ser exibida na tela.
 */

package Aula04;

import java.util.Scanner;

public class Exercicio01 {

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] vetor = {2,5,1,3,4,9,7,8,10,6};
        int numero;


        System.out.print("Digite um número: ");
        numero = sc.nextInt();

        for(int i = 0; i <= vetor.length; i++){
            if(i < vetor.length && numero == vetor[i] ){
                System.out.println("\nO número " + numero + " Está na posição " + i + ".");
                break;
            }else if (i >= vetor.length) {
                System.out.println("\nO número " + numero + " não foi encontrado.");
            }
        }
    }
}
