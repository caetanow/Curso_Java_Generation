package funcionario;

import funcionarios.model.*;


public class TestaFuncionarios {
    public static void main(String[] args) {
        Funcionarios f1 = new Funcionarios("Willian", "11/12/1985", 1,999999999,"willian@caetano.com",1);
        Funcionarios f2 = new Funcionarios("Caetano", "11/12/1985", 1,333333333,"caetano@willian.com",1);

        Gerente g1 = new Gerente("Galadhwyn", "05/05/2005", 2, 456987132,"hoeumanie@3ioahfen.com",1, 001);
        Gerente g2 = new Gerente("Dushoda","09/09/1999", 2, 159357852,"Urzulg@Veizadub.com",1, 002);

        Vendedor v1 = new Vendedor("Fouwiufui", "07/07/1977",3,741369132,"vnaoueq@jkdfal.com",2,105253.3f);
        Vendedor v2 = new Vendedor("Elurt", "22/02/2002",1,46137954,"ieowjmniao@2ildfno.com", 2,245656.3f);

        f1.visualizar();
        f2.visualizar();
        g1.visualizar();
        g2.visualizar();
        v1.visualizar();
        v2.visualizar();

    }
}
