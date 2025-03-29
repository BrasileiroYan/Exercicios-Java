import entities.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de funcionários: ");
        int qtdFuncionarios = sc.nextInt();


        List<Funcionarios> listaFuncionarios = new ArrayList<>();
        for (int i = 0; i<qtdFuncionarios; i++) {
            sc.nextLine();
            System.out.printf("\nDados do funcionário %d:\n", i+1);
            System.out.print("Terceirizado [S|N]: ");
            char respTerc = sc.next().toUpperCase().charAt(0);

            while (respTerc != 'S' && respTerc != 'N') {
                System.out.println("Resposta inválida! Digite S ou N.");
                System.out.print("Terceirizado [S|N]: ");
                respTerc = sc.next().toUpperCase().charAt(0);
            }

            sc.nextLine();

            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Horas: ");
            int hora = sc.nextInt();
            System.out.print("Valor por horas: R$");
            double valorPorHora = sc.nextDouble();

            if (respTerc == 'S') {
                System.out.print("Custo adicional: R$");
                double custoAdicional = sc.nextDouble();

                Funcionarios funcionario = new FuncionariosTerceirizados(nome, hora, valorPorHora, custoAdicional);
                listaFuncionarios.add(funcionario);
            }
            else if (respTerc == 'N') {
                Funcionarios funcionario = new Funcionarios(nome, hora, valorPorHora);
                listaFuncionarios.add(funcionario);
            }
        }
        System.out.println("\nPagamentos:");
        for (Funcionarios f : listaFuncionarios) {
            System.out.println(f);
        }
        
        sc.close();
    }
}