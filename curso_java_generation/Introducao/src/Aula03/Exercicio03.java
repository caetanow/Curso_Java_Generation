/*
    Escreva um algoritmo em Java, que leia a idade de várias pessoas
    (números inteiros), via teclado e mostre na tela o total de pessoas
    cuja idade seja menor que 21 anos e o total de pessoas cuja idade,
    seja maior que 50 anos. A leitura dos dados deve ser finalizada ao
    digitar uma idade negativa.
 */

package Aula03;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        int idadeEntrada = 0, idadeMenor = 0, idadeMaior = 0, i = 0;
        boolean continua = true;
        Scanner sc = new Scanner(System.in);

        while (continua == true){
            System.out.print("Digite uma idade: ");
            idadeEntrada = sc.nextInt();

            if (idadeEntrada >= 0 && idadeEntrada <= 21) {
                idadeMenor ++;
            }else if (idadeEntrada >= 50){
                idadeMaior ++;
            } else if (idadeEntrada < 0 ){
                System.out.println("\n\nTotal de pessoas menores que 21 anos: " + idadeMenor + "\n" +
                        "Total de pessoas maiores que 50 anos: " + idadeMaior);
                break;
            }

        }

    }
}
