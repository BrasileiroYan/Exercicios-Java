package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Trem extends RecursoFerroviario {

    private String prefixo;
    private LocalDate dataFormacao;
    private EstacaoFerroviaria estacaoOrigem;
    private EstacaoFerroviaria estacaoDestino;
    private List<RecursoFerroviario> recursos = new ArrayList<>();

    public Trem(String prefixo, LocalDate dataFormacao, EstacaoFerroviaria estacaoOrigem, EstacaoFerroviaria estacaoDestino) {
        super(prefixo);
        if (estacaoOrigem.equals(estacaoDestino)) {
            throw new IllegalArgumentException("Estação de origem e destino não podem ser a mesma.");
        }


        this.dataFormacao = dataFormacao;
        this.estacaoOrigem = estacaoOrigem;
        this.estacaoDestino = estacaoDestino;
    }

    public String getPrefixo() {
        return prefixo;
    }

    public void setPrefixo(String prefixo) {
        this.prefixo = prefixo;
    }

    public LocalDate getDataFormacao() {
        return dataFormacao;
    }

    public void setDataFormacao(LocalDate dataFormacao) {
        this.dataFormacao = dataFormacao;
    }

    public EstacaoFerroviaria getEstacaoOrigem() {
        return estacaoOrigem;
    }

    public void setEstacaoOrigem(EstacaoFerroviaria estacaoOrigem) {
        this.estacaoOrigem = estacaoOrigem;
    }

    public EstacaoFerroviaria getEstacaoDestino() {
        return estacaoDestino;
    }

    public void setEstacaoDestino(EstacaoFerroviaria estacaoDestino) {
        this.estacaoDestino = estacaoDestino;
    }

    public List<RecursoFerroviario> getRecursos() {
        return recursos;
    }

    public void adicionarRecurso(RecursoFerroviario recurso) {
        if (!(recurso instanceof Vagao || recurso instanceof Locomotiva)) {
            throw new IllegalArgumentException("Somente Vagões e Locomotivas podem ser adicionados a um Trem.");
        }
        if (recursos.size() >= 150) {
            throw new IllegalStateException("O trem já possui o número máximo de 150 recursos.");
        }
        recursos.add(recurso);
    }

    public void removerRecurso(RecursoFerroviario recurso) {
        recursos.remove(recurso);
    }
}
