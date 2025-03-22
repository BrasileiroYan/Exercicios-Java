package entities;

import entities.enums.TrabalhadorNivel;

import java.util.List;
import java.util.ArrayList;


public class Trabalhador {
    private String nome;
    private TrabalhadorNivel nivel;
    private Double salarioBase;

    private Departamento departamento;
    private List<ContratoHora> contratos = new ArrayList<>();

    public Trabalhador() {
    }

    public Trabalhador(String nome, TrabalhadorNivel nivel, Double salarioBase, Departamento departamento) {
        this.nome = nome;
        this.nivel = nivel;
        this.salarioBase = salarioBase;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TrabalhadorNivel getNivel() {
        return nivel;
    }

    public void setNivel(TrabalhadorNivel nivel) {
        this.nivel = nivel;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public List<ContratoHora> getContratos() {
        return contratos;
    }


    public void adicionarContrato(ContratoHora contrato) {
        contratos.add(contrato);
    }

    public void removerContrato(ContratoHora contrato) {
        contratos.remove(contrato);
    }

    public double renda(Integer mes, Integer ano) {
        double somaSalarioContrato = salarioBase;

        for (ContratoHora contratoIndividual : contratos) {
            int anoContrato = contratoIndividual.getDataContrato().getYear();
            int mesContrato = contratoIndividual.getDataContrato().getMonthValue();

            if (anoContrato == ano && mesContrato == mes) {
                somaSalarioContrato += contratoIndividual.valorTotal();
            }
        }
        return somaSalarioContrato;
    }
}
