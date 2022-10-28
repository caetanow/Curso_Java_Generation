package Aula01;

import java.util.*;

public class exercicio02 {
    public static void main(String[] args) {
        float[] nota = new float[4];
        float soma = 0, media = 0;
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < nota.length; i++) {
            System.out.println("Digite a " + (i+1) + "ª nota: ");
            nota[i] = in.nextFloat();
            soma += nota[i];
        }
        media = soma / nota.length;

        System.out.println("A média final é: " + media);

    }
}
