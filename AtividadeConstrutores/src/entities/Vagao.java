package entities;

public class Vagao extends RecursoFerroviario {

    private String tipo;
    private double capacidadeDeCarga;
    private double comprimentoEntreTesteiras;
    private double comprimentoDosEngates;

    public Vagao(String numeroSerie, String tipo, double capacidadeDeCarga, double comprimentoEntreTesteiras, double comprimentoDosEngates) {
        super(numeroSerie);
        this.tipo = tipo;
        this.capacidadeDeCarga = capacidadeDeCarga;
        this.comprimentoEntreTesteiras = comprimentoEntreTesteiras;
        this.comprimentoDosEngates = comprimentoDosEngates;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getCapacidadeDeCarga() {
        return capacidadeDeCarga;
    }

    public void setCapacidadeDeCarga(double capacidadeDeCarga) {
        this.capacidadeDeCarga = capacidadeDeCarga;
    }

    public double getComprimentoEntreTesteiras() {
        return comprimentoEntreTesteiras;
    }

    public void setComprimentoEntreTesteiras(double comprimentoEntreTesteiras) {
        this.comprimentoEntreTesteiras = comprimentoEntreTesteiras;
    }

    public double getComprimentoDosEngates() {
        return comprimentoDosEngates;
    }

    public void setComprimentoDosEngates(double comprimentoDosEngates) {
        this.comprimentoDosEngates = comprimentoDosEngates;
    }
}
