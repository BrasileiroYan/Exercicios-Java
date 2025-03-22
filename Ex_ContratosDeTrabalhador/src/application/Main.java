package application;

import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import entities.*;
import entities.enums.TrabalhadorNivel;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o departamento: ");
        String departamento = sc.nextLine();
        Departamento nomeDepartamento = new Departamento(departamento);

        System.out.println("Digite os dados do trabalhador: ");

        System.out.print("Nome: ");
        String nomeDigitado = sc.nextLine();

        System.out.print("Nível: ");
        String nivelDigitado = sc.nextLine();
        TrabalhadorNivel nivel = TrabalhadorNivel.valueOf(nivelDigitado);

        System.out.print("Salário: ");
        double salarioDigitado = sc.nextDouble();

        Trabalhador trabalhador = new Trabalhador(nomeDigitado, nivel, salarioDigitado, nomeDepartamento);

        System.out.printf("\nDigite a quantidade de contratos do %s: ", trabalhador.getNome());
        int qtdContratos = sc.nextInt();

        for (int i = 0; i < qtdContratos; i++) {
            sc.nextLine();
            System.out.printf("Digite os dados do contrato %d:\n", i+1);

            System.out.print("Data(DD/MM/YYYY): ");
            String dataContrato = sc.nextLine();

            System.out.print("Valor por hora: ");
            double valorPorHora = sc.nextDouble();

            System.out.print("Hora(s): ");
            int horas = sc.nextInt();

            ContratoHora dadosDoContrato = new ContratoHora(dataContrato, valorPorHora, horas);
            trabalhador.adicionarContrato(dadosDoContrato);
        }
        sc.nextLine();

        System.out.print("\nDigite mês e ano para calcular renda (MM/YYYY): ");
        String dataParaRenda = sc.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/yyyy");
        YearMonth data = YearMonth.parse(dataParaRenda, formatter);

        int mes = data.getMonthValue();
        int ano = data.getYear();

        System.out.printf("Nome: %s\n", trabalhador.getNome());
        System.out.printf("Departamento: %s\n", trabalhador.getDepartamento().getNomeDepartamento());
        System.out.printf("Renda de %s: %.2f\n", dataParaRenda, trabalhador.renda(mes, ano));

        sc.close();
    }
}
