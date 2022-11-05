package funcionarios.model;

public class Vendedor extends Funcionarios{
    private float metaVendas;
    public Vendedor(String nome, String dataNascimento, int sexo, int telefone, String email, int cargo ,float metaVendas) {
        super(nome, dataNascimento, sexo, telefone, email, cargo);
        this.metaVendas = metaVendas;
    }

    public float getMetaVendas() {
        return metaVendas;
    }

    public void setMetaVendas(float metaVendas) {
        this.metaVendas = metaVendas;
    }

    public void visualizar() {
        super.visualizar();
        System.out.println("\nMeta de vendas no mês: " + this.metaVendas);
    }
}
