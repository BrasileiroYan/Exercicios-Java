package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ContratoHora {
    private LocalDate dataContrato;
    private Double valorPorHora;
    private Integer hora;
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public ContratoHora() {
    }

    public ContratoHora(String dataStr) {
        this.dataContrato = LocalDate.parse(dataStr, formatter);
    }

    public ContratoHora(String dataStr, Double valorPorHora, Integer hora) {
        this.dataContrato = LocalDate.parse(dataStr, formatter);
        this.valorPorHora = valorPorHora;
        this.hora = hora;
    }

    public LocalDate getDataContrato() {
        return dataContrato;
    }

    public Double getValorPorHora() {
        return valorPorHora;
    }

    public Integer getHora() {
        return hora;
    }

    public Double valorTotal() {
        return valorPorHora * hora;
    }
}
