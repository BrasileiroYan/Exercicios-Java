package entities;

public class Locomotiva extends RecursoFerroviario {

    private double capacidadeDeTracao;
    private double comprimento;

    public Locomotiva(String numeroSerie, double capacidadeDeTracao, double comprimento) {
        super(numeroSerie);
        this.capacidadeDeTracao = capacidadeDeTracao;
        this.comprimento = comprimento;
    }

    public double getCapacidadeDeTracao() {
        return capacidadeDeTracao;
    }

    public void setCapacidadeDeTracao(double capacidadeDeTracao) {
        this.capacidadeDeTracao = capacidadeDeTracao;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }
}
