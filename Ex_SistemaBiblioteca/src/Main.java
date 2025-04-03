import module.entities.Biblioteca;
import module.entities.Livro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("\tBiblioteca Saraiva");
            Biblioteca saraiva = new Biblioteca();

            System.out.print("Digite a quantidade de livros para organizar: ");
            int quantLivros = sc.nextInt();

            for (int i = 0; i < quantLivros; i++) {
                sc.nextLine();

                System.out.printf("\tLivro #%d\n", i+1);
                System.out.print("Título: ");
                String titulo = sc.nextLine();

                System.out.print("Autor: ");
                String autor = sc.nextLine();

                System.out.print("Ano de publicação: ");
                int anoPublicacao = sc.nextInt();

                saraiva.adicionarLivro(new Livro(titulo, autor, anoPublicacao));
            }

            System.out.println("\nLivros Desorganizados:");

            for (Livro l : saraiva.getLivroLista()) {
                l.exibirDados();
            }

            saraiva.ordenarLivros();

            System.out.println("\nLivros Organizados:");
            for (Livro l : saraiva.getLivroLista()) {
                l.exibirDados();
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

    }
}