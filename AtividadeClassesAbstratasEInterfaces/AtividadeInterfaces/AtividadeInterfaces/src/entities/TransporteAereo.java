package entities;

import java.util.Objects;

public abstract class TransporteAereo extends Transporte {
    private Integer altitudeAtual;

    public TransporteAereo() {
    }

    public TransporteAereo(String nome, Integer numeroPassageiros, Integer velocidadeAtual, Integer altitudeAtual) {
        super(nome, numeroPassageiros, velocidadeAtual);
        this.altitudeAtual = altitudeAtual;
    }

    public abstract void subir(Integer metros);

    public abstract void descer(Integer metros);

    public Integer getAltitudeAtual() {
        return altitudeAtual;
    }

    public void setAltitudeAtual(Integer altitudeAtual) {
        this.altitudeAtual = altitudeAtual;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TransporteAereo that = (TransporteAereo) o;
        return Objects.equals(altitudeAtual, that.altitudeAtual);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), altitudeAtual);
    }
}
