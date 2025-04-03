package module.entities;

import java.util.*;

public class Biblioteca {
    List<Livro> livroLista = new ArrayList<>();

    public List<Livro> getLivroLista() {
        return livroLista;
    }

    public void adicionarLivro(Livro livro) {
        livroLista.add(livro);
    }

    public void removerLivro(Livro livro) {
        livroLista.remove(livro);
    }

    public void ordenarLivros() {
        Collections.sort(livroLista);
    }

}
