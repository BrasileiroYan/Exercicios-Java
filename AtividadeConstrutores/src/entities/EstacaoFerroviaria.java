package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class EstacaoFerroviaria {

    private String sigla;
    private String descricao;
    private List<LinhaFerroviaria> linhas = new ArrayList<>();

    public EstacaoFerroviaria() {
    }

    public EstacaoFerroviaria(String sigla, String descricao) {
        this.sigla = sigla;
        this.descricao = descricao;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<LinhaFerroviaria> getLinhas() {
        return linhas;
    }

    public void adicionarLinhas(LinhaFerroviaria linha) {
        linhas.add(linha);
    }

    public void removerLinhas(LinhaFerroviaria linha) {
        linhas.remove(linha);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        EstacaoFerroviaria that = (EstacaoFerroviaria) o;
        return Objects.equals(sigla, that.sigla) && Objects.equals(descricao, that.descricao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sigla, descricao);
    }
}
