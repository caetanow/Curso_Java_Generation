package Aula01;

import java.util.*;

public class exercicio03 {
    public static void main(String[] args) {
        double salarioBruto, adNoturno, horaExtra, descontos, salarioLiquido;
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o valor do salário bruto: ");
        salarioBruto = in.nextDouble();
        System.out.println("Digite o valor do adicional noturno: ");
        adNoturno = in.nextDouble();
        System.out.println("Digite a quantidade de horas extras: ");
        horaExtra = in.nextDouble();
        horaExtra = horaExtra * 5;
        System.out.println("Digite o valor total dos descontos: ");
        descontos = in.nextDouble();

        salarioLiquido = salarioBruto + adNoturno + horaExtra - descontos;

        System.out.println("O salário liquido do colaborador é: " + salarioLiquido);



    }
}
