package entities;

public class EncomendaItens {
    private Produtos produto;
    private Integer quantidadeProduto;
    private Double precoTotalProduto;

    public EncomendaItens() {
    }

    public EncomendaItens(Produtos produto, Integer quantidadeProduto) {
        this.produto = produto;
        this.quantidadeProduto = quantidadeProduto;
        precoTotalProduto = precoSubTotal();
    }

    public Produtos getProduto() {
        return produto;
    }

    public Integer getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public void setQuantidadeProduto(Integer quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }

    public Double getPrecoTotalProduto() {
        return precoTotalProduto;
    }

    public Double precoSubTotal() {
        return produto.getPreco() * quantidadeProduto;
    }

    public String toString() {
        return String.format("%s, R$%.2f, Quantidade: %d, Subtotal: R$%.2f", produto.getNome(), produto.getPreco(), quantidadeProduto, precoTotalProduto);
    }
}
