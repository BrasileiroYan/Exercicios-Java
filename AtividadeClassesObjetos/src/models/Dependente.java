package models;

public class Dependente {
    private Pessoa pessoaDependente;
    private Titular titular;

    public Dependente() {
    }

    public Dependente(Pessoa pessoaDependente, Titular titular) {
        this.pessoaDependente = pessoaDependente;
        this.titular = titular;
    }

    public Pessoa getPessoaDependente() {
        return pessoaDependente;
    }

    public void setPessoaDependente(Pessoa pessoaDependente) {
        this.pessoaDependente = pessoaDependente;
    }

    public Titular getTitular() {
        return titular;
    }

}
