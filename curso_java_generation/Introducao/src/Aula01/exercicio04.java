package Aula01;

import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        int[] numero = new int[4];
        int diferenca;
        System.out.println(numero.length);

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < numero.length; i++) {
            System.out.println("Digite o " + (i+1) + "º número: ");
            numero[i] = sc.nextInt();
        }

        diferenca = (numero[0] * numero[1]) - (numero[2] * numero[3]);

        System.out.println("(" + numero[0] + " * " + numero[1] + ") - (" + numero[2] + " * " +  numero[3] + ") = " + diferenca);

    }
}
