/*
    Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
    categoria ela se encontra:
     10-14 infantil
     15-17 juvenil
     18-25 adulto
 */

package Aula02;

import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        int idade;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        idade = sc.nextInt();

        if (idade >= 10 && idade <= 14){
            System.out.println("Você está na qualificado para entrar na equipe infantil.");
        }else if(idade >= 15 && idade <= 17){
            System.out.println("Você está na qualificado para entrar na equipe juvenil.");
        }else if (idade >= 18 && idade <= 25) {
            System.out.println("Você está na qualificado para entrar na equipe adulto.");
        }else{
            System.out.println("Você não está qualificado para entrar na equipe.");
        }


    }
}
