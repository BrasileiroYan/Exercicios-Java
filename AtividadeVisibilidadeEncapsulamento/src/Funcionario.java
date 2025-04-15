// Questões 1 e 2

import java.time.LocalDate;

public class Funcionario {
    private String nome;
    private LocalDate dataAdmissao;
    private Double salario;

    private static Integer contador = 0;
    private Integer identificador;

    // Questão 4
    public Funcionario() {
        identificador = ++contador;
    }

    public Funcionario(String nome, LocalDate dataAdmissao, Double salario) {
        this.nome = nome;
        this.dataAdmissao = dataAdmissao;
        this.salario = salario;
        identificador = ++contador;
    }

    public Integer getIdentificador() {
        return identificador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        // Questão 6
        if (!dataAdmissao.isAfter(LocalDate.now())) {
            this.dataAdmissao = dataAdmissao;
        } else {
            System.out.println("Data inválida!");
            throw new RuntimeException();
        }
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        // Questão 5
        if (salario > 1100) {
            this.salario = salario;
        } else {
            System.out.println("Sálario não permitido!");
            throw new RuntimeException();
        }
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", dataAdmissao=" + dataAdmissao +
                ", salario=" + salario +
                ", id=" + identificador +
                '}';
    }
}
