
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Cadastrar produto");
            System.out.println("2. Listar produtos (somente Produto)");
            System.out.println("3. Cadastrar livro");
            System.out.println("4. Listar livros (somente Livro)");
            System.out.println("5. Imprimir tudo (Produto e Livro)");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");

            try {
                opcao = scanner.nextInt();
                scanner.nextLine();

                switch (opcao) {
                    case 1:
                        cadastrarProduto(scanner, produtos);
                        break;
                    case 2:
                        listarProdutos(produtos);
                        break;
                    case 3:
                        cadastrarLivro(scanner, produtos);
                        break;
                    case 4:
                        listarLivros(produtos);
                        break;
                    case 5:
                        imprimirTudo(produtos);
                        break;
                    case 6:
                        System.out.println("Saindo do programa. Até mais!");
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número.");
                scanner.nextLine();
                opcao = 0;
            }

        } while (opcao != 6);

        scanner.close();
    }

    private static void cadastrarProduto(Scanner scanner, List<Produto> produtos) {
        System.out.println("\n--- Cadastro de Produto ---");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Descrição: ");
        String descricao = scanner.nextLine();
        System.out.print("Preço: ");
        double preco = scanner.nextDouble();
        scanner.nextLine(); // Consumir a quebra de linha

        Produto produto = new Produto(nome, descricao, preco);
        produtos.add(produto);
        System.out.println("Produto cadastrado com sucesso!");
    }

    private static void listarProdutos(List<Produto> produtos) {
        System.out.println("\n--- Produtos Cadastrados ---");
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
            return;
        }
        for (Produto p : produtos) {
            if (p.getClass() == Produto.class) {
                System.out.println(p.toString());
            }
        }
    }

    private static void cadastrarLivro(Scanner scanner, List<Produto> produtos) {
        System.out.println("\n--- Cadastro de Livro ---");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Descrição: ");
        String descricao = scanner.nextLine();
        System.out.print("Preço: ");
        double preco = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Autores: ");
        String autores = scanner.nextLine();
        System.out.print("ISBN: ");
        String isbn = scanner.nextLine();
        System.out.print("Editora: ");
        String editora = scanner.nextLine();

        Livro livro = new Livro(nome, descricao, preco, autores, isbn, editora);
        produtos.add(livro);
        System.out.println("Livro cadastrado com sucesso!");
    }

    private static void listarLivros(List<Produto> produtos) {
        System.out.println("\n--- Livros Cadastrados ---");
        if (produtos.isEmpty()) {
            System.out.println("Nenhum livro cadastrado.");
            return;
        }
        for (Produto p : produtos) {
            if (p instanceof Livro) {
                System.out.println(p.toString());
            }
        }
    }

    private static void imprimirTudo(List<Produto> produtos) {
        System.out.println("\n--- Todos os Itens Cadastrados ---");
        if (produtos.isEmpty()) {
            System.out.println("Nenhum item cadastrado.");
            return;
        }
        for (Produto p : produtos) {
            System.out.println(p.toString());
        }
    }
}
