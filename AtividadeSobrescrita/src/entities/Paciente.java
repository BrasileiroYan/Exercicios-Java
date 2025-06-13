package entities;

public class Paciente extends Pessoa {

    private String doenca;
    private String medicacao;

    public Paciente(String nome, String endereco, Integer idade, String cpf, String sexo, String doenca, String medicacao) {
        super(nome, endereco, idade, cpf, sexo);
        this.doenca = doenca;
        this.medicacao = medicacao;
    }

    public String getDoenca() {
        return doenca;
    }

    public void setDoenca(String doenca) {
        this.doenca = doenca;
    }

    public String getMedicacao() {
        return medicacao;
    }

    public void setMedicacao(String medicacao) {
        this.medicacao = medicacao;
    }

    public void sentirDor() {
        System.out.println("Aii! Estou com muita dor!\n");
    }

    public void receberAlta() {
        System.out.println("Recebendo alta!\n");
    }

    @Override
    public String imprimirValores() {
        return String.format("Pessoa{Nome: %s Endereço: %s Idade: %d CPF: %s Sexo: %s Doença: %s Medicação: %s}\n", getNome(), getEndereco(), getIdade(), getCpf(), getSexo(), getDoenca(), getMedicacao());
    }
}
