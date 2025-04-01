package entities;

public class Itens {
    private String nome;
    private Double precoUni;
    private Integer quantidade;

    public Itens() {
    }

    public Itens(String nome, Double precoUni, Integer quantidade) {
        this.nome = nome;
        this.precoUni = precoUni;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPrecoUni() {
        return precoUni;
    }

    public void setPrecoUni(Double precoUni) {
        this.precoUni = precoUni;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double valorTotal() {
        return quantidade * precoUni;
    }

    @Override
    public String toString() {
        return String.format("%d: R$%.2f", nome, valorTotal());
    }
}
