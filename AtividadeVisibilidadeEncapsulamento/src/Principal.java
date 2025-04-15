// Questão 3

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        List<Funcionario> funcionarioLista = new ArrayList<>();

        System.out.print("Digite o número de funcionários: ");
        int qtdFunc = sc.nextInt();

        try {

            for (int i = 0; i < qtdFunc; i++) {
                sc.nextLine();
                System.out.printf("Funcionário #%d:\n", i + 1);
                System.out.print("NOME: ");
                String nome = sc.nextLine();

                System.out.print("DATA ADMISSÃO: ");
                LocalDate dataAdmissao = LocalDate.parse(sc.nextLine(), formatter);

                System.out.print("SALÁRIO: R$");
                double salario = sc.nextDouble();

                Funcionario funcionario = new Funcionario();

                funcionario.setNome(nome);
                funcionario.setDataAdmissao(dataAdmissao);
                funcionario.setSalario(salario);

                funcionarioLista.add(funcionario);
            }
            for (Funcionario f : funcionarioLista) {
                System.out.println(f);
            }
        } catch (RuntimeException e) {
            e.printStackTrace();
        } finally {
            sc.close();
        }

    }
}