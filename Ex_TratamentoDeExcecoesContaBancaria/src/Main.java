import module.entities.ContaBancaria;
import module.exceptions.DomainException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws DomainException{
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("\tDIGITE OS DADOS DA CONTA");
            System.out.print("Número: ");
            int numeroConta = sc.nextInt();

            sc.nextLine();
            System.out.print("Titular: ");
            String titularConta = sc.nextLine();

            System.out.print("Saldo inicial: R$");
            double saldoConta = sc.nextDouble();

            System.out.print("Limite de saque: R$");
            double limiteSaque = sc.nextDouble();

            ContaBancaria conta = new ContaBancaria(numeroConta, titularConta, saldoConta, limiteSaque);

            System.out.print("\n\tSacar[S] ou Depositar[D]: ");
            char saqueDepositoResp = sc.next().toUpperCase().charAt(0);

            while(saqueDepositoResp != 'S' && saqueDepositoResp != 'D') {
                System.out.println("Dígito inválido! Digite [S] ou [D]");

                System.out.print("\n\tSacar[S] ou Depositar[D]: ");
                saqueDepositoResp = sc.next().toUpperCase().charAt(0);
            }

            if (saqueDepositoResp == 'S') {
                System.out.print("\nDigite a quantia para saque: R$");
                double quantiaDinheiro = sc.nextDouble();

                try{
                    conta.sacarDinheiro(quantiaDinheiro);
                    System.out.printf("Novo saldo: R$%.2f", conta.getSaldoConta());
                } catch (DomainException e) {
                    System.out.println(e.getMessage());
                } catch (Exception e) {
                    System.out.println("Erro inesperado.");
                }
            }
            else if (saqueDepositoResp == 'D') {
                System.out.print("\nDigite a quantia para depósito: R$");
                double quantiaDinheiro = sc.nextDouble();

                try {
                    conta.depositarDinheiro(quantiaDinheiro);
                    System.out.printf("Novo saldo: R$%.2f", conta.getSaldoConta());
                } catch (DomainException e) {
                    System.out.println(e.getMessage());
                } catch (Exception e) {
                    System.out.println("Erro inesperado.");
                }
            }
        } catch (Exception e) {
            System.out.println("Erro inesperado.");
        } finally {
            sc.close();
        }
    }
}
