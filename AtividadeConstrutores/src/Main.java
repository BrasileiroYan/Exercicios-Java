import entities.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        LinhaFerroviaria linha = new LinhaFerroviaria(1, 10000, "Linha SP-RJ");

        List<LinhaFerroviaria> linhasOrigem = new ArrayList<>();
        linhasOrigem.add(linha);
        EstacaoFerroviaria estacaoOrigem = new EstacaoFerroviaria("SP", "Estação São Paulo");
        for (LinhaFerroviaria l : linhasOrigem) {
            estacaoOrigem.adicionarLinhas(l);
        }

        List<LinhaFerroviaria> linhasDestino = new ArrayList<>();
        linhasDestino.add(linha);
        EstacaoFerroviaria estacaoDestino = new EstacaoFerroviaria("RJ", "Estação Rio de Janeiro");
        for (LinhaFerroviaria l : linhasDestino) {
            estacaoDestino.adicionarLinhas(l);
        }

        Trem trem = new Trem("NAG1010", LocalDate.now(), estacaoOrigem, estacaoDestino);

        Locomotiva locomotiva = new Locomotiva("L001", 3000, 25);
        trem.adicionarRecurso(locomotiva);

        Vagao vagao1 = new Vagao("V101", "Graneleiro", 10000, 15, 1.5);
        Vagao vagao2 = new Vagao("V102", "Tanque", 8000, 14, 1.4);
        Vagao vagao3 = new Vagao("V103", "Baú", 9000, 16, 1.6);
        trem.adicionarRecurso(vagao1);
        trem.adicionarRecurso(vagao2);
        trem.adicionarRecurso(vagao3);

        linha.adicionarRecurso(trem);

        System.out.println("Trem " + trem.getNumeroSerie() + " criado com sucesso!");
        System.out.println("Origem: " + estacaoOrigem.getSigla() + " -> Destino: " + estacaoDestino.getSigla());
        System.out.println("Número de recursos no trem: " + trem.getRecursos().size()); // melhor que hardcoded
    }
}
