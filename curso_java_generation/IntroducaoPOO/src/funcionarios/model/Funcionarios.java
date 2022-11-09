package funcionarios.model;

public class Funcionarios {

    private String nome;
    private String dataNascimento;
    private int sexo;
    private int telefone;
    private String email;
    private int cargo;

    public Funcionarios(String nome, String dataNascimento, int sexo, int telefone, String email, int cargo) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.telefone = telefone;
        this.email = email;
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int getSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCargo() {
        return cargo;
    }

    public void setCargo(int cargo) {
        this.cargo = cargo;
    }

    public void visualizar(){
        String sexo = "";
        String cargo = "";

        switch (this.sexo){
            case 1:
                sexo = "Masculino";
            break;

            case 2:
                sexo = "Feminino";
            break;

            case 3:
                sexo = "Outros";
            break;
        }

        switch (this.cargo) {
            case 1:
                cargo = "Gerente";
            break;

            case 2 :
                cargo = "Vendedor";
            break;
        }

        System.out.println("********************************");
        System.out.println("\n**    Dados do Funcionário    **");
        System.out.println("\n********************************");
        System.out.println("\nNome: " + this.nome);
        System.out.println("\nSexo: " + sexo);
        System.out.println("\nData de Nascimento: " + this.dataNascimento);
        System.out.println("\nTelefone: " + this.telefone);
        System.out.println("\nEmail: " + this.email);
        System.out.println("\nCargo: " + cargo);
    }


}
