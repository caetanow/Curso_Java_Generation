package cadastrocliente.model;

public class Cliente {
    private String nome;
    private int sexo;
    private int telefone;
    private String endereco;
    private String email;


    public Cliente(String nome, int sexo, int telefone, String endereco, String email) {
        this.nome = nome;
        this.sexo = sexo;
        this.telefone = telefone;
        this.endereco = endereco;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void visualizar(){
        String sexo = "";

        switch (this.sexo){
            case 1:
                sexo = "Masculino";
            break;

            case 2:
                sexo = "Feminino";
            break;

            case 3:
                sexo = "Feminino";
            break;

        }

        System.out.println("\n\n*********************************************************************");
        System.out.println("Dados do Cliente:");
        System.out.println("*********************************************************************");
        System.out.println("Nome: " + this.nome);
        System.out.println("Sexo: " + sexo);
        System.out.println("Telefone: " + this.telefone);
        System.out.println("Endereço: " + this.endereco);
        System.out.println("Email: " + this.email);
    }
}
