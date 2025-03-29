package entities;

public final class ProdutoImportado extends Produto {
    private Double taxaImportacao;

    public ProdutoImportado() {
    }

    public ProdutoImportado(String nome, Double preco, Double taxaImportacao) {
        super(nome, preco);
        this.taxaImportacao = taxaImportacao;
    }

    public Double getTaxaImportacao() {
        return taxaImportacao;
    }

    public void setTaxaImportacao(Double taxaImportacao) {
        this.taxaImportacao = taxaImportacao;
    }

    @Override
    public String etiquetaPreco() {
        return String.format("%s - R$%.2f (Taxa alfandegária: R$%.2f)", nome, precoTotal(), taxaImportacao);
    }

    public Double precoTotal() {
        return preco + taxaImportacao;
    }
}