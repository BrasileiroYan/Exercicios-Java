import module.entities.Contrato;
import module.entities.Parcelas;
import module.services.ServicoContrato;
import module.services.ServicoPayPal;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Entre com os dados do contrato: ");
        System.out.print("Número: ");
        int numeroContrato = sc.nextInt();
        sc.nextLine();

        System.out.print("Data (dd/mm/yyyy): ");
        LocalDate dataContrato = LocalDate.parse(sc.nextLine(), formatter);

        System.out.print("Valor do Contrato: R$");
        double valorContrato = sc.nextDouble();

        System.out.print("\nEntre como número de parcelas: ");
        int numeroParcelas = sc.nextInt();

        Contrato contrato = new Contrato(numeroContrato, dataContrato, valorContrato);

        System.out.println("\nPARCELAS");

        ServicoContrato servicoContrato = new ServicoContrato(new ServicoPayPal());

        servicoContrato.processarPagamento(contrato, numeroParcelas);

        for (Parcelas p : contrato.getParcelasLista()) {
            System.out.println(p);
        }

        sc.close();
    }
}