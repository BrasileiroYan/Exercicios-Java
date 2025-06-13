package entities;

import java.util.Objects;

public abstract class TransporteTerrestre extends Transporte {

    private String tipo;

    public TransporteTerrestre() {
    }

    public TransporteTerrestre(String nome, Integer numeroPassageiros, Integer velocidadeAtual, String tipo) {
        super(nome, numeroPassageiros, velocidadeAtual);
        this.tipo = tipo;
    }

    public abstract void estacionar();

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TransporteTerrestre that = (TransporteTerrestre) o;
        return Objects.equals(tipo, that.tipo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), tipo);
    }
}
