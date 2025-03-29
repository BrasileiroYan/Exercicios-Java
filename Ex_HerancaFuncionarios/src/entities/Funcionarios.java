package entities;

public class Funcionarios {
    protected String nome;
    protected Integer hora;
    protected Double valorPorHora;

    public Funcionarios(){
    }

    public Funcionarios(String nome, Integer hora, Double valorPorHora) {
        this.nome = nome;
        this.hora = hora;
        this.valorPorHora = valorPorHora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getHora() {
        return hora;
    }

    public void setHora(Integer hora) {
        this.hora = hora;
    }

    public Double getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(Double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }

    public Double pagamento() {
        return valorPorHora * hora;
    }

    public String toString(){
        return String.format("Funcionário %s - R$ %.2f", nome, pagamento());
    }
}
