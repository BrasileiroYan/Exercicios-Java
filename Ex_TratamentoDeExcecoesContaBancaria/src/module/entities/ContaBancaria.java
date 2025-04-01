package module.entities;

import module.exceptions.DomainException;

public class ContaBancaria {
    private Integer numeroConta;
    private String titularConta;
    private Double saldoConta;
    private Double limiteDeSaldo;

    public ContaBancaria(){
    }

    public ContaBancaria(Integer numeroConta, String titularConta, Double saldoConta, Double limiteDeSaldo) {
        this.numeroConta = numeroConta;
        this.titularConta = titularConta;
        this.saldoConta = saldoConta;
        this.limiteDeSaldo = limiteDeSaldo;
    }

    public Integer getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(Integer numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTitularConta() {
        return titularConta;
    }

    public void setTitularConta(String titularConta) {
        this.titularConta = titularConta;
    }

    public Double getSaldoConta() {
        return saldoConta;
    }

    public Double getLimiteDeSaldo() {
        return limiteDeSaldo;
    }

    public void setLimiteDeSaldo(Double limiteDeSaldo) {
        this.limiteDeSaldo = limiteDeSaldo;
    }

    public void depositarDinheiro(Double quantiaDinheiro) throws DomainException{
        if (quantiaDinheiro <= 0.0) {
            throw new DomainException("Erro: Depósito inválido.");
        }
        saldoConta += quantiaDinheiro;
    }

    public void sacarDinheiro(Double quantiaDinheiro) throws DomainException {
        if (saldoConta == 0.0) {
            throw new DomainException("Erro: Não há dinheiro na conta.");
        }
        if (quantiaDinheiro > saldoConta) {
            throw new DomainException("Erro: Saldo bancário insuficiente.");
        }
        if (quantiaDinheiro > limiteDeSaldo) {
            throw new DomainException("Erro: Limite de saque insuficiente.");
        }
        saldoConta -= quantiaDinheiro;
    }
}
