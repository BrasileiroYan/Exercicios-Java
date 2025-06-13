package entities;

import java.util.Objects;

public class Aviao extends TransporteAereo implements Motorizado, Conduzivel {

    private Integer numeroMotores;

    public Aviao() {}

    public Aviao(String nome, Integer numeroPassageiros, Integer velocidadeAtual, Integer altitudeAtual, Integer numeroMotores) {
        super(nome, numeroPassageiros, velocidadeAtual, altitudeAtual);
        this.numeroMotores = numeroMotores;
    }

    @Override
    public void curvar(Double angulo) {
        System.out.println("Avião fazendo curva com ângulo de " + angulo + "°.");
    }

    @Override
    public void ligarMotor() {
        System.out.println("Avião ligando motor...");
    }

    @Override
    public void abastecer(Integer litros) {
        System.out.println("Avião abastecendo tanque com " + litros + " litros.");
    }

    @Override
    public void subir(Integer metros) {
        System.out.println("Avião subiu " + metros + " metros.");
    }

    @Override
    public void descer(Integer metros) {
        System.out.println("Avião desceu " + metros + " metros.");
    }

    public Integer getNumeroMotores() {
        return numeroMotores;
    }

    public void setNumeroMotores(Integer numeroMotores) {
        this.numeroMotores = numeroMotores;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Aviao aviao = (Aviao) o;
        return Objects.equals(numeroMotores, aviao.numeroMotores);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numeroMotores);
    }
}
