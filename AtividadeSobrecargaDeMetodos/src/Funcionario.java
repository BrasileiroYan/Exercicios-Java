import java.time.LocalDate;

public class Funcionario {
    private String nome;
    private LocalDate dataAdmissao;
    private Double salario;

    private static Integer contador = 0;
    private Integer identificador;


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

        if (salario > 1100) {
            this.salario = salario;
        } else {
            System.out.println("Sálario não permitido!");
            throw new RuntimeException();
        }
    }

    public void tirarFerias() {
        tirarFerias(30);
    }

    public void tirarFerias(Integer dias) {
        System.out.printf("O funcionário %s irá tirar férias de %d dias.\n", getNome(), dias);
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
