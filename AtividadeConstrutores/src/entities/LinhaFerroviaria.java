package entities;

import java.util.ArrayList;
import java.util.List;

public class LinhaFerroviaria {

    private int numero;
    private double extensaoEmMetros;
    private String descricao;

    private EstacaoFerroviaria estacaoFerroviaria;
    private List<RecursoFerroviario> recursos = new ArrayList<>();

    public LinhaFerroviaria() {
    }

    public LinhaFerroviaria(int numero, double extensaoEmMetros, String descricao) {
        this.numero = numero;
        this.extensaoEmMetros = extensaoEmMetros;
        this.descricao = descricao;
    }

    public LinhaFerroviaria(int numero, double extensaoEmMetros, String descricao, EstacaoFerroviaria estacaoFerroviaria) {
        this.numero = numero;
        this.extensaoEmMetros = extensaoEmMetros;
        this.descricao = descricao;
        this.estacaoFerroviaria = estacaoFerroviaria;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getExtensaoEmMetros() {
        return extensaoEmMetros;
    }

    public void setExtensaoEmMetros(double extensaoEmMetros) {
        this.extensaoEmMetros = extensaoEmMetros;
    }

    public String getDescricao() {
        return descricao;
    }

    public EstacaoFerroviaria getEstacaoFerroviaria() {
        return estacaoFerroviaria;
    }

    public void setEstacaoFerroviaria(EstacaoFerroviaria estacaoFerroviaria) {
        this.estacaoFerroviaria = estacaoFerroviaria;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<RecursoFerroviario> getRecursos() {
        return recursos;
    }

    public void adicionarRecurso(RecursoFerroviario recurso) {
        recursos.add(recurso);
    }

    public void removerRecurso(RecursoFerroviario recurso) {
        recursos.remove(recurso);
    }
}
