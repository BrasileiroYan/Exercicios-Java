import entities.*;
import entities.enums.EncomendaStatus;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Digite os dados do cliente:");
        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();

        LocalDate dataNascimento = null;

        while (dataNascimento == null) {
            System.out.print("Data de nascimento (DD/MM/YYYY): ");
            String data = sc.nextLine();

            try {
                dataNascimento = LocalDate.parse(data, formatter);

            } catch (DateTimeParseException e) {
                System.out.println("Error: Data inválida! Digite novamente.\n");
            }
        }
        Cliente cliente = new Cliente(nome, email, dataNascimento);

        System.out.println("\nDigite dados da encomenda:");
        System.out.print("Status: ");
        String strStatus = sc.nextLine();
        EncomendaStatus status = EncomendaStatus.valueOf(strStatus);

        System.out.print("Adicionar quantos itens: ");
        int qtdItens = sc.nextInt();

        List<EncomendaItens> itens = new ArrayList<>();
        for (int i = 0; i<qtdItens; i++) {
            sc.nextLine();

            System.out.printf("\nDigite os dados do %dº item:\n", i+1);
            System.out.print("Nome do Produto: ");
            String nomeProduto = sc.nextLine();

            System.out.print("Preço do Produto: R$");
            double precoProduto = sc.nextDouble();
            Produtos produto = new Produtos(nomeProduto, precoProduto);

            System.out.print("Quantidade: ");
            int qtdProduto = sc.nextInt();

            EncomendaItens dadosItens = new EncomendaItens(produto, qtdProduto);
            itens.add(dadosItens);
        }

        Encomenda encomenda = new Encomenda(status, cliente);
        for(EncomendaItens i : itens) encomenda.adicionarItem(i);

        System.out.println("\n\tSumário de pedidos:");
        System.out.printf("Horário do pedido: %s\n", encomenda.getDataEncomenda());

        System.out.printf("Status do pedido: %s\n", encomenda.getStatus());

        System.out.printf("Cliente: %s\n", encomenda.getCliente().toString());

        System.out.println("\nItens do pedido:");
        for(EncomendaItens i : itens) {
            System.out.printf("Item: %s\n", i.toString());
        }

        System.out.printf("\nPreço Total: R$%.2f\n", encomenda.precoTotal());
        sc.close();
    }
}