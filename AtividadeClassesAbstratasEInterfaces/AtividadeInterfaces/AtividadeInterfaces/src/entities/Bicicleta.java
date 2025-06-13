package entities;

import java.util.Objects;

public class Bicicleta extends TransporteTerrestre implements Conduzivel{

    private Integer numeroRaios;

    public Bicicleta() {}

    public Bicicleta(String nome, Integer numeroPassageiros, Integer velocidadeAtual, String tipo, Integer numeroRaios) {
        super(nome, numeroPassageiros, velocidadeAtual, tipo);
        this.numeroRaios = numeroRaios;
    }

    public Integer getNumeroRaios() {
        return numeroRaios;
    }

    public void setNumeroRaios(Integer numeroRaios) {
        this.numeroRaios = numeroRaios;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bicicleta bicicleta = (Bicicleta) o;
        return Objects.equals(numeroRaios, bicicleta.numeroRaios);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numeroRaios);
    }

    @Override
    public void curvar(Double angulo) {
        System.out.println("Bicicleta fazendo curva com ângulo de " + angulo + "°.");
    }

    @Override
    public void estacionar() {
        System.out.println("Bicicleta estacionada.");
    }

    public void pedalar() {
        System.out.println("Pedalando...");
    }
}
