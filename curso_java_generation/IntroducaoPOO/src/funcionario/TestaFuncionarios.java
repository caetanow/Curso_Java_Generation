package funcionario;

import funcionarios.model.Funcionarios;

public class TestaFuncionarios {
    public static void main(String[] args) {
        Funcionarios f1 = new Funcionarios("Willian", "11/12/1985", 1,999999999,"willian@caetano.com");
        Funcionarios f2 = new Funcionarios("Caetano", "11/12/1985", 1,333333333,"caetano@willian.com");

        f1.visualizar();
        f2.visualizar();
    }
}
