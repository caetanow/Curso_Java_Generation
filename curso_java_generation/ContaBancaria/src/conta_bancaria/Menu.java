package conta_bancaria;

import contabancaria.model.Conta;

public class Menu {
    public static void main(String[] args) {
        Conta c1 = new Conta(123456,123,1,"Willian Caetano",2000.0f);

        c1.visualizar();
    }
}
