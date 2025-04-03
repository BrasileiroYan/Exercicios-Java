package module.entities;

import module.services.LivroInfo;

public class Livro implements LivroInfo, Comparable<Livro> {
    private String titulo;
    private String autor;
    private Integer anoPublicacao;

    public Livro(){
    }

    public Livro(String titulo, String autor, Integer anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(Integer anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    @Override
    public int compareTo(Livro outro) {
        return Integer.compare(this.anoPublicacao, outro.getAnoPublicacao());
    }

    @Override
    public void exibirDados() {
        System.out.printf("%s | %s | %d\n", getTitulo(), getAutor(), getAnoPublicacao());
    }
}
