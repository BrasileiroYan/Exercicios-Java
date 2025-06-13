package entities;


public abstract class Pessoa {

    private String nome;
    private String endereco;
    private Integer idade;
    private String cpf;
    private String sexo;

    public Pessoa(String nome, String endereco, Integer idade, String cpf, String sexo) {
        this.nome = nome;
        this.endereco = endereco;
        this.idade = idade;
        this.cpf = cpf;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void andar() {
        System.out.printf("Meu nome é %s e estou andando!\n", getNome());
    }

    public String imprimirValores() {
        return String.format("Pessoa{Nome: %s Endereço: %s Idade: %d CPF: %s Sexo: %s}\n", getNome(), getEndereco(), getIdade(), getCpf(), getSexo());
    }
}
