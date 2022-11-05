package cadastrocliente.model;

public class PessoaJuridica extends Cliente{
    private int cnpj;
    public PessoaJuridica(String nome, int sexo, int telefone, String endereco, String email, int cnpj) {
        super(nome, sexo, telefone, endereco, email);
        this.cnpj = cnpj;
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public void visualizar() {
        super.visualizar();
        System.out.println("CNPJ: " + this.cnpj);

    }
}
