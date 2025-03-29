package models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contrato {
    private String numeroContrato;
    private Titular titular;
    private List<Dependente> dependentes = new ArrayList<>();
    private LocalDate dataInicio;
    private LocalDate dataReajuste;

    public Contrato(){
    }

    public Contrato(String numeroContrato, Titular titular, LocalDate dataInicio) {
        this.numeroContrato = numeroContrato;
        this.titular = titular;
        this.dataInicio = dataInicio;
        dataReajuste = dataInicio.plusYears(1);
    }

    public String getNumeroContrato() {
        return numeroContrato;
    }

    public void setNumeroContrato(String numeroContrato) {
        this.numeroContrato = numeroContrato;
    }

    public Titular getTitular() {
        return titular;
    }

    public List<Dependente> getDependentes() {
        return dependentes;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataReajuste() {
        return dataReajuste;
    }

    public void adicionarDependente(Dependente dependente) {
        dependentes.add(dependente);
    }

    public double calcularTarifa() {
        // implementação de cálculo
        return 0.0;
    }
}
