package funcionarios.model;

public class Gerente extends Funcionarios{
    private int filial;

    public Gerente(String nome, String dataNascimento, int sexo, int telefone, String email, int cargo, int filial) {
        super(nome, dataNascimento, sexo, telefone, email, cargo);
        this.filial = filial;
    }

    public int getFilial() {
        return filial;
    }

    public void setFilial(int filial) {
        this.filial = filial;
    }

    public void visualizar() {
        super.visualizar();
        System.out.println("\nNúmero da Filial: " + this.filial);
    }
}
