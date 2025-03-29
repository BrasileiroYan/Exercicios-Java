import entities.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Digite o número de produtos: ");
        int qtdProduto = sc.nextInt();

        List<Produto> listaProdutos = new ArrayList<>();
        for (int i = 0; i<qtdProduto; i++) {
            sc.nextLine();

            System.out.printf("\nDados do produto %d:\n", i+1);
            System.out.print("Comum, Usado, Importado (C | U | I): ");
            char respTipoProduto = sc.next().toUpperCase().charAt(0);

            while (respTipoProduto != 'C' && respTipoProduto != 'U' && respTipoProduto != 'I') {
                System.out.println("Resposta inválida! Digite C, U ou I.");
                System.out.print("[C | U | I]: ");
                respTipoProduto = sc.next().toUpperCase().charAt(0);
            }
            sc.nextLine();

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Preço: R$ ");
            double preco = sc.nextDouble();

            switch (respTipoProduto) {
                case 'C':
                    listaProdutos.add(new Produto(nome, preco));
                    break;
                case 'U':
                    sc.nextLine();
                    System.out.print("Data de fabricação (DD/MM/YYYY): ");
                    String dataString = sc.nextLine();
                    LocalDate data = LocalDate.parse(dataString, formatter);
                    listaProdutos.add(new ProdutoUsado(nome, preco, data));
                    break;
                case 'I':
                    sc.nextLine();
                    System.out.print("Taxa de importação: R$ ");
                    double taxaImportacao = sc.nextDouble();
                    listaProdutos.add(new ProdutoImportado(nome, preco, taxaImportacao));
                    break;
                default:
                    System.out.println("Tipo de produto inválido!");
                    break;
            }
        }

        System.out.println("\nEtiqueta de preços: ");
        for (Produto p : listaProdutos) {
            System.out.println(p.etiquetaPreco());
        }

        sc.close();
    }
}
