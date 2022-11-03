package cadastro_cliente;

import cadastrocliente.model.Cliente;

public class TestaCliente {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Willian", 1, 99999999,"Rua tal que foi lá", "willian@caetano.com");
        Cliente c2 = new Cliente("Caetano", 1, 11111111,"Rua de lá que foi pra cá", "caetano@willian.com");

        c1.visualizar();
        c2.visualizar();
    }
}
