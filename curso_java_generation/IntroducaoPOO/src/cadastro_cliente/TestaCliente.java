package cadastro_cliente;

import cadastrocliente.model.*;

public class TestaCliente {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Willian", 1, 99999999,"Rua tal que foi lá", "willian@caetano.com");
        Cliente c2 = new Cliente("Caetano", 1, 11111111,"Rua de lá que foi pra cá", "caetano@willian.com");

        PessoaFisica pf1= new PessoaFisica("Zaedum",2,369425071,"Lorem ipsum quisque eleifend senectus","Loremipsum@quisqueeleifendsenectus",513473004);
        PessoaFisica pf2= new PessoaFisica("Celebmuhad",2,584524851,"ras feugiat, fames lacus","quisqueeleimipsum@fendsenectus",688330600);

        PessoaJuridica pj1 = new PessoaJuridica("Thurinborn",2,89566231,"ondimentum nisi venenatis aene","TheAmbiguousOFEJAOFJAWEOF",46278418);
        PessoaJuridica pj2 = new PessoaJuridica("venenatis",1,00013013,"s sociosqu bibendum ornare mat","DasErqwfsda",56088605);


        c1.visualizar();
        c2.visualizar();
        pf1.visualizar();
        pf2.visualizar();
        pj1.visualizar();
        pj2.visualizar();

    }
}
