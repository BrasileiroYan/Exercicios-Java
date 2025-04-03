package module.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Parcelas {
    private LocalDate dataParcela;
    private Double valorParcela;

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Parcelas() {
    }

    public Parcelas(LocalDate dataParcela, Double valorParcela) {
        this.dataParcela = dataParcela;
        this.valorParcela = valorParcela;
    }

    public LocalDate getDataParcela() {
        return dataParcela;
    }

    public void setDataParcela(LocalDate dataParcela) {
        this.dataParcela = dataParcela;
    }

    public Double getValorParcela() {
        return valorParcela;
    }

    public void setValorParcela(Double valorParcela) {
        this.valorParcela = valorParcela;
    }

    @Override
    public String toString() {
        return String.format("%s - R$%.2f", getDataParcela().format(formatter), getValorParcela());
    }
}
