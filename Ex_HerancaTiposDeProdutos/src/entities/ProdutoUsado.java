package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public final class ProdutoUsado extends Produto {
    private LocalDate dataDeManufatura;
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public ProdutoUsado() {
    }

    public ProdutoUsado(String nome, Double preco, LocalDate dataDeManufatura) {
        super(nome, preco);
        this.dataDeManufatura = dataDeManufatura;
    }

    public LocalDate getDataDeManufatura() {
        return dataDeManufatura;
    }

    public void setDataDeManufatura(LocalDate dataDeManufatura) {
        this.dataDeManufatura = dataDeManufatura;
    }

    @Override
    public String etiquetaPreco() {
        return String.format("%s (usado) - R$%.2f (Data de Manufatura: %s)", nome, preco, dataDeManufatura.format(formatter));
    }
}