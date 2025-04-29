package entities;

public abstract class RecursoFerroviario {

    private String numeroSerie;

    public RecursoFerroviario(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }
}
