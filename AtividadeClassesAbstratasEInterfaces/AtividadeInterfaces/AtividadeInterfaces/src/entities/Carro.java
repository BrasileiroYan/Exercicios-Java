package entities;

import java.util.Objects;

public class Carro extends TransporteTerrestre implements Motorizado, Conduzivel {

    private Integer numeroCilindrada;

    public Carro() {
    }

    public Carro(String nome, Integer numeroPassageiros, Integer velocidadeAtual, String tipo, Integer numeroCilindrada) {
        super(nome, numeroPassageiros, velocidadeAtual, tipo);
        this.numeroCilindrada = numeroCilindrada;
    }

    public Integer getNumeroCilindrada() {
        return numeroCilindrada;
    }

    public void setNumeroCilindrada(Integer numeroCilindrada) {
        this.numeroCilindrada = numeroCilindrada;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Carro carro = (Carro) o;
        return Objects.equals(numeroCilindrada, carro.numeroCilindrada);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numeroCilindrada);
    }

    @Override
    public void curvar(Double angulo) {
        System.out.println("Carro fazendo curva com ângulo de " + angulo + "°.");
    }

    @Override
    public void ligarMotor() {
        System.out.println("Ligando motor do carro...");
    }

    @Override
    public void abastecer(Integer litros) {
        System.out.println("Carro abastecido com " + litros + " litros.");
    }

    @Override
    public void estacionar() {
        System.out.println("Carro estacionado.");
    }

    public void embraiar() {
        System.out.println("Ligando o motor à caixa das velocidades...");
    }
}
