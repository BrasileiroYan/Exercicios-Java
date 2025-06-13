package entities;

public class Medico extends Pessoa {

    private String crm;
    private Double salario;
    private String especializacao;

    private Hospital hospital;

    public Medico(String nome, String endereco, Integer idade, String cpf, String sexo, String crm, Double salario, String especializacao, Hospital hospital) {
        super(nome, endereco, idade, cpf, sexo);
        this.crm = crm;
        this.salario = salario;
        this.especializacao = especializacao;
        this.hospital = hospital;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }

    public void plantao() {
        System.out.println("Estou dando plantão!\n");
    }

    @Override
    public String imprimirValores() {
        return String.format("Pessoa{Nome: %s Endereço: %s Idade: %d CPF: %s Sexo: %s CRM: %s Salário: R$%.2f Especialização: %s Hospital[nome]: %s, Hospital[endereco]: %s}\n", getNome(), getEndereco(), getIdade(), getCpf(), getSexo(), getCrm(), getSalario(), getEspecializacao(), hospital.getNome(), hospital.getEndereco());
    }
}
