import java.util.Objects;

public class Livro extends Produto {
    private String autores;
    private String ISBN;
    private String editora;

    public Livro(String nome, String descricao, double preco, String autores, String ISBN, String editora) {
        super(nome, descricao, preco);
        this.autores = autores;
        this.ISBN = ISBN;
        this.editora = editora;
    }

    public String getAutores() {
        return autores;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Livro livro = (Livro) o;
        return Objects.equals(autores, livro.autores) && Objects.equals(ISBN, livro.ISBN) && Objects.equals(editora, livro.editora);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), autores, ISBN, editora);
    }

    @Override
    public String toString() {
        return "Livro: " + getNome() + ", " + getDescricao() + ", " + String.format("%.2f", getPreco()) +
                ", " + autores + ", " + ISBN + ", " + editora;
    }
}