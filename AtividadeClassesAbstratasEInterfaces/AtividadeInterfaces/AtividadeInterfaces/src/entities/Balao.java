package entities;

import java.util.Objects;

public class Balao extends TransporteAereo {

    private Integer pesoLargada;

    public Balao() {}

    public Balao(String nome, Integer numeroPassageiros, Integer velocidadeAtual, Integer altitudeAtual, Integer pesoLargada) {
        super(nome, numeroPassageiros, velocidadeAtual, altitudeAtual);
        this.pesoLargada = pesoLargada;
    }

    public void largarPeso(Double peso) {
        System.out.println("Largando " + peso + " Kg.");
    }

    public void aquecerAr(Double tempo) {
        System.out.println("Aquecendo ar por " + tempo + " min.");
    }

    @Override
    public void subir(Integer metros) {
        System.out.println("Balão subindo " + metros + " metros.");
    }

    @Override
    public void descer(Integer metros) {
        System.out.println("Balão descendo " + metros + " metros.");
    }

    public Integer getPesoLargada() {
        return pesoLargada;
    }

    public void setPesoLargada(Integer pesoLargada) {
        this.pesoLargada = pesoLargada;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Balao balao = (Balao) o;
        return Objects.equals(pesoLargada, balao.pesoLargada);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), pesoLargada);
    }
}
