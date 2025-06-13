package entities;

import java.util.Objects;

public abstract class Transporte {

    private String nome;
    private Integer numeroPassageiros;
    private Integer velocidadeAtual;

    public Transporte() {
    }

    public Transporte(String nome, Integer numeroPassageiros, Integer velocidadeAtual) {
        this.nome = nome;
        this.numeroPassageiros = numeroPassageiros;
        this.velocidadeAtual = velocidadeAtual;
    }

    public boolean estaParado() {
        if (this.velocidadeAtual != 0) {
            return false;
        }
        else {
            return true;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumeroPassageiros() {
        return numeroPassageiros;
    }

    public void setNumeroPassageiros(Integer numeroPassageiros) {
        this.numeroPassageiros = numeroPassageiros;
    }

    public Integer getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(Integer velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Transporte that = (Transporte) o;
        return Objects.equals(nome, that.nome) && Objects.equals(numeroPassageiros, that.numeroPassageiros) && Objects.equals(velocidadeAtual, that.velocidadeAtual);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, numeroPassageiros, velocidadeAtual);
    }
}
