package models;

public class Titular {
    private Pessoa pessoaTitular;
    private Contrato contrato;

    public Titular() {
    }

    public Titular(Pessoa pessoaTitular, Contrato contrato) {
        this.pessoaTitular = pessoaTitular;
        this.contrato = contrato;
    }

    public Pessoa getPessoaTitular() {
        return pessoaTitular;
    }

    public void setPessoaTitular(Pessoa pessoaTitular) {
        this.pessoaTitular = pessoaTitular;
    }

    public Contrato getContrato() {
        return contrato;
    }

    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }
}
