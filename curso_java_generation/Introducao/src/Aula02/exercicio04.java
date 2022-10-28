/*
    Faça um programa em que permita a entrada de um número qualquer e exiba se este
    número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
    ímpar exiba o número elevado ao quadrado.
 */

package Aula02;

import javax.swing.*;
import java.util.Scanner;
import java.math.*;

public class exercicio04 {
    public static void main(String[] args) {
        float numero;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        numero = sc.nextFloat();

        if(numero%2 == 0){
            System.out.println("√" + numero + " = " + Math.sqrt(numero));
        }else {
            System.out.println(numero + " ao quadrado é " + Math.pow(numero,2));
        }




    }
}
