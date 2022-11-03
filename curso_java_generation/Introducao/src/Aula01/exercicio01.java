package Aula01;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
        float salario, abono, novoSalario;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite o salário: ");
        salario = in.nextFloat();
        System.out.println("Digite o abono: ");
        abono = in.nextFloat();

        novoSalario = salario + abono;

        System.out.println("O novo salário é: " + novoSalario);


    }
}
