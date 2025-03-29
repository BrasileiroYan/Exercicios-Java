package models;

import java.time.LocalDate;

public class Fatura {
    private Contrato contrato;
    private LocalDate dataVencimento;
    private Double percentualMulta;
    private Double jurosPorDia;
    private Double valorTotal;

    public Fatura(){
    }

    public Fatura(Contrato contrato, LocalDate dataVencimento, Double percentualMulta, Double jurosPorDia) {
        this.contrato = contrato;
        this.dataVencimento = dataVencimento;
        this.percentualMulta = percentualMulta;
        this.jurosPorDia = jurosPorDia;
        valorTotal = calcularValorTotal();
    }

    public Contrato getContrato() {
        return contrato;
    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Double getPercentualMulta() {
        return percentualMulta;
    }

    public void setPercentualMulta(Double percentualMulta) {
        this.percentualMulta = percentualMulta;
    }

    public Double getJurosPorDia() {
        return jurosPorDia;
    }

    public void setJurosPorDia(Double jurosPorDia) {
        this.jurosPorDia = jurosPorDia;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public double calcularValorTotal() {
        // Implementação do cálculo
        return 0.0;
    }
}
