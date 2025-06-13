import java.util.Scanner;

public class Cadastro {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Digite o nome completo: ");
                String nomeCompleto = scanner.nextLine().trim();

                if (nomeCompleto.isEmpty()) {
                    throw new IllegalArgumentException("Nome completo não pode ser vazio.");
                }

                System.out.print("Digite o DDD (2 dígitos): ");
                String ddd = scanner.nextLine().trim();
                if (ddd.length() != 2 || !ddd.chars().allMatch(Character::isDigit)) {
                    throw new IllegalArgumentException("DDD deve conter exatamente 2 dígitos.");
                }

                System.out.print("Digite o número do telefone (8 ou 9 dígitos): ");
                String numero = scanner.nextLine().trim();
                if (numero.length() < 8 || numero.length() > 9 || !numero.chars().allMatch(Character::isDigit)) {
                    throw new IllegalArgumentException("Número deve conter 8 ou 9 dígitos.");
                }

                System.out.println("\nCadastro realizado com sucesso!");
                System.out.println("Nome: " + nomeCompleto);
                System.out.println("Telefone: (" + ddd + ") " + numero);
                break;

            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());
                System.out.println("Por favor, tente novamente.\n");
            }
        }

        scanner.close();
    }
}
